package typingsSlinky.hdkey.mod

import typingsSlinky.hdkey.anon.Xpriv
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HDNode extends js.Object {
  var chainCode: Buffer = js.native
  var privateKey: Buffer = js.native
  var publicKey: Buffer = js.native
  def derive(path: String): HDNode = js.native
  def toJSON(): Xpriv = js.native
}

object HDNode {
  @scala.inline
  def apply(
    chainCode: Buffer,
    derive: String => HDNode,
    privateKey: Buffer,
    publicKey: Buffer,
    toJSON: () => Xpriv
  ): HDNode = {
    val __obj = js.Dynamic.literal(chainCode = chainCode.asInstanceOf[js.Any], derive = js.Any.fromFunction1(derive), privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[HDNode]
  }
  @scala.inline
  implicit class HDNodeOps[Self <: HDNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChainCode(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chainCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDerive(value: String => HDNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("derive")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPrivateKey(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicKey(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => Xpriv): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

