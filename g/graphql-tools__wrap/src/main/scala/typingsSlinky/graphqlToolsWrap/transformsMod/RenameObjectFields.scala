package typingsSlinky.graphqlToolsWrap.transformsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfig
import typingsSlinky.graphqlToolsWrap.renameObjectFieldsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/wrap/transforms", "RenameObjectFields")
@js.native
class RenameObjectFields protected () extends default {
  def this(renamer: js.Function3[
        /* typeName */ String, 
        /* fieldName */ String, 
        /* fieldConfig */ GraphQLFieldConfig[_, _, StringDictionary[_]], 
        String
      ]) = this()
}
