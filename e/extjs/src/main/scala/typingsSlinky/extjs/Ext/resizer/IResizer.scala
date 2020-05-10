package typingsSlinky.extjs.Ext.resizer

import typingsSlinky.extjs.Ext.IElement
import typingsSlinky.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResizer extends IObservable {
  /** [Config Option] (Ext.Element/Ext.util.Region) */
  var constrainTo: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var dynamic: js.UndefOr[Boolean] = js.native
  /** [Property] (Ext.Element) */
  var el: js.UndefOr[IElement] = js.native
  /** [Method] Returns the element that was configured with the el or target config property
  		* @returns Ext.Element element
  		*/
  var getEl: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Method] Returns the element or component that was configured with the target config property
  		* @returns Ext.Element/Ext.Component
  		*/
  var getTarget: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (String) */
  var handles: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var height: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var heightIncrement: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var maxHeight: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var maxWidth: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minHeight: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minWidth: js.UndefOr[Double] = js.native
  /** [Property] (Ext.Element/Ext.Component) */
  var originalTarget: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var pinned: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var preserveRatio: js.UndefOr[Boolean] = js.native
  /** [Method] Perform a manual resize and fires the resize event
  		* @param width Number
  		* @param height Number
  		*/
  var resizeTo: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], Unit]
  ] = js.native
  /** [Property] (Ext.resizer.ResizeTracker) */
  var resizeTracker: js.UndefOr[IResizeTracker] = js.native
  /** [Config Option] (Ext.Element/Ext.Component) */
  var target: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var transparent: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var width: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var widthIncrement: js.UndefOr[Double] = js.native
}

object IResizer {
  @scala.inline
  def apply(): IResizer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResizer]
  }
  @scala.inline
  implicit class IResizerOps[Self <: IResizer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstrainTo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrainTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainTo")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamic")(js.undefined)
        ret
    }
    @scala.inline
    def withEl(value: IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEl(value: () => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEl")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTarget(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTarget")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withHandles(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handles")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHeightIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightIncrement")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withPinned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveRatio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeTo(value: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeTo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutResizeTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeTo")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeTracker(value: IResizeTracker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeTracker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeTracker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeTracker")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTransparent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransparent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidthIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthIncrement")(js.undefined)
        ret
    }
  }
  
}

