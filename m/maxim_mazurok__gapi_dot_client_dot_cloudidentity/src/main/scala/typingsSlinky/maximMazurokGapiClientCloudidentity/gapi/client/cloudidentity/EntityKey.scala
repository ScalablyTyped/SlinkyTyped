package typingsSlinky.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityKey extends StObject {
  
  /**
    * The ID of the entity. For Google-managed entities, the `id` should be the email address of an existing group or user. For external-identity-mapped entities, the `id` must be a
    * string conforming to the Identity Source's requirements. Must be unique within a `namespace`.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The namespace in which the entity exists. If not specified, the `EntityKey` represents a Google-managed entity such as a Google user or a Google Group. If specified, the `EntityKey`
    * represents an external-identity-mapped group. The namespace must correspond to an identity source created in Admin Console and must be in the form of
    * `identitysources/{identity_source_id}.
    */
  var namespace: js.UndefOr[String] = js.native
}
object EntityKey {
  
  @scala.inline
  def apply(): EntityKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityKey]
  }
  
  @scala.inline
  implicit class EntityKeyMutableBuilder[Self <: EntityKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
  }
}
