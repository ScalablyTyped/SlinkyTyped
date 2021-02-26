package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelMembershipForAppInstanceUserSummary extends StObject {
  
  /**
    * Returns the channel membership data for an app instance.
    */
  var AppInstanceUserMembershipSummary: js.UndefOr[typingsSlinky.awsSdk.chimeMod.AppInstanceUserMembershipSummary] = js.native
  
  var ChannelSummary: js.UndefOr[typingsSlinky.awsSdk.chimeMod.ChannelSummary] = js.native
}
object ChannelMembershipForAppInstanceUserSummary {
  
  @scala.inline
  def apply(): ChannelMembershipForAppInstanceUserSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMembershipForAppInstanceUserSummary]
  }
  
  @scala.inline
  implicit class ChannelMembershipForAppInstanceUserSummaryMutableBuilder[Self <: ChannelMembershipForAppInstanceUserSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceUserMembershipSummary(value: AppInstanceUserMembershipSummary): Self = StObject.set(x, "AppInstanceUserMembershipSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstanceUserMembershipSummaryUndefined: Self = StObject.set(x, "AppInstanceUserMembershipSummary", js.undefined)
    
    @scala.inline
    def setChannelSummary(value: ChannelSummary): Self = StObject.set(x, "ChannelSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelSummaryUndefined: Self = StObject.set(x, "ChannelSummary", js.undefined)
  }
}
