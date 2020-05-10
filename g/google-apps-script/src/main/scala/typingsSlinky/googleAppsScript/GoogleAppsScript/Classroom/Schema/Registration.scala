package typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Registration extends js.Object {
  var cloudPubsubTopic: js.UndefOr[CloudPubsubTopic] = js.native
  var expiryTime: js.UndefOr[String] = js.native
  var feed: js.UndefOr[Feed] = js.native
  var registrationId: js.UndefOr[String] = js.native
}

object Registration {
  @scala.inline
  def apply(): Registration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Registration]
  }
  @scala.inline
  implicit class RegistrationOps[Self <: Registration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudPubsubTopic(value: CloudPubsubTopic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudPubsubTopic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudPubsubTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudPubsubTopic")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiryTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiryTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiryTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiryTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFeed(value: Feed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feed")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistrationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistrationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationId")(js.undefined)
        ret
    }
  }
  
}

