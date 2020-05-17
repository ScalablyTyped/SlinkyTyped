package typingsSlinky.node.anon

import typingsSlinky.node.cryptoMod.KeyFormat
import typingsSlinky.node.nodeStrings.pkcs1
import typingsSlinky.node.nodeStrings.spki
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Format[PubF /* <: KeyFormat */] extends js.Object {
  var format: PubF = js.native
  var `type`: pkcs1 | spki = js.native
}

object Format {
  @scala.inline
  def apply[PubF](format: PubF, `type`: pkcs1 | spki): Format[PubF] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format[PubF]]
  }
  @scala.inline
  implicit class FormatOps[Self[pubf] <: Format[pubf], PubF] (val x: Self[PubF]) extends AnyVal {
    @scala.inline
    def duplicate: Self[PubF] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[PubF]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[PubF] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[PubF] with Other]
    @scala.inline
    def withFormat(value: PubF): Self[PubF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: pkcs1 | spki): Self[PubF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

