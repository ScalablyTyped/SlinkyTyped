package typingsSlinky.relayCompiler.relayLanguagePluginInterfaceMod

import typingsSlinky.relayCompiler.compilerContextMod.IRTransform
import typingsSlinky.relayCompiler.iRMod.Fragment
import typingsSlinky.relayCompiler.iRMod.Root
import typingsSlinky.relayCompiler.schemaMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeGenerator extends js.Object {
  
  def generate(schema: Schema, node: Fragment, options: TypeGeneratorOptions): String = js.native
  /**
    * Given GraphQL document IR, this function should generate type information
    * for e.g. the selections made. It can, however, also generate any other
    * content such as importing other files, including other artifacts.
    */
  def generate(schema: Schema, node: Root, options: TypeGeneratorOptions): String = js.native
  
  /**
    * Transforms that should be applied to the intermediate representation of the
    * GraphQL document before passing to the `generate` function.
    */
  var transforms: js.Array[IRTransform] = js.native
}
