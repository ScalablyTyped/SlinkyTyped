package typingsSlinky.navermaps.naver.maps

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapPanes extends js.Object {
  var floatPane: HTMLElement = js.native
  var overlayImage: HTMLElement = js.native
  var overlayLayer: HTMLElement = js.native
}

object MapPanes {
  @scala.inline
  def apply(floatPane: HTMLElement, overlayImage: HTMLElement, overlayLayer: HTMLElement): MapPanes = {
    val __obj = js.Dynamic.literal(floatPane = floatPane.asInstanceOf[js.Any], overlayImage = overlayImage.asInstanceOf[js.Any], overlayLayer = overlayLayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapPanes]
  }
  @scala.inline
  implicit class MapPanesOps[Self <: MapPanes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFloatPane(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlayImage(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlayLayer(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayLayer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

