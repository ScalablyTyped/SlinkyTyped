package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDefaultPatchBaselineResult extends StObject {
  
  /**
    * The ID of the default patch baseline.
    */
  var BaselineId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.BaselineId] = js.native
  
  /**
    * The operating system for the returned patch baseline. 
    */
  var OperatingSystem: js.UndefOr[typingsSlinky.awsSdk.ssmMod.OperatingSystem] = js.native
}
object GetDefaultPatchBaselineResult {
  
  @scala.inline
  def apply(): GetDefaultPatchBaselineResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDefaultPatchBaselineResult]
  }
  
  @scala.inline
  implicit class GetDefaultPatchBaselineResultMutableBuilder[Self <: GetDefaultPatchBaselineResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineIdUndefined: Self = StObject.set(x, "BaselineId", js.undefined)
    
    @scala.inline
    def setOperatingSystem(value: OperatingSystem): Self = StObject.set(x, "OperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemUndefined: Self = StObject.set(x, "OperatingSystem", js.undefined)
  }
}
