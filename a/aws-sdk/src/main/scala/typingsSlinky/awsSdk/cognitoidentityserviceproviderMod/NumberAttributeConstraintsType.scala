package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberAttributeConstraintsType extends js.Object {
  /**
    * The maximum value of an attribute that is of the number data type.
    */
  var MaxValue: js.UndefOr[StringType] = js.native
  /**
    * The minimum value of an attribute that is of the number data type.
    */
  var MinValue: js.UndefOr[StringType] = js.native
}

object NumberAttributeConstraintsType {
  @scala.inline
  def apply(): NumberAttributeConstraintsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberAttributeConstraintsType]
  }
  @scala.inline
  implicit class NumberAttributeConstraintsTypeOps[Self <: NumberAttributeConstraintsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxValue(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinValue")(js.undefined)
        ret
    }
  }
  
}

