package typingsSlinky.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Hashsig")
@js.native
class Hashsig ()
  extends typingsSlinky.nodegit.hashSigMod.Hashsig
/* static members */
@JSImport("nodegit", "Hashsig")
@js.native
object Hashsig extends js.Object {
  
  def create(buf: String, buflen: Double, opts: Double): js.Promise[typingsSlinky.nodegit.hashSigMod.Hashsig] = js.native
  
  def createFromFile(path: String, opts: Double): js.Promise[typingsSlinky.nodegit.hashSigMod.Hashsig] = js.native
}
