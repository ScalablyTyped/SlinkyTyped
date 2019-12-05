package typingsSlinky.apolloDashServer.apolloDashServerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloDashServer.apolloDashServerStrings.Mutation
import typingsSlinky.apolloDashServer.apolloDashServerStrings.Query
import typingsSlinky.apolloDashServer.apolloDashServerStrings.Subscription
import typingsSlinky.graphql.typeDefinitionMod.GraphQLField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "RenameRootFields")
@js.native
class RenameRootFields protected ()
  extends typingsSlinky.apolloDashServer.distExportsMod.RenameRootFields {
  def this(renamer: js.Function3[
        /* operation */ Query | Mutation | Subscription, 
        /* name */ String, 
        /* field */ GraphQLField[_, _, StringDictionary[_]], 
        String
      ]) = this()
}

