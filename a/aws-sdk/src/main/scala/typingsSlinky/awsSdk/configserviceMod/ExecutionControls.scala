package typingsSlinky.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionControls extends StObject {
  
  /**
    * A SsmControls object.
    */
  var SsmControls: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.SsmControls] = js.native
}
object ExecutionControls {
  
  @scala.inline
  def apply(): ExecutionControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionControls]
  }
  
  @scala.inline
  implicit class ExecutionControlsMutableBuilder[Self <: ExecutionControls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSsmControls(value: SsmControls): Self = StObject.set(x, "SsmControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsmControlsUndefined: Self = StObject.set(x, "SsmControls", js.undefined)
  }
}
