package typingsSlinky.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/app/app", JSImport.Namespace)
@js.native
object appMod extends js.Object {
  @js.native
  class App () extends ComponentInterface {
    var el: HTMLElement = js.native
    @JSName("componentDidLoad")
    def componentDidLoad_MApp(): Unit = js.native
    @JSName("render")
    def render_MApp(): js.Any = js.native
  }
  
}

