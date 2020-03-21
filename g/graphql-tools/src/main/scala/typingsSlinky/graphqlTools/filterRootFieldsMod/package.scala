package typingsSlinky.graphqlTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object filterRootFieldsMod {
  type RootFilter = js.Function3[
    /* operation */ typingsSlinky.graphqlTools.graphqlToolsStrings.Query | typingsSlinky.graphqlTools.graphqlToolsStrings.Mutation | typingsSlinky.graphqlTools.graphqlToolsStrings.Subscription, 
    /* fieldName */ java.lang.String, 
    /* field */ typingsSlinky.graphql.definitionMod.GraphQLField[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]], 
    scala.Boolean
  ]
}
