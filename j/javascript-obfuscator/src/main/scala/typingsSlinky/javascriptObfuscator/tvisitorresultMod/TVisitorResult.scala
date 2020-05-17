package typingsSlinky.javascriptObfuscator.tvisitorresultMod

import org.scalajs.dom.raw.Node
import typingsSlinky.estraverse.mod.VisitorOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Node
  - typingsSlinky.estraverse.mod.VisitorOption
  - scala.Unit
*/
trait TVisitorResult extends js.Object

object TVisitorResult {
  @scala.inline
  implicit def apply(value: Node): TVisitorResult = value.asInstanceOf[TVisitorResult]
  @scala.inline
  implicit def apply(value: Unit): TVisitorResult = value.asInstanceOf[TVisitorResult]
  @scala.inline
  implicit def apply(value: VisitorOption): TVisitorResult = value.asInstanceOf[TVisitorResult]
}

