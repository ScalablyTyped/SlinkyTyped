package typingsSlinky.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openpgp.openpgp.EncryptResult & {  data  :string} */
@js.native
trait EncryptResultdatastring extends js.Object {
  var data: String = js.native
  var sessionKey: AeadAlgorithm = js.native
}

object EncryptResultdatastring {
  @scala.inline
  def apply(data: String, sessionKey: AeadAlgorithm): EncryptResultdatastring = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptResultdatastring]
  }
  @scala.inline
  implicit class EncryptResultdatastringOps[Self <: EncryptResultdatastring] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionKey(value: AeadAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

