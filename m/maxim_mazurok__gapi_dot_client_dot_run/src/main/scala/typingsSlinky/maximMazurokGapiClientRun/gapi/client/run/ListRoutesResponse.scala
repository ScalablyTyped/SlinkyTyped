package typingsSlinky.maximMazurokGapiClientRun.gapi.client.run

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRoutesResponse extends js.Object {
  
  /** The API version for this call such as "serving.knative.dev/v1". */
  var apiVersion: js.UndefOr[String] = js.native
  
  /** List of Routes. */
  var items: js.UndefOr[js.Array[Route]] = js.native
  
  /** The kind of this resource, in this case always "RouteList". */
  var kind: js.UndefOr[String] = js.native
  
  /** Metadata associated with this Route list. */
  var metadata: js.UndefOr[ListMeta] = js.native
  
  /** Locations that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
}
object ListRoutesResponse {
  
  @scala.inline
  def apply(): ListRoutesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRoutesResponse]
  }
  
  @scala.inline
  implicit class ListRoutesResponseOps[Self <: ListRoutesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Route*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[Route]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMetadata(value: ListMeta): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setUnreachableVarargs(value: String*): Self = this.set("unreachable", js.Array(value :_*))
    
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = this.set("unreachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnreachable: Self = this.set("unreachable", js.undefined)
  }
}
