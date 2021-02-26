package typingsSlinky.graphqlReact

import slinky.core.facade.ReactElement
import typingsSlinky.graphqlReact.mod.GraphQL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("graphql-react/server", "ssr")
  @js.native
  def ssr(graphql: GraphQL, node: ReactElement): js.Promise[String] = js.native
  @JSImport("graphql-react/server", "ssr")
  @js.native
  def ssr(graphql: GraphQL, node: ReactElement, render: js.Function1[/* element */ ReactElement, String]): js.Promise[String] = js.native
}
