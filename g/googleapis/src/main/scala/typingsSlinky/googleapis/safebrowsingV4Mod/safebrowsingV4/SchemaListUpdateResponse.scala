package typingsSlinky.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An update to an individual list.
  */
@js.native
trait SchemaListUpdateResponse extends StObject {
  
  /**
    * A set of entries to add to a local threat type&#39;s list. Repeated to
    * allow for a combination of compressed and raw data to be sent in a single
    * response.
    */
  var additions: js.UndefOr[js.Array[SchemaThreatEntrySet]] = js.native
  
  /**
    * The expected SHA256 hash of the client state; that is, of the sorted list
    * of all hashes present in the database after applying the provided update.
    * If the client state doesn&#39;t match the expected state, the client must
    * disregard this update and retry later.
    */
  var checksum: js.UndefOr[SchemaChecksum] = js.native
  
  /**
    * The new client state, in encrypted format. Opaque to clients.
    */
  var newClientState: js.UndefOr[String] = js.native
  
  /**
    * The platform type for which data is returned.
    */
  var platformType: js.UndefOr[String] = js.native
  
  /**
    * A set of entries to remove from a local threat type&#39;s list. In
    * practice, this field is empty or contains exactly one ThreatEntrySet.
    */
  var removals: js.UndefOr[js.Array[SchemaThreatEntrySet]] = js.native
  
  /**
    * The type of response. This may indicate that an action is required by the
    * client when the response is received.
    */
  var responseType: js.UndefOr[String] = js.native
  
  /**
    * The format of the threats.
    */
  var threatEntryType: js.UndefOr[String] = js.native
  
  /**
    * The threat type for which data is returned.
    */
  var threatType: js.UndefOr[String] = js.native
}
object SchemaListUpdateResponse {
  
  @scala.inline
  def apply(): SchemaListUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListUpdateResponse]
  }
  
  @scala.inline
  implicit class SchemaListUpdateResponseMutableBuilder[Self <: SchemaListUpdateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditions(value: js.Array[SchemaThreatEntrySet]): Self = StObject.set(x, "additions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionsUndefined: Self = StObject.set(x, "additions", js.undefined)
    
    @scala.inline
    def setAdditionsVarargs(value: SchemaThreatEntrySet*): Self = StObject.set(x, "additions", js.Array(value :_*))
    
    @scala.inline
    def setChecksum(value: SchemaChecksum): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    @scala.inline
    def setNewClientState(value: String): Self = StObject.set(x, "newClientState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewClientStateUndefined: Self = StObject.set(x, "newClientState", js.undefined)
    
    @scala.inline
    def setPlatformType(value: String): Self = StObject.set(x, "platformType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformTypeUndefined: Self = StObject.set(x, "platformType", js.undefined)
    
    @scala.inline
    def setRemovals(value: js.Array[SchemaThreatEntrySet]): Self = StObject.set(x, "removals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovalsUndefined: Self = StObject.set(x, "removals", js.undefined)
    
    @scala.inline
    def setRemovalsVarargs(value: SchemaThreatEntrySet*): Self = StObject.set(x, "removals", js.Array(value :_*))
    
    @scala.inline
    def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    @scala.inline
    def setThreatEntryType(value: String): Self = StObject.set(x, "threatEntryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatEntryTypeUndefined: Self = StObject.set(x, "threatEntryType", js.undefined)
    
    @scala.inline
    def setThreatType(value: String): Self = StObject.set(x, "threatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatTypeUndefined: Self = StObject.set(x, "threatType", js.undefined)
  }
}
