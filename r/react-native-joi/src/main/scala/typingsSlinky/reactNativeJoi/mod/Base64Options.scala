package typingsSlinky.reactNativeJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base64Options extends StObject {
  
  /**
    * optional parameter defaulting to true which will require = padding if true or make padding optional if false
    */
  var paddingRequired: js.UndefOr[Boolean] = js.native
}
object Base64Options {
  
  @scala.inline
  def apply(): Base64Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Base64Options]
  }
  
  @scala.inline
  implicit class Base64OptionsMutableBuilder[Self <: Base64Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaddingRequired(value: Boolean): Self = StObject.set(x, "paddingRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingRequiredUndefined: Self = StObject.set(x, "paddingRequired", js.undefined)
  }
}
