package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.AnonDelay
import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.top
import typingsSlinky.devextreme.mod.DevExpress.positionConfig
import typingsSlinky.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPopoverOptions[T] extends dxPopupOptions[T] {
  /** Configures widget visibility animations. This object contains two fields: show and hide. */
  @JSName("animation")
  var animation_dxPopoverOptions: js.UndefOr[dxPopoverAnimation] = js.native
  /** Specifies options of popover hiding. */
  var hideEvent: js.UndefOr[AnonDelay | String] = js.native
  /** An object defining widget positioning options. */
  @JSName("position")
  var position_dxPopoverOptions: js.UndefOr[bottom | left | right | top | positionConfig] = js.native
  /** Specifies options for displaying the widget. */
  var showEvent: js.UndefOr[AnonDelay | String] = js.native
  /** The target element associated with the widget. */
  var target: js.UndefOr[String | Element | JQuery] = js.native
}

object dxPopoverOptions {
  @scala.inline
  def apply[T](): dxPopoverOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPopoverOptions[T]]
  }
  @scala.inline
  implicit class dxPopoverOptionsOps[Self[t] <: dxPopoverOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAnimation(value: dxPopoverAnimation): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withHideEvent(value: AnonDelay | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideEvent: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: bottom | left | right | top | positionConfig): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withShowEvent(value: AnonDelay | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowEvent: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetElement(value: Element): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String | Element | JQuery): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

