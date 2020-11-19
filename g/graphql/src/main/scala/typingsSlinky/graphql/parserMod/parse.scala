package typingsSlinky.graphql.parserMod

import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.sourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/language/parser", "parse")
@js.native
object parse extends js.Object {
  
  def apply(source: String): DocumentNode = js.native
  def apply(source: String, options: ParseOptions): DocumentNode = js.native
  def apply(source: Source): DocumentNode = js.native
  def apply(source: Source, options: ParseOptions): DocumentNode = js.native
}
