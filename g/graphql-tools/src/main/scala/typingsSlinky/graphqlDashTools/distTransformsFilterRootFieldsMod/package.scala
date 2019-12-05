package typingsSlinky.graphqlDashTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTransformsFilterRootFieldsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.graphql.typeDefinitionMod.GraphQLField
  import typingsSlinky.graphqlDashTools.graphqlDashToolsStrings.Mutation
  import typingsSlinky.graphqlDashTools.graphqlDashToolsStrings.Query
  import typingsSlinky.graphqlDashTools.graphqlDashToolsStrings.Subscription

  type RootFilter = js.Function3[
    /* operation */ Query | Mutation | Subscription, 
    /* fieldName */ String, 
    /* field */ GraphQLField[js.Any, js.Any, StringDictionary[js.Any]], 
    Boolean
  ]
}
