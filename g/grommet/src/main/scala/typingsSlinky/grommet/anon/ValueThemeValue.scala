package typingsSlinky.grommet.anon

import typingsSlinky.grommet.themeContextMod.ThemeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueThemeValue extends StObject {
  
  var value: ThemeValue = js.native
}
object ValueThemeValue {
  
  @scala.inline
  def apply(value: ThemeValue): ValueThemeValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueThemeValue]
  }
  
  @scala.inline
  implicit class ValueThemeValueMutableBuilder[Self <: ValueThemeValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: ThemeValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
