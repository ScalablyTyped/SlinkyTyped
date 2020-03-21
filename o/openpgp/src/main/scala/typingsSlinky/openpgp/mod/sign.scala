package typingsSlinky.openpgp.mod

import typingsSlinky.openpgp.AnonData
import typingsSlinky.openpgp.AnonMessage
import typingsSlinky.openpgp.AnonSignature
import typingsSlinky.openpgp.AnonSignatureSignature
import typingsSlinky.openpgp.SignOptionsarmorfalsedeta
import typingsSlinky.openpgp.SignOptionsarmorfalsedetaArmor
import typingsSlinky.openpgp.SignOptionsarmortruedetac
import typingsSlinky.openpgp.SignOptionsarmortruedetacArmor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "sign")
@js.native
object sign extends js.Object {
  def apply(options: SignOptionsarmorfalsedeta): js.Promise[AnonMessage] = js.native
  def apply(options: SignOptionsarmorfalsedetaArmor): js.Promise[AnonSignatureSignature] = js.native
  def apply(options: SignOptionsarmortruedetac): js.Promise[AnonData] = js.native
  def apply(options: SignOptionsarmortruedetacArmor): js.Promise[AnonSignature] = js.native
  def apply(options: SignOptions): js.Promise[SignResult] = js.native
}

