package typingsSlinky.reduxForm.reduxFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateCallback[FormData, P, ErrorType] extends js.Object {
  var fieldValidatorKeys: js.Array[String] = js.native
  var initialRender: Boolean = js.native
  var lastFieldValidatorKeys: js.Array[String] = js.native
  var nextProps: P with (InjectedFormProps[FormData, P, ErrorType]) = js.native
  var props: P with (InjectedFormProps[FormData, P, ErrorType]) = js.native
  var structure: js.Any = js.native
  var values: FormData = js.native
}

object ValidateCallback {
  @scala.inline
  def apply[FormData, P, ErrorType](
    fieldValidatorKeys: js.Array[String],
    initialRender: Boolean,
    lastFieldValidatorKeys: js.Array[String],
    nextProps: P with (InjectedFormProps[FormData, P, ErrorType]),
    props: P with (InjectedFormProps[FormData, P, ErrorType]),
    structure: js.Any,
    values: FormData
  ): ValidateCallback[FormData, P, ErrorType] = {
    val __obj = js.Dynamic.literal(fieldValidatorKeys = fieldValidatorKeys.asInstanceOf[js.Any], initialRender = initialRender.asInstanceOf[js.Any], lastFieldValidatorKeys = lastFieldValidatorKeys.asInstanceOf[js.Any], nextProps = nextProps.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], structure = structure.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateCallback[FormData, P, ErrorType]]
  }
  @scala.inline
  implicit class ValidateCallbackOps[Self[formdata, p, errortype] <: ValidateCallback[formdata, p, errortype], FormData, P, ErrorType] (val x: Self[FormData, P, ErrorType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[FormData, P, ErrorType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[FormData, P, ErrorType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[FormData, P, ErrorType]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[FormData, P, ErrorType]) with Other]
    @scala.inline
    def withFieldValidatorKeys(value: js.Array[String]): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldValidatorKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialRender(value: Boolean): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastFieldValidatorKeys(value: js.Array[String]): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastFieldValidatorKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextProps(value: P with (InjectedFormProps[FormData, P, ErrorType])): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProps(value: P with (InjectedFormProps[FormData, P, ErrorType])): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStructure(value: js.Any): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: FormData): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

