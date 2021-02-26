package typingsSlinky.materialUiCore.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUiCore.clickAwayListenerClickAwayListenerMod.ClickAwayListenerProps
import typingsSlinky.materialUiCore.materialUiCoreBooleans.`false`
import typingsSlinky.materialUiCore.materialUiCoreStrings.onClick
import typingsSlinky.materialUiCore.materialUiCoreStrings.onMouseDown
import typingsSlinky.materialUiCore.materialUiCoreStrings.onMouseUp
import typingsSlinky.materialUiCore.materialUiCoreStrings.onTouchEnd
import typingsSlinky.materialUiCore.materialUiCoreStrings.onTouchStart
import typingsSlinky.react.mod.ChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClickAwayListener {
  
  @scala.inline
  def apply(onClickAway: ChangeEvent[js.Object] => Unit): Builder = {
    val __props = js.Dynamic.literal(onClickAway = js.Any.fromFunction1(onClickAway))
    new Builder(js.Array(this.component, __props.asInstanceOf[ClickAwayListenerProps]))
  }
  
  @JSImport("@material-ui/core", "ClickAwayListener")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def mouseEvent(value: onClick | onMouseDown | onMouseUp | `false`): this.type = set("mouseEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def touchEvent(value: onTouchStart | onTouchEnd | `false`): this.type = set("touchEvent", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ClickAwayListenerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
