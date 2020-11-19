package typingsSlinky.graphqlBinding

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlBinding.anon.InputSchemaPath
import typingsSlinky.graphqlBinding.typesMod.Interpolation
import typingsSlinky.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-binding/dist/codegen/Generator", JSImport.Namespace)
@js.native
object generatorMod extends js.Object {
  
  @js.native
  class Generator protected () extends js.Object {
    def this(hasSchemaInputSchemaPathOutputBindingPathIsDefaultExport: InputSchemaPath) = this()
    
    def compile(strings: TemplateStringsArray, interpolations: Interpolation[Generator]*): String = js.native
    
    def getRelativeSchemaPath(): String = js.native
    
    var inputSchemaPath: String = js.native
    
    var isDefaultExport: Boolean = js.native
    
    var outputBindingPath: String = js.native
    
    def render(): String = js.native
    
    def renderExports(): String = js.native
    
    def renderImports(): String = js.native
    
    var schema: GraphQLSchema = js.native
  }
}
