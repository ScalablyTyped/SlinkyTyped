package typingsSlinky.reactDom.mod

import org.scalajs.dom.raw.Element
import slinky.core.TagMod
import typingsSlinky.react.mod.ReactPortal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom", "createPortal")
@js.native
object createPortal extends js.Object {
  def apply(children: TagMod[Any], container: Element): ReactPortal = js.native
  def apply(children: TagMod[Any], container: Element, key: String): ReactPortal = js.native
}

