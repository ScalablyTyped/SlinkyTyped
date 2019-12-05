package typingsSlinky.atMaterialIconDashButton

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atMaterialBase.componentMod.MDCComponent
import typingsSlinky.atMaterialBase.foundationMod.default
import typingsSlinky.atMaterialIconDashButton.componentMod.MDCIconButtonToggle
import typingsSlinky.atMaterialIconDashButton.foundationMod.MDCIconButtonToggleFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/icon-button/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  @js.native
  class MDCIconButtonToggle () extends MDCComponent[MDCIconButtonToggleFoundation, default[MDCIconButtonToggleFoundation]] {
    var on: Boolean = js.native
    val ripple: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MDCRipple */ js.Any = js.native
    var root_ : HTMLElement = js.native
  }
  
  /* static members */
  @js.native
  object MDCIconButtonToggle extends js.Object {
    def attachTo(root: HTMLElement): MDCIconButtonToggle = js.native
  }
  
}

