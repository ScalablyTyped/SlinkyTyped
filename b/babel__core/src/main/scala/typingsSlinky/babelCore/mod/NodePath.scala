package typingsSlinky.babelCore.mod

import typingsSlinky.babelTraverse.anon.Container
import typingsSlinky.babelTraverse.mod.Hub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/core", "NodePath")
@js.native
class NodePath[T] protected ()
  extends typingsSlinky.babelTraverse.mod.NodePath[T] {
  def this(hub: Hub, parent: typingsSlinky.babelTypes.mod.Node) = this()
}
/* static members */
object NodePath {
  
  @JSImport("@babel/core", "NodePath.get")
  @js.native
  def get[C /* <: typingsSlinky.babelTypes.mod.Node */, K /* <: /* keyof C */ String */](opts: Container[C, K]): typingsSlinky.babelTraverse.mod.NodePath[
    /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
  ] = js.native
}
