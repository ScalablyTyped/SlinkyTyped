package typingsSlinky.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeSeriesDescriptor extends StObject {
  
  /** Descriptors for the labels. */
  var labelDescriptors: js.UndefOr[js.Array[LabelDescriptor]] = js.native
  
  /** Descriptors for the point data value columns. */
  var pointDescriptors: js.UndefOr[js.Array[ValueDescriptor]] = js.native
}
object TimeSeriesDescriptor {
  
  @scala.inline
  def apply(): TimeSeriesDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSeriesDescriptor]
  }
  
  @scala.inline
  implicit class TimeSeriesDescriptorMutableBuilder[Self <: TimeSeriesDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelDescriptors(value: js.Array[LabelDescriptor]): Self = StObject.set(x, "labelDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelDescriptorsUndefined: Self = StObject.set(x, "labelDescriptors", js.undefined)
    
    @scala.inline
    def setLabelDescriptorsVarargs(value: LabelDescriptor*): Self = StObject.set(x, "labelDescriptors", js.Array(value :_*))
    
    @scala.inline
    def setPointDescriptors(value: js.Array[ValueDescriptor]): Self = StObject.set(x, "pointDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointDescriptorsUndefined: Self = StObject.set(x, "pointDescriptors", js.undefined)
    
    @scala.inline
    def setPointDescriptorsVarargs(value: ValueDescriptor*): Self = StObject.set(x, "pointDescriptors", js.Array(value :_*))
  }
}
