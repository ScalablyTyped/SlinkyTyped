package typingsSlinky.maximMazurokGapiClientTpu.gapi.client.tpu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTensorFlowVersionsResponse extends StObject {
  
  /** The next page token or empty if none. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The listed nodes. */
  var tensorflowVersions: js.UndefOr[js.Array[TensorFlowVersion]] = js.native
  
  /** Locations that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
}
object ListTensorFlowVersionsResponse {
  
  @scala.inline
  def apply(): ListTensorFlowVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTensorFlowVersionsResponse]
  }
  
  @scala.inline
  implicit class ListTensorFlowVersionsResponseMutableBuilder[Self <: ListTensorFlowVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTensorflowVersions(value: js.Array[TensorFlowVersion]): Self = StObject.set(x, "tensorflowVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTensorflowVersionsUndefined: Self = StObject.set(x, "tensorflowVersions", js.undefined)
    
    @scala.inline
    def setTensorflowVersionsVarargs(value: TensorFlowVersion*): Self = StObject.set(x, "tensorflowVersions", js.Array(value :_*))
    
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    @scala.inline
    def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value :_*))
  }
}
