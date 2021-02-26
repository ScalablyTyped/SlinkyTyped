package typingsSlinky.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.elementInterfaceMod.AnchorInterface
import typingsSlinky.ionicCore.elementInterfaceMod.ButtonInterface
import typingsSlinky.ionicCore.mod.Color
import typingsSlinky.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itemOptionMod {
  
  @JSImport("@ionic/core/dist/types/components/item-option/item-option", "ItemOption")
  @js.native
  class ItemOption ()
    extends ComponentInterface
       with AnchorInterface
       with ButtonInterface {
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    var el: HTMLElement = js.native
    
    /**
      * If `true`, the option will expand to take up the available width and cover any other options.
      */
    var expandable: Boolean = js.native
    
    var onClick: js.Any = js.native
    
    @JSName("render")
    def render_MItemOption(): js.Any = js.native
  }
}
