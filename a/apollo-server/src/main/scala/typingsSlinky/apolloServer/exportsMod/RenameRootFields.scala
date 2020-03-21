package typingsSlinky.apolloServer.exportsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloServer.apolloServerStrings.Mutation
import typingsSlinky.apolloServer.apolloServerStrings.Query
import typingsSlinky.apolloServer.apolloServerStrings.Subscription
import typingsSlinky.graphql.definitionMod.GraphQLField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "RenameRootFields")
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

