package typingsSlinky.graphql.parserMod

import typingsSlinky.graphql.astMod.ValueNode
import typingsSlinky.graphql.sourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/language/parser", "parseValue")
@js.native
object parseValue extends js.Object {
  
  def apply(source: String): ValueNode = js.native
  def apply(source: String, options: ParseOptions): ValueNode = js.native
  def apply(source: Source): ValueNode = js.native
  def apply(source: Source, options: ParseOptions): ValueNode = js.native
}
