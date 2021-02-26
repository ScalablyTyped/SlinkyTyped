package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchBaselineIdentity extends StObject {
  
  /**
    * The description of the patch baseline.
    */
  var BaselineDescription: js.UndefOr[typingsSlinky.awsSdk.ssmMod.BaselineDescription] = js.native
  
  /**
    * The ID of the patch baseline.
    */
  var BaselineId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.BaselineId] = js.native
  
  /**
    * The name of the patch baseline.
    */
  var BaselineName: js.UndefOr[typingsSlinky.awsSdk.ssmMod.BaselineName] = js.native
  
  /**
    * Whether this is the default baseline. Note that Systems Manager supports creating multiple default patch baselines. For example, you can create a default patch baseline for each operating system.
    */
  var DefaultBaseline: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DefaultBaseline] = js.native
  
  /**
    * Defines the operating system the patch baseline applies to. The Default value is WINDOWS. 
    */
  var OperatingSystem: js.UndefOr[typingsSlinky.awsSdk.ssmMod.OperatingSystem] = js.native
}
object PatchBaselineIdentity {
  
  @scala.inline
  def apply(): PatchBaselineIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchBaselineIdentity]
  }
  
  @scala.inline
  implicit class PatchBaselineIdentityMutableBuilder[Self <: PatchBaselineIdentity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaselineDescription(value: BaselineDescription): Self = StObject.set(x, "BaselineDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineDescriptionUndefined: Self = StObject.set(x, "BaselineDescription", js.undefined)
    
    @scala.inline
    def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineIdUndefined: Self = StObject.set(x, "BaselineId", js.undefined)
    
    @scala.inline
    def setBaselineName(value: BaselineName): Self = StObject.set(x, "BaselineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineNameUndefined: Self = StObject.set(x, "BaselineName", js.undefined)
    
    @scala.inline
    def setDefaultBaseline(value: DefaultBaseline): Self = StObject.set(x, "DefaultBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultBaselineUndefined: Self = StObject.set(x, "DefaultBaseline", js.undefined)
    
    @scala.inline
    def setOperatingSystem(value: OperatingSystem): Self = StObject.set(x, "OperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemUndefined: Self = StObject.set(x, "OperatingSystem", js.undefined)
  }
}
