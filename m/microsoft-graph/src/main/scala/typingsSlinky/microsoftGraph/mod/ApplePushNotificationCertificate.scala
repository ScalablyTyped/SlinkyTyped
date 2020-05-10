package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplePushNotificationCertificate extends Entity {
  // Apple Id of the account used to create the MDM push certificate.
  var appleIdentifier: js.UndefOr[String] = js.native
  // Not yet documented
  var certificate: js.UndefOr[String] = js.native
  // The expiration date and time for Apple push notification certificate.
  var expirationDateTime: js.UndefOr[String] = js.native
  // Last modified date and time for Apple push notification certificate.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  // Topic Id.
  var topicIdentifier: js.UndefOr[String] = js.native
}

object ApplePushNotificationCertificate {
  @scala.inline
  def apply(): ApplePushNotificationCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplePushNotificationCertificate]
  }
  @scala.inline
  implicit class ApplePushNotificationCertificateOps[Self <: ApplePushNotificationCertificate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppleIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appleIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppleIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appleIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTopicIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopicIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicIdentifier")(js.undefined)
        ret
    }
  }
  
}

