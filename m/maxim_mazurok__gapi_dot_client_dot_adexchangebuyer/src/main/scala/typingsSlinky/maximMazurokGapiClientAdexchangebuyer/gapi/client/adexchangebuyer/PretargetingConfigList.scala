package typingsSlinky.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PretargetingConfigList extends StObject {
  
  /** A list of pretargeting configs */
  var items: js.UndefOr[js.Array[PretargetingConfig]] = js.native
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
}
object PretargetingConfigList {
  
  @scala.inline
  def apply(): PretargetingConfigList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PretargetingConfigList]
  }
  
  @scala.inline
  implicit class PretargetingConfigListMutableBuilder[Self <: PretargetingConfigList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[PretargetingConfig]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: PretargetingConfig*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
