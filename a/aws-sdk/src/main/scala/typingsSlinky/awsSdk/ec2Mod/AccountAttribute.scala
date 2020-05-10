package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountAttribute extends js.Object {
  /**
    * The name of the account attribute.
    */
  var AttributeName: js.UndefOr[String] = js.native
  /**
    * The values for the account attribute.
    */
  var AttributeValues: js.UndefOr[AccountAttributeValueList] = js.native
}

object AccountAttribute {
  @scala.inline
  def apply(): AccountAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountAttribute]
  }
  @scala.inline
  implicit class AccountAttributeOps[Self <: AccountAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributeValues(value: AccountAttributeValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeValues")(js.undefined)
        ret
    }
  }
  
}

