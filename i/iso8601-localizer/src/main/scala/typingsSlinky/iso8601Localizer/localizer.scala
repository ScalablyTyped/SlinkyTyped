package typingsSlinky.iso8601Localizer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait localizer extends js.Object {
  def localize(): String = js.native
  def returnAs(as: String): localizer = js.native
  def to(offset: Double): localizer = js.native
}

object localizer {
  @scala.inline
  def apply(localize: () => String, returnAs: String => localizer, to: Double => localizer): localizer = {
    val __obj = js.Dynamic.literal(localize = js.Any.fromFunction0(localize), returnAs = js.Any.fromFunction1(returnAs), to = js.Any.fromFunction1(to))
    __obj.asInstanceOf[localizer]
  }
  @scala.inline
  implicit class localizerOps[Self <: localizer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalize(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReturnAs(value: String => localizer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnAs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTo(value: Double => localizer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

