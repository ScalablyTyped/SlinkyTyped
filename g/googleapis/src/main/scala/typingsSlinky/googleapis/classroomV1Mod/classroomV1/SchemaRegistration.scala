package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instruction to Classroom to send notifications from the `feed` to the
  * provided destination.
  */
@js.native
trait SchemaRegistration extends js.Object {
  /**
    * The Cloud Pub/Sub topic that notifications are to be sent to.
    */
  var cloudPubsubTopic: js.UndefOr[SchemaCloudPubsubTopic] = js.native
  /**
    * The time until which the `Registration` is effective.  This is a
    * read-only field assigned by the server.
    */
  var expiryTime: js.UndefOr[String] = js.native
  /**
    * Specification for the class of notifications that Classroom should
    * deliver to the destination.
    */
  var feed: js.UndefOr[SchemaFeed] = js.native
  /**
    * A server-generated unique identifier for this `Registration`.  Read-only.
    */
  var registrationId: js.UndefOr[String] = js.native
}

object SchemaRegistration {
  @scala.inline
  def apply(): SchemaRegistration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegistration]
  }
  @scala.inline
  implicit class SchemaRegistrationOps[Self <: SchemaRegistration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudPubsubTopic(value: SchemaCloudPubsubTopic): Self = {
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
    def withFeed(value: SchemaFeed): Self = {
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

