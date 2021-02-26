package typingsSlinky.materialUiLab.anon

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassName extends StObject {
  
  var className: String = js.native
  
  var endAdornment: ReactElement = js.native
  
  var ref: Ref[_] = js.native
  
  var startAdornment: ReactElement = js.native
}
object ClassName {
  
  @scala.inline
  def apply(className: String): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
  
  @scala.inline
  implicit class ClassNameMutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAdornment(value: ReactElement): Self = StObject.set(x, "endAdornment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAdornmentUndefined: Self = StObject.set(x, "endAdornment", js.undefined)
    
    @scala.inline
    def setRef(value: Ref[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefRefObject(value: ReactRef[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAdornment(value: ReactElement): Self = StObject.set(x, "startAdornment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAdornmentUndefined: Self = StObject.set(x, "startAdornment", js.undefined)
  }
}
