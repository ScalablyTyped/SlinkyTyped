package typingsSlinky.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepresentativeInfoResponse extends StObject {
  
  /** A map of political geographic divisions that contain the requested address, keyed by the unique Open Civic Data identifier for this division. */
  var divisions: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.civicinfo.gapi.client.civicinfo.GeographicDivision}
    */ typingsSlinky.maximMazurokGapiClientCivicinfo.maximMazurokGapiClientCivicinfoStrings.RepresentativeInfoResponse with TopLevel[js.Any]
  ] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "civicinfo#representativeInfoResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** The normalized version of the requested address */
  var normalizedInput: js.UndefOr[SimpleAddressType] = js.native
  
  /** Elected offices referenced by the divisions listed above. Will only be present if includeOffices was true in the request. */
  var offices: js.UndefOr[js.Array[Office]] = js.native
  
  /** Officials holding the offices listed above. Will only be present if includeOffices was true in the request. */
  var officials: js.UndefOr[js.Array[Official]] = js.native
}
object RepresentativeInfoResponse {
  
  @scala.inline
  def apply(): RepresentativeInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepresentativeInfoResponse]
  }
  
  @scala.inline
  implicit class RepresentativeInfoResponseMutableBuilder[Self <: RepresentativeInfoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDivisions(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.civicinfo.gapi.client.civicinfo.GeographicDivision}
      */ typingsSlinky.maximMazurokGapiClientCivicinfo.maximMazurokGapiClientCivicinfoStrings.RepresentativeInfoResponse with TopLevel[js.Any]
    ): Self = StObject.set(x, "divisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivisionsUndefined: Self = StObject.set(x, "divisions", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNormalizedInput(value: SimpleAddressType): Self = StObject.set(x, "normalizedInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedInputUndefined: Self = StObject.set(x, "normalizedInput", js.undefined)
    
    @scala.inline
    def setOffices(value: js.Array[Office]): Self = StObject.set(x, "offices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficesUndefined: Self = StObject.set(x, "offices", js.undefined)
    
    @scala.inline
    def setOfficesVarargs(value: Office*): Self = StObject.set(x, "offices", js.Array(value :_*))
    
    @scala.inline
    def setOfficials(value: js.Array[Official]): Self = StObject.set(x, "officials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficialsUndefined: Self = StObject.set(x, "officials", js.undefined)
    
    @scala.inline
    def setOfficialsVarargs(value: Official*): Self = StObject.set(x, "officials", js.Array(value :_*))
  }
}
