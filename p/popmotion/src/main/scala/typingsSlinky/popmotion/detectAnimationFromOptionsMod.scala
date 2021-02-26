package typingsSlinky.popmotion

import typingsSlinky.popmotion.anon.FnCall
import typingsSlinky.popmotion.anon.Typeofspring
import typingsSlinky.popmotion.popmotionStrings.decay
import typingsSlinky.popmotion.popmotionStrings.keyframes
import typingsSlinky.popmotion.popmotionStrings.spring
import typingsSlinky.popmotion.typesMod.Animation
import typingsSlinky.popmotion.typesMod.DecayOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detectAnimationFromOptionsMod {
  
  @JSImport("popmotion/lib/animations/utils/detect-animation-from-options", "detectAnimationFromOptions")
  @js.native
  def detectAnimationFromOptions[T /* <: Options */](config: T): Typeofspring | FnCall | (js.Function1[
    /* hasVelocityFromPowerTimeConstantRestDeltaModifyTarget */ DecayOptions, 
    Animation[Double]
  ]) = js.native
  
  @js.native
  trait Options extends StObject {
    
    var to: js.UndefOr[js.Any] = js.native
    
    var `type`: js.UndefOr[decay | keyframes | spring] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTo(value: js.Any): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      @scala.inline
      def setType(value: decay | keyframes | spring): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
