package typingsSlinky.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridFSBucketFindOptions extends StObject {
  
  var batchSize: js.UndefOr[scala.Double] = js.native
  
  var limit: js.UndefOr[scala.Double] = js.native
  
  var maxTimeMS: js.UndefOr[scala.Double] = js.native
  
  var noCursorTimeout: js.UndefOr[Boolean] = js.native
  
  var skip: js.UndefOr[scala.Double] = js.native
  
  var sort: js.UndefOr[js.Object] = js.native
}
object GridFSBucketFindOptions {
  
  @scala.inline
  def apply(): GridFSBucketFindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridFSBucketFindOptions]
  }
  
  @scala.inline
  implicit class GridFSBucketFindOptionsMutableBuilder[Self <: GridFSBucketFindOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchSize(value: scala.Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    @scala.inline
    def setLimit(value: scala.Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setMaxTimeMS(value: scala.Double): Self = StObject.set(x, "maxTimeMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTimeMSUndefined: Self = StObject.set(x, "maxTimeMS", js.undefined)
    
    @scala.inline
    def setNoCursorTimeout(value: Boolean): Self = StObject.set(x, "noCursorTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoCursorTimeoutUndefined: Self = StObject.set(x, "noCursorTimeout", js.undefined)
    
    @scala.inline
    def setSkip(value: scala.Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    @scala.inline
    def setSort(value: js.Object): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
