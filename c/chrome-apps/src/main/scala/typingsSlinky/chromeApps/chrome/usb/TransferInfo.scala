package typingsSlinky.chromeApps.chrome.usb

import typingsSlinky.chromeApps.AnonCLASS
import typingsSlinky.chromeApps.AnonDEVICE
import typingsSlinky.chromeApps.AnonIN
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chromeAppsStrings.CLASS
import typingsSlinky.chromeApps.chromeAppsStrings.DEVICE
import typingsSlinky.chromeApps.chromeAppsStrings.ENDPOINT
import typingsSlinky.chromeApps.chromeAppsStrings.IN
import typingsSlinky.chromeApps.chromeAppsStrings.INTERFACE
import typingsSlinky.chromeApps.chromeAppsStrings.OTHER
import typingsSlinky.chromeApps.chromeAppsStrings.OUT
import typingsSlinky.chromeApps.chromeAppsStrings.RESERVED
import typingsSlinky.chromeApps.chromeAppsStrings.STANDARD
import typingsSlinky.chromeApps.chromeAppsStrings.VENDOR
import typingsSlinky.chromeApps.chromeAppsStrings.class_
import typingsSlinky.chromeApps.chromeAppsStrings.device__
import typingsSlinky.chromeApps.chromeAppsStrings.endpoint_
import typingsSlinky.chromeApps.chromeAppsStrings.in_
import typingsSlinky.chromeApps.chromeAppsStrings.interface_
import typingsSlinky.chromeApps.chromeAppsStrings.other_
import typingsSlinky.chromeApps.chromeAppsStrings.out_
import typingsSlinky.chromeApps.chromeAppsStrings.reserved_
import typingsSlinky.chromeApps.chromeAppsStrings.standard_
import typingsSlinky.chromeApps.chromeAppsStrings.vendor_
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferInfo extends js.Object {
  /** The data to transmit (required only by output transfers). */
  var data: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
  /**
    * The transfer direction ('in' or 'out').
    * @see Direction
    */
  var direction: ToStringLiteral[
    AnonIN, 
    /* keyof chrome-apps.AnonIN */ IN | OUT, 
    Exclude[/* keyof chrome-apps.AnonIN */ IN | OUT, in_ | out_]
  ] = js.native
  /** The wIndex field, see *Ibid*. */
  var index: integer = js.native
  /** The maximum number of bytes to receive(required only by input transfers). */
  var length: js.UndefOr[integer] = js.native
  /**
    * The transfer target.
    * The target given by index must be claimed if 'interface' or 'endpoint'.
    * @see Recipient
    */
  var recipient: ToStringLiteral[
    AnonDEVICE, 
    /* keyof chrome-apps.AnonDEVICE */ DEVICE | INTERFACE | ENDPOINT | OTHER, 
    Exclude[
      /* keyof chrome-apps.AnonDEVICE */ DEVICE | INTERFACE | ENDPOINT | OTHER, 
      device__ | interface_ | endpoint_ | other_
    ]
  ] = js.native
  /** The bRequest field, see *Universal Serial Bus Specification Revision 1.1 § 9.3.* */
  var request: integer = js.native
  /**
    * The request type.
    * @see RequestType
    */
  var requestType: ToStringLiteral[
    AnonCLASS, 
    /* keyof chrome-apps.AnonCLASS */ STANDARD | CLASS | VENDOR | RESERVED, 
    Exclude[
      /* keyof chrome-apps.AnonCLASS */ STANDARD | CLASS | VENDOR | RESERVED, 
      standard_ | class_ | vendor_ | reserved_
    ]
  ] = js.native
  /**
    * @since Chrome 43.
    * Request timeout (in milliseconds).
    * The default value 0 indicates no timeout.
    * @default 0
    */
  var timeout: js.UndefOr[integer] = js.native
  /** The wValue field, see *Ibid*. */
  var value: integer = js.native
}

object TransferInfo {
  @scala.inline
  def apply(
    direction: ToStringLiteral[
      AnonIN, 
      /* keyof chrome-apps.AnonIN */ IN | OUT, 
      Exclude[/* keyof chrome-apps.AnonIN */ IN | OUT, in_ | out_]
    ],
    index: integer,
    recipient: ToStringLiteral[
      AnonDEVICE, 
      /* keyof chrome-apps.AnonDEVICE */ DEVICE | INTERFACE | ENDPOINT | OTHER, 
      Exclude[
        /* keyof chrome-apps.AnonDEVICE */ DEVICE | INTERFACE | ENDPOINT | OTHER, 
        device__ | interface_ | endpoint_ | other_
      ]
    ],
    request: integer,
    requestType: ToStringLiteral[
      AnonCLASS, 
      /* keyof chrome-apps.AnonCLASS */ STANDARD | CLASS | VENDOR | RESERVED, 
      Exclude[
        /* keyof chrome-apps.AnonCLASS */ STANDARD | CLASS | VENDOR | RESERVED, 
        standard_ | class_ | vendor_ | reserved_
      ]
    ],
    value: integer
  ): TransferInfo = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestType = requestType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferInfo]
  }
  @scala.inline
  implicit class TransferInfoOps[Self <: TransferInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(
      value: ToStringLiteral[
          AnonIN, 
          /* keyof chrome-apps.AnonIN */ IN | OUT, 
          Exclude[/* keyof chrome-apps.AnonIN */ IN | OUT, in_ | out_]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipient(
      value: ToStringLiteral[
          AnonDEVICE, 
          /* keyof chrome-apps.AnonDEVICE */ DEVICE | INTERFACE | ENDPOINT | OTHER, 
          Exclude[
            /* keyof chrome-apps.AnonDEVICE */ DEVICE | INTERFACE | ENDPOINT | OTHER, 
            device__ | interface_ | endpoint_ | other_
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestType(
      value: ToStringLiteral[
          AnonCLASS, 
          /* keyof chrome-apps.AnonCLASS */ STANDARD | CLASS | VENDOR | RESERVED, 
          Exclude[
            /* keyof chrome-apps.AnonCLASS */ STANDARD | CLASS | VENDOR | RESERVED, 
            standard_ | class_ | vendor_ | reserved_
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

