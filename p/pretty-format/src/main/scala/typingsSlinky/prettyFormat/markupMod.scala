package typingsSlinky.prettyFormat

import typingsSlinky.prettyFormat.typesMod.Config
import typingsSlinky.prettyFormat.typesMod.Printer
import typingsSlinky.prettyFormat.typesMod.Refs
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pretty-format/build/plugins/lib/markup", JSImport.Namespace)
@js.native
object markupMod extends js.Object {
  def printChildren(
    children: js.Array[_],
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer
  ): String = js.native
  def printComment(comment: String, config: Config): String = js.native
  def printElement(`type`: String, printedProps: String, printedChildren: String, config: Config, indentation: String): String = js.native
  def printElementAsLeaf(`type`: String, config: Config): String = js.native
  def printProps(
    keys: js.Array[String],
    props: Record[String, _],
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer
  ): String = js.native
  def printText(text: String, config: Config): String = js.native
}

