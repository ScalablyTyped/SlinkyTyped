package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDBProxyResponse extends StObject {
  
  /**
    * The data structure representing the details of the DB proxy that you delete.
    */
  var DBProxy: js.UndefOr[typingsSlinky.awsSdk.rdsMod.DBProxy] = js.native
}
object DeleteDBProxyResponse {
  
  @scala.inline
  def apply(): DeleteDBProxyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDBProxyResponse]
  }
  
  @scala.inline
  implicit class DeleteDBProxyResponseMutableBuilder[Self <: DeleteDBProxyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBProxy(value: DBProxy): Self = StObject.set(x, "DBProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBProxyUndefined: Self = StObject.set(x, "DBProxy", js.undefined)
  }
}
