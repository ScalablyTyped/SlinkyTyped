package typingsSlinky.ejWebAll.anon

import typingsSlinky.ejWebAll.ej.Pager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPager extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: Pager = js.native
}
object TypeofPager {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Pager): TypeofPager = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPager]
  }
  
  @scala.inline
  implicit class TypeofPagerMutableBuilder[Self <: TypeofPager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Pager): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
