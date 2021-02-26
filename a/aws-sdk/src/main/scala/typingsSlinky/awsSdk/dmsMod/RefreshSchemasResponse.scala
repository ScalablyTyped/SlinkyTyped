package typingsSlinky.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefreshSchemasResponse extends StObject {
  
  /**
    * The status of the refreshed schema.
    */
  var RefreshSchemasStatus: js.UndefOr[typingsSlinky.awsSdk.dmsMod.RefreshSchemasStatus] = js.native
}
object RefreshSchemasResponse {
  
  @scala.inline
  def apply(): RefreshSchemasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshSchemasResponse]
  }
  
  @scala.inline
  implicit class RefreshSchemasResponseMutableBuilder[Self <: RefreshSchemasResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRefreshSchemasStatus(value: RefreshSchemasStatus): Self = StObject.set(x, "RefreshSchemasStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshSchemasStatusUndefined: Self = StObject.set(x, "RefreshSchemasStatus", js.undefined)
  }
}
