package typingsSlinky.ol

import typingsSlinky.ol.conditionMod.Condition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyboardZoomMod {
  
  @JSImport("ol/interaction/KeyboardZoom", JSImport.Default)
  @js.native
  class default () extends KeyboardZoom {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait KeyboardZoom
    extends typingsSlinky.ol.interactionInteractionMod.default
  
  @js.native
  trait Options extends StObject {
    
    var condition: js.UndefOr[Condition] = js.native
    
    var delta: js.UndefOr[Double] = js.native
    
    var duration: js.UndefOr[Double] = js.native
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
      def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      @scala.inline
      def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    }
  }
}
