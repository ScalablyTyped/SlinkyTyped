package typingsSlinky.cypress.cypressMod.Cypress

import typingsSlinky.cypress.cypressStrings.linear
import typingsSlinky.cypress.cypressStrings.swing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollToOptions
  extends Loggable
     with Timeoutable {
  /**
    * Scrolls over the duration (in ms)
    *
    * @default 0
    */
  var duration: Double = js.native
  /**
    * Will scroll with the easing animation
    *
    * @default 'swing'
    */
  var easing: swing | linear = js.native
}

object ScrollToOptions {
  @scala.inline
  def apply(duration: Double, easing: swing | linear, log: Boolean, timeout: Double): ScrollToOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollToOptions]
  }
  @scala.inline
  implicit class ScrollToOptionsOps[Self <: ScrollToOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEasing(value: swing | linear): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

