package typingsSlinky.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Reflog")
@js.native
class Reflog ()
  extends typingsSlinky.nodegit.refLogMod.Reflog
/* static members */
object Reflog {
  
  @JSImport("nodegit", "Reflog.delete")
  @js.native
  def delete(repo: typingsSlinky.nodegit.repositoryMod.Repository, name: String): Double = js.native
  
  @JSImport("nodegit", "Reflog.read")
  @js.native
  def read(repo: typingsSlinky.nodegit.repositoryMod.Repository, name: String): js.Promise[typingsSlinky.nodegit.refLogMod.Reflog] = js.native
  
  @JSImport("nodegit", "Reflog.rename")
  @js.native
  def rename(repo: typingsSlinky.nodegit.repositoryMod.Repository, oldName: String, name: String): Double = js.native
}
