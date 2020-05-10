package typingsSlinky.extjs.Ext.slider

import typingsSlinky.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThumb extends IBase {
  /** [Config Option] (Boolean) */
  var constrain: js.UndefOr[Boolean] = js.native
  /** [Method] Disables the thumb if it is currently enabled */
  var disable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Enables the thumb if it is currently disabled */
  var enable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets up an Ext dd DragTracker for this thumb */
  var initEvents: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Renders the thumb into a slider */
  var render: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Ext.slider.MultiSlider) */
  var slider: js.UndefOr[IMultiSlider] = js.native
}

object IThumb {
  @scala.inline
  def apply(): IThumb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IThumb]
  }
  @scala.inline
  implicit class IThumbOps[Self <: IThumb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstrain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrain")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withInitEvents(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initEvents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInitEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withSlider(value: IMultiSlider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slider")(js.undefined)
        ret
    }
  }
  
}

