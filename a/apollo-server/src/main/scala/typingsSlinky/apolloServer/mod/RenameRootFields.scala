package typingsSlinky.apolloServer.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloServer.apolloServerStrings.Mutation
import typingsSlinky.apolloServer.apolloServerStrings.Query
import typingsSlinky.apolloServer.apolloServerStrings.Subscription
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "RenameRootFields")
@js.native
class RenameRootFields protected ()
  extends typingsSlinky.apolloServer.exportsMod.RenameRootFields {
  def this(renamer: js.Function3[
        /* operation */ Query | Mutation | Subscription, 
        /* name */ String, 
        /* fieldConfig */ GraphQLFieldConfig[_, _, StringDictionary[_]], 
        String
      ]) = this()
}

