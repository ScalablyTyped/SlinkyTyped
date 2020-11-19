package typingsSlinky.graphqlToolsWrap.mod

import typingsSlinky.graphql.definitionMod.GraphQLInputFieldConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/wrap", "RenameInputObjectFields")
@js.native
class RenameInputObjectFields protected ()
  extends typingsSlinky.graphqlToolsWrap.transformsMod.RenameInputObjectFields {
  def this(renamer: js.Function3[
        /* typeName */ String, 
        /* fieldName */ String, 
        /* inputFieldConfig */ GraphQLInputFieldConfig, 
        String
      ]) = this()
}
