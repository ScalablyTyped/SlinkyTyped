package typingsSlinky.atom.atomMod

import org.scalajs.dom.raw.Node
import typingsSlinky.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryCompatible[Element /* <: Node */] extends Iterable[Element] {
  var jquery: String = js.native
}

