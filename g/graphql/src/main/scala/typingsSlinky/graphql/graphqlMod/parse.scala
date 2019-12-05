package typingsSlinky.graphql.graphqlMod

import typingsSlinky.graphql.languageAstMod.DocumentNode
import typingsSlinky.graphql.languageParserMod.ParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "parse")
@js.native
object parse extends js.Object {
  def apply(source: String): DocumentNode = js.native
  def apply(source: String, options: ParseOptions): DocumentNode = js.native
  def apply(source: typingsSlinky.graphql.languageSourceMod.Source): DocumentNode = js.native
  def apply(source: typingsSlinky.graphql.languageSourceMod.Source, options: ParseOptions): DocumentNode = js.native
}

