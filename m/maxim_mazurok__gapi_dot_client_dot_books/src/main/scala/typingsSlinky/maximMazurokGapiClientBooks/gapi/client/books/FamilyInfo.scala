package typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books

import typingsSlinky.maximMazurokGapiClientBooks.anon.AcquirePermission
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FamilyInfo extends StObject {
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
  
  /** Family membership info of the user that made the request. */
  var membership: js.UndefOr[AcquirePermission] = js.native
}
object FamilyInfo {
  
  @scala.inline
  def apply(): FamilyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FamilyInfo]
  }
  
  @scala.inline
  implicit class FamilyInfoMutableBuilder[Self <: FamilyInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMembership(value: AcquirePermission): Self = StObject.set(x, "membership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembershipUndefined: Self = StObject.set(x, "membership", js.undefined)
  }
}
