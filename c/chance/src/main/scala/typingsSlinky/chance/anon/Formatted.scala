package typingsSlinky.chance.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Formatted extends StObject {
  
  var formatted: Boolean = js.native
}
object Formatted {
  
  @scala.inline
  def apply(formatted: Boolean): Formatted = {
    val __obj = js.Dynamic.literal(formatted = formatted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formatted]
  }
  
  @scala.inline
  implicit class FormattedMutableBuilder[Self <: Formatted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormatted(value: Boolean): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
  }
}
