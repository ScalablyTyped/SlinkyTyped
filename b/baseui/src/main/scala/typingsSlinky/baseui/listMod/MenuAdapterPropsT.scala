package typingsSlinky.baseui.listMod

import org.scalajs.dom.raw.HTMLLIElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuAdapterPropsT extends PropsT {
  
  @JSName("$disabled")
  var $disabled: Boolean = js.native
  
  @JSName("$isHighlighted")
  var $isHighlighted: Boolean = js.native
  
  @JSName("$size")
  var $size: String = js.native
  
  // eslint-disable-next-line flowtype/no-weak-types
  var item: js.Any = js.native
  
  def onClick(event: SyntheticMouseEvent[HTMLLIElement]): js.Any = js.native
  
  def onMouseEnter(event: SyntheticMouseEvent[HTMLLIElement]): js.Any = js.native
}
object MenuAdapterPropsT {
  
  @scala.inline
  def apply(
    $disabled: Boolean,
    $isHighlighted: Boolean,
    $size: String,
    item: js.Any,
    onClick: SyntheticMouseEvent[HTMLLIElement] => js.Any,
    onMouseEnter: SyntheticMouseEvent[HTMLLIElement] => js.Any
  ): MenuAdapterPropsT = {
    val __obj = js.Dynamic.literal($disabled = $disabled.asInstanceOf[js.Any], $isHighlighted = $isHighlighted.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onMouseEnter = js.Any.fromFunction1(onMouseEnter))
    __obj.asInstanceOf[MenuAdapterPropsT]
  }
  
  @scala.inline
  implicit class MenuAdapterPropsTOps[Self <: MenuAdapterPropsT] (val x: Self) extends AnyVal {
    
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
    def set$disabled(value: Boolean): Self = this.set("$disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isHighlighted(value: Boolean): Self = this.set("$isHighlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$size(value: String): Self = this.set("$size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[HTMLLIElement] => js.Any): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseEnter(value: SyntheticMouseEvent[HTMLLIElement] => js.Any): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
  }
}
