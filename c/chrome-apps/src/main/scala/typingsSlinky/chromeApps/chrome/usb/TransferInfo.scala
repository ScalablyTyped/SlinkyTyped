package typingsSlinky.chromeApps.chrome.usb

import typingsSlinky.chromeApps.AnonCLASS
import typingsSlinky.chromeApps.AnonDEVICE
import typingsSlinky.chromeApps.AnonIN
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chromeAppsStrings.`class`
import typingsSlinky.chromeApps.chromeAppsStrings.device_
import typingsSlinky.chromeApps.chromeAppsStrings.endpoint
import typingsSlinky.chromeApps.chromeAppsStrings.in
import typingsSlinky.chromeApps.chromeAppsStrings.interface
import typingsSlinky.chromeApps.chromeAppsStrings.other_
import typingsSlinky.chromeApps.chromeAppsStrings.out
import typingsSlinky.chromeApps.chromeAppsStrings.reserved
import typingsSlinky.chromeApps.chromeAppsStrings.standard
import typingsSlinky.chromeApps.chromeAppsStrings.vendor
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferInfo extends js.Object {
  /** The data to transmit (required only by output transfers). */
  var data: js.UndefOr[scala.scalajs.js.typedarray.ArrayBuffer] = js.undefined
  /**
    * The transfer direction ('in' or 'out').
    * @see Direction
    */
  var direction: ToStringLiteral[AnonIN, String, Exclude[String, in | out]]
  /** The wIndex field, see *Ibid*. */
  var index: integer
  /** The maximum number of bytes to receive(required only by input transfers). */
  var length: js.UndefOr[integer] = js.undefined
  /**
    * The transfer target.
    * The target given by index must be claimed if 'interface' or 'endpoint'.
    * @see Recipient
    */
  var recipient: ToStringLiteral[AnonDEVICE, String, Exclude[String, device_ | interface | endpoint | other_]]
  /** The bRequest field, see *Universal Serial Bus Specification Revision 1.1 § 9.3.* */
  var request: integer
  /**
    * The request type.
    * @see RequestType
    */
  var requestType: ToStringLiteral[AnonCLASS, String, Exclude[String, standard | `class` | vendor | reserved]]
  /**
    * @since Chrome 43.
    * Request timeout (in milliseconds).
    * The default value 0 indicates no timeout.
    * @default 0
    */
  var timeout: js.UndefOr[integer] = js.undefined
  /** The wValue field, see *Ibid*. */
  var value: integer
}

object TransferInfo {
  @scala.inline
  def apply(
    direction: ToStringLiteral[AnonIN, String, Exclude[String, in | out]],
    index: integer,
    recipient: ToStringLiteral[AnonDEVICE, String, Exclude[String, device_ | interface | endpoint | other_]],
    request: integer,
    requestType: ToStringLiteral[AnonCLASS, String, Exclude[String, standard | `class` | vendor | reserved]],
    value: integer,
    data: scala.scalajs.js.typedarray.ArrayBuffer = null,
    length: Int | Double = null,
    timeout: Int | Double = null
  ): TransferInfo = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestType = requestType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferInfo]
  }
}

