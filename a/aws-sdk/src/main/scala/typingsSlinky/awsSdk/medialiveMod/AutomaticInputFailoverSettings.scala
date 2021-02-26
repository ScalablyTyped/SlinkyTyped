package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutomaticInputFailoverSettings extends StObject {
  
  /**
    * This clear time defines the requirement a recovered input must meet to be considered healthy. The input must have no failover conditions for this length of time. Enter a time in milliseconds. This value is particularly important if the input_preference for the failover pair is set to PRIMARY_INPUT_PREFERRED, because after this time, MediaLive will switch back to the primary input.
    */
  var ErrorClearTimeMsec: js.UndefOr[integerMin1] = js.native
  
  /**
    * A list of failover conditions. If any of these conditions occur, MediaLive will perform a failover to the other input.
    */
  var FailoverConditions: js.UndefOr[listOfFailoverCondition] = js.native
  
  /**
    * Input preference when deciding which input to make active when a previously failed input has recovered.
    */
  var InputPreference: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.InputPreference] = js.native
  
  /**
    * The input ID of the secondary input in the automatic input failover pair.
    */
  var SecondaryInputId: string = js.native
}
object AutomaticInputFailoverSettings {
  
  @scala.inline
  def apply(SecondaryInputId: string): AutomaticInputFailoverSettings = {
    val __obj = js.Dynamic.literal(SecondaryInputId = SecondaryInputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomaticInputFailoverSettings]
  }
  
  @scala.inline
  implicit class AutomaticInputFailoverSettingsMutableBuilder[Self <: AutomaticInputFailoverSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorClearTimeMsec(value: integerMin1): Self = StObject.set(x, "ErrorClearTimeMsec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorClearTimeMsecUndefined: Self = StObject.set(x, "ErrorClearTimeMsec", js.undefined)
    
    @scala.inline
    def setFailoverConditions(value: listOfFailoverCondition): Self = StObject.set(x, "FailoverConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailoverConditionsUndefined: Self = StObject.set(x, "FailoverConditions", js.undefined)
    
    @scala.inline
    def setFailoverConditionsVarargs(value: FailoverCondition*): Self = StObject.set(x, "FailoverConditions", js.Array(value :_*))
    
    @scala.inline
    def setInputPreference(value: InputPreference): Self = StObject.set(x, "InputPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputPreferenceUndefined: Self = StObject.set(x, "InputPreference", js.undefined)
    
    @scala.inline
    def setSecondaryInputId(value: string): Self = StObject.set(x, "SecondaryInputId", value.asInstanceOf[js.Any])
  }
}
