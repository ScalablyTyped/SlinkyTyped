package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ItemContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Selectable[K, D] extends StObject {
  
  var renderer: js.UndefOr[(js.Function1[/* context */ ItemContext[K, D], Unit]) | Null] = js.native
  
  var selectable: js.UndefOr[(js.Function1[/* context */ ItemContext[K, D], Boolean]) | Boolean] = js.native
}
object Selectable {
  
  @scala.inline
  def apply[K, D](): Selectable[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Selectable[K, D]]
  }
  
  @scala.inline
  implicit class SelectableMutableBuilder[Self <: Selectable[_, _], K, D] (val x: Self with (Selectable[K, D])) extends AnyVal {
    
    @scala.inline
    def setRenderer(value: /* context */ ItemContext[K, D] => Unit): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRendererNull: Self = StObject.set(x, "renderer", null)
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    @scala.inline
    def setSelectable(value: (js.Function1[/* context */ ItemContext[K, D], Boolean]) | Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableFunction1(value: /* context */ ItemContext[K, D] => Boolean): Self = StObject.set(x, "selectable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
  }
}
