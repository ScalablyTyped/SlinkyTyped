package typingsSlinky.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveTimeSpanRestrict extends StObject {
  
  var `type`: js.UndefOr[String] = js.native
}
object DriveTimeSpanRestrict {
  
  @scala.inline
  def apply(): DriveTimeSpanRestrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveTimeSpanRestrict]
  }
  
  @scala.inline
  implicit class DriveTimeSpanRestrictMutableBuilder[Self <: DriveTimeSpanRestrict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
