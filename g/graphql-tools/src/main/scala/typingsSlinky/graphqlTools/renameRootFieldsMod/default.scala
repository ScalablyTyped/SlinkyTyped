package typingsSlinky.graphqlTools.renameRootFieldsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLField
import typingsSlinky.graphqlTools.graphqlToolsStrings.Mutation
import typingsSlinky.graphqlTools.graphqlToolsStrings.Query
import typingsSlinky.graphqlTools.graphqlToolsStrings.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms/RenameRootFields", JSImport.Default)
@js.native
class default protected () extends RenameRootFields {
  def this(renamer: js.Function3[
        /* operation */ Query | Mutation | Subscription, 
        /* name */ String, 
        /* field */ GraphQLField[_, _, StringDictionary[_]], 
        String
      ]) = this()
}

