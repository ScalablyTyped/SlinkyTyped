package typingsSlinky.babelPluginTester.anon

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.babelCore.mod.NodePath
import typingsSlinky.babelTraverse.anon.Container
import typingsSlinky.babelTraverse.mod.Hub
import typingsSlinky.babelTypes.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofNodePath
  extends Instantiable2[/* hub */ Hub, /* parent */ Node, NodePath[js.Object]] {
  
  def get[C /* <: Node */, K /* <: /* keyof C */ String */](opts: Container[C, K]): typingsSlinky.babelTraverse.mod.NodePath[
    /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
  ] = js.native
}
