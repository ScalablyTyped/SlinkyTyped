package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderUserIdentifierType extends js.Object {
  /**
    * The name of the provider attribute to link to, for example, NameID.
    */
  var ProviderAttributeName: js.UndefOr[StringType] = js.native
  /**
    * The value of the provider attribute to link to, for example, xxxxx_account.
    */
  var ProviderAttributeValue: js.UndefOr[StringType] = js.native
  /**
    * The name of the provider, for example, Facebook, Google, or Login with Amazon.
    */
  var ProviderName: js.UndefOr[ProviderNameType] = js.native
}

object ProviderUserIdentifierType {
  @scala.inline
  def apply(): ProviderUserIdentifierType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderUserIdentifierType]
  }
  @scala.inline
  implicit class ProviderUserIdentifierTypeOps[Self <: ProviderUserIdentifierType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProviderAttributeName(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderAttributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderAttributeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderAttributeName")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderAttributeValue(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderAttributeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderAttributeValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderAttributeValue")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderName(value: ProviderNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderName")(js.undefined)
        ret
    }
  }
  
}

