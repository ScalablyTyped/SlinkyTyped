package typingsSlinky.reactAliceCarousel

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import typingsSlinky.reactAliceCarousel.anon.AnimationDuration
import typingsSlinky.reactAliceCarousel.anon.Height
import typingsSlinky.reactAliceCarousel.anon.PaddingLeft
import typingsSlinky.reactAliceCarousel.anon.PartialState
import typingsSlinky.reactAliceCarousel.anon.Transform
import typingsSlinky.reactAliceCarousel.reactAliceCarouselNumbers.`0`
import typingsSlinky.reactAliceCarousel.reactAliceCarouselNumbers.`1`
import typingsSlinky.reactAliceCarousel.typesMod.Props
import typingsSlinky.reactAliceCarousel.typesMod.RootElement
import typingsSlinky.reactAliceCarousel.typesMod.State
import typingsSlinky.reactAliceCarousel.typesMod.Style
import typingsSlinky.reactAliceCarousel.typesMod.TransformationSetItem
import typingsSlinky.reactAliceCarousel.typesMod.Transition
import typingsSlinky.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-alice-carousel/lib/utils/elements", JSImport.Namespace)
@js.native
object elementsMod extends js.Object {
  
  def animate(element: js.Any, options: js.Any): js.Any = js.native
  
  def createAutowidthTransformationSet(el: js.Any): js.Array[TransformationSetItem] = js.native
  
  def createClones(props: Props): js.Any = js.native
  
  def createDefaultTransformationSet(children: js.Array[_], galleryWidth: Double, itemsInSlide: Double): js.Array[TransformationSetItem] = js.native
  
  def getAutoheightProperty(stageComponent: Element, props: Props, state: State): js.UndefOr[Double] = js.native
  
  def getElementCursor(props: Props, state: State): Double = js.native
  
  def getElementDimensions(element: js.Any): Height = js.native
  
  def getElementFirstChild(stageComponent: js.Any, cursor: js.Any): js.Any = js.native
  
  def getItemWidth(galleryWidth: Double, itemsInSlide: Double): Double = js.native
  
  def getItemsCount(props: Props): js.Any = js.native
  
  def getItemsOffset(props: Props): `0` | `1` = js.native
  
  def getRenderStageItemStyles(i: Double, state: State): AnimationDuration | Transform = js.native
  
  def getRenderStageStyles(nextStyles: js.Any, currentStyles: Style): Style = js.native
  
  def getRenderWrapperStyles(props: Props, state: State, element: js.Any): PaddingLeft = js.native
  
  def getSlides(props: Props): js.Any = js.native
  
  def getTouchmoveTranslatePosition(deltaX: Double, translate3d: Double): Double = js.native
  
  def getTransformMatrix(element: js.Any): RegExpMatchArray = js.native
  
  def getTransitionProperty(): String = js.native
  def getTransitionProperty(options: Transition): String = js.native
  
  def getTranslate3dProperty(nextIndex: js.Any, state: PartialState): Double = js.native
  
  def getTranslateXProperty(element: js.Any): Double = js.native
  
  def isElement(element: js.Any): Boolean = js.native
  
  def shouldHandleResizeEvent(e: Event): Boolean = js.native
  def shouldHandleResizeEvent(e: Event, prevDimensions: js.UndefOr[scala.Nothing], nextRootComponentDimensions: RootElement): Boolean = js.native
  def shouldHandleResizeEvent(e: Event, prevDimensions: RootElement): Boolean = js.native
  def shouldHandleResizeEvent(e: Event, prevDimensions: RootElement, nextRootComponentDimensions: RootElement): Boolean = js.native
}
