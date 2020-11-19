package typingsSlinky.reactPlacesAutocomplete.anon

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.TouchEventHandler
import typingsSlinky.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Id extends js.Object {
  
  var id: js.UndefOr[String] = js.native
  
  var key: Double = js.native
  
  var onClick: MouseEventHandler[Element] = js.native
  
  var onMouseDown: MouseEventHandler[Element] = js.native
  
  var onMouseEnter: MouseEventHandler[Element] = js.native
  
  var onMouseLeave: MouseEventHandler[Element] = js.native
  
  var onMouseUp: MouseEventHandler[Element] = js.native
  
  var onTouchEnd: TouchEventHandler[Element] = js.native
  
  var onTouchStart: TouchEventHandler[Element] = js.native
  
  var role: option = js.native
}
object Id {
  
  @scala.inline
  def apply(
    key: Double,
    onClick: SyntheticMouseEvent[Element] => Unit,
    onMouseDown: SyntheticMouseEvent[Element] => Unit,
    onMouseEnter: SyntheticMouseEvent[Element] => Unit,
    onMouseLeave: SyntheticMouseEvent[Element] => Unit,
    onMouseUp: SyntheticMouseEvent[Element] => Unit,
    onTouchEnd: SyntheticTouchEvent[Element] => Unit,
    onTouchStart: SyntheticTouchEvent[Element] => Unit,
    role: option
  ): Id = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseEnter = js.Any.fromFunction1(onMouseEnter), onMouseLeave = js.Any.fromFunction1(onMouseLeave), onMouseUp = js.Any.fromFunction1(onMouseUp), onTouchEnd = js.Any.fromFunction1(onTouchEnd), onTouchStart = js.Any.fromFunction1(onTouchStart), role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit class IdOps[Self <: Id] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKey(value: Double): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[Element] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseDown(value: SyntheticMouseEvent[Element] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseEnter(value: SyntheticMouseEvent[Element] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseLeave(value: SyntheticMouseEvent[Element] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseUp(value: SyntheticMouseEvent[Element] => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchEnd(value: SyntheticTouchEvent[Element] => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchStart(value: SyntheticTouchEvent[Element] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRole(value: option): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}
