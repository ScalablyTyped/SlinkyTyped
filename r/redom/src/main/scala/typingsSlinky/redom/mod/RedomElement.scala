package typingsSlinky.redom.mod

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Node
  - typingsSlinky.redom.mod.RedomComponent
*/
trait RedomElement
  extends RedomQueryArgumentValue
     with RedomQuery

object RedomElement {
  @scala.inline
  implicit def apply(value: Node): RedomElement = value.asInstanceOf[RedomElement]
  @scala.inline
  implicit def apply(value: RedomComponent): RedomElement = value.asInstanceOf[RedomElement]
}

