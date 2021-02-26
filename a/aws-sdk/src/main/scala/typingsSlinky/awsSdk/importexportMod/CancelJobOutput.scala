package typingsSlinky.awsSdk.importexportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelJobOutput extends StObject {
  
  var Success: js.UndefOr[typingsSlinky.awsSdk.importexportMod.Success] = js.native
}
object CancelJobOutput {
  
  @scala.inline
  def apply(): CancelJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelJobOutput]
  }
  
  @scala.inline
  implicit class CancelJobOutputMutableBuilder[Self <: CancelJobOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: Success): Self = StObject.set(x, "Success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "Success", js.undefined)
  }
}
