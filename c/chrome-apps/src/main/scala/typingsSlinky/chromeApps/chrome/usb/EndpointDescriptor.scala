package typingsSlinky.chromeApps.chrome.usb

import typingsSlinky.chromeApps.anon.ADAPTIVE
import typingsSlinky.chromeApps.anon.BULK
import typingsSlinky.chromeApps.anon.DATA_
import typingsSlinky.chromeApps.anon.IN
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chromeAppsStrings.ASYNCHRONOUS
import typingsSlinky.chromeApps.chromeAppsStrings.CONTROL
import typingsSlinky.chromeApps.chromeAppsStrings.DATA
import typingsSlinky.chromeApps.chromeAppsStrings.EXPLICIT_FEEDBACK
import typingsSlinky.chromeApps.chromeAppsStrings.FEEDBACK
import typingsSlinky.chromeApps.chromeAppsStrings.INTERRUPT
import typingsSlinky.chromeApps.chromeAppsStrings.ISOCHRONOUS
import typingsSlinky.chromeApps.chromeAppsStrings.NOTIFICATION
import typingsSlinky.chromeApps.chromeAppsStrings.OUT
import typingsSlinky.chromeApps.chromeAppsStrings.PERIODIC
import typingsSlinky.chromeApps.chromeAppsStrings.SYNCHRONOUS
import typingsSlinky.chromeApps.chromeAppsStrings.adaptive_
import typingsSlinky.chromeApps.chromeAppsStrings.asynchronous_
import typingsSlinky.chromeApps.chromeAppsStrings.bulk_
import typingsSlinky.chromeApps.chromeAppsStrings.control_
import typingsSlinky.chromeApps.chromeAppsStrings.data_
import typingsSlinky.chromeApps.chromeAppsStrings.explicitFeedback
import typingsSlinky.chromeApps.chromeAppsStrings.feedback_
import typingsSlinky.chromeApps.chromeAppsStrings.in_
import typingsSlinky.chromeApps.chromeAppsStrings.interrupt_
import typingsSlinky.chromeApps.chromeAppsStrings.isochronous_
import typingsSlinky.chromeApps.chromeAppsStrings.notification_
import typingsSlinky.chromeApps.chromeAppsStrings.out_
import typingsSlinky.chromeApps.chromeAppsStrings.periodic_
import typingsSlinky.chromeApps.chromeAppsStrings.synchronous_
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Since Chrome 29. */
@js.native
trait EndpointDescriptor extends js.Object {
  /** Transfer type. */
  var address: integer = js.native
  /**
    * Transfer direction.
    * @see Direction
    */
  var direction: ToStringLiteral[
    IN, 
    /* keyof chrome-apps.anon.IN */ typingsSlinky.chromeApps.chromeAppsStrings.IN | OUT, 
    Exclude[
      /* keyof chrome-apps.anon.IN */ typingsSlinky.chromeApps.chromeAppsStrings.IN | OUT, 
      in_ | out_
    ]
  ] = js.native
  /**
    * Extra descriptor data associated with this endpoint.
    * @since Chrome 39.
    */
  var extra_data: js.typedarray.ArrayBuffer = js.native
  /** Maximum packet size. */
  var maximumPacketSize: integer = js.native
  /** Polling interval (interrupt and isochronous only). */
  var pollingInterval: js.UndefOr[integer] = js.native
  /**
    * Transfer synchronization mode (isochronous only).
    * @see SynchronizationType
    */
  var synchronization: js.UndefOr[
    ToStringLiteral[
      ADAPTIVE, 
      /* keyof chrome-apps.anon.ADAPTIVE */ ASYNCHRONOUS | typingsSlinky.chromeApps.chromeAppsStrings.ADAPTIVE | SYNCHRONOUS, 
      Exclude[
        /* keyof chrome-apps.anon.ADAPTIVE */ ASYNCHRONOUS | typingsSlinky.chromeApps.chromeAppsStrings.ADAPTIVE | SYNCHRONOUS, 
        asynchronous_ | adaptive_ | synchronous_
      ]
    ]
  ] = js.native
  /**
    * Transfer type.
    * @see TransferType
    *
    */
  var `type`: ToStringLiteral[
    BULK, 
    /* keyof chrome-apps.anon.BULK */ CONTROL | INTERRUPT | ISOCHRONOUS | typingsSlinky.chromeApps.chromeAppsStrings.BULK, 
    Exclude[
      /* keyof chrome-apps.anon.BULK */ CONTROL | INTERRUPT | ISOCHRONOUS | typingsSlinky.chromeApps.chromeAppsStrings.BULK, 
      control_ | interrupt_ | isochronous_ | bulk_
    ]
  ] = js.native
  /**
    * Endpoint usage hint
    * @see UsageType
    */
  var usage: js.UndefOr[
    ToStringLiteral[
      DATA_, 
      /* keyof chrome-apps.anon.DATA */ DATA | FEEDBACK | EXPLICIT_FEEDBACK | PERIODIC | NOTIFICATION, 
      Exclude[
        /* keyof chrome-apps.anon.DATA */ DATA | FEEDBACK | EXPLICIT_FEEDBACK | PERIODIC | NOTIFICATION, 
        notification_ | data_ | periodic_ | feedback_ | explicitFeedback
      ]
    ]
  ] = js.native
}

object EndpointDescriptor {
  @scala.inline
  def apply(
    address: integer,
    direction: ToStringLiteral[
      IN, 
      /* keyof chrome-apps.anon.IN */ typingsSlinky.chromeApps.chromeAppsStrings.IN | OUT, 
      Exclude[
        /* keyof chrome-apps.anon.IN */ typingsSlinky.chromeApps.chromeAppsStrings.IN | OUT, 
        in_ | out_
      ]
    ],
    extra_data: js.typedarray.ArrayBuffer,
    maximumPacketSize: integer,
    `type`: ToStringLiteral[
      BULK, 
      /* keyof chrome-apps.anon.BULK */ CONTROL | INTERRUPT | ISOCHRONOUS | typingsSlinky.chromeApps.chromeAppsStrings.BULK, 
      Exclude[
        /* keyof chrome-apps.anon.BULK */ CONTROL | INTERRUPT | ISOCHRONOUS | typingsSlinky.chromeApps.chromeAppsStrings.BULK, 
        control_ | interrupt_ | isochronous_ | bulk_
      ]
    ]
  ): EndpointDescriptor = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], extra_data = extra_data.asInstanceOf[js.Any], maximumPacketSize = maximumPacketSize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointDescriptor]
  }
  @scala.inline
  implicit class EndpointDescriptorOps[Self <: EndpointDescriptor] (val x: Self) extends AnyVal {
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
    def setAddress(value: integer): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(
      value: ToStringLiteral[
          IN, 
          /* keyof chrome-apps.anon.IN */ typingsSlinky.chromeApps.chromeAppsStrings.IN | OUT, 
          Exclude[
            /* keyof chrome-apps.anon.IN */ typingsSlinky.chromeApps.chromeAppsStrings.IN | OUT, 
            in_ | out_
          ]
        ]
    ): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtra_data(value: js.typedarray.ArrayBuffer): Self = this.set("extra_data", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaximumPacketSize(value: integer): Self = this.set("maximumPacketSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(
      value: ToStringLiteral[
          BULK, 
          /* keyof chrome-apps.anon.BULK */ CONTROL | INTERRUPT | ISOCHRONOUS | typingsSlinky.chromeApps.chromeAppsStrings.BULK, 
          Exclude[
            /* keyof chrome-apps.anon.BULK */ CONTROL | INTERRUPT | ISOCHRONOUS | typingsSlinky.chromeApps.chromeAppsStrings.BULK, 
            control_ | interrupt_ | isochronous_ | bulk_
          ]
        ]
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setPollingInterval(value: integer): Self = this.set("pollingInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePollingInterval: Self = this.set("pollingInterval", js.undefined)
    @scala.inline
    def setSynchronization(
      value: ToStringLiteral[
          ADAPTIVE, 
          /* keyof chrome-apps.anon.ADAPTIVE */ ASYNCHRONOUS | typingsSlinky.chromeApps.chromeAppsStrings.ADAPTIVE | SYNCHRONOUS, 
          Exclude[
            /* keyof chrome-apps.anon.ADAPTIVE */ ASYNCHRONOUS | typingsSlinky.chromeApps.chromeAppsStrings.ADAPTIVE | SYNCHRONOUS, 
            asynchronous_ | adaptive_ | synchronous_
          ]
        ]
    ): Self = this.set("synchronization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSynchronization: Self = this.set("synchronization", js.undefined)
    @scala.inline
    def setUsage(
      value: ToStringLiteral[
          DATA_, 
          /* keyof chrome-apps.anon.DATA */ DATA | FEEDBACK | EXPLICIT_FEEDBACK | PERIODIC | NOTIFICATION, 
          Exclude[
            /* keyof chrome-apps.anon.DATA */ DATA | FEEDBACK | EXPLICIT_FEEDBACK | PERIODIC | NOTIFICATION, 
            notification_ | data_ | periodic_ | feedback_ | explicitFeedback
          ]
        ]
    ): Self = this.set("usage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsage: Self = this.set("usage", js.undefined)
  }
  
}

