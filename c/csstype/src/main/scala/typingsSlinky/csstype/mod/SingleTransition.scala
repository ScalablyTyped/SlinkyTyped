package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.TimingFunction
  - typingsSlinky.csstype.csstypeStrings.all
  - typingsSlinky.csstype.csstypeStrings.none
  - java.lang.String
*/
trait SingleTransition extends TransitionProperty

object SingleTransition {
  @scala.inline
  def all: typingsSlinky.csstype.csstypeStrings.all = "all".asInstanceOf[typingsSlinky.csstype.csstypeStrings.all]
  @scala.inline
  def none: typingsSlinky.csstype.csstypeStrings.none = "none".asInstanceOf[typingsSlinky.csstype.csstypeStrings.none]
  @scala.inline
  implicit def apply(value: String): SingleTransition = value.asInstanceOf[SingleTransition]
  @scala.inline
  implicit def apply(value: TimingFunction): SingleTransition = value.asInstanceOf[SingleTransition]
}

