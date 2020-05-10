package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UICustomizationType extends js.Object {
  /**
    * The CSS values in the UI customization.
    */
  var CSS: js.UndefOr[CSSType] = js.native
  /**
    * The CSS version number.
    */
  var CSSVersion: js.UndefOr[CSSVersionType] = js.native
  /**
    * The client ID for the client app.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.native
  /**
    * The creation date for the UI customization.
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  /**
    * The logo image for the UI customization.
    */
  var ImageUrl: js.UndefOr[ImageUrlType] = js.native
  /**
    * The last-modified date for the UI customization.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.native
}

object UICustomizationType {
  @scala.inline
  def apply(): UICustomizationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UICustomizationType]
  }
  @scala.inline
  implicit class UICustomizationTypeOps[Self <: UICustomizationType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCSS(value: CSSType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCSS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CSS")(js.undefined)
        ret
    }
    @scala.inline
    def withCSSVersion(value: CSSVersionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CSSVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCSSVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CSSVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withClientId(value: ClientIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientId")(js.undefined)
        ret
    }
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
    def withImageUrl(value: ImageUrlType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageUrl")(js.undefined)
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
    def withUserPoolId(value: UserPoolIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(js.undefined)
        ret
    }
  }
  
}

