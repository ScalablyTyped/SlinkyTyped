package typingsSlinky.petitDom.mod.global.JSX

import typingsSlinky.petitDom.anon.PropsElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementAttributesProperty extends js.Object {
  
  var props: PropsElement = js.native
}
object ElementAttributesProperty {
  
  @scala.inline
  def apply(props: PropsElement): ElementAttributesProperty = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementAttributesProperty]
  }
  
  @scala.inline
  implicit class ElementAttributesPropertyOps[Self <: ElementAttributesProperty] (val x: Self) extends AnyVal {
    
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
    def setProps(value: PropsElement): Self = this.set("props", value.asInstanceOf[js.Any])
  }
}
