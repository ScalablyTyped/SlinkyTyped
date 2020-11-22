package typingsSlinky.reactAliceCarousel

import typingsSlinky.reactAliceCarousel.anon.PartialProps
import typingsSlinky.reactAliceCarousel.anon.PartialState
import typingsSlinky.reactAliceCarousel.typesMod.State
import typingsSlinky.reactAliceCarousel.typesMod.TransformationSetItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-alice-carousel/lib/utils/math", JSImport.Namespace)
@js.native
object mathMod extends js.Object {
  
  def getActiveIndex(index: Double, dotsLength: Double, infinite: Boolean): Double = js.native
  
  def getFadeoutAnimationIndex(state: State): Double = js.native
  
  def getFadeoutAnimationPosition(nextIndex: js.Any, state: State): Double = js.native
  
  def getIsLeftDirection(): Boolean = js.native
  def getIsLeftDirection(deltaX: Double): Boolean = js.native
  
  def getShiftIndex(): Double = js.native
  def getShiftIndex(itemsInSlide: js.UndefOr[scala.Nothing], itemsOffset: Double): Double = js.native
  def getShiftIndex(itemsInSlide: Double): Double = js.native
  def getShiftIndex(itemsInSlide: Double, itemsOffset: Double): Double = js.native
  
  def getStartIndex(): Double = js.native
  def getStartIndex(index: js.UndefOr[scala.Nothing], childrenLength: Double): Double = js.native
  def getStartIndex(index: Double): Double = js.native
  def getStartIndex(index: Double, childrenLength: Double): Double = js.native
  
  def getSwipeLimitMax(state: PartialState, props: PartialProps): Double = js.native
  
  def getSwipeLimitMin(state: PartialState, props: PartialProps): Double = js.native
  
  def getSwipeShiftValue(): Double = js.native
  def getSwipeShiftValue(cursor: js.UndefOr[scala.Nothing], transformationSet: js.Array[TransformationSetItem]): Double = js.native
  def getSwipeShiftValue(cursor: Double): Double = js.native
  def getSwipeShiftValue(cursor: Double, transformationSet: js.Array[TransformationSetItem]): Double = js.native
  
  def getSwipeTouchendIndex(position: js.Any, state: State): Double = js.native
  
  def getSwipeTouchendPosition(state: State, deltaX: Double): Double = js.native
  def getSwipeTouchendPosition(state: State, deltaX: Double, swipePosition: Double): Double = js.native
  
  def getSwipeTransformationCursor(): Double = js.native
  def getSwipeTransformationCursor(transformationSet: js.UndefOr[scala.Nothing], position: js.UndefOr[scala.Nothing], deltaX: Double): Double = js.native
  def getSwipeTransformationCursor(transformationSet: js.UndefOr[scala.Nothing], position: Double): Double = js.native
  def getSwipeTransformationCursor(transformationSet: js.UndefOr[scala.Nothing], position: Double, deltaX: Double): Double = js.native
  def getSwipeTransformationCursor(transformationSet: js.Array[TransformationSetItem]): Double = js.native
  def getSwipeTransformationCursor(
    transformationSet: js.Array[TransformationSetItem],
    position: js.UndefOr[scala.Nothing],
    deltaX: Double
  ): Double = js.native
  def getSwipeTransformationCursor(transformationSet: js.Array[TransformationSetItem], position: Double): Double = js.native
  def getSwipeTransformationCursor(transformationSet: js.Array[TransformationSetItem], position: Double, deltaX: Double): Double = js.native
  
  def getTransformationItemIndex(): Double = js.native
  def getTransformationItemIndex(transformationSet: js.UndefOr[scala.Nothing], position: Double): Double = js.native
  def getTransformationItemIndex(transformationSet: js.Array[TransformationSetItem]): Double = js.native
  def getTransformationItemIndex(transformationSet: js.Array[TransformationSetItem], position: Double): Double = js.native
  
  def getTransformationSetItem(): TransformationSetItem = js.native
  def getTransformationSetItem(cursor: js.UndefOr[scala.Nothing], transformationSet: js.Array[TransformationSetItem]): TransformationSetItem = js.native
  def getTransformationSetItem(cursor: Double): TransformationSetItem = js.native
  def getTransformationSetItem(cursor: Double, transformationSet: js.Array[TransformationSetItem]): TransformationSetItem = js.native
  
  def getUpdateSlidePositionIndex(activeIndex: Double, itemsCount: Double): Double = js.native
  
  def isVerticalTouchmoveDetected(absX: Double, absY: Double): Boolean = js.native
  def isVerticalTouchmoveDetected(absX: Double, absY: Double, swipeDelta: Double): Boolean = js.native
  
  def shouldCancelSlideAnimation(activeIndex: js.Any, itemsCount: js.Any, itemsInSlide: js.Any): Boolean = js.native
  
  def shouldRecalculateSlideIndex(activeIndex: js.Any, itemsCount: js.Any): Boolean = js.native
  
  def shouldRecalculateSwipePosition(currentPosition: js.Any, minPosition: js.Any, maxPosition: js.Any): Boolean = js.native
}
