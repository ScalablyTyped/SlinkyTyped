package typingsSlinky.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a FHIR store.
  */
@js.native
trait SchemaFhirStore extends StObject {
  
  /**
    * Whether to disable referential integrity in this FHIR store. This field
    * is immutable after FHIR store creation. The default value is false,
    * meaning that the API will enforce referential integrity and fail the
    * requests that will result in inconsistent state in the FHIR store. When
    * this field is set to true, the API will skip referential integrity check.
    * Consequently, operations that rely on references, such as
    * GetPatientEverything, will not return all the results if broken
    * references exist.
    */
  var disableReferentialIntegrity: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to disable resource versioning for this FHIR store. This field
    * can not be changed after the creation of FHIR store. If set to false,
    * which is the default behavior, all write operations will cause historical
    * versions to be recorded automatically. The historical versions can be
    * fetched through the history APIs, but cannot be updated. If set to true,
    * no historical versions will be kept. The server will send back errors for
    * attempts to read the historical versions.
    */
  var disableResourceVersioning: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to allow the bulk import API to accept history bundles and
    * directly insert historical resource versions into the FHIR store.
    * Importing resource histories creates resource interactions that appear to
    * have occurred in the past, which clients may not want to allow. If set to
    * false, history bundles within an import will fail with an error.
    */
  var enableHistoryImport: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether this FHIR store has the [updateCreate
    * capability](https://www.hl7.org/fhir/capabilitystatement-definitions.html#CapabilityStatement.rest.resource.updateCreate).
    * This determines if the client can use an Update operation to create a new
    * resource with a client-specified ID. If false, all IDs are
    * server-assigned through the Create operation and attempts to Update a
    * non-existent resource will return errors. Please treat the audit logs
    * with appropriate levels of care if client-specified resource IDs contain
    * sensitive data such as patient identifiers, those IDs will be part of the
    * FHIR resource path recorded in Cloud audit logs and Cloud Pub/Sub
    * notifications.
    */
  var enableUpdateCreate: js.UndefOr[Boolean] = js.native
  
  /**
    * User-supplied key-value pairs used to organize FHIR stores.  Label keys
    * must be between 1 and 63 characters long, have a UTF-8 encoding of
    * maximum 128 bytes, and must conform to the following PCRE regular
    * expression: \p{Ll}\p{Lo}{0,62}  Label values are optional, must be
    * between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
    * bytes, and must conform to the following PCRE regular expression:
    * [\p{Ll}\p{Lo}\p{N}_-]{0,63}  No more than 64 labels can be associated
    * with a given store.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Output only. Resource name of the FHIR store, of the form
    * `projects/{project_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * If non-empty, publish all resource modifications of this FHIR store to
    * this destination. The Cloud Pub/Sub message attributes will contain a map
    * with a string describing the action that has triggered the notification,
    * e.g. &quot;action&quot;:&quot;CreateResource&quot;.
    */
  var notificationConfig: js.UndefOr[SchemaNotificationConfig] = js.native
}
object SchemaFhirStore {
  
  @scala.inline
  def apply(): SchemaFhirStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFhirStore]
  }
  
  @scala.inline
  implicit class SchemaFhirStoreMutableBuilder[Self <: SchemaFhirStore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableReferentialIntegrity(value: Boolean): Self = StObject.set(x, "disableReferentialIntegrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableReferentialIntegrityUndefined: Self = StObject.set(x, "disableReferentialIntegrity", js.undefined)
    
    @scala.inline
    def setDisableResourceVersioning(value: Boolean): Self = StObject.set(x, "disableResourceVersioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableResourceVersioningUndefined: Self = StObject.set(x, "disableResourceVersioning", js.undefined)
    
    @scala.inline
    def setEnableHistoryImport(value: Boolean): Self = StObject.set(x, "enableHistoryImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableHistoryImportUndefined: Self = StObject.set(x, "enableHistoryImport", js.undefined)
    
    @scala.inline
    def setEnableUpdateCreate(value: Boolean): Self = StObject.set(x, "enableUpdateCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableUpdateCreateUndefined: Self = StObject.set(x, "enableUpdateCreate", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNotificationConfig(value: SchemaNotificationConfig): Self = StObject.set(x, "notificationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationConfigUndefined: Self = StObject.set(x, "notificationConfig", js.undefined)
  }
}
