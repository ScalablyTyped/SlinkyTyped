package typingsSlinky.graphqlDashTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTransformsTransformRootFieldsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.graphql.typeDefinitionMod.GraphQLField
  import typingsSlinky.graphql.typeDefinitionMod.GraphQLFieldConfig
  import typingsSlinky.graphqlDashTools.Anon_ArgNameField
  import typingsSlinky.graphqlDashTools.graphqlDashToolsStrings.Mutation
  import typingsSlinky.graphqlDashTools.graphqlDashToolsStrings.Query
  import typingsSlinky.graphqlDashTools.graphqlDashToolsStrings.Subscription

  type RootTransformer = js.Function3[
    /* operation */ Query | Mutation | Subscription, 
    /* fieldName */ String, 
    /* field */ GraphQLField[js.Any, js.Any, StringDictionary[js.Any]], 
    js.UndefOr[
      (GraphQLFieldConfig[js.Any, js.Any, StringDictionary[js.Any]]) | Anon_ArgNameField | Null
    ]
  ]
}
