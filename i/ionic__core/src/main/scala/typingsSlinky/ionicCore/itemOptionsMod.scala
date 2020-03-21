package typingsSlinky.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.mod.Side
import typingsSlinky.ionicCore.stencilCoreMod.ComponentInterface
import typingsSlinky.ionicCore.stencilCoreMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/item-options/item-options", JSImport.Namespace)
@js.native
object itemOptionsMod extends js.Object {
  @js.native
  class ItemOptions () extends ComponentInterface {
    var el: HTMLElement = js.native
    /**
      * Emitted when the item has been fully swiped.
      */
    var ionSwipe: EventEmitter[_] = js.native
    /**
      * The side the option button should be on. Possible values: `"start"` and `"end"`. If you have multiple `ion-item-options`, a side must be provided for each.
      *
      */
    var side: Side = js.native
    /** @internal */
    def fireSwipeEvent(): js.Promise[Unit] = js.native
    @JSName("render")
    def render_MItemOptions(): js.Any = js.native
  }
  
}

