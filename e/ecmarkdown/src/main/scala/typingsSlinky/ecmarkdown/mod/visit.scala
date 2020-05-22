package typingsSlinky.ecmarkdown.mod

import typingsSlinky.ecmarkdown.nodeTypesMod.Node
import typingsSlinky.ecmarkdown.visitorMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecmarkdown/dist/ecmarkdown", "visit")
@js.native
object visit extends js.Object {
  def apply(node: Node, observer: Observer): Unit = js.native
}

