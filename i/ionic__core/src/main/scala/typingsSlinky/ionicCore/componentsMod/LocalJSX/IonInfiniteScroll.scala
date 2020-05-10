package typingsSlinky.ionicCore.componentsMod.LocalJSX

import org.scalajs.dom.raw.CustomEvent
import typingsSlinky.ionicCore.ionicCoreStrings.bottom
import typingsSlinky.ionicCore.ionicCoreStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonInfiniteScroll extends js.Object {
  /**
    * If `true`, the infinite scroll will be hidden and scroll event listeners will be removed.  Set this to true to disable the infinite scroll from actively trying to receive new data while scrolling. This is useful when it is known that there is no more data that can be added, and the infinite scroll is no longer needed.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Emitted when the scroll reaches the threshold distance. From within your infinite handler, you must call the infinite scroll's `complete()` method when your async operation has completed.
    */
  var onIonInfinite: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * The position of the infinite scroll element. The value can be either `top` or `bottom`.
    */
  var position: js.UndefOr[top | bottom] = js.native
  /**
    * The threshold distance from the bottom of the content to call the `infinite` output event when scrolled. The threshold value can be either a percent, or in pixels. For example, use the value of `10%` for the `infinite` output event to get called when the user has scrolled 10% from the bottom of the page. Use the value `100px` when the scroll is within 100 pixels from the bottom of the page.
    */
  var threshold: js.UndefOr[String] = js.native
}

object IonInfiniteScroll {
  @scala.inline
  def apply(): IonInfiniteScroll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonInfiniteScroll]
  }
  @scala.inline
  implicit class IonInfiniteScrollOps[Self <: IonInfiniteScroll] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonInfinite(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonInfinite")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonInfinite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonInfinite")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: top | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
  }
  
}

