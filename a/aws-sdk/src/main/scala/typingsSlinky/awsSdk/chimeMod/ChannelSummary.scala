package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelSummary extends StObject {
  
  /**
    * The ARN of the channel summary.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.native
  
  /**
    * The time at which the last message in a channel was sent.
    */
  var LastMessageTimestamp: js.UndefOr[js.Date] = js.native
  
  /**
    * The metadata of the channel summary.
    */
  var Metadata: js.UndefOr[typingsSlinky.awsSdk.chimeMod.Metadata] = js.native
  
  /**
    * The summary mode of the channel.
    */
  var Mode: js.UndefOr[ChannelMode] = js.native
  
  /**
    * The parameter of the action.
    */
  var Name: js.UndefOr[NonEmptyResourceName] = js.native
  
  /**
    * The privacy setting of the channel being summarized, PUBLIC or HIDDEN.
    */
  var Privacy: js.UndefOr[ChannelPrivacy] = js.native
}
object ChannelSummary {
  
  @scala.inline
  def apply(): ChannelSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelSummary]
  }
  
  @scala.inline
  implicit class ChannelSummaryMutableBuilder[Self <: ChannelSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    @scala.inline
    def setLastMessageTimestamp(value: js.Date): Self = StObject.set(x, "LastMessageTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastMessageTimestampUndefined: Self = StObject.set(x, "LastMessageTimestamp", js.undefined)
    
    @scala.inline
    def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    @scala.inline
    def setMode(value: ChannelMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setPrivacy(value: ChannelPrivacy): Self = StObject.set(x, "Privacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacyUndefined: Self = StObject.set(x, "Privacy", js.undefined)
  }
}
