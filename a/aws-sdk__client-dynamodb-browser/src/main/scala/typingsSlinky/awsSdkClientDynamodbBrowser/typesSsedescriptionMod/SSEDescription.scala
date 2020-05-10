package typingsSlinky.awsSdkClientDynamodbBrowser.typesSsedescriptionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.AES256
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DISABLED
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DISABLING
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ENABLED
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ENABLING
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.KMS
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.UPDATING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSEDescription extends js.Object {
  /**
    * <p>The KMS master key ARN used for the KMS encryption.</p>
    */
  var KMSMasterKeyArn: js.UndefOr[String] = js.native
  /**
    * <p>Server-side encryption type:</p> <ul> <li> <p> <code>AES256</code> - Server-side encryption which uses the AES256 algorithm.</p> </li> <li> <p> <code>KMS</code> - Server-side encryption which uses AWS Key Management Service.</p> </li> </ul>
    */
  var SSEType: js.UndefOr[AES256 | KMS | String] = js.native
  /**
    * <p>The current state of server-side encryption:</p> <ul> <li> <p> <code>ENABLING</code> - Server-side encryption is being enabled.</p> </li> <li> <p> <code>ENABLED</code> - Server-side encryption is enabled.</p> </li> <li> <p> <code>DISABLING</code> - Server-side encryption is being disabled.</p> </li> <li> <p> <code>DISABLED</code> - Server-side encryption is disabled.</p> </li> <li> <p> <code>UPDATING</code> - Server-side encryption is being updated.</p> </li> </ul>
    */
  var Status: js.UndefOr[ENABLING | ENABLED | DISABLING | DISABLED | UPDATING | String] = js.native
}

object SSEDescription {
  @scala.inline
  def apply(): SSEDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSEDescription]
  }
  @scala.inline
  implicit class SSEDescriptionOps[Self <: SSEDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKMSMasterKeyArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSMasterKeyArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKMSMasterKeyArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSMasterKeyArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSSEType(value: AES256 | KMS | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSEType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSEType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSEType")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ENABLING | ENABLED | DISABLING | DISABLED | UPDATING | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

