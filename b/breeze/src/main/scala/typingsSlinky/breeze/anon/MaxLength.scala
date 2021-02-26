package typingsSlinky.breeze.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxLength extends StObject {
  
  var maxLength: Double = js.native
  
  var messageTemplate: js.UndefOr[String] = js.native
}
object MaxLength {
  
  @scala.inline
  def apply(maxLength: Double): MaxLength = {
    val __obj = js.Dynamic.literal(maxLength = maxLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxLength]
  }
  
  @scala.inline
  implicit class MaxLengthMutableBuilder[Self <: MaxLength] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTemplate(value: String): Self = StObject.set(x, "messageTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTemplateUndefined: Self = StObject.set(x, "messageTemplate", js.undefined)
  }
}
