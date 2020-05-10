package typingsSlinky.openjscad.OpenJsCad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * options parameter:
  * - drawLines: display wireframe lines
  * - drawFaces: display surfaces
  * - bgColor: canvas background color
  * - color: object color
  * - viewerwidth, viewerheight: set rendering size. Works with any css unit.
  *     viewerheight can also be specified as a ratio to width, ie number e (0, 1]
  * - noWebGL: force render without webGL
  * - verbose: show additional info (currently only time used for rendering)
  */
@js.native
trait ViewerSize extends js.Object {
  var height: Double = js.native
  var heightDefault: String = js.native
  var heightratio: Double = js.native
  var width: Double = js.native
  var widthDefault: String = js.native
}

object ViewerSize {
  @scala.inline
  def apply(height: Double, heightDefault: String, heightratio: Double, width: Double, widthDefault: String): ViewerSize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], heightDefault = heightDefault.asInstanceOf[js.Any], heightratio = heightratio.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], widthDefault = widthDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewerSize]
  }
  @scala.inline
  implicit class ViewerSizeOps[Self <: ViewerSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeightDefault(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeightratio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidthDefault(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthDefault")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

