package typingsSlinky.androiduix.android.graphics.drawable.ClipDrawable

import typingsSlinky.androiduix.android.graphics.drawable.Drawable
import typingsSlinky.androiduix.android.graphics.drawable.Drawable.ConstantState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClipState extends ConstantState {
  var mCanConstantState: js.Any = js.native
  var mCheckedConstantState: js.Any = js.native
  var mDrawable: Drawable = js.native
  var mGravity: Double = js.native
  var mOrientation: Double = js.native
  def canConstantState(): Boolean = js.native
}

object ClipState {
  @scala.inline
  def apply(
    canConstantState: () => Boolean,
    mCanConstantState: js.Any,
    mCheckedConstantState: js.Any,
    mDrawable: Drawable,
    mGravity: Double,
    mOrientation: Double,
    newDrawable: () => Drawable
  ): ClipState = {
    val __obj = js.Dynamic.literal(canConstantState = js.Any.fromFunction0(canConstantState), mCanConstantState = mCanConstantState.asInstanceOf[js.Any], mCheckedConstantState = mCheckedConstantState.asInstanceOf[js.Any], mDrawable = mDrawable.asInstanceOf[js.Any], mGravity = mGravity.asInstanceOf[js.Any], mOrientation = mOrientation.asInstanceOf[js.Any], newDrawable = js.Any.fromFunction0(newDrawable))
    __obj.asInstanceOf[ClipState]
  }
  @scala.inline
  implicit class ClipStateOps[Self <: ClipState] (val x: Self) extends AnyVal {
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
    def withMOrientation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOrientation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

