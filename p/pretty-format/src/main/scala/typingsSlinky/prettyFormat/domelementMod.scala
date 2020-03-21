package typingsSlinky.prettyFormat

import org.scalajs.dom.raw.Comment
import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Text
import typingsSlinky.prettyFormat.typesMod.Config
import typingsSlinky.prettyFormat.typesMod.NewPlugin
import typingsSlinky.prettyFormat.typesMod.Printer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pretty-format/build/plugins/DOMElement", JSImport.Namespace)
@js.native
object domelementMod extends js.Object {
  val default: NewPlugin = js.native
  def serialize(
    node: HandledType,
    config: Config,
    indentation: String,
    depth: Double,
    refs: js.Array[_],
    printer: Printer
  ): String = js.native
  def test(`val`: js.Any): Boolean = js.native
  type HandledType = Element | Text | Comment | DocumentFragment
}

