package typingsSlinky.elliptic.mod.ec

import typingsSlinky.elliptic.mod.BNInput
import typingsSlinky.elliptic.mod.SignatureInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureOptions extends SignatureInput {
  var r: BNInput = js.native
  var recoveryParam: js.UndefOr[Double] = js.native
  var s: BNInput = js.native
}

object SignatureOptions {
  @scala.inline
  def apply(r: BNInput, s: BNInput): SignatureOptions = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureOptions]
  }
  @scala.inline
  implicit class SignatureOptionsOps[Self <: SignatureOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR(value: BNInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS(value: BNInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecoveryParam(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recoveryParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecoveryParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recoveryParam")(js.undefined)
        ret
    }
  }
  
}

