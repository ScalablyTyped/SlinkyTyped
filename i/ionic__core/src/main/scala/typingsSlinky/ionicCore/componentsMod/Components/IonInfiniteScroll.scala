package typingsSlinky.ionicCore.componentsMod.Components

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
  var disabled: Boolean = js.native
  /**
    * The position of the infinite scroll element. The value can be either `top` or `bottom`.
    */
  var position: top | bottom = js.native
  /**
    * The threshold distance from the bottom of the content to call the `infinite` output event when scrolled. The threshold value can be either a percent, or in pixels. For example, use the value of `10%` for the `infinite` output event to get called when the user has scrolled 10% from the bottom of the page. Use the value `100px` when the scroll is within 100 pixels from the bottom of the page.
    */
  var threshold: String = js.native
  /**
    * Call `complete()` within the `ionInfinite` output event handler when your async operation has completed. For example, the `loading` state is while the app is performing an asynchronous operation, such as receiving more data from an AJAX request to add more items to a data list. Once the data has been received and UI updated, you then call this method to signify that the loading has completed. This method will change the infinite scroll's state from `loading` to `enabled`.
    */
  def complete(): js.Promise[Unit] = js.native
}

object IonInfiniteScroll {
  @scala.inline
  def apply(complete: () => js.Promise[Unit], disabled: Boolean, position: top | bottom, threshold: String): IonInfiniteScroll = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), disabled = disabled.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonInfiniteScroll]
  }
  @scala.inline
  implicit class IonInfiniteScrollOps[Self <: IonInfiniteScroll] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: top | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreshold(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

