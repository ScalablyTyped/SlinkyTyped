package typingsSlinky.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IManifestInfo extends StObject {
  
  var DVRWindowSize: Double = js.native
  
  var availableFrom: js.Date = js.native
  
  var duration: Double = js.native
  
  var isDynamic: Boolean = js.native
  
  var loadedTime: js.Date = js.native
  
  var maxFragmentDuration: Double = js.native
  
  var minBufferTime: Double = js.native
}
object IManifestInfo {
  
  @scala.inline
  def apply(
    DVRWindowSize: Double,
    availableFrom: js.Date,
    duration: Double,
    isDynamic: Boolean,
    loadedTime: js.Date,
    maxFragmentDuration: Double,
    minBufferTime: Double
  ): IManifestInfo = {
    val __obj = js.Dynamic.literal(DVRWindowSize = DVRWindowSize.asInstanceOf[js.Any], availableFrom = availableFrom.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], isDynamic = isDynamic.asInstanceOf[js.Any], loadedTime = loadedTime.asInstanceOf[js.Any], maxFragmentDuration = maxFragmentDuration.asInstanceOf[js.Any], minBufferTime = minBufferTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IManifestInfo]
  }
  
  @scala.inline
  implicit class IManifestInfoMutableBuilder[Self <: IManifestInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableFrom(value: js.Date): Self = StObject.set(x, "availableFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDVRWindowSize(value: Double): Self = StObject.set(x, "DVRWindowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDynamic(value: Boolean): Self = StObject.set(x, "isDynamic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadedTime(value: js.Date): Self = StObject.set(x, "loadedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFragmentDuration(value: Double): Self = StObject.set(x, "maxFragmentDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinBufferTime(value: Double): Self = StObject.set(x, "minBufferTime", value.asInstanceOf[js.Any])
  }
}
