package typingsSlinky.node.anon

import typingsSlinky.node.cryptoMod.KeyFormat
import typingsSlinky.node.nodeStrings.spki
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatType[PubF /* <: KeyFormat */] extends js.Object {
  var format: PubF = js.native
  var `type`: spki = js.native
}

object FormatType {
  @scala.inline
  def apply[PubF](format: PubF, `type`: spki): FormatType[PubF] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatType[PubF]]
  }
  @scala.inline
  implicit class FormatTypeOps[Self[pubf] <: FormatType[pubf], PubF] (val x: Self[PubF]) extends AnyVal {
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
    def withType(value: spki): Self[PubF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

