package typingsSlinky.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassName extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var theme: js.UndefOr[ColorsSpacing] = js.native
}
object ClassName {
  
  @scala.inline
  def apply(): ClassName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassName]
  }
  
  @scala.inline
  implicit class ClassNameMutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTheme(value: ColorsSpacing): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
