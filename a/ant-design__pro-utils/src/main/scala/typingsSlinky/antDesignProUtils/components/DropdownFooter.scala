package typingsSlinky.antDesignProUtils.components

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignProUtils.dropdownFooterMod.DropdownFooterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownFooter {
  
  @JSImport("@ant-design/pro-utils/lib/components/DropdownFooter", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClear(value: /* e */ SyntheticMouseEvent[Element] => Unit): this.type = set("onClear", js.Any.fromFunction1(value))
    
    @scala.inline
    def onConfirm(value: /* e */ SyntheticMouseEvent[Element] => Unit): this.type = set("onConfirm", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: DropdownFooter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DropdownFooterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
