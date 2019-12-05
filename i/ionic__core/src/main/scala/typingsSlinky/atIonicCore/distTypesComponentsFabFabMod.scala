package typingsSlinky.atIonicCore

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atIonicCore.atIonicCoreStrings.bottom
import typingsSlinky.atIonicCore.atIonicCoreStrings.center
import typingsSlinky.atIonicCore.atIonicCoreStrings.end
import typingsSlinky.atIonicCore.atIonicCoreStrings.start
import typingsSlinky.atIonicCore.atIonicCoreStrings.top
import typingsSlinky.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/fab/fab", JSImport.Namespace)
@js.native
object distTypesComponentsFabFabMod extends js.Object {
  @js.native
  class Fab () extends ComponentInterface {
    /**
      * If `true`, both the `ion-fab-button` and all `ion-fab-list` inside `ion-fab` will become active.
      * That means `ion-fab-button` will become a `close` icon and `ion-fab-list` will become visible.
      */
    var activated: Boolean = js.native
    /**
      * If `true`, the fab will display on the edge of the header if
      * `vertical` is `"top"`, and on the edge of the footer if
      * it is `"bottom"`. Should be used with a `fixed` slot.
      */
    var edge: Boolean = js.native
    var el: HTMLElement = js.native
    var getFab: js.Any = js.native
    /**
      * Where to align the fab horizontally in the viewport.
      */
    var horizontal: js.UndefOr[start | end | center] = js.native
    var onClick: js.Any = js.native
    /**
      * Where to align the fab vertically in the viewport.
      */
    var vertical: js.UndefOr[top | bottom | center] = js.native
    def activatedChanged(): Unit = js.native
    /**
      * Close an active FAB list container.
      */
    def close(): js.Promise[Unit] = js.native
    @JSName("componentDidLoad")
    def componentDidLoad_MFab(): Unit = js.native
    @JSName("render")
    def render_MFab(): js.Any = js.native
  }
  
}

