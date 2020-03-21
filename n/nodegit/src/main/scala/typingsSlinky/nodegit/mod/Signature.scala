package typingsSlinky.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Signature")
@js.native
class Signature ()
  extends typingsSlinky.nodegit.signatureMod.Signature

/* static members */
@JSImport("nodegit", "Signature")
@js.native
object Signature extends js.Object {
  def create(name: String, email: String, time: Double, offset: Double): typingsSlinky.nodegit.signatureMod.Signature = js.native
  def default(repo: typingsSlinky.nodegit.repositoryMod.Repository): typingsSlinky.nodegit.signatureMod.Signature = js.native
  def fromBuffer(buf: String): js.Promise[typingsSlinky.nodegit.signatureMod.Signature] = js.native
  def now(name: String, email: String): typingsSlinky.nodegit.signatureMod.Signature = js.native
}

