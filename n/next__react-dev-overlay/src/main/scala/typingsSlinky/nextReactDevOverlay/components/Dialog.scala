package typingsSlinky.nextReactDevOverlay.components

import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.nextReactDevOverlay.dialogDialogMod.DialogProps
import typingsSlinky.nextReactDevOverlay.nextReactDevOverlayStrings.error
import typingsSlinky.nextReactDevOverlay.nextReactDevOverlayStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Dialog {
  @JSImport("@next/react-dev-overlay/lib/internal/components/Dialog", "Dialog")
  @js.native
  object component extends js.Object
  
  def withProps(p: DialogProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    `aria-describedby`: String,
    `aria-labelledby`: String,
    onClose: MouseEvent | TouchEvent => Unit,
    `type`: error | warning
  ): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(onClose = js.Any.fromFunction1(onClose))
    __props.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    __props.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[DialogProps]))
  }
}

