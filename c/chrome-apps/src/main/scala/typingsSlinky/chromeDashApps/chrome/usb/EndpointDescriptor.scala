package typingsSlinky.chromeDashApps.chrome.usb

import typingsSlinky.chromeDashApps.Anon_ADAPTIVE
import typingsSlinky.chromeDashApps.Anon_BULK
import typingsSlinky.chromeDashApps.Anon_DATA
import typingsSlinky.chromeDashApps.Anon_IN
import typingsSlinky.chromeDashApps.chrome.ToStringLiteral
import typingsSlinky.chromeDashApps.chrome.integer
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.adaptive
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.asynchronous
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.bulk
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.control
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.data
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.explicitFeedback
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.feedback
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.in
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.interrupt
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.isochronous
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.notification
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.out
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.periodic
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.synchronous
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Since Chrome 29. */
trait EndpointDescriptor extends js.Object {
  /** Transfer type. */
  var address: integer
  /**
    * Transfer direction.
    * @see Direction
    */
  var direction: ToStringLiteral[Anon_IN, String, Exclude[String, in | out]]
  /**
    * Extra descriptor data associated with this endpoint.
    * @since Chrome 39.
    */
  var extra_data: scala.scalajs.js.typedarray.ArrayBuffer
  /** Maximum packet size. */
  var maximumPacketSize: integer
  /** Polling interval (interrupt and isochronous only). */
  var pollingInterval: js.UndefOr[integer] = js.undefined
  /**
    * Transfer synchronization mode (isochronous only).
    * @see SynchronizationType
    */
  var synchronization: js.UndefOr[
    ToStringLiteral[Anon_ADAPTIVE, String, Exclude[String, asynchronous | adaptive | synchronous]]
  ] = js.undefined
  /**
    * Transfer type.
    * @see TransferType
    *
    */
  var `type`: ToStringLiteral[Anon_BULK, String, Exclude[String, control | interrupt | isochronous | bulk]]
  /**
    * Endpoint usage hint
    * @see UsageType
    */
  var usage: js.UndefOr[
    ToStringLiteral[
      Anon_DATA, 
      String, 
      Exclude[String, notification | data | periodic | feedback | explicitFeedback]
    ]
  ] = js.undefined
}

object EndpointDescriptor {
  @scala.inline
  def apply(
    address: integer,
    direction: ToStringLiteral[Anon_IN, String, Exclude[String, in | out]],
    extra_data: scala.scalajs.js.typedarray.ArrayBuffer,
    maximumPacketSize: integer,
    `type`: ToStringLiteral[Anon_BULK, String, Exclude[String, control | interrupt | isochronous | bulk]],
    pollingInterval: Int | Double = null,
    synchronization: ToStringLiteral[Anon_ADAPTIVE, String, Exclude[String, asynchronous | adaptive | synchronous]] = null,
    usage: ToStringLiteral[
      Anon_DATA, 
      String, 
      Exclude[String, notification | data | periodic | feedback | explicitFeedback]
    ] = null
  ): EndpointDescriptor = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], extra_data = extra_data.asInstanceOf[js.Any], maximumPacketSize = maximumPacketSize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (pollingInterval != null) __obj.updateDynamic("pollingInterval")(pollingInterval.asInstanceOf[js.Any])
    if (synchronization != null) __obj.updateDynamic("synchronization")(synchronization.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointDescriptor]
  }
}

