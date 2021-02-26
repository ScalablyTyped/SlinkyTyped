package typingsSlinky.baseui.components

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import slinky.web.html.button.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.anon.Size
import typingsSlinky.baseui.snackbarMod.SnackbarElementOverridesT
import typingsSlinky.baseui.snackbarMod.SnackbarElementPropsT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SnackbarElement {
  
  @scala.inline
  def apply(message: String): Builder = {
    val __props = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SnackbarElementPropsT]))
  }
  
  @JSImport("baseui/snackbar", "SnackbarElement")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def actionMessage(value: String): this.type = set("actionMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def actionOnClick(value: /* event */ SyntheticMouseEvent[HTMLButtonElement] => _): this.type = set("actionOnClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def focus(value: Boolean): this.type = set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overrides(value: SnackbarElementOverridesT): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def progress(value: Boolean): this.type = set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def startEnhancer(value: ReactComponentClass[Size]): this.type = set("startEnhancer", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SnackbarElementPropsT): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
