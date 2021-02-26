package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputGroup extends StObject {
  
  /**
    * Custom output group name optionally defined by the user.  Only letters, numbers, and the underscore character allowed; only 32 characters allowed.
    */
  var Name: js.UndefOr[stringMax32] = js.native
  
  /**
    * Settings associated with the output group.
    */
  var OutputGroupSettings: typingsSlinky.awsSdk.medialiveMod.OutputGroupSettings = js.native
  
  var Outputs: listOfOutput = js.native
}
object OutputGroup {
  
  @scala.inline
  def apply(OutputGroupSettings: OutputGroupSettings, Outputs: listOfOutput): OutputGroup = {
    val __obj = js.Dynamic.literal(OutputGroupSettings = OutputGroupSettings.asInstanceOf[js.Any], Outputs = Outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputGroup]
  }
  
  @scala.inline
  implicit class OutputGroupMutableBuilder[Self <: OutputGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: stringMax32): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOutputGroupSettings(value: OutputGroupSettings): Self = StObject.set(x, "OutputGroupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputs(value: listOfOutput): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsVarargs(value: Output*): Self = StObject.set(x, "Outputs", js.Array(value :_*))
  }
}
