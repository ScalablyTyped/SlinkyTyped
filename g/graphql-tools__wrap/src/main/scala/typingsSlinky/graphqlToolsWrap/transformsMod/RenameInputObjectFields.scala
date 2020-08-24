package typingsSlinky.graphqlToolsWrap.transformsMod

import typingsSlinky.graphql.definitionMod.GraphQLInputFieldConfig
import typingsSlinky.graphqlToolsWrap.renameInputObjectFieldsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/transforms", "RenameInputObjectFields")
@js.native
class RenameInputObjectFields protected () extends default {
  def this(renamer: js.Function3[
        /* typeName */ String, 
        /* fieldName */ String, 
        /* inputFieldConfig */ GraphQLInputFieldConfig, 
        String
      ]) = this()
}

