package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the Tabs
  */
@js.native
trait TabsOptions extends js.Object {
  /**
    * Transition duration in milliseconds.
    * @default 300
    */
  var duration: Double = js.native
  /**
    * The maximum width of the screen, in pixels, where the swipeable functionality initializes.
    * @default infinity
    */
  var responsiveThreshold: Double = js.native
  /**
    * Set to true to enable swipeable tabs. This also uses the responsiveThreshold option
    * @default false
    */
  var swipeable: Boolean = js.native
  /**
    * Callback for when a new tab content is shown
    */
  def onShow(newContent: Element): Unit = js.native
}

object TabsOptions {
  @scala.inline
  def apply(duration: Double, onShow: Element => Unit, responsiveThreshold: Double, swipeable: Boolean): TabsOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], onShow = js.Any.fromFunction1(onShow), responsiveThreshold = responsiveThreshold.asInstanceOf[js.Any], swipeable = swipeable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsOptions]
  }
  @scala.inline
  implicit class TabsOptionsOps[Self <: TabsOptions] (val x: Self) extends AnyVal {
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
    def withOnShow(value: Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResponsiveThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipeable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

