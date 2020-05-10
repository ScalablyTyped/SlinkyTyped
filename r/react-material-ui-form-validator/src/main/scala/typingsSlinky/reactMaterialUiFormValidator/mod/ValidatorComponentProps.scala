package typingsSlinky.reactMaterialUiFormValidator.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidatorComponentProps
  extends /* key */ StringDictionary[js.Any] {
  var errorMessages: js.UndefOr[js.Array[_] | String] = js.native
  var name: String = js.native
  var validatorListener: js.UndefOr[js.Function1[/* isValid */ Boolean, Unit]] = js.native
  var validators: js.UndefOr[js.Array[_]] = js.native
  var value: js.Any = js.native
  var withRequiredValidator: js.UndefOr[Boolean] = js.native
}

object ValidatorComponentProps {
  @scala.inline
  def apply(name: String, value: js.Any): ValidatorComponentProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorComponentProps]
  }
  @scala.inline
  implicit class ValidatorComponentPropsOps[Self <: ValidatorComponentProps] (val x: Self) extends AnyVal {
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
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorMessages(value: js.Array[_] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withValidatorListener(value: /* isValid */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatorListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValidatorListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatorListener")(js.undefined)
        ret
    }
    @scala.inline
    def withValidators(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(js.undefined)
        ret
    }
    @scala.inline
    def withWithRequiredValidator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withRequiredValidator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithRequiredValidator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withRequiredValidator")(js.undefined)
        ret
    }
  }
  
}

