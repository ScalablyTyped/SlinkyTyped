package typingsSlinky.ejWebAll.anon

import typingsSlinky.ejWebAll.ej.TreeGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTreeGrid extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: TreeGrid = js.native
}
object TypeofTreeGrid {
  
  @scala.inline
  def apply(Locale: js.Any, fn: TreeGrid): TypeofTreeGrid = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTreeGrid]
  }
  
  @scala.inline
  implicit class TypeofTreeGridMutableBuilder[Self <: TypeofTreeGrid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: TreeGrid): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
