package typingsSlinky.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFshader extends js.Object {
  var attributes: js.Any = js.native
  var fshader: String = js.native
  var useTransformFeedback: js.UndefOr[Boolean] = js.native
  var vshader: String = js.native
}

object AnonFshader {
  @scala.inline
  def apply(attributes: js.Any, fshader: String, vshader: String): AnonFshader = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], fshader = fshader.asInstanceOf[js.Any], vshader = vshader.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFshader]
  }
  @scala.inline
  implicit class AnonFshaderOps[Self <: AnonFshader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFshader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fshader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVshader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vshader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseTransformFeedback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTransformFeedback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTransformFeedback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTransformFeedback")(js.undefined)
        ret
    }
  }
  
}

