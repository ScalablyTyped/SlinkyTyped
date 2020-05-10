package typingsSlinky.reactForm

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactText
import typingsSlinky.reactForm.mod.FieldApi
import typingsSlinky.reactForm.mod.RenderReturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-form.react-form.StyledProps & {  children ? :(props : react-form.react-form.FieldApi): react-form.react-form.RenderReturn | react-form.react-form.RenderReturn} */
@js.native
trait StyledPropschildrenpropsF extends js.Object {
  var children: js.UndefOr[(js.Function1[/* props */ FieldApi, RenderReturn]) | RenderReturn] = js.native
  var errorBefore: js.UndefOr[Boolean] = js.native
  var field: js.UndefOr[String | (js.Array[js.Array[ReactText] | ReactText | String])] = js.native
  var isForm: js.UndefOr[Boolean] = js.native
  var messageBefore: js.UndefOr[Boolean] = js.native
  var noMessage: js.UndefOr[Boolean] = js.native
  var showErrors: js.UndefOr[Boolean] = js.native
  var touchValidation: js.UndefOr[Boolean] = js.native
}

object StyledPropschildrenpropsF {
  @scala.inline
  def apply(): StyledPropschildrenpropsF = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyledPropschildrenpropsF]
  }
  @scala.inline
  implicit class StyledPropschildrenpropsFOps[Self <: StyledPropschildrenpropsF] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenFunction1(value: /* props */ FieldApi => RenderReturn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildren(value: (js.Function1[/* props */ FieldApi, RenderReturn]) | RenderReturn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(null)
        ret
    }
    @scala.inline
    def withErrorBefore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: String | (js.Array[js.Array[ReactText] | ReactText | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withIsForm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isForm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isForm")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageBefore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withNoMessage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withShowErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchValidation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchValidation")(js.undefined)
        ret
    }
  }
  
}

