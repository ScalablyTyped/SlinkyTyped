package typingsSlinky.passportSamlMetadata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMultipleCerts extends js.Object {
  var multipleCerts: Boolean = js.native
}

object AnonMultipleCerts {
  @scala.inline
  def apply(multipleCerts: Boolean): AnonMultipleCerts = {
    val __obj = js.Dynamic.literal(multipleCerts = multipleCerts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMultipleCerts]
  }
  @scala.inline
  implicit class AnonMultipleCertsOps[Self <: AnonMultipleCerts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultipleCerts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleCerts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

