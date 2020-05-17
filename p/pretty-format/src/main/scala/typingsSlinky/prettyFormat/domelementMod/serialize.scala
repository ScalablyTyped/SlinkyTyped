package typingsSlinky.prettyFormat.domelementMod

import typingsSlinky.prettyFormat.typesMod.Config
import typingsSlinky.prettyFormat.typesMod.Printer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pretty-format/build/plugins/DOMElement", "serialize")
@js.native
object serialize extends js.Object {
  def apply(
    node: HandledType,
    config: Config,
    indentation: String,
    depth: Double,
    refs: js.Array[_],
    printer: Printer
  ): String = js.native
}

