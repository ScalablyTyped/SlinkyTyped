package typingsSlinky.prettyFormat.reactTestComponentMod

import typingsSlinky.prettyFormat.typesMod.Config
import typingsSlinky.prettyFormat.typesMod.Printer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pretty-format/build/plugins/ReactTestComponent", "serialize")
@js.native
object serialize extends js.Object {
  def apply(
    `object`: ReactTestObject,
    config: Config,
    indentation: String,
    depth: Double,
    refs: js.Array[_],
    printer: Printer
  ): String = js.native
}

