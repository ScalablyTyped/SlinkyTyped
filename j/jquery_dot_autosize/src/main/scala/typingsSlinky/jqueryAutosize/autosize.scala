package typingsSlinky.jqueryAutosize

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.NodeList
import typingsSlinky.jquery.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("autosize")
@js.native
object autosize extends js.Object {
  @js.native
  trait AutosizeStatic extends js.Object {
    def apply(el: JQuery[HTMLElement]): Unit = js.native
    def apply(el: Element): Unit = js.native
    def apply(el: NodeList): Unit = js.native
  }
  
}

