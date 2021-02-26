package typingsSlinky.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFacetResponse extends StObject {
  
  /**
    * The Facet structure that is associated with the facet.
    */
  var Facet: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.Facet] = js.native
}
object GetFacetResponse {
  
  @scala.inline
  def apply(): GetFacetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFacetResponse]
  }
  
  @scala.inline
  implicit class GetFacetResponseMutableBuilder[Self <: GetFacetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFacet(value: Facet): Self = StObject.set(x, "Facet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetUndefined: Self = StObject.set(x, "Facet", js.undefined)
  }
}
