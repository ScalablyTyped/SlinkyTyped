package typingsSlinky.reactNativeSnapCarousel.mod

import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Carousel[T]
  extends Component[CarouselProperties[T], js.Object, js.Any] {
  
  /**
    * Current active item (int, starts at 0)
    */
  var currentIndex: Double = js.native
  
  /**
    * Underlying ScrollView's current content offset
    * (int, starts at 0 if activeSlideAlignment is set to start, negative value otherwise)
    */
  var currentScrollPosition: Double = js.native
  
  /**
    * Snap to an item manually
    */
  def snapToItem(index: Double): Unit = js.native
  def snapToItem(index: Double, animated: js.UndefOr[scala.Nothing], fireCallback: Boolean): Unit = js.native
  def snapToItem(index: Double, animated: Boolean): Unit = js.native
  def snapToItem(index: Double, animated: Boolean, fireCallback: Boolean): Unit = js.native
  
  /**
    * Snap to next item manually
    */
  def snapToNext(): Unit = js.native
  def snapToNext(animated: js.UndefOr[scala.Nothing], fireCallback: Boolean): Unit = js.native
  def snapToNext(animated: Boolean): Unit = js.native
  def snapToNext(animated: Boolean, fireCallback: Boolean): Unit = js.native
  
  /**
    * Snap to previous item manually
    */
  def snapToPrev(): Unit = js.native
  def snapToPrev(animated: js.UndefOr[scala.Nothing], fireCallback: Boolean): Unit = js.native
  def snapToPrev(animated: Boolean): Unit = js.native
  def snapToPrev(animated: Boolean, fireCallback: Boolean): Unit = js.native
  
  /**
    * Start the autoplay manually
    */
  def startAutoplay(): Unit = js.native
  def startAutoplay(instantly: Boolean): Unit = js.native
  
  /**
    * Stop the autoplay manually
    */
  def stopAutoplay(): Unit = js.native
  
  /**
    * Call this when needed to work around a random FlatList bug that keeps content hidden until the carousel is scrolled
    * (see #238). Note that the offset parameter is not required and will default to either 1 or -1 depending
    * on the current scroll position
    */
  def triggerRenderingHack(): Unit = js.native
  def triggerRenderingHack(offset: Double): Unit = js.native
}
