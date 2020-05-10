package typingsSlinky.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes EventTrigger, used to request events be sent from another
  * service.
  */
@js.native
trait SchemaEventTrigger extends js.Object {
  /**
    * `event_type` names contain the service that is sending an event and the
    * kind of event that was fired. Must be of the form
    * `providers/x/eventTypes/x e.g. Directly handle a Message published to
    * Google Cloud Pub/Sub `providers/cloud.pubsub/eventTypes/topic.publish`.
    * Handle an object changing in Google Cloud Storage:
    * `providers/cloud.storage/eventTypes/object.change`  Handle a write to the
    * Firebase Realtime Database:
    * `providers/google.firebase.database/eventTypes/ref.write`
    */
  var eventType: js.UndefOr[String] = js.native
  /**
    * Specifies policy for failed executions.
    */
  var failurePolicy: js.UndefOr[SchemaFailurePolicy] = js.native
  /**
    * Which instance of the source&#39;s service should send events. E.g. for
    * Pub/Sub this would be a Pub/Sub topic at `projects/x/topics/x. For Google
    * Cloud Storage this would be a bucket at `projects/x/buckets/x. For any
    * source that only supports one instance per-project, this should be the
    * name of the project (`projects/x)
    */
  var resource: js.UndefOr[String] = js.native
  /**
    * The hostname of the service that should be observed.  If no string is
    * provided, the default service implementing the API will be used. For
    * example, `storage.googleapis.com` is the default for all event types in
    * the `google.storage` namespace.
    */
  var service: js.UndefOr[String] = js.native
}

object SchemaEventTrigger {
  @scala.inline
  def apply(): SchemaEventTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventTrigger]
  }
  @scala.inline
  implicit class SchemaEventTriggerOps[Self <: SchemaEventTrigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventType")(js.undefined)
        ret
    }
    @scala.inline
    def withFailurePolicy(value: SchemaFailurePolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failurePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailurePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failurePolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
    @scala.inline
    def withService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
  }
  
}

