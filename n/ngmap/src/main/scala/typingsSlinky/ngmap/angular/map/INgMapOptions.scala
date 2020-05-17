package typingsSlinky.ngmap.angular.map

import typingsSlinky.ngmap.anon.AnchorPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INgMapOptions extends js.Object {
  var marker: AnchorPoint = js.native
}

object INgMapOptions {
  @scala.inline
  def apply(marker: AnchorPoint): INgMapOptions = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[INgMapOptions]
  }
  @scala.inline
  implicit class INgMapOptionsOps[Self <: INgMapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarker(value: AnchorPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

