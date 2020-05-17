package typingsSlinky.androiduix.android.widget.TextView

import typingsSlinky.androiduix.android.graphics.Rect
import typingsSlinky.androiduix.android.graphics.drawable.Drawable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Drawables extends js.Object {
  var mCompoundRect: Rect = js.native
  var mDrawableBottom: Drawable = js.native
  var mDrawableEnd: Drawable = js.native
  var mDrawableError: Drawable = js.native
  var mDrawableHeightEnd: Double = js.native
  var mDrawableHeightError: Double = js.native
  var mDrawableHeightLeft: Double = js.native
  var mDrawableHeightRight: Double = js.native
  var mDrawableHeightStart: Double = js.native
  var mDrawableHeightTemp: Double = js.native
  var mDrawableLeft: Drawable = js.native
  var mDrawableLeftInitial: Drawable = js.native
  var mDrawablePadding: Double = js.native
  var mDrawableRight: Drawable = js.native
  var mDrawableRightInitial: Drawable = js.native
  var mDrawableSaved: Double = js.native
  var mDrawableSizeBottom: Double = js.native
  var mDrawableSizeEnd: Double = js.native
  var mDrawableSizeError: Double = js.native
  var mDrawableSizeLeft: Double = js.native
  var mDrawableSizeRight: Double = js.native
  var mDrawableSizeStart: Double = js.native
  var mDrawableSizeTemp: Double = js.native
  var mDrawableSizeTop: Double = js.native
  var mDrawableStart: Drawable = js.native
  var mDrawableTemp: Drawable = js.native
  var mDrawableTop: Drawable = js.native
  var mDrawableWidthBottom: Double = js.native
  var mDrawableWidthTop: Double = js.native
  var mIsRtlCompatibilityMode: Boolean = js.native
  var mOverride: Boolean = js.native
  /* private */ def applyErrorDrawableIfNeeded(layoutDirection: js.Any): js.Any = js.native
  def resolveWithLayoutDirection(layoutDirection: Double): Unit = js.native
  def setErrorDrawable(dr: Drawable, tv: typingsSlinky.androiduix.android.widget.TextView): Unit = js.native
  /* private */ def updateDrawablesLayoutDirection(layoutDirection: js.Any): js.Any = js.native
}

object Drawables {
  @scala.inline
  def apply(
    applyErrorDrawableIfNeeded: js.Any => js.Any,
    mCompoundRect: Rect,
    mDrawableBottom: Drawable,
    mDrawableEnd: Drawable,
    mDrawableError: Drawable,
    mDrawableHeightEnd: Double,
    mDrawableHeightError: Double,
    mDrawableHeightLeft: Double,
    mDrawableHeightRight: Double,
    mDrawableHeightStart: Double,
    mDrawableHeightTemp: Double,
    mDrawableLeft: Drawable,
    mDrawableLeftInitial: Drawable,
    mDrawablePadding: Double,
    mDrawableRight: Drawable,
    mDrawableRightInitial: Drawable,
    mDrawableSaved: Double,
    mDrawableSizeBottom: Double,
    mDrawableSizeEnd: Double,
    mDrawableSizeError: Double,
    mDrawableSizeLeft: Double,
    mDrawableSizeRight: Double,
    mDrawableSizeStart: Double,
    mDrawableSizeTemp: Double,
    mDrawableSizeTop: Double,
    mDrawableStart: Drawable,
    mDrawableTemp: Drawable,
    mDrawableTop: Drawable,
    mDrawableWidthBottom: Double,
    mDrawableWidthTop: Double,
    mIsRtlCompatibilityMode: Boolean,
    mOverride: Boolean,
    resolveWithLayoutDirection: Double => Unit,
    setErrorDrawable: (Drawable, typingsSlinky.androiduix.android.widget.TextView) => Unit,
    updateDrawablesLayoutDirection: js.Any => js.Any
  ): Drawables = {
    val __obj = js.Dynamic.literal(applyErrorDrawableIfNeeded = js.Any.fromFunction1(applyErrorDrawableIfNeeded), mCompoundRect = mCompoundRect.asInstanceOf[js.Any], mDrawableBottom = mDrawableBottom.asInstanceOf[js.Any], mDrawableEnd = mDrawableEnd.asInstanceOf[js.Any], mDrawableError = mDrawableError.asInstanceOf[js.Any], mDrawableHeightEnd = mDrawableHeightEnd.asInstanceOf[js.Any], mDrawableHeightError = mDrawableHeightError.asInstanceOf[js.Any], mDrawableHeightLeft = mDrawableHeightLeft.asInstanceOf[js.Any], mDrawableHeightRight = mDrawableHeightRight.asInstanceOf[js.Any], mDrawableHeightStart = mDrawableHeightStart.asInstanceOf[js.Any], mDrawableHeightTemp = mDrawableHeightTemp.asInstanceOf[js.Any], mDrawableLeft = mDrawableLeft.asInstanceOf[js.Any], mDrawableLeftInitial = mDrawableLeftInitial.asInstanceOf[js.Any], mDrawablePadding = mDrawablePadding.asInstanceOf[js.Any], mDrawableRight = mDrawableRight.asInstanceOf[js.Any], mDrawableRightInitial = mDrawableRightInitial.asInstanceOf[js.Any], mDrawableSaved = mDrawableSaved.asInstanceOf[js.Any], mDrawableSizeBottom = mDrawableSizeBottom.asInstanceOf[js.Any], mDrawableSizeEnd = mDrawableSizeEnd.asInstanceOf[js.Any], mDrawableSizeError = mDrawableSizeError.asInstanceOf[js.Any], mDrawableSizeLeft = mDrawableSizeLeft.asInstanceOf[js.Any], mDrawableSizeRight = mDrawableSizeRight.asInstanceOf[js.Any], mDrawableSizeStart = mDrawableSizeStart.asInstanceOf[js.Any], mDrawableSizeTemp = mDrawableSizeTemp.asInstanceOf[js.Any], mDrawableSizeTop = mDrawableSizeTop.asInstanceOf[js.Any], mDrawableStart = mDrawableStart.asInstanceOf[js.Any], mDrawableTemp = mDrawableTemp.asInstanceOf[js.Any], mDrawableTop = mDrawableTop.asInstanceOf[js.Any], mDrawableWidthBottom = mDrawableWidthBottom.asInstanceOf[js.Any], mDrawableWidthTop = mDrawableWidthTop.asInstanceOf[js.Any], mIsRtlCompatibilityMode = mIsRtlCompatibilityMode.asInstanceOf[js.Any], mOverride = mOverride.asInstanceOf[js.Any], resolveWithLayoutDirection = js.Any.fromFunction1(resolveWithLayoutDirection), setErrorDrawable = js.Any.fromFunction2(setErrorDrawable), updateDrawablesLayoutDirection = js.Any.fromFunction1(updateDrawablesLayoutDirection))
    __obj.asInstanceOf[Drawables]
  }
  @scala.inline
  implicit class DrawablesOps[Self <: Drawables] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyErrorDrawableIfNeeded(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyErrorDrawableIfNeeded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMCompoundRect(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mCompoundRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawableBottom(value: Drawable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawableBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawableEnd(value: Drawable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawableEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawableError(value: Drawable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawableError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawableHeightEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawableHeightEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawableHeightError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawableHeightError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawableHeightLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawableHeightLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawableHeightRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawableHeightRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawableHeightStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawableHeightStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawableHeightTemp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawableHeightTemp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawableLeft(value: Drawable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawableLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawableLeftInitial(value: Drawable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawableLeftInitial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawablePadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawablePadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawableRight(value: Drawable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawableRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawableRightInitial(value: Drawable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawableRightInitial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawableSaved(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawableSaved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawableSizeBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawableSizeBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawableSizeEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawableSizeEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawableSizeError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawableSizeError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawableSizeLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawableSizeLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawableSizeRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawableSizeRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawableSizeStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawableSizeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawableSizeTemp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawableSizeTemp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawableSizeTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawableSizeTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawableStart(value: Drawable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawableStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawableTemp(value: Drawable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawableTemp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawableTop(value: Drawable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawableTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawableWidthBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawableWidthBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawableWidthTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawableWidthTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIsRtlCompatibilityMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mIsRtlCompatibilityMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOverride(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolveWithLayoutDirection(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveWithLayoutDirection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetErrorDrawable(value: (Drawable, typingsSlinky.androiduix.android.widget.TextView) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setErrorDrawable")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdateDrawablesLayoutDirection(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDrawablesLayoutDirection")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

