package typingsSlinky.reactNativeJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorOptions extends StObject {
  
  /**
    * Boolean value indicating whether the error handler should be used for all errors or only for errors occurring
    * on this property (`true` value).
    * This concept only makes sense for `array` or `object` schemas as other values don't have children.
    * @default false
    */
  var self: js.UndefOr[Boolean] = js.native
}
object ErrorOptions {
  
  @scala.inline
  def apply(): ErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorOptions]
  }
  
  @scala.inline
  implicit class ErrorOptionsMutableBuilder[Self <: ErrorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelf(value: Boolean): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
  }
}
