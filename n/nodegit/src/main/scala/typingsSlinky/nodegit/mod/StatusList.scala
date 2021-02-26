package typingsSlinky.nodegit.mod

import typingsSlinky.nodegit.statusOptionsMod.StatusOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "StatusList")
@js.native
class StatusList ()
  extends typingsSlinky.nodegit.statusListMod.StatusList
/* static members */
object StatusList {
  
  @JSImport("nodegit", "StatusList.create")
  @js.native
  def create(repo: typingsSlinky.nodegit.repositoryMod.Repository): js.Promise[typingsSlinky.nodegit.statusListMod.StatusList] = js.native
  @JSImport("nodegit", "StatusList.create")
  @js.native
  def create(repo: typingsSlinky.nodegit.repositoryMod.Repository, opts: StatusOptions): js.Promise[typingsSlinky.nodegit.statusListMod.StatusList] = js.native
}
