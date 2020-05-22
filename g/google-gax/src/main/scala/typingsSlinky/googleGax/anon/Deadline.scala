package typingsSlinky.googleGax.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deadline extends js.Object {
  var deadline: js.UndefOr[js.Date] = js.undefined
}

object Deadline {
  @scala.inline
  def apply(deadline: js.Date = null): Deadline = {
    val __obj = js.Dynamic.literal()
    if (deadline != null) __obj.updateDynamic("deadline")(deadline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deadline]
  }
}

