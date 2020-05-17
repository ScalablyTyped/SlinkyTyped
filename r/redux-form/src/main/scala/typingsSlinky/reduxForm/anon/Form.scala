package typingsSlinky.reduxForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Form extends js.Object {
  var form: String = js.native
  var sectionPrefix: js.UndefOr[String] = js.native
}

object Form {
  @scala.inline
  def apply(form: String): Form = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
    __obj.asInstanceOf[Form]
  }
  @scala.inline
  implicit class FormOps[Self <: Form] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSectionPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSectionPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionPrefix")(js.undefined)
        ret
    }
  }
  
}

