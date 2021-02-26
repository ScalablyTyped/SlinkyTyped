package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatafeedsFetchNowResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#datafeedsFetchNowResponse". */
  var kind: js.UndefOr[String] = js.native
}
object DatafeedsFetchNowResponse {
  
  @scala.inline
  def apply(): DatafeedsFetchNowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatafeedsFetchNowResponse]
  }
  
  @scala.inline
  implicit class DatafeedsFetchNowResponseMutableBuilder[Self <: DatafeedsFetchNowResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
