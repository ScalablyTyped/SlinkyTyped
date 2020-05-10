package typingsSlinky.freedom.freedom.PgpProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyDecryptResult extends js.Object {
  var data: js.typedarray.ArrayBuffer = js.native
  var signedBy: js.Array[String] = js.native
}

object VerifyDecryptResult {
  @scala.inline
  def apply(data: js.typedarray.ArrayBuffer, signedBy: js.Array[String]): VerifyDecryptResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], signedBy = signedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyDecryptResult]
  }
  @scala.inline
  implicit class VerifyDecryptResultOps[Self <: VerifyDecryptResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignedBy(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedBy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

