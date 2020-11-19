package typingsSlinky.relayCompiler

import typingsSlinky.graphql.astMod.DefinitionNode
import typingsSlinky.relayCompiler.iRMod.Fragment
import typingsSlinky.relayCompiler.iRMod.Root
import typingsSlinky.relayCompiler.schemaMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-compiler/lib/core/RelayParser", JSImport.Namespace)
@js.native
object relayParserMod extends js.Object {
  
  def parse(schema: Schema, text: String): js.Array[Root | Fragment] = js.native
  def parse(schema: Schema, text: String, filename: String): js.Array[Root | Fragment] = js.native
  
  def transform(schema: Schema, documents: js.Array[DefinitionNode]): js.Array[Root | Fragment] = js.native
}
