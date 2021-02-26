package typingsSlinky.jqueryui.JQueryUI

import typingsSlinky.jqueryui.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectMenuUIParams extends StObject {
  
  var item: js.UndefOr[JQuery] = js.native
}
object SelectMenuUIParams {
  
  @scala.inline
  def apply(): SelectMenuUIParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectMenuUIParams]
  }
  
  @scala.inline
  implicit class SelectMenuUIParamsMutableBuilder[Self <: SelectMenuUIParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: JQuery): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
