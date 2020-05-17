package typingsSlinky.interpret.mod

import typingsSlinky.interpret.anon.Dictkey
import typingsSlinky.interpret.anon.Extensions
import typingsSlinky.node.NodeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hook extends js.Object {
  def apply(m: Extensions): js.Any = js.native
  def apply(m: NodeModule): js.Any = js.native
  def install(): Unit = js.native
  def install(m: Dictkey): Unit = js.native
}

