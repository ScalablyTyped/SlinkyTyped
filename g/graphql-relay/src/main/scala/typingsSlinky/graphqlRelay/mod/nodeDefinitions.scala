package typingsSlinky.graphqlRelay.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.definitionMod.GraphQLTypeResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-relay", "nodeDefinitions")
@js.native
object nodeDefinitions extends js.Object {
  def apply[TContext](idFetcher: js.Function3[/* id */ String, /* context */ TContext, /* info */ GraphQLResolveInfo, _]): GraphQLNodeDefinitions = js.native
  def apply[TContext](
    idFetcher: js.Function3[/* id */ String, /* context */ TContext, /* info */ GraphQLResolveInfo, _],
    typeResolver: GraphQLTypeResolver[_, TContext, StringDictionary[_]]
  ): GraphQLNodeDefinitions = js.native
}

