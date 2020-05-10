package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.plotlyJsStrings.arraydraw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Padding extends js.Object {
  /**
  	 * The amount of padding (in px) along the bottom of the component.
  	 */
  var b: Double = js.native
  var editType: arraydraw = js.native
  /**
  	 * The amount of padding (in px) on the left side of the component.
  	 */
  var l: Double = js.native
  /**
  	 * The amount of padding (in px) on the right side of the component.
  	 */
  var r: Double = js.native
  /**
  	 * The amount of padding (in px) along the top of the component.
  	 */
  var t: Double = js.native
}

object Padding {
  @scala.inline
  def apply(b: Double, editType: arraydraw, l: Double, r: Double, t: Double): Padding = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], editType = editType.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[Padding]
  }
  @scala.inline
  implicit class PaddingOps[Self <: Padding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditType(value: arraydraw): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

