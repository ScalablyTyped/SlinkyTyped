package typingsSlinky.formik.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnBlur extends js.Object {
  var name: String = js.native
  var onBlur: FnCallE = js.native
  var onChange: FnCall = js.native
  var value: js.Any = js.native
}

object OnBlur {
  @scala.inline
  def apply(name: String, onBlur: FnCallE, onChange: FnCall, value: js.Any): OnBlur = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onBlur = onBlur.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBlur]
  }
  @scala.inline
  implicit class OnBlurOps[Self <: OnBlur] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnBlur(value: FnCallE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChange(value: FnCall): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

