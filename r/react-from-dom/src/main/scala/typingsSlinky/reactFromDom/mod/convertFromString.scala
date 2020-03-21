package typingsSlinky.reactFromDom.mod

import org.scalajs.dom.raw.Node
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-from-dom", "convertFromString")
@js.native
object convertFromString extends js.Object {
  def apply(input: String): TagMod[Any] | Node = js.native
  def apply(input: String, options: IOptions): TagMod[Any] | Node = js.native
}

