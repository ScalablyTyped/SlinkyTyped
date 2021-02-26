package typingsSlinky.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Wrinkler extends StObject {
  
  var close: Double = js.native
  
  var hp: Double = js.native
  
  var hurt: Double = js.native
  
  var id: Double = js.native
  
  var phase: Double = js.native
  
  var r: Double = js.native
  
  var selected: PseudoBoolean = js.native
  
  var sucked: Double = js.native
  
  var `type`: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object Wrinkler {
  
  @scala.inline
  def apply(
    close: Double,
    hp: Double,
    hurt: Double,
    id: Double,
    phase: Double,
    r: Double,
    selected: PseudoBoolean,
    sucked: Double,
    `type`: Double,
    x: Double,
    y: Double
  ): Wrinkler = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], hp = hp.asInstanceOf[js.Any], hurt = hurt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], sucked = sucked.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wrinkler]
  }
  
  @scala.inline
  implicit class WrinklerMutableBuilder[Self <: Wrinkler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: Double): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHp(value: Double): Self = StObject.set(x, "hp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHurt(value: Double): Self = StObject.set(x, "hurt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhase(value: Double): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: PseudoBoolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucked(value: Double): Self = StObject.set(x, "sucked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
