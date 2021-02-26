package typingsSlinky.prettyFormat

import typingsSlinky.prettyFormat.typesMod.Config
import typingsSlinky.prettyFormat.typesMod.Printer
import typingsSlinky.prettyFormat.typesMod.Refs
import typingsSlinky.std.ArrayLike
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectionsMod {
  
  @JSImport("pretty-format/build/collections", "printIteratorEntries")
  @js.native
  def printIteratorEntries(
    iterator: js.Iterator[js.Tuple2[_, _]],
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer
  ): String = js.native
  @JSImport("pretty-format/build/collections", "printIteratorEntries")
  @js.native
  def printIteratorEntries(
    iterator: js.Iterator[js.Tuple2[_, _]],
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer,
    separator: String
  ): String = js.native
  
  @JSImport("pretty-format/build/collections", "printIteratorValues")
  @js.native
  def printIteratorValues(
    iterator: js.Iterator[_],
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer
  ): String = js.native
  
  @JSImport("pretty-format/build/collections", "printListItems")
  @js.native
  def printListItems(
    list: ArrayLike[_],
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer
  ): String = js.native
  
  @JSImport("pretty-format/build/collections", "printObjectProperties")
  @js.native
  def printObjectProperties(
    `val`: Record[String, _],
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer
  ): String = js.native
}
