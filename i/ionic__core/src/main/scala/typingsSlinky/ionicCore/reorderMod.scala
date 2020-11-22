package typingsSlinky.ionicCore

import org.scalajs.dom.raw.Event
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonReorderElement
import typingsSlinky.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/core/dist/types/components/reorder/reorder", JSImport.Namespace)
@js.native
object reorderMod extends js.Object {
  
  @js.native
  class Reorder () extends ComponentInterface {
    
    var el: HTMLIonReorderElement = js.native
    
    def onClick(ev: Event): Unit = js.native
    
    @JSName("render")
    def render_MReorder(): js.Any = js.native
  }
}
