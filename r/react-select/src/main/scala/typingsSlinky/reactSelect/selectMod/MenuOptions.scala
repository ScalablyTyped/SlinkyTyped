package typingsSlinky.reactSelect.selectMod

import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuOptions[OptionType /* <: OptionTypeBase */] extends js.Object {
  
  var focusable: js.Array[OptionType] = js.native
  
  var render: js.Array[OptionType] = js.native
}
object MenuOptions {
  
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](focusable: js.Array[OptionType], render: js.Array[OptionType]): MenuOptions[OptionType] = {
    val __obj = js.Dynamic.literal(focusable = focusable.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuOptions[OptionType]]
  }
  
  @scala.inline
  implicit class MenuOptionsOps[Self <: MenuOptions[_], OptionType /* <: OptionTypeBase */] (val x: Self with MenuOptions[OptionType]) extends AnyVal {
    
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
    def setFocusableVarargs(value: OptionType*): Self = this.set("focusable", js.Array(value :_*))
    
    @scala.inline
    def setFocusable(value: js.Array[OptionType]): Self = this.set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderVarargs(value: OptionType*): Self = this.set("render", js.Array(value :_*))
    
    @scala.inline
    def setRender(value: js.Array[OptionType]): Self = this.set("render", value.asInstanceOf[js.Any])
  }
}
