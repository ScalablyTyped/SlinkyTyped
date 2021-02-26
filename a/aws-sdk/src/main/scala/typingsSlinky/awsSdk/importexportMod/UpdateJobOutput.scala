package typingsSlinky.awsSdk.importexportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateJobOutput extends StObject {
  
  var ArtifactList: js.UndefOr[typingsSlinky.awsSdk.importexportMod.ArtifactList] = js.native
  
  var Success: js.UndefOr[typingsSlinky.awsSdk.importexportMod.Success] = js.native
  
  var WarningMessage: js.UndefOr[typingsSlinky.awsSdk.importexportMod.WarningMessage] = js.native
}
object UpdateJobOutput {
  
  @scala.inline
  def apply(): UpdateJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateJobOutput]
  }
  
  @scala.inline
  implicit class UpdateJobOutputMutableBuilder[Self <: UpdateJobOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactList(value: ArtifactList): Self = StObject.set(x, "ArtifactList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactListUndefined: Self = StObject.set(x, "ArtifactList", js.undefined)
    
    @scala.inline
    def setArtifactListVarargs(value: Artifact*): Self = StObject.set(x, "ArtifactList", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: Success): Self = StObject.set(x, "Success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "Success", js.undefined)
    
    @scala.inline
    def setWarningMessage(value: WarningMessage): Self = StObject.set(x, "WarningMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningMessageUndefined: Self = StObject.set(x, "WarningMessage", js.undefined)
  }
}
