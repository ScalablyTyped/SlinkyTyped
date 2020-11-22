package typingsSlinky.estreeWalker

import typingsSlinky.estree.mod.BaseNode
import typingsSlinky.estreeWalker.asyncMod.AsyncWalker
import typingsSlinky.estreeWalker.syncMod.SyncWalker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("estree-walker", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def asyncWalk(ast: BaseNode, walker: AsyncWalker): js.Promise[BaseNode] = js.native
  
  def walk(ast: BaseNode, walker: SyncWalker): BaseNode = js.native
}
