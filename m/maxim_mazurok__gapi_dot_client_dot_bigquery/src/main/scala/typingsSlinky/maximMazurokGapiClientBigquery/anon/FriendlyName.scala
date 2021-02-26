package typingsSlinky.maximMazurokGapiClientBigquery.anon

import typingsSlinky.maximMazurokGapiClientBigquery.gapi.client.bigquery.ProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FriendlyName extends StObject {
  
  /** A descriptive name for this project. */
  var friendlyName: js.UndefOr[String] = js.native
  
  /** An opaque ID of this project. */
  var id: js.UndefOr[String] = js.native
  
  /** The resource type. */
  var kind: js.UndefOr[String] = js.native
  
  /** The numeric ID of this project. */
  var numericId: js.UndefOr[String] = js.native
  
  /** A unique reference to this project. */
  var projectReference: js.UndefOr[ProjectReference] = js.native
}
object FriendlyName {
  
  @scala.inline
  def apply(): FriendlyName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FriendlyName]
  }
  
  @scala.inline
  implicit class FriendlyNameMutableBuilder[Self <: FriendlyName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNumericId(value: String): Self = StObject.set(x, "numericId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericIdUndefined: Self = StObject.set(x, "numericId", js.undefined)
    
    @scala.inline
    def setProjectReference(value: ProjectReference): Self = StObject.set(x, "projectReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectReferenceUndefined: Self = StObject.set(x, "projectReference", js.undefined)
  }
}
