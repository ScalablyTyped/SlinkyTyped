package typingsSlinky.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectOptionMod {
  
  @JSImport("@ionic/core/dist/types/components/select-option/select-option", "SelectOption")
  @js.native
  class SelectOption () extends ComponentInterface {
    
    /**
      * If `true`, the user cannot interact with the select option. This property does not apply when `interface="action-sheet"` as `ion-action-sheet` does not allow for disabled buttons.
      */
    var disabled: Boolean = js.native
    
    var el: HTMLElement = js.native
    
    var inputId: js.Any = js.native
    
    @JSName("render")
    def render_MSelectOption(): js.Any = js.native
    
    /**
      * The text value of the option.
      */
    var value: js.UndefOr[js.Any | Null] = js.native
  }
}
