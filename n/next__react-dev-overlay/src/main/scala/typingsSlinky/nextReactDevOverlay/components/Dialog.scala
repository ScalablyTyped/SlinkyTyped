package typingsSlinky.nextReactDevOverlay.components

import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nextReactDevOverlay.dialogDialogMod.DialogProps
import typingsSlinky.nextReactDevOverlay.nextReactDevOverlayStrings.error
import typingsSlinky.nextReactDevOverlay.nextReactDevOverlayStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dialog {
  
  @JSImport("@next/react-dev-overlay/lib/internal/components/Dialog", "Dialog")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def onClose(value: /* e */ MouseEvent | TouchEvent => Unit): this.type = set("onClose", js.Any.fromFunction1(value))
  }
  
  def withProps(p: DialogProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(`aria-describedby`: String, `aria-labelledby`: String, `type`: error | warning): Builder = {
    val __props = js.Dynamic.literal()
    __props.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    __props.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DialogProps]))
  }
}
