package typingsSlinky.bootstrap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bootstrap.bootstrapStrings.showDotbsDottoast
  - typingsSlinky.bootstrap.bootstrapStrings.shownDotbsDottoast
  - typingsSlinky.bootstrap.bootstrapStrings.hideDotbsDottoast
  - typingsSlinky.bootstrap.bootstrapStrings.hiddenDotbsDottoast
*/
trait ToastEvent extends js.Object

object ToastEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hiddenDotbsDottoast: typingsSlinky.bootstrap.bootstrapStrings.hiddenDotbsDottoast = this.cast("hidden.bs.toast")
  @scala.inline
  def hideDotbsDottoast: typingsSlinky.bootstrap.bootstrapStrings.hideDotbsDottoast = this.cast("hide.bs.toast")
  @scala.inline
  def showDotbsDottoast: typingsSlinky.bootstrap.bootstrapStrings.showDotbsDottoast = this.cast("show.bs.toast")
  @scala.inline
  def shownDotbsDottoast: typingsSlinky.bootstrap.bootstrapStrings.shownDotbsDottoast = this.cast("shown.bs.toast")
}

