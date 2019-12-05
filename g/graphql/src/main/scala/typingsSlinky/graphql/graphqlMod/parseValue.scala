package typingsSlinky.graphql.graphqlMod

import typingsSlinky.graphql.languageAstMod.ValueNode
import typingsSlinky.graphql.languageParserMod.ParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "parseValue")
@js.native
object parseValue extends js.Object {
  def apply(source: String): ValueNode = js.native
  def apply(source: String, options: ParseOptions): ValueNode = js.native
  def apply(source: typingsSlinky.graphql.languageSourceMod.Source): ValueNode = js.native
  def apply(source: typingsSlinky.graphql.languageSourceMod.Source, options: ParseOptions): ValueNode = js.native
}

