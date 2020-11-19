package typingsSlinky.activexLibreoffice.com_.sun.star.presentation

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.rendering.XBitmap
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * {@link TransitionFactory} interface to request optional custom Transition instances for slide show transitions.
  *
  * This interface provides the necessary methods to query and create optional transition effects for a {@link SlideShow}
  * @since OOo 2.4
  */
@js.native
trait XTransitionFactory extends XInterface {
  
  /**
    * Actually create a transition for the given transition id
    * @param transitionType Main type of transition (
    * @param transitionSubType Subtype for the transition (
    * @param view Slide show view to display on
    * @param leavingBitmap Bitmap of the slide that's going to leave the screen
    * @param enteringBitmap Bitmap of the slide that's going to enter the screen
    * @see com.sun.star.animations.TransitionType)
    * @see com.sun.star.animations.TransitionSubType)
    */
  def createTransition(
    transitionType: Double,
    transitionSubType: Double,
    view: XSlideShowView,
    leavingBitmap: XBitmap,
    enteringBitmap: XBitmap
  ): XTransition = js.native
  
  /** Checks whether this instance provides an implementation for given transition id. */
  def hasTransition(transitionType: Double, transitionSubType: Double): Boolean = js.native
}
object XTransitionFactory {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createTransition: (Double, Double, XSlideShowView, XBitmap, XBitmap) => XTransition,
    hasTransition: (Double, Double) => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTransitionFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createTransition = js.Any.fromFunction5(createTransition), hasTransition = js.Any.fromFunction2(hasTransition), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTransitionFactory]
  }
  
  @scala.inline
  implicit class XTransitionFactoryOps[Self <: XTransitionFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateTransition(value: (Double, Double, XSlideShowView, XBitmap, XBitmap) => XTransition): Self = this.set("createTransition", js.Any.fromFunction5(value))
    
    @scala.inline
    def setHasTransition(value: (Double, Double) => Boolean): Self = this.set("hasTransition", js.Any.fromFunction2(value))
  }
}
