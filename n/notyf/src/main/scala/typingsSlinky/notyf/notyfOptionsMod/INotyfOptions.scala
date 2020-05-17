package typingsSlinky.notyf.notyfOptionsMod

import typingsSlinky.notyf.anon.DeepPartialINotyfNotifica
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INotyfOptions extends js.Object {
  var duration: Double = js.native
  var ripple: Boolean = js.native
  var types: js.Array[DeepPartialINotyfNotifica] = js.native
}

object INotyfOptions {
  @scala.inline
  def apply(duration: Double, ripple: Boolean, types: js.Array[DeepPartialINotyfNotifica]): INotyfOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], ripple = ripple.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotyfOptions]
  }
  @scala.inline
  implicit class INotyfOptionsOps[Self <: INotyfOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRipple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ripple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[DeepPartialINotyfNotifica]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

