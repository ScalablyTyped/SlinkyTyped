package typingsSlinky.popperjsCore.typesMod

import typingsSlinky.popperjsCore.anon.PartialModifieranyany
import typingsSlinky.popperjsCore.anon.PartialState
import typingsSlinky.popperjsCore.enumsMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  var modifiers: js.Array[PartialModifieranyany] = js.native
  
  var onFirstUpdate: js.UndefOr[js.Function1[/* arg0 */ PartialState, Unit]] = js.native
  
  var placement: Placement = js.native
  
  var strategy: PositioningStrategy = js.native
}
object Options {
  
  @scala.inline
  def apply(modifiers: js.Array[PartialModifieranyany], placement: Placement, strategy: PositioningStrategy): Options = {
    val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModifiers(value: js.Array[PartialModifieranyany]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersVarargs(value: PartialModifieranyany*): Self = StObject.set(x, "modifiers", js.Array(value :_*))
    
    @scala.inline
    def setOnFirstUpdate(value: /* arg0 */ PartialState => Unit): Self = StObject.set(x, "onFirstUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFirstUpdateUndefined: Self = StObject.set(x, "onFirstUpdate", js.undefined)
    
    @scala.inline
    def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategy(value: PositioningStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
  }
}
