package typingsSlinky.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.ionicCoreStrings.large
import typingsSlinky.ionicCore.ionicCoreStrings.small
import typingsSlinky.ionicCore.mod.Color
import typingsSlinky.ionicCore.mod.StyleEventDetail
import typingsSlinky.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typingsSlinky.ionicCore.stencilPublicRuntimeMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object titleMod {
  
  @JSImport("@ionic/core/dist/types/components/title/title", "ToolbarTitle")
  @js.native
  class ToolbarTitle () extends ComponentInterface {
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MToolbarTitle(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    var emitStyle: js.Any = js.native
    
    var getSize: js.Any = js.native
    
    /**
      * Emitted when the styles change.
      * @internal
      */
    var ionStyle: EventEmitter[StyleEventDetail] = js.native
    
    @JSName("render")
    def render_MToolbarTitle(): js.Any = js.native
    
    /**
      * The size of the toolbar title.
      */
    var size: js.UndefOr[large | small] = js.native
    
    /* protected */ def sizeChanged(): Unit = js.native
  }
}
