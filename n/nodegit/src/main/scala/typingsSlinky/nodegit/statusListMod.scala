package typingsSlinky.nodegit

import typingsSlinky.nodegit.diffPerfDataMod.DiffPerfdata
import typingsSlinky.nodegit.repositoryMod.Repository
import typingsSlinky.nodegit.statusOptionsMod.StatusOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusListMod {
  
  @JSImport("nodegit/status-list", "StatusList")
  @js.native
  class StatusList () extends StObject {
    
    def entrycount(): Double = js.native
    
    def free(): Unit = js.native
    
    def getPerfdata(): js.Promise[DiffPerfdata] = js.native
  }
  /* static members */
  object StatusList {
    
    @JSImport("nodegit/status-list", "StatusList.create")
    @js.native
    def create(repo: Repository): js.Promise[StatusList] = js.native
    @JSImport("nodegit/status-list", "StatusList.create")
    @js.native
    def create(repo: Repository, opts: StatusOptions): js.Promise[StatusList] = js.native
  }
}
