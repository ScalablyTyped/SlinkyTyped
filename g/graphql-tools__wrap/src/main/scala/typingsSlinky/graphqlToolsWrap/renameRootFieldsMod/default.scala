package typingsSlinky.graphqlToolsWrap.renameRootFieldsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfig
import typingsSlinky.graphqlToolsWrap.graphqlToolsWrapStrings.Mutation
import typingsSlinky.graphqlToolsWrap.graphqlToolsWrapStrings.Query
import typingsSlinky.graphqlToolsWrap.graphqlToolsWrapStrings.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/wrap/transforms/RenameRootFields", JSImport.Default)
@js.native
class default protected () extends RenameRootFields {
  def this(renamer: js.Function3[
        /* operation */ Query | Mutation | Subscription, 
        /* name */ String, 
        /* fieldConfig */ GraphQLFieldConfig[_, _, StringDictionary[_]], 
        String
      ]) = this()
}
