package typingsSlinky.androiduix.android.view

import typingsSlinky.androiduix.android.graphics.Point
import typingsSlinky.androiduix.android.graphics.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewParent extends js.Object {
  def bringChildToFront(child: View): js.Any = js.native
  def childDrawableStateChanged(child: View): js.Any = js.native
  def childHasTransientStateChanged(child: View, hasTransientState: Boolean): js.Any = js.native
  def clearChildFocus(child: View): js.Any = js.native
  def focusSearch(v: View, direction: Double): View = js.native
  def focusableViewAvailable(v: View): js.Any = js.native
  def getChildVisibleRect(child: View, r: Rect, offset: Point): Boolean = js.native
  def getParent(): ViewParent = js.native
  def invalidateChild(child: View, r: Rect): js.Any = js.native
  def invalidateChildInParent(location: js.Array[Double], r: Rect): ViewParent = js.native
  def isLayoutRequested(): Boolean = js.native
  def requestChildFocus(child: View, focused: View): js.Any = js.native
  def requestChildRectangleOnScreen(child: View, rectangle: Rect, immediate: Boolean): Boolean = js.native
  def requestDisallowInterceptTouchEvent(disallowIntercept: Boolean): js.Any = js.native
  def requestLayout(): js.Any = js.native
}

object ViewParent {
  @scala.inline
  def apply(
    bringChildToFront: View => js.Any,
    childDrawableStateChanged: View => js.Any,
    childHasTransientStateChanged: (View, Boolean) => js.Any,
    clearChildFocus: View => js.Any,
    focusSearch: (View, Double) => View,
    focusableViewAvailable: View => js.Any,
    getChildVisibleRect: (View, Rect, Point) => Boolean,
    getParent: () => ViewParent,
    invalidateChild: (View, Rect) => js.Any,
    invalidateChildInParent: (js.Array[Double], Rect) => ViewParent,
    isLayoutRequested: () => Boolean,
    requestChildFocus: (View, View) => js.Any,
    requestChildRectangleOnScreen: (View, Rect, Boolean) => Boolean,
    requestDisallowInterceptTouchEvent: Boolean => js.Any,
    requestLayout: () => js.Any
  ): ViewParent = {
    val __obj = js.Dynamic.literal(bringChildToFront = js.Any.fromFunction1(bringChildToFront), childDrawableStateChanged = js.Any.fromFunction1(childDrawableStateChanged), childHasTransientStateChanged = js.Any.fromFunction2(childHasTransientStateChanged), clearChildFocus = js.Any.fromFunction1(clearChildFocus), focusSearch = js.Any.fromFunction2(focusSearch), focusableViewAvailable = js.Any.fromFunction1(focusableViewAvailable), getChildVisibleRect = js.Any.fromFunction3(getChildVisibleRect), getParent = js.Any.fromFunction0(getParent), invalidateChild = js.Any.fromFunction2(invalidateChild), invalidateChildInParent = js.Any.fromFunction2(invalidateChildInParent), isLayoutRequested = js.Any.fromFunction0(isLayoutRequested), requestChildFocus = js.Any.fromFunction2(requestChildFocus), requestChildRectangleOnScreen = js.Any.fromFunction3(requestChildRectangleOnScreen), requestDisallowInterceptTouchEvent = js.Any.fromFunction1(requestDisallowInterceptTouchEvent), requestLayout = js.Any.fromFunction0(requestLayout))
    __obj.asInstanceOf[ViewParent]
  }
  @scala.inline
  implicit class ViewParentOps[Self <: ViewParent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBringChildToFront(value: View => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bringChildToFront")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildDrawableStateChanged(value: View => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childDrawableStateChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildHasTransientStateChanged(value: (View, Boolean) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childHasTransientStateChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClearChildFocus(value: View => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearChildFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFocusSearch(value: (View, Double) => View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusSearch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFocusableViewAvailable(value: View => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusableViewAvailable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetChildVisibleRect(value: (View, Rect, Point) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildVisibleRect")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetParent(value: () => ViewParent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInvalidateChild(value: (View, Rect) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidateChild")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInvalidateChildInParent(value: (js.Array[Double], Rect) => ViewParent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidateChildInParent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsLayoutRequested(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLayoutRequested")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRequestChildFocus(value: (View, View) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestChildFocus")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRequestChildRectangleOnScreen(value: (View, Rect, Boolean) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestChildRectangleOnScreen")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRequestDisallowInterceptTouchEvent(value: Boolean => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestDisallowInterceptTouchEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequestLayout(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestLayout")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

