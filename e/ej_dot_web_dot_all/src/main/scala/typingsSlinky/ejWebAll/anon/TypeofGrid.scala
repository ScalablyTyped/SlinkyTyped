package typingsSlinky.ejWebAll.anon

import typingsSlinky.ejWebAll.ej.Grid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofGrid extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: Grid = js.native
}
object TypeofGrid {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Grid): TypeofGrid = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofGrid]
  }
  
  @scala.inline
  implicit class TypeofGridMutableBuilder[Self <: TypeofGrid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Grid): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
