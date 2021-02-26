package typingsSlinky.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait monthSettings extends StObject {
  
  var names: js.Array[String] = js.native
  
  var namesAbbr: js.Array[String] = js.native
}
object monthSettings {
  
  @scala.inline
  def apply(names: js.Array[String], namesAbbr: js.Array[String]): monthSettings = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any], namesAbbr = namesAbbr.asInstanceOf[js.Any])
    __obj.asInstanceOf[monthSettings]
  }
  
  @scala.inline
  implicit class monthSettingsMutableBuilder[Self <: monthSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesAbbr(value: js.Array[String]): Self = StObject.set(x, "namesAbbr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesAbbrVarargs(value: String*): Self = StObject.set(x, "namesAbbr", js.Array(value :_*))
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
  }
}
