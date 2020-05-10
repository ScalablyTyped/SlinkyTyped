package typingsSlinky.googleCloudKms.mod.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyOperationAttestation extends js.Object {
  var format: AttestationFormat = js.native
}

object KeyOperationAttestation {
  @scala.inline
  def apply(format: AttestationFormat): KeyOperationAttestation = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyOperationAttestation]
  }
  @scala.inline
  implicit class KeyOperationAttestationOps[Self <: KeyOperationAttestation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: AttestationFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

