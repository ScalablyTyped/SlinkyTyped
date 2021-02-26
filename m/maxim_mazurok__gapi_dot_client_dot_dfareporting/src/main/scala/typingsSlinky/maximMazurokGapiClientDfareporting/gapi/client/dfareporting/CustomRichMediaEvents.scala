package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomRichMediaEvents extends StObject {
  
  /** List of custom rich media event IDs. Dimension values must be all of type dfa:richMediaEventTypeIdAndName. */
  var filteredEventIds: js.UndefOr[js.Array[DimensionValue]] = js.native
  
  /** The kind of resource this is, in this case dfareporting#customRichMediaEvents. */
  var kind: js.UndefOr[String] = js.native
}
object CustomRichMediaEvents {
  
  @scala.inline
  def apply(): CustomRichMediaEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomRichMediaEvents]
  }
  
  @scala.inline
  implicit class CustomRichMediaEventsMutableBuilder[Self <: CustomRichMediaEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilteredEventIds(value: js.Array[DimensionValue]): Self = StObject.set(x, "filteredEventIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteredEventIdsUndefined: Self = StObject.set(x, "filteredEventIds", js.undefined)
    
    @scala.inline
    def setFilteredEventIdsVarargs(value: DimensionValue*): Self = StObject.set(x, "filteredEventIds", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
