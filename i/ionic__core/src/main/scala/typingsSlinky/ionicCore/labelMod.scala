package typingsSlinky.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.ionicCoreStrings.fixed
import typingsSlinky.ionicCore.ionicCoreStrings.floating
import typingsSlinky.ionicCore.ionicCoreStrings.stacked
import typingsSlinky.ionicCore.mod.Color
import typingsSlinky.ionicCore.mod.StyleEventDetail
import typingsSlinky.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typingsSlinky.ionicCore.stencilPublicRuntimeMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/core/dist/types/components/label/label", JSImport.Namespace)
@js.native
object labelMod extends js.Object {
  
  @js.native
  class Label () extends ComponentInterface {
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    def colorChanged(): Unit = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MLabel(): Unit = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MLabel(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    var emitColor: js.Any = js.native
    
    var emitStyle: js.Any = js.native
    
    var inRange: js.Any = js.native
    
    /**
      * Emitted when the color changes.
      * @internal
      */
    var ionColor: EventEmitter[StyleEventDetail] = js.native
    
    /**
      * Emitted when the styles change.
      * @internal
      */
    var ionStyle: EventEmitter[StyleEventDetail] = js.native
    
    var noAnimate: Boolean = js.native
    
    /**
      * The position determines where and how the label behaves inside an item.
      */
    var position: js.UndefOr[fixed | stacked | floating] = js.native
    
    def positionChanged(): Unit = js.native
    
    @JSName("render")
    def render_MLabel(): js.Any = js.native
  }
}
