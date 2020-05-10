package typingsSlinky.googleapis.sourcerepoV1Mod.sourcerepoV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration to publish a Cloud Pub/Sub message.
  */
@js.native
trait SchemaPubsubConfig extends js.Object {
  /**
    * The format of the Cloud Pub/Sub messages.
    */
  var messageFormat: js.UndefOr[String] = js.native
  /**
    * Email address of the service account used for publishing Cloud Pub/Sub
    * messages. This service account needs to be in the same project as the
    * PubsubConfig. When added, the caller needs to have
    * iam.serviceAccounts.actAs permission on this service account. If
    * unspecified, it defaults to the compute engine default service account.
    */
  var serviceAccountEmail: js.UndefOr[String] = js.native
  /**
    * A topic of Cloud Pub/Sub. Values are of the form
    * `projects/&lt;project&gt;/topics/&lt;topic&gt;`. The project needs to be
    * the same project as this config is in.
    */
  var topic: js.UndefOr[String] = js.native
}

object SchemaPubsubConfig {
  @scala.inline
  def apply(): SchemaPubsubConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPubsubConfig]
  }
  @scala.inline
  implicit class SchemaPubsubConfigOps[Self <: SchemaPubsubConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccountEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccountEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(js.undefined)
        ret
    }
  }
  
}

