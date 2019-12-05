package typingsSlinky.graphql.graphqlMod

import typingsSlinky.graphql.languageAstMod.TypeNode
import typingsSlinky.graphql.languageParserMod.ParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "parseType")
@js.native
object parseType extends js.Object {
  def apply(source: String): TypeNode = js.native
  def apply(source: String, options: ParseOptions): TypeNode = js.native
  def apply(source: typingsSlinky.graphql.languageSourceMod.Source): TypeNode = js.native
  def apply(source: typingsSlinky.graphql.languageSourceMod.Source, options: ParseOptions): TypeNode = js.native
}

