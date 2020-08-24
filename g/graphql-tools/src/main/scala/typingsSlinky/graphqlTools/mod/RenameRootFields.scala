package typingsSlinky.graphqlTools.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfig
import typingsSlinky.graphqlTools.graphqlToolsStrings.Mutation
import typingsSlinky.graphqlTools.graphqlToolsStrings.Query
import typingsSlinky.graphqlTools.graphqlToolsStrings.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "RenameRootFields")
@js.native
class RenameRootFields protected ()
  extends typingsSlinky.graphqlToolsWrap.mod.RenameRootFields {
  def this(renamer: js.Function3[
        /* operation */ Query | Mutation | Subscription, 
        /* name */ String, 
        /* fieldConfig */ GraphQLFieldConfig[_, _, StringDictionary[_]], 
        String
      ]) = this()
}

