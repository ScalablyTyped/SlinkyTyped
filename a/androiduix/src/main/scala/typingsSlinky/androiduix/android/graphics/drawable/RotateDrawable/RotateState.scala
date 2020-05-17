package typingsSlinky.androiduix.android.graphics.drawable.RotateDrawable

import typingsSlinky.androiduix.android.graphics.drawable.Drawable
import typingsSlinky.androiduix.android.graphics.drawable.Drawable.ConstantState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RotateState extends ConstantState {
  var mCanConstantState: js.Any = js.native
  var mCheckedConstantState: js.Any = js.native
  var mCurrentDegrees: Double = js.native
  var mDrawable: Drawable = js.native
  var mFromDegrees: Double = js.native
  var mPivotX: Double = js.native
  var mPivotXRel: Boolean = js.native
  var mPivotY: Double = js.native
  var mPivotYRel: Boolean = js.native
  var mToDegrees: Double = js.native
  def canConstantState(): Boolean = js.native
}

object RotateState {
  @scala.inline
  def apply(
    canConstantState: () => Boolean,
    mCanConstantState: js.Any,
    mCheckedConstantState: js.Any,
    mCurrentDegrees: Double,
    mDrawable: Drawable,
    mFromDegrees: Double,
    mPivotX: Double,
    mPivotXRel: Boolean,
    mPivotY: Double,
    mPivotYRel: Boolean,
    mToDegrees: Double,
    newDrawable: () => Drawable
  ): RotateState = {
    val __obj = js.Dynamic.literal(canConstantState = js.Any.fromFunction0(canConstantState), mCanConstantState = mCanConstantState.asInstanceOf[js.Any], mCheckedConstantState = mCheckedConstantState.asInstanceOf[js.Any], mCurrentDegrees = mCurrentDegrees.asInstanceOf[js.Any], mDrawable = mDrawable.asInstanceOf[js.Any], mFromDegrees = mFromDegrees.asInstanceOf[js.Any], mPivotX = mPivotX.asInstanceOf[js.Any], mPivotXRel = mPivotXRel.asInstanceOf[js.Any], mPivotY = mPivotY.asInstanceOf[js.Any], mPivotYRel = mPivotYRel.asInstanceOf[js.Any], mToDegrees = mToDegrees.asInstanceOf[js.Any], newDrawable = js.Any.fromFunction0(newDrawable))
    __obj.asInstanceOf[RotateState]
  }
  @scala.inline
  implicit class RotateStateOps[Self <: RotateState] (val x: Self) extends AnyVal {
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
    def withMCurrentDegrees(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mCurrentDegrees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawable(value: Drawable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMFromDegrees(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mFromDegrees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMPivotX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mPivotX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMPivotXRel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mPivotXRel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMPivotY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mPivotY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMPivotYRel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mPivotYRel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMToDegrees(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mToDegrees")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

