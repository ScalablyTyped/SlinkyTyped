package typingsSlinky.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VcardTelephone extends js.Object {
  /** A nested telephone URI of the form: tel:+1-123-456-7890. */
  var uri: js.UndefOr[String] = js.native
}

object VcardTelephone {
  @scala.inline
  def apply(): VcardTelephone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VcardTelephone]
  }
  @scala.inline
  implicit class VcardTelephoneOps[Self <: VcardTelephone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
  }
  
}

