package typingsSlinky.prettyDashFormat

import org.scalajs.dom.raw.Comment
import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Text
import typingsSlinky.prettyDashFormat.buildTypesMod.Config
import typingsSlinky.prettyDashFormat.buildTypesMod.NewPlugin
import typingsSlinky.prettyDashFormat.buildTypesMod.Printer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pretty-format/build/plugins/DOMElement", JSImport.Namespace)
@js.native
object buildPluginsDOMElementMod extends js.Object {
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

