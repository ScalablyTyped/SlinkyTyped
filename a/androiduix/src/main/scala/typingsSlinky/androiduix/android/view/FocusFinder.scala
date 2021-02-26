package typingsSlinky.androiduix.android.view

import typingsSlinky.androiduix.android.graphics.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocusFinder extends StObject {
  
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
  
  var mBestCandidateRect: Rect = js.native
  
  var mFocusedRect: Rect = js.native
  
  var mOtherRect: Rect = js.native
  
  var mSequentialFocusComparator: js.Any = js.native
  
  var mTempList: js.Any = js.native
  
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
  implicit class FocusFinderMutableBuilder[Self <: FocusFinder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeamBeats(value: (Double, Rect, Rect, Rect) => Boolean): Self = StObject.set(x, "beamBeats", js.Any.fromFunction4(value))
    
    @scala.inline
    def setBeamsOverlap(value: (Double, Rect, Rect) => Boolean): Self = StObject.set(x, "beamsOverlap", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFindNearestTouchable(value: (ViewGroup, Double, Double, Double, js.Array[Double]) => View): Self = StObject.set(x, "findNearestTouchable", js.Any.fromFunction5(value))
    
    @scala.inline
    def setFindNextFocus(value: (ViewGroup, View, Double) => View): Self = StObject.set(x, "findNextFocus", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFindNextFocusFromRect(value: (ViewGroup, Rect, Double) => View): Self = StObject.set(x, "findNextFocusFromRect", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFindNextFocusInAbsoluteDirection(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "findNextFocusInAbsoluteDirection", js.Any.fromFunction5(value))
    
    @scala.inline
    def setFindNextFocusInRelativeDirection(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "findNextFocusInRelativeDirection", js.Any.fromFunction5(value))
    
    @scala.inline
    def setFindNextUserSpecifiedFocus(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "findNextUserSpecifiedFocus", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetWeightedDistanceFor(value: (Double, Double) => Double): Self = StObject.set(x, "getWeightedDistanceFor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsBetterCandidate(value: (Double, Rect, Rect, Rect) => Boolean): Self = StObject.set(x, "isBetterCandidate", js.Any.fromFunction4(value))
    
    @scala.inline
    def setIsCandidate(value: (Rect, Rect, Double) => Boolean): Self = StObject.set(x, "isCandidate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setIsToDirectionOf(value: (Double, Rect, Rect) => Boolean): Self = StObject.set(x, "isToDirectionOf", js.Any.fromFunction3(value))
    
    @scala.inline
    def setIsTouchCandidate(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "isTouchCandidate", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMBestCandidateRect(value: Rect): Self = StObject.set(x, "mBestCandidateRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMFocusedRect(value: Rect): Self = StObject.set(x, "mFocusedRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOtherRect(value: Rect): Self = StObject.set(x, "mOtherRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSequentialFocusComparator(value: js.Any): Self = StObject.set(x, "mSequentialFocusComparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTempList(value: js.Any): Self = StObject.set(x, "mTempList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFocusBottomRight(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "setFocusBottomRight", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetFocusTopLeft(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "setFocusTopLeft", js.Any.fromFunction2(value))
    
    @scala.inline
    def set__findNextFocus(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "__findNextFocus", js.Any.fromFunction5(value))
    
    @scala.inline
    def set_findNextFocus(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "_findNextFocus", js.Any.fromFunction4(value))
  }
}
