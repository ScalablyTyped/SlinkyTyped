package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCloudPubsubTopic(value: SchemaCloudPubsubTopic): Self = this.set("cloudPubsubTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudPubsubTopic: Self = this.set("cloudPubsubTopic", js.undefined)
    
    @scala.inline
    def setExpiryTime(value: String): Self = this.set("expiryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiryTime: Self = this.set("expiryTime", js.undefined)
    
    @scala.inline
    def setFeed(value: SchemaFeed): Self = this.set("feed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeed: Self = this.set("feed", js.undefined)
    
    @scala.inline
    def setRegistrationId(value: String): Self = this.set("registrationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistrationId: Self = this.set("registrationId", js.undefined)
  }
}
