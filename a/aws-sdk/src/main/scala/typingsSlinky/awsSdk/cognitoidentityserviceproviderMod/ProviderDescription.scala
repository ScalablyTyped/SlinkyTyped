package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderDescription extends js.Object {
  /**
    * The date the provider was added to the user pool.
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  /**
    * The date the provider was last modified.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * The identity provider name.
    */
  var ProviderName: js.UndefOr[ProviderNameType] = js.native
  /**
    * The identity provider type.
    */
  var ProviderType: js.UndefOr[IdentityProviderTypeType] = js.native
}

object ProviderDescription {
  @scala.inline
  def apply(): ProviderDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderDescription]
  }
  @scala.inline
  implicit class ProviderDescriptionOps[Self <: ProviderDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(js.undefined)
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
    @scala.inline
    def withProviderType(value: IdentityProviderTypeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderType")(js.undefined)
        ret
    }
  }
  
}

