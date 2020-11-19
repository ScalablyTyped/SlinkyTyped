package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.graphql.definitionMod.GraphQLInputFieldConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server/dist/exports", "RenameInputObjectFields")
@js.native
class RenameInputObjectFields protected ()
  extends typingsSlinky.graphqlTools.mod.RenameInputObjectFields {
  def this(renamer: js.Function3[
        /* typeName */ String, 
        /* fieldName */ String, 
        /* inputFieldConfig */ GraphQLInputFieldConfig, 
        String
      ]) = this()
}
