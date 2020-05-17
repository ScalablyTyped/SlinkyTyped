package typingsSlinky.baidumapWebSdk.BMap

import typingsSlinky.baidumapWebSdk.anon.Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomLayer extends TileLayer {
  def onhotspotclick(event: Content): Unit = js.native
}

object CustomLayer {
  @scala.inline
  def apply(
    getCopyright: () => Copyright,
    getTilesUrl: (Pixel, Double) => String,
    isTransparentPng: () => Boolean,
    onhotspotclick: Content => Unit
  ): CustomLayer = {
    val __obj = js.Dynamic.literal(getCopyright = js.Any.fromFunction0(getCopyright), getTilesUrl = js.Any.fromFunction2(getTilesUrl), isTransparentPng = js.Any.fromFunction0(isTransparentPng), onhotspotclick = js.Any.fromFunction1(onhotspotclick))
    __obj.asInstanceOf[CustomLayer]
  }
  @scala.inline
  implicit class CustomLayerOps[Self <: CustomLayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnhotspotclick(value: Content => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onhotspotclick")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

