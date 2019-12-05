package typingsSlinky.graphqlDashReact

import slinky.core.facade.ReactElement
import typingsSlinky.graphqlDashReact.graphqlDashReactMod.GraphQL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-react/server", JSImport.Namespace)
@js.native
object serverMod extends js.Object {
  def ssr(graphql: GraphQL, node: ReactElement): js.Promise[String] = js.native
  def ssr(graphql: GraphQL, node: ReactElement, render: js.Function1[/* element */ ReactElement, String]): js.Promise[String] = js.native
}

