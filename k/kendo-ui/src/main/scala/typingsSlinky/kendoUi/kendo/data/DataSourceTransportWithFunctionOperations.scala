package typingsSlinky.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceTransportWithFunctionOperations extends DataSourceTransport {
  
  @JSName("create")
  var create_DataSourceTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportOptions, Unit]] = js.native
  
  @JSName("destroy")
  var destroy_DataSourceTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportOptions, Unit]] = js.native
  
  @JSName("read")
  var read_DataSourceTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportReadOptions, Unit]] = js.native
  
  @JSName("update")
  var update_DataSourceTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportOptions, Unit]] = js.native
}
object DataSourceTransportWithFunctionOperations {
  
  @scala.inline
  def apply(): DataSourceTransportWithFunctionOperations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceTransportWithFunctionOperations]
  }
  
  @scala.inline
  implicit class DataSourceTransportWithFunctionOperationsMutableBuilder[Self <: DataSourceTransportWithFunctionOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: /* options */ DataSourceTransportOptions => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* options */ DataSourceTransportOptions => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setRead(value: /* options */ DataSourceTransportReadOptions => Unit): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    @scala.inline
    def setUpdate(value: /* options */ DataSourceTransportOptions => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
