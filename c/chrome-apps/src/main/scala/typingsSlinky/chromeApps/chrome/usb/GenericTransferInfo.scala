package typingsSlinky.chromeApps.chrome.usb

import typingsSlinky.chromeApps.anon.IN
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chromeAppsStrings.OUT
import typingsSlinky.chromeApps.chromeAppsStrings.in_
import typingsSlinky.chromeApps.chromeAppsStrings.out_
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericTransferInfo extends js.Object {
  /** The data to transmit (required only by output transfers). */
  var data: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
  /**
    * The transfer direction ('in' or 'out').
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
  /** The target endpoint address. The interface containing this endpoint must be claimed. */
  var endpoint: integer = js.native
  /** The maximum number of bytes to receive (required only by input transfers). */
  var length: js.UndefOr[integer] = js.native
  /**
    * Request timeout (in milliseconds).
    * The default value 0 indicates no timeout.
    * @default 0
    */
  var timeout: js.UndefOr[integer] = js.native
}

object GenericTransferInfo {
  @scala.inline
  def apply(
    direction: ToStringLiteral[
      IN, 
      /* keyof chrome-apps.anon.IN */ typingsSlinky.chromeApps.chromeAppsStrings.IN | OUT, 
      Exclude[
        /* keyof chrome-apps.anon.IN */ typingsSlinky.chromeApps.chromeAppsStrings.IN | OUT, 
        in_ | out_
      ]
    ],
    endpoint: integer
  ): GenericTransferInfo = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericTransferInfo]
  }
  @scala.inline
  implicit class GenericTransferInfoOps[Self <: GenericTransferInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(
      value: ToStringLiteral[
          IN, 
          /* keyof chrome-apps.anon.IN */ typingsSlinky.chromeApps.chromeAppsStrings.IN | OUT, 
          Exclude[
            /* keyof chrome-apps.anon.IN */ typingsSlinky.chromeApps.chromeAppsStrings.IN | OUT, 
            in_ | out_
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpoint(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
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

