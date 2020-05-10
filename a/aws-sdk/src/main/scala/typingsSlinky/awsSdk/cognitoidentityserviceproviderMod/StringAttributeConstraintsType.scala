package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringAttributeConstraintsType extends js.Object {
  /**
    * The maximum length.
    */
  var MaxLength: js.UndefOr[StringType] = js.native
  /**
    * The minimum length.
    */
  var MinLength: js.UndefOr[StringType] = js.native
}

object StringAttributeConstraintsType {
  @scala.inline
  def apply(): StringAttributeConstraintsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringAttributeConstraintsType]
  }
  @scala.inline
  implicit class StringAttributeConstraintsTypeOps[Self <: StringAttributeConstraintsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxLength(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMinLength(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinLength")(js.undefined)
        ret
    }
  }
  
}

