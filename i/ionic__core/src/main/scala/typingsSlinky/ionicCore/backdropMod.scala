package typingsSlinky.ionicCore

import org.scalajs.dom.raw.TouchEvent
import typingsSlinky.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typingsSlinky.ionicCore.stencilPublicRuntimeMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backdropMod {
  
  @JSImport("@ionic/core/dist/types/components/backdrop/backdrop", "Backdrop")
  @js.native
  class Backdrop () extends ComponentInterface {
    
    var blocker: js.Any = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MBackdrop(): Unit = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MBackdrop(): Unit = js.native
    
    var emitTap: js.Any = js.native
    
    /**
      * Emitted when the backdrop is tapped.
      */
    var ionBackdropTap: EventEmitter[Unit] = js.native
    
    /* protected */ def onMouseDown(ev: TouchEvent): Unit = js.native
    
    @JSName("render")
    def render_MBackdrop(): js.Any = js.native
    
    /**
      * If `true`, the backdrop will stop propagation on tap.
      */
    var stopPropagation: Boolean = js.native
    
    /**
      * If `true`, the backdrop will can be clicked and will emit the `ionBackdropTap` event.
      */
    var tappable: Boolean = js.native
    
    /**
      * If `true`, the backdrop will be visible.
      */
    var visible: Boolean = js.native
  }
}
