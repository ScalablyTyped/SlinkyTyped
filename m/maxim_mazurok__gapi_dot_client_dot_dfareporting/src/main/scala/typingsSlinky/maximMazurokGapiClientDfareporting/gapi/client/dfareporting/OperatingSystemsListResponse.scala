package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperatingSystemsListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#operatingSystemsListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Operating system collection. */
  var operatingSystems: js.UndefOr[js.Array[OperatingSystem]] = js.native
}
object OperatingSystemsListResponse {
  
  @scala.inline
  def apply(): OperatingSystemsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperatingSystemsListResponse]
  }
  
  @scala.inline
  implicit class OperatingSystemsListResponseMutableBuilder[Self <: OperatingSystemsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setOperatingSystems(value: js.Array[OperatingSystem]): Self = StObject.set(x, "operatingSystems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemsUndefined: Self = StObject.set(x, "operatingSystems", js.undefined)
    
    @scala.inline
    def setOperatingSystemsVarargs(value: OperatingSystem*): Self = StObject.set(x, "operatingSystems", js.Array(value :_*))
  }
}
