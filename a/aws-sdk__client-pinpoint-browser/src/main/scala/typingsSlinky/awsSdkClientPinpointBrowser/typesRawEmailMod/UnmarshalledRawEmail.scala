package typingsSlinky.awsSdkClientPinpointBrowser.typesRawEmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledRawEmail extends RawEmail {
  /**
    * The raw data of the email.
    */
  @JSName("Data")
  var Data_UnmarshalledRawEmail: js.UndefOr[js.typedarray.Uint8Array] = js.native
}

object UnmarshalledRawEmail {
  @scala.inline
  def apply(): UnmarshalledRawEmail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledRawEmail]
  }
  @scala.inline
  implicit class UnmarshalledRawEmailOps[Self <: UnmarshalledRawEmail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data")(js.undefined)
        ret
    }
  }
  
}

