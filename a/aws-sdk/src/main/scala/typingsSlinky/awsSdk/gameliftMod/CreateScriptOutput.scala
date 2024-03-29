package typingsSlinky.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateScriptOutput extends StObject {
  
  /**
    * The newly created script record with a unique script ID and ARN. The new script's storage location reflects an Amazon S3 location: (1) If the script was uploaded from an S3 bucket under your account, the storage location reflects the information that was provided in the CreateScript request; (2) If the script file was uploaded from a local zip file, the storage location reflects an S3 location controls by the Amazon GameLift service.
    */
  var Script: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.Script] = js.native
}
object CreateScriptOutput {
  
  @scala.inline
  def apply(): CreateScriptOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateScriptOutput]
  }
  
  @scala.inline
  implicit class CreateScriptOutputMutableBuilder[Self <: CreateScriptOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScript(value: Script): Self = StObject.set(x, "Script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptUndefined: Self = StObject.set(x, "Script", js.undefined)
  }
}
