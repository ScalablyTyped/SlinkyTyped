package typingsSlinky.androiduix.android.graphics.drawable.ScaleDrawable

import typingsSlinky.androiduix.android.graphics.drawable.Drawable
import typingsSlinky.androiduix.android.graphics.drawable.Drawable.ConstantState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleState extends ConstantState {
  var mCanConstantState: js.Any = js.native
  var mCheckedConstantState: js.Any = js.native
  var mDrawable: Drawable = js.native
  var mGravity: Double = js.native
  var mScaleHeight: Double = js.native
  var mScaleWidth: Double = js.native
  var mUseIntrinsicSizeAsMin: Boolean = js.native
  def canConstantState(): Boolean = js.native
}

object ScaleState {
  @scala.inline
  def apply(
    canConstantState: () => Boolean,
    mCanConstantState: js.Any,
    mCheckedConstantState: js.Any,
    mDrawable: Drawable,
    mGravity: Double,
    mScaleHeight: Double,
    mScaleWidth: Double,
    mUseIntrinsicSizeAsMin: Boolean,
    newDrawable: () => Drawable
  ): ScaleState = {
    val __obj = js.Dynamic.literal(canConstantState = js.Any.fromFunction0(canConstantState), mCanConstantState = mCanConstantState.asInstanceOf[js.Any], mCheckedConstantState = mCheckedConstantState.asInstanceOf[js.Any], mDrawable = mDrawable.asInstanceOf[js.Any], mGravity = mGravity.asInstanceOf[js.Any], mScaleHeight = mScaleHeight.asInstanceOf[js.Any], mScaleWidth = mScaleWidth.asInstanceOf[js.Any], mUseIntrinsicSizeAsMin = mUseIntrinsicSizeAsMin.asInstanceOf[js.Any], newDrawable = js.Any.fromFunction0(newDrawable))
    __obj.asInstanceOf[ScaleState]
  }
  @scala.inline
  implicit class ScaleStateOps[Self <: ScaleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanConstantState(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canConstantState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMCanConstantState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mCanConstantState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMCheckedConstantState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mCheckedConstantState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawable(value: Drawable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMGravity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mGravity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMScaleHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mScaleHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMScaleWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mScaleWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMUseIntrinsicSizeAsMin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mUseIntrinsicSizeAsMin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

