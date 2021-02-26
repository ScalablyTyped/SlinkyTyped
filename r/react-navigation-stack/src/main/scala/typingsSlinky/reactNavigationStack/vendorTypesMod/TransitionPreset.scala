package typingsSlinky.reactNavigationStack.vendorTypesMod

import typingsSlinky.reactNavigationStack.anon.Close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitionPreset extends StObject {
  
  /**
    * Function which specifies interpolated styles for various parts of the card, e.g. the overlay, shadow etc.
    */
  var cardStyleInterpolator: StackCardStyleInterpolator = js.native
  
  /**
    * The direction of swipe gestures, `horizontal` or `vertical`.
    */
  var gestureDirection: GestureDirection = js.native
  
  /**
    * Function which specifies interpolated styles for various parts of the header, e.g. the title, left button etc.
    */
  var headerStyleInterpolator: StackHeaderStyleInterpolator = js.native
  
  /**
    * Object which specifies the animation type (timing or spring) and their options (such as duration for timing).
    */
  var transitionSpec: Close = js.native
}
object TransitionPreset {
  
  @scala.inline
  def apply(
    cardStyleInterpolator: /* props */ StackCardInterpolationProps => StackCardInterpolatedStyle,
    gestureDirection: GestureDirection,
    headerStyleInterpolator: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle,
    transitionSpec: Close
  ): TransitionPreset = {
    val __obj = js.Dynamic.literal(cardStyleInterpolator = js.Any.fromFunction1(cardStyleInterpolator), gestureDirection = gestureDirection.asInstanceOf[js.Any], headerStyleInterpolator = js.Any.fromFunction1(headerStyleInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionPreset]
  }
  
  @scala.inline
  implicit class TransitionPresetMutableBuilder[Self <: TransitionPreset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardStyleInterpolator(value: /* props */ StackCardInterpolationProps => StackCardInterpolatedStyle): Self = StObject.set(x, "cardStyleInterpolator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGestureDirection(value: GestureDirection): Self = StObject.set(x, "gestureDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderStyleInterpolator(value: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle): Self = StObject.set(x, "headerStyleInterpolator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransitionSpec(value: Close): Self = StObject.set(x, "transitionSpec", value.asInstanceOf[js.Any])
  }
}
