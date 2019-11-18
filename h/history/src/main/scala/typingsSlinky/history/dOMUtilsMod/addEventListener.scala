package typingsSlinky.history.dOMUtilsMod

import typingsSlinky.history.dOMUtilsMod._Global_.EventListener
import typingsSlinky.history.dOMUtilsMod._Global_.EventListenerObject
import typingsSlinky.history.dOMUtilsMod._Global_.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("history/DOMUtils", "addEventListener")
@js.native
object addEventListener extends js.Object {
  def apply(node: EventTarget, event: String, listener: EventListener): Unit = js.native
  def apply(node: EventTarget, event: String, listener: EventListenerObject): Unit = js.native
}

