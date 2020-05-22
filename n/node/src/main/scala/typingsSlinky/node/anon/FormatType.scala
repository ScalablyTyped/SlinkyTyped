package typingsSlinky.node.anon

import typingsSlinky.node.cryptoMod.KeyFormat
import typingsSlinky.node.nodeStrings.spki
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatType[PubF /* <: KeyFormat */] extends js.Object {
  var format: PubF
  var `type`: spki
}

object FormatType {
  @scala.inline
  def apply[PubF](format: PubF, `type`: spki): FormatType[PubF] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatType[PubF]]
  }
}

