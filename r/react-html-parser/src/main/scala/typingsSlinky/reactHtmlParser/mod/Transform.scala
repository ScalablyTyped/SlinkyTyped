package typingsSlinky.reactHtmlParser.mod

import slinky.core.facade.ReactElement
import typingsSlinky.domhandler.mod.DomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transform extends js.Object {
  def apply(node: DomElement, index: Double): ReactElement | Unit | Null = js.native
  def apply(node: DomElement, index: Double, transform: Transform): ReactElement | Unit | Null = js.native
}

