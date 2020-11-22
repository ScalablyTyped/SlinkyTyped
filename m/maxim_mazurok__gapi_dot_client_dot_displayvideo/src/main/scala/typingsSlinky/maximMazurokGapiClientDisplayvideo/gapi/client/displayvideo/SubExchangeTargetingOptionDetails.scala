package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubExchangeTargetingOptionDetails extends js.Object {
  
  /** Output only. The display name of the sub-exchange. */
  var displayName: js.UndefOr[String] = js.native
}
object SubExchangeTargetingOptionDetails {
  
  @scala.inline
  def apply(): SubExchangeTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubExchangeTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class SubExchangeTargetingOptionDetailsOps[Self <: SubExchangeTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
  }
}
