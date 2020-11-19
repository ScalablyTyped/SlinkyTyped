package typingsSlinky.graphqlToolsWrap.transformsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfig
import typingsSlinky.graphqlToolsWrap.graphqlToolsWrapStrings.Mutation
import typingsSlinky.graphqlToolsWrap.graphqlToolsWrapStrings.Query
import typingsSlinky.graphqlToolsWrap.graphqlToolsWrapStrings.Subscription
import typingsSlinky.graphqlToolsWrap.renameRootFieldsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/wrap/transforms", "RenameRootFields")
@js.native
class RenameRootFields protected () extends default {
  def this(renamer: js.Function3[
        /* operation */ Query | Mutation | Subscription, 
        /* name */ String, 
        /* fieldConfig */ GraphQLFieldConfig[_, _, StringDictionary[_]], 
        String
      ]) = this()
}
