package typingsSlinky.rcUtil

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-util/lib/Dom/findDOMNode", JSImport.Namespace)
@js.native
object findDOMNodeMod extends js.Object {
  def default[T](node: ReactInstance): T = js.native
  def default[T](node: HTMLElement): T = js.native
}

