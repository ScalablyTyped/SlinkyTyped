package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyOptionGroupResult extends StObject {
  
  var OptionGroup: js.UndefOr[typingsSlinky.awsSdk.rdsMod.OptionGroup] = js.native
}
object CopyOptionGroupResult {
  
  @scala.inline
  def apply(): CopyOptionGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyOptionGroupResult]
  }
  
  @scala.inline
  implicit class CopyOptionGroupResultMutableBuilder[Self <: CopyOptionGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptionGroup(value: OptionGroup): Self = StObject.set(x, "OptionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionGroupUndefined: Self = StObject.set(x, "OptionGroup", js.undefined)
  }
}
