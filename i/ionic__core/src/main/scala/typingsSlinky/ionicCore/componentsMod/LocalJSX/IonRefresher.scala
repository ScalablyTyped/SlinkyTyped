package typingsSlinky.ionicCore.componentsMod.LocalJSX

import org.scalajs.dom.raw.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonRefresher extends js.Object {
  /**
    * Time it takes to close the refresher.
    */
  var closeDuration: js.UndefOr[String] = js.native
  /**
    * If `true`, the refresher will be hidden.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Emitted while the user is pulling down the content and exposing the refresher.
    */
  var onIonPull: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted when the user lets go of the content and has pulled down further than the `pullMin` or pulls the content down and exceeds the pullMax. Updates the refresher state to `refreshing`. The `complete()` method should be called when the async operation has completed.
    */
  var onIonRefresh: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted when the user begins to start pulling down.
    */
  var onIonStart: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * How much to multiply the pull speed by. To slow the pull animation down, pass a number less than `1`. To speed up the pull, pass a number greater than `1`. The default value is `1` which is equal to the speed of the cursor. If a negative value is passed in, the factor will be `1` instead.  For example: If the value passed is `1.2` and the content is dragged by `10` pixels, instead of `10` pixels the content will be pulled by `12` pixels (an increase of 20 percent). If the value passed is `0.8`, the dragged amount will be `8` pixels, less than the amount the cursor has moved.
    */
  var pullFactor: js.UndefOr[Double] = js.native
  /**
    * The maximum distance of the pull until the refresher will automatically go into the `refreshing` state. Defaults to the result of `pullMin + 60`.
    */
  var pullMax: js.UndefOr[Double] = js.native
  /**
    * The minimum distance the user must pull down until the refresher will go into the `refreshing` state.
    */
  var pullMin: js.UndefOr[Double] = js.native
  /**
    * Time it takes the refresher to to snap back to the `refreshing` state.
    */
  var snapbackDuration: js.UndefOr[String] = js.native
}

object IonRefresher {
  @scala.inline
  def apply(): IonRefresher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonRefresher]
  }
  @scala.inline
  implicit class IonRefresherOps[Self <: IonRefresher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeDuration")(js.undefined)
        ret
    }
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
    def withOnIonPull(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonPull")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonPull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonPull")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonRefresh(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonRefresh")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonStart(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonStart")(js.undefined)
        ret
    }
    @scala.inline
    def withPullFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withPullMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullMax")(js.undefined)
        ret
    }
    @scala.inline
    def withPullMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullMin")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapbackDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapbackDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapbackDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapbackDuration")(js.undefined)
        ret
    }
  }
  
}

