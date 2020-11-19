package typingsSlinky.apolloReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-react/lib/server", JSImport.Namespace)
@js.native
object serverMod extends js.Object {
  
  def cleanupApolloState(apolloState: js.Any): Unit = js.native
  
  def getDataFromTree(rootElement: js.Any): js.Promise[Unit] = js.native
  def getDataFromTree(rootElement: js.Any, rootContext: js.UndefOr[scala.Nothing], fetchRoot: Boolean): js.Promise[Unit] = js.native
  def getDataFromTree(rootElement: js.Any, rootContext: js.Any): js.Promise[Unit] = js.native
  def getDataFromTree(rootElement: js.Any, rootContext: js.Any, fetchRoot: Boolean): js.Promise[Unit] = js.native
  
  def renderToStringWithData(component: js.Any): js.Promise[String] = js.native
  
  def walkTree(
    element: js.Any,
    context: js.Any,
    visitor: js.Function3[/* element */ js.Any, /* instance */ js.Any, /* context */ js.Any, Boolean | Unit]
  ): Unit = js.native
}
