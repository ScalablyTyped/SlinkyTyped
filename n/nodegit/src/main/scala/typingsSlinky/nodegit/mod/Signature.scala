package typingsSlinky.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Signature")
@js.native
class Signature ()
  extends typingsSlinky.nodegit.signatureMod.Signature
/* static members */
object Signature {
  
  @JSImport("nodegit", "Signature.default")
  @js.native
  def default(repo: typingsSlinky.nodegit.repositoryMod.Repository): typingsSlinky.nodegit.signatureMod.Signature = js.native
  
  @JSImport("nodegit", "Signature.create")
  @js.native
  def create(name: String, email: String, time: Double, offset: Double): typingsSlinky.nodegit.signatureMod.Signature = js.native
  
  @JSImport("nodegit", "Signature.fromBuffer")
  @js.native
  def fromBuffer(buf: String): js.Promise[typingsSlinky.nodegit.signatureMod.Signature] = js.native
  
  @JSImport("nodegit", "Signature.now")
  @js.native
  def now(name: String, email: String): typingsSlinky.nodegit.signatureMod.Signature = js.native
}
