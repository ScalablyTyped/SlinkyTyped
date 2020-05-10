package typingsSlinky.node.cryptoMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyPairSyncResult[T1 /* <: String | Buffer */, T2 /* <: String | Buffer */] extends js.Object {
  var privateKey: T2 = js.native
  var publicKey: T1 = js.native
}

object KeyPairSyncResult {
  @scala.inline
  def apply[T1, T2](privateKey: T2, publicKey: T1): KeyPairSyncResult[T1, T2] = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPairSyncResult[T1, T2]]
  }
  @scala.inline
  implicit class KeyPairSyncResultOps[Self[t1, t2] <: KeyPairSyncResult[t1, t2], T1, T2] (val x: Self[T1, T2]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T1, T2] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T1, T2]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T1, T2]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T1, T2]) with Other]
    @scala.inline
    def withPrivateKey(value: T2): Self[T1, T2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicKey(value: T1): Self[T1, T2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

