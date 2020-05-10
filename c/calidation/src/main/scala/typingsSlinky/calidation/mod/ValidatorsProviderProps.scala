package typingsSlinky.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidatorsProviderProps extends js.Object {
  var validators: Dictionary[
    js.Function1[/* config */ SimpleValidatorConfig, js.Function1[/* value */ _, String | Null]]
  ] = js.native
}

object ValidatorsProviderProps {
  @scala.inline
  def apply(
    validators: Dictionary[
      js.Function1[/* config */ SimpleValidatorConfig, js.Function1[/* value */ _, String | Null]]
    ]
  ): ValidatorsProviderProps = {
    val __obj = js.Dynamic.literal(validators = validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorsProviderProps]
  }
  @scala.inline
  implicit class ValidatorsProviderPropsOps[Self <: ValidatorsProviderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidators(
      value: Dictionary[
          js.Function1[/* config */ SimpleValidatorConfig, js.Function1[/* value */ _, String | Null]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

