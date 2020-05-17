package typingsSlinky.androiduix.android.graphics.drawable.LayerDrawable

import typingsSlinky.androiduix.android.graphics.drawable.Drawable
import typingsSlinky.androiduix.android.graphics.drawable.Drawable.ConstantState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerState extends ConstantState {
  var mAutoMirrored: js.Any = js.native
  var mCanConstantState: js.Any = js.native
  var mCheckedConstantState: js.Any = js.native
  var mChildren: js.Array[ChildDrawable] = js.native
  var mHaveOpacity: js.Any = js.native
  var mHaveStateful: js.Any = js.native
  var mNum: Double = js.native
  var mOpacity: js.Any = js.native
  var mStateful: js.Any = js.native
  def canConstantState(): Boolean = js.native
  def getOpacity(): Double = js.native
  def isStateful(): Boolean = js.native
}

object LayerState {
  @scala.inline
  def apply(
    canConstantState: () => Boolean,
    getOpacity: () => Double,
    isStateful: () => Boolean,
    mAutoMirrored: js.Any,
    mCanConstantState: js.Any,
    mCheckedConstantState: js.Any,
    mChildren: js.Array[ChildDrawable],
    mHaveOpacity: js.Any,
    mHaveStateful: js.Any,
    mNum: Double,
    mOpacity: js.Any,
    mStateful: js.Any,
    newDrawable: () => Drawable
  ): LayerState = {
    val __obj = js.Dynamic.literal(canConstantState = js.Any.fromFunction0(canConstantState), getOpacity = js.Any.fromFunction0(getOpacity), isStateful = js.Any.fromFunction0(isStateful), mAutoMirrored = mAutoMirrored.asInstanceOf[js.Any], mCanConstantState = mCanConstantState.asInstanceOf[js.Any], mCheckedConstantState = mCheckedConstantState.asInstanceOf[js.Any], mChildren = mChildren.asInstanceOf[js.Any], mHaveOpacity = mHaveOpacity.asInstanceOf[js.Any], mHaveStateful = mHaveStateful.asInstanceOf[js.Any], mNum = mNum.asInstanceOf[js.Any], mOpacity = mOpacity.asInstanceOf[js.Any], mStateful = mStateful.asInstanceOf[js.Any], newDrawable = js.Any.fromFunction0(newDrawable))
    __obj.asInstanceOf[LayerState]
  }
  @scala.inline
  implicit class LayerStateOps[Self <: LayerState] (val x: Self) extends AnyVal {
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
    def withGetOpacity(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOpacity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsStateful(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStateful")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMAutoMirrored(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mAutoMirrored")(value.asInstanceOf[js.Any])
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
    def withMChildren(value: js.Array[ChildDrawable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMHaveOpacity(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mHaveOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMHaveStateful(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mHaveStateful")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMNum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOpacity(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMStateful(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mStateful")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

