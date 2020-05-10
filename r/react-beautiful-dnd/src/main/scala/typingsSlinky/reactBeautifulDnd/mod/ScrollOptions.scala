package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollOptions extends js.Object {
  var shouldPublishImmediately: Boolean = js.native
}

object ScrollOptions {
  @scala.inline
  def apply(shouldPublishImmediately: Boolean): ScrollOptions = {
    val __obj = js.Dynamic.literal(shouldPublishImmediately = shouldPublishImmediately.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollOptions]
  }
  @scala.inline
  implicit class ScrollOptionsOps[Self <: ScrollOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShouldPublishImmediately(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldPublishImmediately")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

