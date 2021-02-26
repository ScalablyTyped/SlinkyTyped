package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventorySourceVideoCreativeConfig extends StObject {
  
  /** The duration requirements for the video creatives that can be assigned to the inventory source. */
  var duration: js.UndefOr[String] = js.native
}
object InventorySourceVideoCreativeConfig {
  
  @scala.inline
  def apply(): InventorySourceVideoCreativeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventorySourceVideoCreativeConfig]
  }
  
  @scala.inline
  implicit class InventorySourceVideoCreativeConfigMutableBuilder[Self <: InventorySourceVideoCreativeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
