package typingsSlinky.ionicCore

import typingsSlinky.ionicCore.componentsMod.global.HTMLIonToastElement
import typingsSlinky.ionicCore.ionicCoreStrings.bottom
import typingsSlinky.ionicCore.ionicCoreStrings.end
import typingsSlinky.ionicCore.ionicCoreStrings.middle
import typingsSlinky.ionicCore.ionicCoreStrings.start
import typingsSlinky.ionicCore.ionicCoreStrings.top
import typingsSlinky.ionicCore.mod.Color
import typingsSlinky.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typingsSlinky.ionicCore.overlaysInterfaceMod.OverlayInterface
import typingsSlinky.ionicCore.sanitizationMod.IonicSafeString
import typingsSlinky.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typingsSlinky.ionicCore.toastInterfaceMod.ToastButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastMod {
  
  @JSImport("@ionic/core/dist/types/components/toast/toast", "Toast")
  @js.native
  class Toast ()
    extends ComponentInterface
       with OverlayInterface {
    
    var buttonClick: js.Any = js.native
    
    /**
      * An array of buttons for the toast.
      */
    var buttons: js.UndefOr[js.Array[ToastButton | String]] = js.native
    
    var callButtonHandler: js.Any = js.native
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MToast(): Unit = js.native
    
    /**
      * Additional classes to apply for custom CSS. If multiple classes are
      * provided they should be separated by spaces.
      */
    var cssClass: js.UndefOr[String | js.Array[String]] = js.native
    
    var dispatchCancelHandler: js.Any = js.native
    
    /**
      * How many milliseconds to wait before hiding the toast. By default, it will show
      * until `dismiss()` is called.
      */
    var duration: Double = js.native
    
    var durationTimeout: js.Any = js.native
    
    @JSName("el")
    var el_Toast: HTMLIonToastElement = js.native
    
    var getButtons: js.Any = js.native
    
    /**
      * Header to be shown in the toast.
      */
    var header: js.UndefOr[String] = js.native
    
    /**
      * Message to be shown in the toast.
      */
    var message: js.UndefOr[String | IonicSafeString] = js.native
    
    /**
      * Returns a promise that resolves when the toast did dismiss.
      */
    def onDidDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
    
    /**
      * Returns a promise that resolves when the toast will dismiss.
      */
    def onWillDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
    
    /**
      * The position of the toast on the screen.
      */
    var position: top | bottom | middle = js.native
    
    @JSName("renderButtons")
    def renderButtons_end(buttons: js.Array[ToastButton], side: end): js.Any = js.native
    @JSName("renderButtons")
    def renderButtons_start(buttons: js.Array[ToastButton], side: start): js.Any = js.native
    
    @JSName("render")
    def render_MToast(): js.Any = js.native
    
    /**
      * If `true`, the toast will be translucent.
      * Only applies when the mode is `"ios"` and the device supports
      * [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
      */
    var translucent: Boolean = js.native
  }
}
