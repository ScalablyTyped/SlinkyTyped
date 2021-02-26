package typingsSlinky.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specification for how requests are aborted as part of fault injection.
  */
@js.native
trait SchemaHttpFaultAbort extends StObject {
  
  /**
    * The HTTP status code used to abort the request. The value must be between
    * 200 and 599 inclusive.
    */
  var httpStatus: js.UndefOr[Double] = js.native
  
  /**
    * The percentage of traffic (connections/operations/requests) which will be
    * aborted as part of fault injection. The value must be between 0.0 and
    * 100.0 inclusive.
    */
  var percentage: js.UndefOr[Double] = js.native
}
object SchemaHttpFaultAbort {
  
  @scala.inline
  def apply(): SchemaHttpFaultAbort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpFaultAbort]
  }
  
  @scala.inline
  implicit class SchemaHttpFaultAbortMutableBuilder[Self <: SchemaHttpFaultAbort] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttpStatus(value: Double): Self = StObject.set(x, "httpStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpStatusUndefined: Self = StObject.set(x, "httpStatus", js.undefined)
    
    @scala.inline
    def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
  }
}
