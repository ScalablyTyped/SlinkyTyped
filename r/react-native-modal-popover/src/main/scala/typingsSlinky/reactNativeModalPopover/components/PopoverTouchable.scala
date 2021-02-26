package typingsSlinky.reactNativeModalPopover.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeModalPopover.popoverTouchableMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PopoverTouchable {
  
  @JSImport("react-native-modal-popover", "PopoverTouchable")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeModalPopover.mod.PopoverTouchable] {
    
    @scala.inline
    def onPopoverDisplayed(value: () => _): this.type = set("onPopoverDisplayed", js.Any.fromFunction0(value))
  }
  
  implicit def make(companion: PopoverTouchable.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
