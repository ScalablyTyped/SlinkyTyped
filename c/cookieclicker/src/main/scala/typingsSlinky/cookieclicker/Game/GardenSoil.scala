package typingsSlinky.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GardenSoil extends StObject {
  
  /**
    * The multiplier of garden effects
    */
  var effMult: Double = js.native
  
  /**
    * The HTML string describing the effects of the soil
    */
  var effsStr: String = js.native
  
  /**
    * The soil icon column in the plant icon sheet
    */
  var icon: Double = js.native
  
  var id: Double = js.native
  
  /**
    * The internal name of the soil
    */
  var key: String = js.native
  
  /**
    * The displayed name of the soil
    */
  var name: String = js.native
  
  /**
    * The flavour text of the soil
    */
  var q: String = js.native
  
  /**
    * The amount of farms required to unlock the soil
    */
  var req: Double = js.native
  
  /**
    * The amount of minutes per tick
    */
  var tick: Double = js.native
  
  /**
    * The multiplier of weed amount
    */
  var weedMult: Double = js.native
}
object GardenSoil {
  
  @scala.inline
  def apply(
    effMult: Double,
    effsStr: String,
    icon: Double,
    id: Double,
    key: String,
    name: String,
    q: String,
    req: Double,
    tick: Double,
    weedMult: Double
  ): GardenSoil = {
    val __obj = js.Dynamic.literal(effMult = effMult.asInstanceOf[js.Any], effsStr = effsStr.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], tick = tick.asInstanceOf[js.Any], weedMult = weedMult.asInstanceOf[js.Any])
    __obj.asInstanceOf[GardenSoil]
  }
  
  @scala.inline
  implicit class GardenSoilMutableBuilder[Self <: GardenSoil] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffMult(value: Double): Self = StObject.set(x, "effMult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffsStr(value: String): Self = StObject.set(x, "effsStr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: Double): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: Double): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTick(value: Double): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeedMult(value: Double): Self = StObject.set(x, "weedMult", value.asInstanceOf[js.Any])
  }
}
