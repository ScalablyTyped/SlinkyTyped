package typingsSlinky.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Refdb")
@js.native
class Refdb ()
  extends typingsSlinky.nodegit.refDbMod.Refdb
/* static members */
@JSImport("nodegit", "Refdb")
@js.native
object Refdb extends js.Object {
  
  def open(repo: typingsSlinky.nodegit.repositoryMod.Repository): js.Promise[typingsSlinky.nodegit.refDbMod.Refdb] = js.native
}
