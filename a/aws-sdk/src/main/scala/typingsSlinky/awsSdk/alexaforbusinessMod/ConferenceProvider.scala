package typingsSlinky.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConferenceProvider extends StObject {
  
  /**
    * The ARN of the newly created conference provider.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.Arn] = js.native
  
  /**
    * The IP endpoint and protocol for calling.
    */
  var IPDialIn: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.IPDialIn] = js.native
  
  /**
    * The meeting settings for the conference provider.
    */
  var MeetingSetting: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.MeetingSetting] = js.native
  
  /**
    * The name of the conference provider.
    */
  var Name: js.UndefOr[ConferenceProviderName] = js.native
  
  /**
    * The information for PSTN conferencing.
    */
  var PSTNDialIn: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.PSTNDialIn] = js.native
  
  /**
    * The type of conference providers.
    */
  var Type: js.UndefOr[ConferenceProviderType] = js.native
}
object ConferenceProvider {
  
  @scala.inline
  def apply(): ConferenceProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferenceProvider]
  }
  
  @scala.inline
  implicit class ConferenceProviderMutableBuilder[Self <: ConferenceProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setIPDialIn(value: IPDialIn): Self = StObject.set(x, "IPDialIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPDialInUndefined: Self = StObject.set(x, "IPDialIn", js.undefined)
    
    @scala.inline
    def setMeetingSetting(value: MeetingSetting): Self = StObject.set(x, "MeetingSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeetingSettingUndefined: Self = StObject.set(x, "MeetingSetting", js.undefined)
    
    @scala.inline
    def setName(value: ConferenceProviderName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setPSTNDialIn(value: PSTNDialIn): Self = StObject.set(x, "PSTNDialIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPSTNDialInUndefined: Self = StObject.set(x, "PSTNDialIn", js.undefined)
    
    @scala.inline
    def setType(value: ConferenceProviderType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
