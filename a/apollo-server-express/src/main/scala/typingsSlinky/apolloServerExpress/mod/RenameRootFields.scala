package typingsSlinky.apolloServerExpress.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloServerExpress.apolloServerExpressStrings.Mutation
import typingsSlinky.apolloServerExpress.apolloServerExpressStrings.Query
import typingsSlinky.apolloServerExpress.apolloServerExpressStrings.Subscription
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server-express", "RenameRootFields")
@js.native
class RenameRootFields protected ()
  extends typingsSlinky.graphqlTools.mod.RenameRootFields {
  def this(renamer: js.Function3[
        /* operation */ Query | Mutation | Subscription, 
        /* name */ String, 
        /* fieldConfig */ GraphQLFieldConfig[_, _, StringDictionary[_]], 
        String
      ]) = this()
}
