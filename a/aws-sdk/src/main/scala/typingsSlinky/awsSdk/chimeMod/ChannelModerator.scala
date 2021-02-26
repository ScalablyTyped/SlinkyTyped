package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelModerator extends StObject {
  
  /**
    * The ARN of the moderator's channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.native
  
  /**
    * The member who created the moderator.
    */
  var CreatedBy: js.UndefOr[Identity] = js.native
  
  /**
    * The time at which the moderator was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.native
  
  /**
    * The moderator's data.
    */
  var Moderator: js.UndefOr[Identity] = js.native
}
object ChannelModerator {
  
  @scala.inline
  def apply(): ChannelModerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelModerator]
  }
  
  @scala.inline
  implicit class ChannelModeratorMutableBuilder[Self <: ChannelModerator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: Identity): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setModerator(value: Identity): Self = StObject.set(x, "Moderator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeratorUndefined: Self = StObject.set(x, "Moderator", js.undefined)
  }
}
