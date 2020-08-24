package typingsSlinky.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/skeleton-text/skeleton-text", JSImport.Namespace)
@js.native
object skeletonTextMod extends js.Object {
  @js.native
  class SkeletonText () extends ComponentInterface {
    /**
      * If `true`, the skeleton text will animate.
      */
    var animated: Boolean = js.native
    var el: HTMLElement = js.native
    @JSName("render")
    def render_MSkeletonText(): js.Any = js.native
  }
  
}

