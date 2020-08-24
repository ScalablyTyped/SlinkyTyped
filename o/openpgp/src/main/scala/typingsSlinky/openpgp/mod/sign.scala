package typingsSlinky.openpgp.mod

import typingsSlinky.openpgp.anon.Data
import typingsSlinky.openpgp.anon.Message
import typingsSlinky.openpgp.anon.SignOptionsarmorfalsedeta
import typingsSlinky.openpgp.anon.SignOptionsarmorfalsedetaArmor
import typingsSlinky.openpgp.anon.SignOptionsarmortrueundef
import typingsSlinky.openpgp.anon.SignOptionsarmortrueundefArmor
import typingsSlinky.openpgp.anon.Signature
import typingsSlinky.openpgp.anon.SignatureSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "sign")
@js.native
object sign extends js.Object {
  def apply(options: SignOptionsarmorfalsedeta): js.Promise[Message] = js.native
  def apply(options: SignOptionsarmorfalsedetaArmor): js.Promise[SignatureSignature] = js.native
  def apply(options: SignOptionsarmortrueundef): js.Promise[Data] = js.native
  def apply(options: SignOptionsarmortrueundefArmor): js.Promise[Signature] = js.native
  def apply(options: SignOptions): js.Promise[SignResult] = js.native
}

