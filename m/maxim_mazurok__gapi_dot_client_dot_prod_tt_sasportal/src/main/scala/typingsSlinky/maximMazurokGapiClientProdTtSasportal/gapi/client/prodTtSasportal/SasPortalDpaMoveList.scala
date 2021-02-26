package typingsSlinky.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalDpaMoveList extends StObject {
  
  /** The ID of the DPA. */
  var dpaId: js.UndefOr[String] = js.native
  
  /** The frequency range that the move list affects. */
  var frequencyRange: js.UndefOr[SasPortalFrequencyRange] = js.native
}
object SasPortalDpaMoveList {
  
  @scala.inline
  def apply(): SasPortalDpaMoveList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalDpaMoveList]
  }
  
  @scala.inline
  implicit class SasPortalDpaMoveListMutableBuilder[Self <: SasPortalDpaMoveList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDpaId(value: String): Self = StObject.set(x, "dpaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpaIdUndefined: Self = StObject.set(x, "dpaId", js.undefined)
    
    @scala.inline
    def setFrequencyRange(value: SasPortalFrequencyRange): Self = StObject.set(x, "frequencyRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyRangeUndefined: Self = StObject.set(x, "frequencyRange", js.undefined)
  }
}
