package typingsSlinky.iitc.iitctypesMod.IITC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkData extends StObject {
  
  var dGuid: String = js.native
  
  var dLatE6: Double = js.native
  
  var dLngE6: Double = js.native
  
  var oGuid: String = js.native
  
  var oLatE6: Double = js.native
  
  var oLngE6: Double = js.native
  
  var team: String = js.native
}
object LinkData {
  
  @scala.inline
  def apply(
    dGuid: String,
    dLatE6: Double,
    dLngE6: Double,
    oGuid: String,
    oLatE6: Double,
    oLngE6: Double,
    team: String
  ): LinkData = {
    val __obj = js.Dynamic.literal(dGuid = dGuid.asInstanceOf[js.Any], dLatE6 = dLatE6.asInstanceOf[js.Any], dLngE6 = dLngE6.asInstanceOf[js.Any], oGuid = oGuid.asInstanceOf[js.Any], oLatE6 = oLatE6.asInstanceOf[js.Any], oLngE6 = oLngE6.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkData]
  }
  
  @scala.inline
  implicit class LinkDataMutableBuilder[Self <: LinkData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDGuid(value: String): Self = StObject.set(x, "dGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDLatE6(value: Double): Self = StObject.set(x, "dLatE6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDLngE6(value: Double): Self = StObject.set(x, "dLngE6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOGuid(value: String): Self = StObject.set(x, "oGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOLatE6(value: Double): Self = StObject.set(x, "oLatE6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOLngE6(value: Double): Self = StObject.set(x, "oLngE6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam(value: String): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
  }
}
