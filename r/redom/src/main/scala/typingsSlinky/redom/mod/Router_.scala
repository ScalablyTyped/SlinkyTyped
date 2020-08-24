package typingsSlinky.redom.mod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redom", "Router")
@js.native
class Router_ protected () extends RedomComponent {
  def this(parent: RedomQuery, Views: RouterDictionary) = this()
  def this(parent: RedomQuery, Views: RouterDictionary, initData: js.Any) = this()
  @JSName("el")
  var el_Router_ : HTMLElement | SVGElement = js.native
  @JSName("update")
  def update_MRouter_(route: String): Unit = js.native
  @JSName("update")
  def update_MRouter_(route: String, data: js.Any): Unit = js.native
}

