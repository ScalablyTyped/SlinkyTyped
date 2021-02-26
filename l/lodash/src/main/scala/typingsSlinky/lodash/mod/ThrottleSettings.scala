package typingsSlinky.lodash.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThrottleSettings extends StObject {
  
  /**
    * @see _.leading
    */
  var leading: js.UndefOr[Boolean] = js.native
  
  /**
    * @see _.trailing
    */
  var trailing: js.UndefOr[Boolean] = js.native
}
object ThrottleSettings {
  
  @scala.inline
  def apply(): ThrottleSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThrottleSettings]
  }
  
  @scala.inline
  implicit class ThrottleSettingsMutableBuilder[Self <: ThrottleSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
    
    @scala.inline
    def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
  }
}
