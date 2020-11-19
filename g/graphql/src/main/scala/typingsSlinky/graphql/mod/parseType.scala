package typingsSlinky.graphql.mod

import typingsSlinky.graphql.astMod.TypeNode
import typingsSlinky.graphql.parserMod.ParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql", "parseType")
@js.native
object parseType extends js.Object {
  
  def apply(source: String): TypeNode = js.native
  def apply(source: String, options: ParseOptions): TypeNode = js.native
  def apply(source: typingsSlinky.graphql.sourceMod.Source): TypeNode = js.native
  def apply(source: typingsSlinky.graphql.sourceMod.Source, options: ParseOptions): TypeNode = js.native
}
