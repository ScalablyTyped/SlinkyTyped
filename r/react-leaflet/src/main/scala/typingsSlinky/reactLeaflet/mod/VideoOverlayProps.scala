package typingsSlinky.reactLeaflet.mod

import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.leaflet.mod.LatLngBoundsExpression
import typingsSlinky.leaflet.mod.VideoOverlayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.reactLeaflet.mod.MapComponentProps because var conflicts: pane. Inlined leaflet */ @js.native
trait VideoOverlayProps extends VideoOverlayOptions {
  var bounds: LatLngBoundsExpression = js.native
  var leaflet: js.UndefOr[LeafletContext] = js.native
  var play: js.UndefOr[Boolean] = js.native
  var url: String | js.Array[String] | HTMLVideoElement = js.native
}

object VideoOverlayProps {
  @scala.inline
  def apply(bounds: LatLngBoundsExpression, url: String | js.Array[String] | HTMLVideoElement): VideoOverlayProps = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoOverlayProps]
  }
  @scala.inline
  implicit class VideoOverlayPropsOps[Self <: VideoOverlayProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounds(value: LatLngBoundsExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrlHTMLVideoElement(value: HTMLVideoElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String | js.Array[String] | HTMLVideoElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeaflet(value: LeafletContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaflet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaflet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaflet")(js.undefined)
        ret
    }
    @scala.inline
    def withPlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play")(js.undefined)
        ret
    }
  }
  
}

