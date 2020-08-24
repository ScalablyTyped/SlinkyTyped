package typingsSlinky.reactMdUtils

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/utils/types/containsElement", JSImport.Namespace)
@js.native
object containsElementMod extends js.Object {
  def default(container: CheckableThing, child: CheckableThing): Boolean = js.native
  type CheckableElement = HTMLElement | Null
  type CheckableThing = CheckableElement | MutableRefObject[CheckableElement]
}

