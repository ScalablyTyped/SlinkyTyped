package typingsSlinky.openjscad.OpenJsCad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IViewerOptions extends js.Object {
  var bgColor: js.UndefOr[Double] = js.native
  var color: js.UndefOr[js.Array[Double]] = js.native
  var drawFaces: js.UndefOr[Boolean] = js.native
  var drawLines: js.UndefOr[Boolean] = js.native
  var noWebGL: js.UndefOr[Boolean] = js.native
}

object IViewerOptions {
  @scala.inline
  def apply(): IViewerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IViewerOptions]
  }
  @scala.inline
  implicit class IViewerOptionsOps[Self <: IViewerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBgColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgColor")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawFaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawFaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawFaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawFaces")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawLines")(js.undefined)
        ret
    }
    @scala.inline
    def withNoWebGL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noWebGL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoWebGL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noWebGL")(js.undefined)
        ret
    }
  }
  
}

