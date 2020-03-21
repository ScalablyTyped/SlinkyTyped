package typingsSlinky.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.aliApp.aliAppStrings.transitionend
  - typingsSlinky.aliApp.aliAppStrings.animationstart
  - typingsSlinky.aliApp.aliAppStrings.animationiteration
  - typingsSlinky.aliApp.aliAppStrings.animationend
*/
trait TransitionEventType extends js.Object

object TransitionEventType {
  @scala.inline
  def animationend: typingsSlinky.aliApp.aliAppStrings.animationend = this.cast("animationend")
  @scala.inline
  def animationiteration: typingsSlinky.aliApp.aliAppStrings.animationiteration = this.cast("animationiteration")
  @scala.inline
  def animationstart: typingsSlinky.aliApp.aliAppStrings.animationstart = this.cast("animationstart")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def transitionend: typingsSlinky.aliApp.aliAppStrings.transitionend = this.cast("transitionend")
}

