package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserAssignedTargetingOptionDetails extends js.Object {
  
  /** Output only. The display name of the browser. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Indicates if this option is being negatively targeted. All assigned browser targeting options on the same line item must have the same value for this field. */
  var negative: js.UndefOr[Boolean] = js.native
  
  /** Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_BROWSER`. */
  var targetingOptionId: js.UndefOr[String] = js.native
}
object BrowserAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): BrowserAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class BrowserAssignedTargetingOptionDetailsOps[Self <: BrowserAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setNegative(value: Boolean): Self = this.set("negative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegative: Self = this.set("negative", js.undefined)
    
    @scala.inline
    def setTargetingOptionId(value: String): Self = this.set("targetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetingOptionId: Self = this.set("targetingOptionId", js.undefined)
  }
}
