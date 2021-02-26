package typingsSlinky.rcSlider.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictx
  extends /* x */ StringDictionary[js.Any] {
  
  var disabled: js.Any = js.native
  
  var dragging: js.Any = js.native
  
  var index: js.Any = js.native
  
  var value: js.Any = js.native
}
object Dictx {
  
  @scala.inline
  def apply(disabled: js.Any, dragging: js.Any, index: js.Any, value: js.Any): Dictx = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictx]
  }
  
  @scala.inline
  implicit class DictxMutableBuilder[Self <: Dictx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: js.Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragging(value: js.Any): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: js.Any): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
