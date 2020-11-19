package typingsSlinky.graphqlToolsWrap.transformsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfig
import typingsSlinky.graphqlToolsWrap.renameInterfaceFieldsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/wrap/transforms", "RenameInterfaceFields")
@js.native
class RenameInterfaceFields protected () extends default {
  def this(renamer: js.Function3[
        /* typeName */ String, 
        /* fieldName */ String, 
        /* fieldConfig */ GraphQLFieldConfig[_, _, StringDictionary[_]], 
        String
      ]) = this()
}
