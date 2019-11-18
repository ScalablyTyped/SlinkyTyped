package typingsSlinky.node

import typingsSlinky.node.cryptoMod.KeyFormat
import typingsSlinky.node.nodeStrings.pkcs1
import typingsSlinky.node.nodeStrings.spki
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format[PubF /* <: KeyFormat */] extends js.Object {
  var format: PubF
  var `type`: pkcs1 | spki
}

object Anon_Format {
  @scala.inline
  def apply[PubF /* <: KeyFormat */](format: PubF, `type`: pkcs1 | spki): Anon_Format[PubF] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Format[PubF]]
  }
}

