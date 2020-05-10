package typingsSlinky.firebaseAdmin.admin.messaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the server response from the legacy
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.messaging.Messaging#sendToDevice `sendToDevice()`} method.
  *
  * See
  * [Send to individual devices](/docs/cloud-messaging/admin/send-messages#send_to_individual_devices)
  * for code samples and detailed documentation.
  */
@js.native
trait MessagingDevicesResponse extends js.Object {
  /**
    * The number of results that contain a canonical registration token. A
    * canonical registration token is the registration token corresponding to the
    * last registration requested by the client app. This is the token that you
    * should use when sending future messages to the device.
    *
    * You can access the canonical registration tokens within the
    * [`results`](#results) property.
    */
  var canonicalRegistrationTokenCount: Double = js.native
  /**
    * The number of messages that could not be processed and resulted in an error.
    */
  var failureCount: Double = js.native
  /**
    * The unique ID number identifying this multicast message.
    */
  var multicastId: Double = js.native
  /**
    * An array of `MessagingDeviceResult` objects representing the status of the
    * processed messages. The objects are listed in the same order as in the
    * request. That is, for each registration token in the request, its result has
    * the same index in this array. If only a single registration token is
    * provided, this array will contain a single object.
    */
  var results: js.Array[MessagingDeviceResult] = js.native
  /**
    * The number of messages that were successfully processed and sent.
    */
  var successCount: Double = js.native
}

object MessagingDevicesResponse {
  @scala.inline
  def apply(
    canonicalRegistrationTokenCount: Double,
    failureCount: Double,
    multicastId: Double,
    results: js.Array[MessagingDeviceResult],
    successCount: Double
  ): MessagingDevicesResponse = {
    val __obj = js.Dynamic.literal(canonicalRegistrationTokenCount = canonicalRegistrationTokenCount.asInstanceOf[js.Any], failureCount = failureCount.asInstanceOf[js.Any], multicastId = multicastId.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], successCount = successCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagingDevicesResponse]
  }
  @scala.inline
  implicit class MessagingDevicesResponseOps[Self <: MessagingDevicesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanonicalRegistrationTokenCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonicalRegistrationTokenCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailureCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMulticastId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multicastId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResults(value: js.Array[MessagingDeviceResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccessCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

