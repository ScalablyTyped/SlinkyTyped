package typingsSlinky.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.mod.Color
import typingsSlinky.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itemDividerMod {
  
  @JSImport("@ionic/core/dist/types/components/item-divider/item-divider", "ItemDivider")
  @js.native
  class ItemDivider () extends ComponentInterface {
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    var el: HTMLElement = js.native
    
    @JSName("render")
    def render_MItemDivider(): js.Any = js.native
    
    /**
      * When it's set to `true`, the item-divider will stay visible when it reaches the top
      * of the viewport until the next `ion-item-divider` replaces it.
      *
      * This feature relies in `position:sticky`:
      * https://caniuse.com/#feat=css-sticky
      */
    var sticky: Boolean = js.native
  }
}
