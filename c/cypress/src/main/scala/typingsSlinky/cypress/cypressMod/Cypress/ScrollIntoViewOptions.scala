package typingsSlinky.cypress.cypressMod.Cypress

import typingsSlinky.cypress.cypressStrings.linear
import typingsSlinky.cypress.cypressStrings.swing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollIntoViewOptions extends ScrollToOptions {
  /**
    * Amount to scroll after the element has been scrolled into view
    *
    * @default {top: 0, left: 0}
    */
  var offset: Offset = js.native
}

object ScrollIntoViewOptions {
  @scala.inline
  def apply(duration: Double, easing: swing | linear, log: Boolean, offset: Offset, timeout: Double): ScrollIntoViewOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollIntoViewOptions]
  }
  @scala.inline
  implicit class ScrollIntoViewOptionsOps[Self <: ScrollIntoViewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOffset(value: Offset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

