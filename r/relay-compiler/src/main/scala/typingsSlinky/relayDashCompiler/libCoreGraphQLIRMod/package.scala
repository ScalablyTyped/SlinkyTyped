package typingsSlinky.relayDashCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCoreGraphQLIRMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.graphql.typeDefinitionMod.GraphQLLeafType
  import typingsSlinky.graphql.typeDefinitionMod.GraphQLNonNull

  type Metadata = js.UndefOr[StringDictionary[js.Any]]
  type ScalarFieldType = GraphQLLeafType | ScalarFieldTypeGraphQLList | (GraphQLNonNull[GraphQLLeafType | ScalarFieldTypeGraphQLList])
}
