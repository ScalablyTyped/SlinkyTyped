package typingsSlinky.ejWebAll.anon

import typingsSlinky.ejWebAll.ej.PivotTreeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPivotTreeMap extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: PivotTreeMap = js.native
}
object TypeofPivotTreeMap {
  
  @scala.inline
  def apply(Locale: js.Any, fn: PivotTreeMap): TypeofPivotTreeMap = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPivotTreeMap]
  }
  
  @scala.inline
  implicit class TypeofPivotTreeMapMutableBuilder[Self <: TypeofPivotTreeMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: PivotTreeMap): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
