package typingsSlinky.extjs.Ext.slider

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.form.field.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMulti extends IBase {
  /** [Method] Creates a new thumb and adds it to the slider
  		* @param value Number The initial value to set on the thumb.
  		* @returns any The thumb
  		*/
  var addThumb: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], _]] = js.native
  /** [Config Option] (Boolean) */
  @JSName("animate")
  var animate_IMulti: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var clickToChange: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var constrainThumbs: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number/Boolean) */
  var decimalPrecision: js.UndefOr[js.Any] = js.native
  /** [Property] (Boolean) */
  var dragging: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the current value of the slider
  		* @param index Number The index of the thumb to return a value for
  		* @returns any The current value of the slider at the given index, or an array of all thumb values if no index is given.
  		*/
  @JSName("getValue")
  var getValue_IMulti: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], _]] = js.native
  /** [Method] Returns an array of values  one for the location of each thumb
  		* @returns any The set of thumb values
  		*/
  var getValues: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Number) */
  var increment: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var keyIncrement: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[Double] = js.native
  /** [Method] Sets the maximum value for the slider instance
  		* @param val Number The new maximum value
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* val */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the minimum value for the slider instance
  		* @param val Number The new minimum value
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* val */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the read only state of this field
  		* @param readOnly Object
  		*/
  @JSName("setReadOnly")
  var setReadOnly_IMulti: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Synchronizes thumbs position to the proper proportion of the total component width based on the current slider value  */
  var syncThumbs: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Array) */
  var thumbs: js.UndefOr[Array] = js.native
  /** [Config Option] (Function) */
  var tipText: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object/Boolean) */
  var useTips: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  @JSName("value")
  var value_IMulti: js.UndefOr[Double] = js.native
  /** [Config Option] (Number[]) */
  var values: js.UndefOr[Array] = js.native
  /** [Config Option] (Boolean) */
  var vertical: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var zeroBasedSnapping: js.UndefOr[Boolean] = js.native
}

object IMulti {
  @scala.inline
  def apply(): IMulti = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMulti]
  }
  @scala.inline
  implicit class IMultiOps[Self <: IMulti] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddThumb(value: /* value */ js.UndefOr[Double] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addThumb")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddThumb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addThumb")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withClickToChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickToChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToChange")(js.undefined)
        ret
    }
    @scala.inline
    def withConstrainThumbs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainThumbs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrainThumbs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainThumbs")(js.undefined)
        ret
    }
    @scala.inline
    def withDecimalPrecision(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalPrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimalPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalPrecision")(js.undefined)
        ret
    }
    @scala.inline
    def withDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragging")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValue(value: /* index */ js.UndefOr[Double] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValues(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValues")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValues")(js.undefined)
        ret
    }
    @scala.inline
    def withIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increment")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyIncrement")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMaxValue(value: /* val */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMinValue(value: /* val */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSetReadOnly(value: /* readOnly */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReadOnly")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReadOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncThumbs(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncThumbs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSyncThumbs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncThumbs")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbs(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbs")(js.undefined)
        ret
    }
    @scala.inline
    def withTipText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTipText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipText")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTips(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTips")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
    @scala.inline
    def withZeroBasedSnapping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroBasedSnapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZeroBasedSnapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroBasedSnapping")(js.undefined)
        ret
    }
  }
  
}

