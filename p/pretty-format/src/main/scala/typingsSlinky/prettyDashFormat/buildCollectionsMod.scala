package typingsSlinky.prettyDashFormat

import typingsSlinky.prettyDashFormat.buildTypesMod.Config
import typingsSlinky.prettyDashFormat.buildTypesMod.Printer
import typingsSlinky.prettyDashFormat.buildTypesMod.Refs
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pretty-format/build/collections", JSImport.Namespace)
@js.native
object buildCollectionsMod extends js.Object {
  def printIteratorEntries(iterator: js.Any, config: Config, indentation: String, depth: Double, refs: Refs, printer: Printer): String = js.native
  def printIteratorEntries(
    iterator: js.Any,
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer,
    separator: String
  ): String = js.native
  def printIteratorValues(
    iterator: js.Iterator[_],
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer
  ): String = js.native
  def printListItems(list: js.Any, config: Config, indentation: String, depth: Double, refs: Refs, printer: Printer): String = js.native
  def printObjectProperties(
    `val`: Record[String, _],
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer
  ): String = js.native
}

