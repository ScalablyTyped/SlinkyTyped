package typingsSlinky.iitc.iitctypesMod.IITC

import typingsSlinky.leaflet.mod.PathOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkOptions extends PathOptions {
  
  var data: LinkData = js.native
  
  var guid: String = js.native
  
  var team: Double = js.native
  
  var timestamp: Double = js.native
}
object LinkOptions {
  
  @scala.inline
  def apply(data: LinkData, guid: String, team: Double, timestamp: Double): LinkOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkOptions]
  }
  
  @scala.inline
  implicit class LinkOptionsMutableBuilder[Self <: LinkOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: LinkData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam(value: Double): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
