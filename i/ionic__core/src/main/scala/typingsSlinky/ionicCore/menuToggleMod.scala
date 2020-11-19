package typingsSlinky.ionicCore

import typingsSlinky.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/core/dist/types/components/menu-toggle/menu-toggle", JSImport.Namespace)
@js.native
object menuToggleMod extends js.Object {
  
  @js.native
  class MenuToggle () extends ComponentInterface {
    
    /**
      * Automatically hides the content when the corresponding menu is not active.
      *
      * By default, it's `true`. Change it to `false` in order to
      * keep `ion-menu-toggle` always visible regardless the state of the menu.
      */
    var autoHide: Boolean = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MMenuToggle(): Unit = js.native
    
    /**
      * Optional property that maps to a Menu's `menuId` prop.
      * Can also be `start` or `end` for the menu side.
      * This is used to find the correct menu to toggle.
      *
      * If this property is not used, `ion-menu-toggle` will toggle the
      * first menu that is active.
      */
    var menu: js.UndefOr[String] = js.native
    
    var onClick: js.Any = js.native
    
    @JSName("render")
    def render_MMenuToggle(): js.Any = js.native
    
    def visibilityChanged(): js.Promise[Unit] = js.native
    
    var visible: Boolean = js.native
  }
}
