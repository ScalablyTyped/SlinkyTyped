package typingsSlinky.apolloServer.mod

import typingsSlinky.graphql.definitionMod.GraphQLInputFieldConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server", "RenameInputObjectFields")
@js.native
class RenameInputObjectFields protected ()
  extends typingsSlinky.apolloServer.exportsMod.RenameInputObjectFields {
  def this(renamer: js.Function3[
        /* typeName */ String, 
        /* fieldName */ String, 
        /* inputFieldConfig */ GraphQLInputFieldConfig, 
        String
      ]) = this()
}
