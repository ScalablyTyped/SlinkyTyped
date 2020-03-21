package typingsSlinky.chromeApps.chrome.usb

import typingsSlinky.chromeApps.AnonADAPTIVE
import typingsSlinky.chromeApps.AnonBULK
import typingsSlinky.chromeApps.AnonDATA_
import typingsSlinky.chromeApps.AnonIN
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chromeAppsStrings.adaptive
import typingsSlinky.chromeApps.chromeAppsStrings.asynchronous
import typingsSlinky.chromeApps.chromeAppsStrings.bulk
import typingsSlinky.chromeApps.chromeAppsStrings.control
import typingsSlinky.chromeApps.chromeAppsStrings.data
import typingsSlinky.chromeApps.chromeAppsStrings.explicitFeedback
import typingsSlinky.chromeApps.chromeAppsStrings.feedback
import typingsSlinky.chromeApps.chromeAppsStrings.in
import typingsSlinky.chromeApps.chromeAppsStrings.interrupt
import typingsSlinky.chromeApps.chromeAppsStrings.isochronous
import typingsSlinky.chromeApps.chromeAppsStrings.notification
import typingsSlinky.chromeApps.chromeAppsStrings.out
import typingsSlinky.chromeApps.chromeAppsStrings.periodic
import typingsSlinky.chromeApps.chromeAppsStrings.synchronous
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
  var direction: ToStringLiteral[AnonIN, String, Exclude[String, in | out]]
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
    ToStringLiteral[AnonADAPTIVE, String, Exclude[String, asynchronous | adaptive | synchronous]]
  ] = js.undefined
  /**
    * Transfer type.
    * @see TransferType
    *
    */
  var `type`: ToStringLiteral[AnonBULK, String, Exclude[String, control | interrupt | isochronous | bulk]]
  /**
    * Endpoint usage hint
    * @see UsageType
    */
  var usage: js.UndefOr[
    ToStringLiteral[
      AnonDATA_, 
      String, 
      Exclude[String, notification | data | periodic | feedback | explicitFeedback]
    ]
  ] = js.undefined
}

object EndpointDescriptor {
  @scala.inline
  def apply(
    address: integer,
    direction: ToStringLiteral[AnonIN, String, Exclude[String, in | out]],
    extra_data: scala.scalajs.js.typedarray.ArrayBuffer,
    maximumPacketSize: integer,
    `type`: ToStringLiteral[AnonBULK, String, Exclude[String, control | interrupt | isochronous | bulk]],
    pollingInterval: Int | Double = null,
    synchronization: ToStringLiteral[AnonADAPTIVE, String, Exclude[String, asynchronous | adaptive | synchronous]] = null,
    usage: ToStringLiteral[
      AnonDATA_, 
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

