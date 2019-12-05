package typingsSlinky.apolloDashServerDashExpress.apolloDashServerDashExpressMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloDashServerDashExpress.apolloDashServerDashExpressStrings.Mutation
import typingsSlinky.apolloDashServerDashExpress.apolloDashServerDashExpressStrings.Query
import typingsSlinky.apolloDashServerDashExpress.apolloDashServerDashExpressStrings.Subscription
import typingsSlinky.graphql.typeDefinitionMod.GraphQLField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "RenameRootFields")
@js.native
class RenameRootFields protected ()
  extends typingsSlinky.graphqlDashTools.graphqlDashToolsMod.RenameRootFields {
  def this(renamer: js.Function3[
        /* operation */ Query | Mutation | Subscription, 
        /* name */ String, 
        /* field */ GraphQLField[_, _, StringDictionary[_]], 
        String
      ]) = this()
}

