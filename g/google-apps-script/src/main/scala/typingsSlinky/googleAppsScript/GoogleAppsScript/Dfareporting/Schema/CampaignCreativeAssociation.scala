package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignCreativeAssociation extends js.Object {
  
  var creativeId: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
}
object CampaignCreativeAssociation {
  
  @scala.inline
  def apply(): CampaignCreativeAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignCreativeAssociation]
  }
  
  @scala.inline
  implicit class CampaignCreativeAssociationOps[Self <: CampaignCreativeAssociation] (val x: Self) extends AnyVal {
    
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
    def setCreativeId(value: String): Self = this.set("creativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeId: Self = this.set("creativeId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
