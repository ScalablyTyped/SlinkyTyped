package typingsSlinky.braintreeWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostedFieldsFieldMaskInput extends js.Object {
  /**
    * The character to use when masking the input.
    * @default '•'
    */
  var character: js.UndefOr[String] = js.native
  /**
    * Only applicable for the credit card field. Whether or not to show the last 4 digits of the card when masking.
    */
  var showLastFour: js.UndefOr[Boolean] = js.native
}

object HostedFieldsFieldMaskInput {
  @scala.inline
  def apply(): HostedFieldsFieldMaskInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostedFieldsFieldMaskInput]
  }
  @scala.inline
  implicit class HostedFieldsFieldMaskInputOps[Self <: HostedFieldsFieldMaskInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharacter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("character")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharacter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("character")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLastFour(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLastFour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLastFour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLastFour")(js.undefined)
        ret
    }
  }
  
}

