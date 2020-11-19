package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGeoMatchSetRequest extends js.Object {
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typingsSlinky.awsSdk.wafMod.ChangeToken = js.native
  
  /**
    * The GeoMatchSetId of the GeoMatchSet that you want to update. GeoMatchSetId is returned by CreateGeoMatchSet and by ListGeoMatchSets.
    */
  var GeoMatchSetId: ResourceId = js.native
  
  /**
    * An array of GeoMatchSetUpdate objects that you want to insert into or delete from an GeoMatchSet. For more information, see the applicable data types:    GeoMatchSetUpdate: Contains Action and GeoMatchConstraint     GeoMatchConstraint: Contains Type and Value  You can have only one Type and Value per GeoMatchConstraint. To add multiple countries, include multiple GeoMatchSetUpdate objects in your request.  
    */
  var Updates: GeoMatchSetUpdates = js.native
}
object UpdateGeoMatchSetRequest {
  
  @scala.inline
  def apply(ChangeToken: ChangeToken, GeoMatchSetId: ResourceId, Updates: GeoMatchSetUpdates): UpdateGeoMatchSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], GeoMatchSetId = GeoMatchSetId.asInstanceOf[js.Any], Updates = Updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGeoMatchSetRequest]
  }
  
  @scala.inline
  implicit class UpdateGeoMatchSetRequestOps[Self <: UpdateGeoMatchSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = this.set("ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoMatchSetId(value: ResourceId): Self = this.set("GeoMatchSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatesVarargs(value: GeoMatchSetUpdate*): Self = this.set("Updates", js.Array(value :_*))
    
    @scala.inline
    def setUpdates(value: GeoMatchSetUpdates): Self = this.set("Updates", value.asInstanceOf[js.Any])
  }
}
