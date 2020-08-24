package typingsSlinky.ink.domMod

import typingsSlinky.ink.anon.NodeName
import typingsSlinky.ink.stylesMod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ink/build/dom", "setStyle")
@js.native
object setStyle extends js.Object {
  def apply(node: DOMNode[NodeName], style: Styles): Unit = js.native
}

