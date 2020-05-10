package typingsSlinky.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

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
    * Required. The type of event to observe. For example:
    * `providers/cloud.storage/eventTypes/object.change` and
    * `providers/cloud.pubsub/eventTypes/topic.publish`.  Event types match
    * pattern `providers/x/eventTypes/ *.*`. The pattern contains:  1.
    * namespace: For example, `cloud.storage` and
    * `google.firebase.analytics`. 2. resource type: The type of resource on
    * which event occurs. For    example, the Google Cloud Storage API includes
    * the type `object`. 3. action: The action that generates the event. For
    * example, action for    a Google Cloud Storage Object is &#39;change&#39;.
    * These parts are lower case.
    */
  var eventType: js.UndefOr[String] = js.native
  /**
    * Specifies policy for failed executions.
    */
  var failurePolicy: js.UndefOr[SchemaFailurePolicy] = js.native
  /**
    * Required. The resource(s) from which to observe events, for example,
    * `projects/_/buckets/myBucket`.  Not all syntactically correct values are
    * accepted by all services. For example:  1. The authorization model must
    * support it. Google Cloud Functions    only allows EventTriggers to be
    * deployed that observe resources in the    same project as the
    * `CloudFunction`. 2. The resource type must match the pattern expected for
    * an    `event_type`. For example, an `EventTrigger` that has an
    * `event_type` of &quot;google.pubsub.topic.publish&quot; should have a
    * resource    that matches Google Cloud Pub/Sub topics.  Additionally, some
    * services may support short names when creating an `EventTrigger`. These
    * will always be returned in the normalized &quot;long&quot; format.  See
    * each *service&#39;s* documentation for supported formats.
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

