package typingsSlinky.pulumiAws.inputMod.cognito

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolSchemaNumberAttributeConstraints extends js.Object {
  /**
    * The maximum value of an attribute that is of the number data type.
    */
  var maxValue: js.UndefOr[Input[String]] = js.native
  /**
    * The minimum value of an attribute that is of the number data type.
    */
  var minValue: js.UndefOr[Input[String]] = js.native
}

object UserPoolSchemaNumberAttributeConstraints {
  @scala.inline
  def apply(): UserPoolSchemaNumberAttributeConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolSchemaNumberAttributeConstraints]
  }
  @scala.inline
  implicit class UserPoolSchemaNumberAttributeConstraintsOps[Self <: UserPoolSchemaNumberAttributeConstraints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxValue(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(js.undefined)
        ret
    }
  }
  
}

