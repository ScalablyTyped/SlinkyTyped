package typingsSlinky.androiduix.android.view

import typingsSlinky.androiduix.android.graphics.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocusFinder extends js.Object {
  var mBestCandidateRect: Rect = js.native
  var mFocusedRect: Rect = js.native
  var mOtherRect: Rect = js.native
  var mSequentialFocusComparator: js.Any = js.native
  var mTempList: js.Any = js.native
  /* private */ def __findNextFocus(root: js.Any, focused: js.Any, focusedRect: js.Any, direction: js.Any, focusables: js.Any): js.Any = js.native
  /* private */ def _findNextFocus(root: js.Any, focused: js.Any, focusedRect: js.Any, direction: js.Any): js.Any = js.native
  def beamBeats(direction: Double, source: Rect, rect1: Rect, rect2: Rect): Boolean = js.native
  def beamsOverlap(direction: Double, rect1: Rect, rect2: Rect): Boolean = js.native
  def findNearestTouchable(root: ViewGroup, x: Double, y: Double, direction: Double, deltas: js.Array[Double]): View = js.native
  def findNextFocus(root: ViewGroup, focused: View, direction: Double): View = js.native
  def findNextFocusFromRect(root: ViewGroup, focusedRect: Rect, direction: Double): View = js.native
  /* private */ def findNextFocusInAbsoluteDirection(focusables: js.Any, root: js.Any, focused: js.Any, focusedRect: js.Any, direction: js.Any): js.Any = js.native
  /* private */ def findNextFocusInRelativeDirection(focusables: js.Any, root: js.Any, focused: js.Any, focusedRect: js.Any, direction: js.Any): js.Any = js.native
  /* private */ def findNextUserSpecifiedFocus(root: js.Any, focused: js.Any, direction: js.Any): js.Any = js.native
  def getWeightedDistanceFor(majorAxisDistance: Double, minorAxisDistance: Double): Double = js.native
  def isBetterCandidate(direction: Double, source: Rect, rect1: Rect, rect2: Rect): Boolean = js.native
  def isCandidate(srcRect: Rect, destRect: Rect, direction: Double): Boolean = js.native
  def isToDirectionOf(direction: Double, src: Rect, dest: Rect): Boolean = js.native
  /* private */ def isTouchCandidate(x: js.Any, y: js.Any, destRect: js.Any, direction: js.Any): js.Any = js.native
  /* private */ def setFocusBottomRight(root: js.Any, focusedRect: js.Any): js.Any = js.native
  /* private */ def setFocusTopLeft(root: js.Any, focusedRect: js.Any): js.Any = js.native
}

object FocusFinder {
  @scala.inline
  def apply(
    __findNextFocus: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    _findNextFocus: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    beamBeats: (Double, Rect, Rect, Rect) => Boolean,
    beamsOverlap: (Double, Rect, Rect) => Boolean,
    findNearestTouchable: (ViewGroup, Double, Double, Double, js.Array[Double]) => View,
    findNextFocus: (ViewGroup, View, Double) => View,
    findNextFocusFromRect: (ViewGroup, Rect, Double) => View,
    findNextFocusInAbsoluteDirection: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    findNextFocusInRelativeDirection: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    findNextUserSpecifiedFocus: (js.Any, js.Any, js.Any) => js.Any,
    getWeightedDistanceFor: (Double, Double) => Double,
    isBetterCandidate: (Double, Rect, Rect, Rect) => Boolean,
    isCandidate: (Rect, Rect, Double) => Boolean,
    isToDirectionOf: (Double, Rect, Rect) => Boolean,
    isTouchCandidate: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    mBestCandidateRect: Rect,
    mFocusedRect: Rect,
    mOtherRect: Rect,
    mSequentialFocusComparator: js.Any,
    mTempList: js.Any,
    setFocusBottomRight: (js.Any, js.Any) => js.Any,
    setFocusTopLeft: (js.Any, js.Any) => js.Any
  ): FocusFinder = {
    val __obj = js.Dynamic.literal(__findNextFocus = js.Any.fromFunction5(__findNextFocus), _findNextFocus = js.Any.fromFunction4(_findNextFocus), beamBeats = js.Any.fromFunction4(beamBeats), beamsOverlap = js.Any.fromFunction3(beamsOverlap), findNearestTouchable = js.Any.fromFunction5(findNearestTouchable), findNextFocus = js.Any.fromFunction3(findNextFocus), findNextFocusFromRect = js.Any.fromFunction3(findNextFocusFromRect), findNextFocusInAbsoluteDirection = js.Any.fromFunction5(findNextFocusInAbsoluteDirection), findNextFocusInRelativeDirection = js.Any.fromFunction5(findNextFocusInRelativeDirection), findNextUserSpecifiedFocus = js.Any.fromFunction3(findNextUserSpecifiedFocus), getWeightedDistanceFor = js.Any.fromFunction2(getWeightedDistanceFor), isBetterCandidate = js.Any.fromFunction4(isBetterCandidate), isCandidate = js.Any.fromFunction3(isCandidate), isToDirectionOf = js.Any.fromFunction3(isToDirectionOf), isTouchCandidate = js.Any.fromFunction4(isTouchCandidate), mBestCandidateRect = mBestCandidateRect.asInstanceOf[js.Any], mFocusedRect = mFocusedRect.asInstanceOf[js.Any], mOtherRect = mOtherRect.asInstanceOf[js.Any], mSequentialFocusComparator = mSequentialFocusComparator.asInstanceOf[js.Any], mTempList = mTempList.asInstanceOf[js.Any], setFocusBottomRight = js.Any.fromFunction2(setFocusBottomRight), setFocusTopLeft = js.Any.fromFunction2(setFocusTopLeft))
    __obj.asInstanceOf[FocusFinder]
  }
  @scala.inline
  implicit class FocusFinderOps[Self <: FocusFinder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__findNextFocus(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__findNextFocus")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def with_findNextFocus(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_findNextFocus")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withBeamBeats(value: (Double, Rect, Rect, Rect) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beamBeats")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withBeamsOverlap(value: (Double, Rect, Rect) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beamsOverlap")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFindNearestTouchable(value: (ViewGroup, Double, Double, Double, js.Array[Double]) => View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findNearestTouchable")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withFindNextFocus(value: (ViewGroup, View, Double) => View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findNextFocus")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFindNextFocusFromRect(value: (ViewGroup, Rect, Double) => View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findNextFocusFromRect")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFindNextFocusInAbsoluteDirection(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findNextFocusInAbsoluteDirection")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withFindNextFocusInRelativeDirection(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findNextFocusInRelativeDirection")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withFindNextUserSpecifiedFocus(value: (js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findNextUserSpecifiedFocus")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetWeightedDistanceFor(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWeightedDistanceFor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsBetterCandidate(value: (Double, Rect, Rect, Rect) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBetterCandidate")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withIsCandidate(value: (Rect, Rect, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCandidate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withIsToDirectionOf(value: (Double, Rect, Rect) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isToDirectionOf")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withIsTouchCandidate(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTouchCandidate")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withMBestCandidateRect(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mBestCandidateRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMFocusedRect(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mFocusedRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOtherRect(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOtherRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMSequentialFocusComparator(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mSequentialFocusComparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTempList(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTempList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetFocusBottomRight(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFocusBottomRight")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetFocusTopLeft(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFocusTopLeft")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

