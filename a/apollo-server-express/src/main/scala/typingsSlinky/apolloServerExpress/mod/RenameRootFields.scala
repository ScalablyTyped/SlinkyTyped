package typingsSlinky.apolloServerExpress.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloServerExpress.apolloServerExpressStrings.Mutation
import typingsSlinky.apolloServerExpress.apolloServerExpressStrings.Query
import typingsSlinky.apolloServerExpress.apolloServerExpressStrings.Subscription
import typingsSlinky.graphql.definitionMod.GraphQLField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "RenameRootFields")
@js.native
class RenameRootFields protected ()
  extends typingsSlinky.graphqlTools.mod.RenameRootFields {
  def this(renamer: js.Function3[
        /* operation */ Query | Mutation | Subscription, 
        /* name */ String, 
        /* field */ GraphQLField[_, _, StringDictionary[_]], 
        String
      ]) = this()
}

