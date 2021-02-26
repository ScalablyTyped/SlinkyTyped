package typingsSlinky.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayPropertiesSummary extends StObject {
  
  /**
    * The job index within the array that is associated with this job. This parameter is returned for children of array jobs.
    */
  var index: js.UndefOr[Integer] = js.native
  
  /**
    * The size of the array job. This parameter is returned for parent array jobs.
    */
  var size: js.UndefOr[Integer] = js.native
}
object ArrayPropertiesSummary {
  
  @scala.inline
  def apply(): ArrayPropertiesSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayPropertiesSummary]
  }
  
  @scala.inline
  implicit class ArrayPropertiesSummaryMutableBuilder[Self <: ArrayPropertiesSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Integer): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setSize(value: Integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
