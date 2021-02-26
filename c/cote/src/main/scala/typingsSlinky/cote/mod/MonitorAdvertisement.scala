package typingsSlinky.cote.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitorAdvertisement extends Advertisement {
  
  /**
    * Port for Monitor to listen on. By default will start searching from 8000.
    */
  var port: js.UndefOr[Double | String] = js.native
}
object MonitorAdvertisement {
  
  @scala.inline
  def apply(name: String): MonitorAdvertisement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorAdvertisement]
  }
  
  @scala.inline
  implicit class MonitorAdvertisementMutableBuilder[Self <: MonitorAdvertisement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
