package typingsSlinky.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddLifecycleRuleOptions extends StObject {
  
  var append: js.UndefOr[Boolean] = js.native
}
object AddLifecycleRuleOptions {
  
  @scala.inline
  def apply(): AddLifecycleRuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddLifecycleRuleOptions]
  }
  
  @scala.inline
  implicit class AddLifecycleRuleOptionsMutableBuilder[Self <: AddLifecycleRuleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
  }
}
