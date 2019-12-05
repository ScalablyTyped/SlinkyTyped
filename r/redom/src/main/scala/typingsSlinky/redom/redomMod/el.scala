package typingsSlinky.redom.redomMod

import typingsSlinky.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redom", "el")
@js.native
object el extends js.Object {
  def apply(query: String, args: RedomQueryArgument*): HTMLElementOfRedomQuery[String] = js.native
  def apply(query: RedomComponent, args: RedomQueryArgument*): HTMLElementOfRedomQuery[RedomComponent] = js.native
  def apply(query: Node, args: RedomQueryArgument*): HTMLElementOfRedomQuery[org.scalajs.dom.raw.Node] = js.native
}

