package typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreRawEmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledRawEmail extends _RawEmail {
  /**
    * The raw data of the email.
    */
  @JSName("Data")
  var Data__UnmarshalledRawEmail: js.UndefOr[scala.scalajs.js.typedarray.Uint8Array] = js.undefined
}

object _UnmarshalledRawEmail {
  @scala.inline
  def apply(Data: scala.scalajs.js.typedarray.Uint8Array = null): _UnmarshalledRawEmail = {
    val __obj = js.Dynamic.literal()
    if (Data != null) __obj.updateDynamic("Data")(Data.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledRawEmail]
  }
}

