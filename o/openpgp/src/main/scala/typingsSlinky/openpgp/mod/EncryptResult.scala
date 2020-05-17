package typingsSlinky.openpgp.mod

import typingsSlinky.openpgp.anon.AeadAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptResult extends js.Object {
  var sessionKey: AeadAlgorithm = js.native
}

object EncryptResult {
  @scala.inline
  def apply(sessionKey: AeadAlgorithm): EncryptResult = {
    val __obj = js.Dynamic.literal(sessionKey = sessionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptResult]
  }
  @scala.inline
  implicit class EncryptResultOps[Self <: EncryptResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSessionKey(value: AeadAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

