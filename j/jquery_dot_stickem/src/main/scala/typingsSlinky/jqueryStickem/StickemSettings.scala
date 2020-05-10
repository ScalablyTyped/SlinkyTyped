package typingsSlinky.jqueryStickem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StickemSettings extends js.Object {
  /**
    * selector for content container, sizes matched with `item`
    */
  var container: js.UndefOr[String] = js.native
  /**
    * css class used to apply when ending sticky
    */
  var endStickClass: js.UndefOr[String] = js.native
  /**
    * selector for element to make sticky
    */
  var item: js.UndefOr[String] = js.native
  /**
    * offset to use for the sticky element in the parent element
    */
  var offset: js.UndefOr[Double | String] = js.native
  /**
    * Callback to execute when in stick state
    */
  var onStick: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback to execute when getting out of stick state
    */
  var onUnstick: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * where to place sticky element
    */
  var start: js.UndefOr[Double | String] = js.native
  /**
    * css class used to apply
    */
  var stickClass: js.UndefOr[String] = js.native
}

object StickemSettings {
  @scala.inline
  def apply(): StickemSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StickemSettings]
  }
  @scala.inline
  implicit class StickemSettingsOps[Self <: StickemSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withEndStickClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endStickClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndStickClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endStickClass")(js.undefined)
        ret
    }
    @scala.inline
    def withItem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnStick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnstick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnstick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnUnstick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnstick")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStickClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickClass")(js.undefined)
        ret
    }
  }
  
}

