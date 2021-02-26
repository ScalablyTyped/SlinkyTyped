package typingsSlinky.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for beacon and attachment information about beacons that a mobile
  * client has encountered &quot;in the wild&quot;.
  */
@js.native
trait SchemaGetInfoForObservedBeaconsRequest extends StObject {
  
  /**
    * Specifies what kind of attachments to include in the response. When
    * given, the response will include only attachments of the given types.
    * When empty, no attachments will be returned. Must be in the format
    * &lt;var&gt;namespace/type&lt;/var&gt;. Accepts `*` to specify all types
    * in all namespaces owned by the client. Optional.
    */
  var namespacedTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The beacons that the client has encountered. At least one must be given.
    */
  var observations: js.UndefOr[js.Array[SchemaObservation]] = js.native
}
object SchemaGetInfoForObservedBeaconsRequest {
  
  @scala.inline
  def apply(): SchemaGetInfoForObservedBeaconsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetInfoForObservedBeaconsRequest]
  }
  
  @scala.inline
  implicit class SchemaGetInfoForObservedBeaconsRequestMutableBuilder[Self <: SchemaGetInfoForObservedBeaconsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamespacedTypes(value: js.Array[String]): Self = StObject.set(x, "namespacedTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespacedTypesUndefined: Self = StObject.set(x, "namespacedTypes", js.undefined)
    
    @scala.inline
    def setNamespacedTypesVarargs(value: String*): Self = StObject.set(x, "namespacedTypes", js.Array(value :_*))
    
    @scala.inline
    def setObservations(value: js.Array[SchemaObservation]): Self = StObject.set(x, "observations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservationsUndefined: Self = StObject.set(x, "observations", js.undefined)
    
    @scala.inline
    def setObservationsVarargs(value: SchemaObservation*): Self = StObject.set(x, "observations", js.Array(value :_*))
  }
}
