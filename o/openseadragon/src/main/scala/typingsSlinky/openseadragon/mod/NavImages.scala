package typingsSlinky.openseadragon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavImages extends js.Object {
  var flip: NavImagesValues = js.native
  var fullpage: NavImagesValues = js.native
  var home: NavImagesValues = js.native
  var next: NavImagesValues = js.native
  var previous: NavImagesValues = js.native
  var rotateleft: NavImagesValues = js.native
  var rotateright: NavImagesValues = js.native
  var zoomIn: NavImagesValues = js.native
  var zoomOut: NavImagesValues = js.native
}

object NavImages {
  @scala.inline
  def apply(
    flip: NavImagesValues,
    fullpage: NavImagesValues,
    home: NavImagesValues,
    next: NavImagesValues,
    previous: NavImagesValues,
    rotateleft: NavImagesValues,
    rotateright: NavImagesValues,
    zoomIn: NavImagesValues,
    zoomOut: NavImagesValues
  ): NavImages = {
    val __obj = js.Dynamic.literal(flip = flip.asInstanceOf[js.Any], fullpage = fullpage.asInstanceOf[js.Any], home = home.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], rotateleft = rotateleft.asInstanceOf[js.Any], rotateright = rotateright.asInstanceOf[js.Any], zoomIn = zoomIn.asInstanceOf[js.Any], zoomOut = zoomOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavImages]
  }
  @scala.inline
  implicit class NavImagesOps[Self <: NavImages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlip(value: NavImagesValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullpage(value: NavImagesValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullpage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHome(value: NavImagesValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("home")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(value: NavImagesValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevious(value: NavImagesValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotateleft(value: NavImagesValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateleft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotateright(value: NavImagesValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomIn(value: NavImagesValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomOut(value: NavImagesValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOut")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

