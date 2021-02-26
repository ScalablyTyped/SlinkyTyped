package typingsSlinky.openlayers.mod.olx.source

import org.scalajs.dom.raw.ImageData
import typingsSlinky.openlayers.mod.GlobalObject
import typingsSlinky.openlayers.mod.RasterOperation
import typingsSlinky.openlayers.mod.RasterOperationType
import typingsSlinky.openlayers.mod.source.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @api
  */
@js.native
trait RasterOptions extends StObject {
  
  var lib: js.UndefOr[GlobalObject] = js.native
  
  var operation: js.UndefOr[RasterOperation] = js.native
  
  var operationType: js.UndefOr[RasterOperationType] = js.native
  
  var sources: js.Array[Source] = js.native
  
  var threads: js.UndefOr[Double] = js.native
}
object RasterOptions {
  
  @scala.inline
  def apply(sources: js.Array[Source]): RasterOptions = {
    val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterOptions]
  }
  
  @scala.inline
  implicit class RasterOptionsMutableBuilder[Self <: RasterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLib(value: GlobalObject): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLibUndefined: Self = StObject.set(x, "lib", js.undefined)
    
    @scala.inline
    def setOperation(
      value: (/* data */ js.Array[js.Array[Double] | ImageData], /* obj */ GlobalObject) => js.Array[Double] | ImageData
    ): Self = StObject.set(x, "operation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOperationType(value: RasterOperationType): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setSources(value: js.Array[Source]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesVarargs(value: Source*): Self = StObject.set(x, "sources", js.Array(value :_*))
    
    @scala.inline
    def setThreads(value: Double): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
  }
}
