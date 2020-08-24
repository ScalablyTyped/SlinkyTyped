package typingsSlinky.reactMdUtils

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/utils/types/wia-aria/getInstance", JSImport.Namespace)
@js.native
object getInstanceMod extends js.Object {
  def default(refOrInstance: RefOrInstance): HTMLElement | Null = js.native
  type RefOrInstance = HTMLElement | Null | (MutableRefObject[HTMLElement | Null])
}

