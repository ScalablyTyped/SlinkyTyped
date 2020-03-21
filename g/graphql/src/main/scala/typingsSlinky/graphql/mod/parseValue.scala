package typingsSlinky.graphql.mod

import typingsSlinky.graphql.astMod.ValueNode
import typingsSlinky.graphql.parserMod.ParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "parseValue")
@js.native
object parseValue extends js.Object {
  def apply(source: String): ValueNode = js.native
  def apply(source: String, options: ParseOptions): ValueNode = js.native
  def apply(source: typingsSlinky.graphql.sourceMod.Source): ValueNode = js.native
  def apply(source: typingsSlinky.graphql.sourceMod.Source, options: ParseOptions): ValueNode = js.native
}

