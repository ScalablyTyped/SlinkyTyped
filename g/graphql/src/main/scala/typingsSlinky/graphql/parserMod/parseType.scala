package typingsSlinky.graphql.parserMod

import typingsSlinky.graphql.astMod.TypeNode
import typingsSlinky.graphql.sourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/language/parser", "parseType")
@js.native
object parseType extends js.Object {
  
  def apply(source: String): TypeNode = js.native
  def apply(source: String, options: ParseOptions): TypeNode = js.native
  def apply(source: Source): TypeNode = js.native
  def apply(source: Source, options: ParseOptions): TypeNode = js.native
}
