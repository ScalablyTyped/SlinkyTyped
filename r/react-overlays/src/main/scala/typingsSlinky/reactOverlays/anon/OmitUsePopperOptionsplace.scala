package typingsSlinky.reactOverlays.anon

import typingsSlinky.popperjsCore.anon.PartialState
import typingsSlinky.popperjsCore.typesMod.PositioningStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<react-overlays.react-overlays/esm/usePopper.UsePopperOptions, 'placement'> */
@js.native
trait OmitUsePopperOptionsplace extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var modifiers: js.UndefOr[js.Array[typingsSlinky.popperjsCore.anon.PartialModifieranyany]] = js.native
  
  var onFirstUpdate: js.UndefOr[js.Function1[/* arg0 */ PartialState, Unit]] = js.native
  
  var strategy: js.UndefOr[PositioningStrategy] = js.native
}
object OmitUsePopperOptionsplace {
  
  @scala.inline
  def apply(): OmitUsePopperOptionsplace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitUsePopperOptionsplace]
  }
  
  @scala.inline
  implicit class OmitUsePopperOptionsplaceMutableBuilder[Self <: OmitUsePopperOptionsplace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setModifiers(value: js.Array[typingsSlinky.popperjsCore.anon.PartialModifieranyany]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    @scala.inline
    def setModifiersVarargs(value: typingsSlinky.popperjsCore.anon.PartialModifieranyany*): Self = StObject.set(x, "modifiers", js.Array(value :_*))
    
    @scala.inline
    def setOnFirstUpdate(value: /* arg0 */ PartialState => Unit): Self = StObject.set(x, "onFirstUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFirstUpdateUndefined: Self = StObject.set(x, "onFirstUpdate", js.undefined)
    
    @scala.inline
    def setStrategy(value: PositioningStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
  }
}
