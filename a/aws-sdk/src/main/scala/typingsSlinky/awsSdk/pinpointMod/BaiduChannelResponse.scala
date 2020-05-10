package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaiduChannelResponse extends js.Object {
  /**
    * The unique identifier for the application that the Baidu channel applies to.
    */
  var ApplicationId: js.UndefOr[string] = js.native
  /**
    * The date and time when the Baidu channel was enabled.
    */
  var CreationDate: js.UndefOr[string] = js.native
  /**
    * The API key that you received from the Baidu Cloud Push service to communicate with the service.
    */
  var Credential: string = js.native
  /**
    * Specifies whether the Baidu channel is enabled for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
  /**
    * (Not used) This property is retained only for backward compatibility.
    */
  var HasCredential: js.UndefOr[boolean] = js.native
  /**
    * (Deprecated) An identifier for the Baidu channel. This property is retained only for backward compatibility.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * Specifies whether the Baidu channel is archived.
    */
  var IsArchived: js.UndefOr[boolean] = js.native
  /**
    * The user who last modified the Baidu channel.
    */
  var LastModifiedBy: js.UndefOr[string] = js.native
  /**
    * The date and time when the Baidu channel was last modified.
    */
  var LastModifiedDate: js.UndefOr[string] = js.native
  /**
    * The type of messaging or notification platform for the channel. For the Baidu channel, this value is BAIDU.
    */
  var Platform: string = js.native
  /**
    * The current version of the Baidu channel.
    */
  var Version: js.UndefOr[integer] = js.native
}

object BaiduChannelResponse {
  @scala.inline
  def apply(Credential: string, Platform: string): BaiduChannelResponse = {
    val __obj = js.Dynamic.literal(Credential = Credential.asInstanceOf[js.Any], Platform = Platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaiduChannelResponse]
  }
  @scala.inline
  implicit class BaiduChannelResponseOps[Self <: BaiduChannelResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredential(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Credential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: string): Self = {
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
    def withEnabled(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHasCredential(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasCredential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasCredential: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasCredential")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withIsArchived(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsArchived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsArchived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsArchived")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedBy(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: string): Self = {
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
    def withVersion(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(js.undefined)
        ret
    }
  }
  
}

