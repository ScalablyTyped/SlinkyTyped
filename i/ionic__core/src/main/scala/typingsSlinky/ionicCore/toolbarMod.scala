package typingsSlinky.ionicCore

import org.scalajs.dom.raw.CustomEvent
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonToolbarElement
import typingsSlinky.ionicCore.mod.Color
import typingsSlinky.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolbarMod {
  
  @JSImport("@ionic/core/dist/types/components/toolbar/toolbar", "Toolbar")
  @js.native
  class Toolbar () extends ComponentInterface {
    
    def childrenStyle(ev: CustomEvent): Unit = js.native
    
    var childrenStyles: js.Any = js.native
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MToolbar(): Unit = js.native
    
    var el: HTMLIonToolbarElement = js.native
    
    @JSName("render")
    def render_MToolbar(): js.Any = js.native
  }
}
