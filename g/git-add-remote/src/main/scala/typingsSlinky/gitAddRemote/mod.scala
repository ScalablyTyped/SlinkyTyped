package typingsSlinky.gitAddRemote

import typingsSlinky.node.childProcessMod.ExecException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git-add-remote", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): AddRemote = js.native
  def apply(cwd: String): AddRemote = js.native
  
  @js.native
  trait AddRemote extends js.Object {
    
    def apply(
      name: String,
      url: String,
      callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
    ): Unit = js.native
    
    def sync(name: String, url: String): Unit = js.native
  }
}
