package typingsSlinky.estreeWalker

import typingsSlinky.estree.mod.BaseNode
import typingsSlinky.estreeWalker.asyncMod.AsyncWalker
import typingsSlinky.estreeWalker.syncMod.SyncWalker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("estree-walker", "asyncWalk")
  @js.native
  def asyncWalk(ast: BaseNode, walker: AsyncWalker): js.Promise[BaseNode] = js.native
  
  @JSImport("estree-walker", "walk")
  @js.native
  def walk(ast: BaseNode, walker: SyncWalker): BaseNode = js.native
}
