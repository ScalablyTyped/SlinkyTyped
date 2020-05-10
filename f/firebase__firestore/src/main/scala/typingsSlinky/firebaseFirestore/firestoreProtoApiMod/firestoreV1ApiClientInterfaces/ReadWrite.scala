package typingsSlinky.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadWrite extends js.Object {
  var retryTransaction: js.UndefOr[String] = js.native
}

object ReadWrite {
  @scala.inline
  def apply(): ReadWrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadWrite]
  }
  @scala.inline
  implicit class ReadWriteOps[Self <: ReadWrite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRetryTransaction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryTransaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryTransaction")(js.undefined)
        ret
    }
  }
  
}

