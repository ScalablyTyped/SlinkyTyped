package typingsSlinky.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.animationInterfaceMod.Animation
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonModalElement
import typingsSlinky.ionicCore.mod.ComponentProps
import typingsSlinky.ionicCore.mod.ComponentRef
import typingsSlinky.ionicCore.mod.FrameworkDelegate
import typingsSlinky.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typingsSlinky.ionicCore.overlaysInterfaceMod.OverlayInterface
import typingsSlinky.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/modal/modal", JSImport.Namespace)
@js.native
object modalMod extends js.Object {
  @js.native
  class Modal ()
    extends ComponentInterface
       with OverlayInterface {
    var animation: js.UndefOr[Animation] = js.native
    /**
      * If `true`, the modal will be dismissed when the backdrop is clicked.
      */
    var backdropDismiss: Boolean = js.native
    /**
      * The component to display inside of the modal.
      */
    var component: ComponentRef = js.native
    /**
      * The data to pass to the modal component.
      */
    var componentProps: js.UndefOr[ComponentProps[Null]] = js.native
    /**
      * Additional classes to apply for custom CSS. If multiple classes are
      * provided they should be separated by spaces.
      */
    var cssClass: js.UndefOr[String | js.Array[String]] = js.native
    /** @internal */
    var delegate: js.UndefOr[FrameworkDelegate] = js.native
    @JSName("el")
    var el_Modal: HTMLIonModalElement = js.native
    var gesture: js.Any = js.native
    var gestureAnimationDismissing: js.Any = js.native
    var initSwipeToClose: js.Any = js.native
    var lastFocus: js.UndefOr[HTMLElement] = js.native
    var onBackdropTap: js.Any = js.native
    var onDismiss: js.Any = js.native
    var onLifecycle: js.Any = js.native
    /**
      * The element that presented the modal. This is used for card presentation effects
      * and for stacking multiple modals on top of each other. Only applies in iOS mode.
      */
    var presentingElement: js.UndefOr[HTMLElement] = js.native
    /**
      * If `true`, a backdrop will be displayed behind the modal.
      */
    var showBackdrop: Boolean = js.native
    /**
      * If `true`, the modal can be swiped to dismiss. Only applies in iOS mode.
      */
    var swipeToClose: Boolean = js.native
    var usersElement: js.Any = js.native
    @JSName("connectedCallback")
    def connectedCallback_MModal(): Unit = js.native
    /**
      * Returns a promise that resolves when the modal did dismiss.
      */
    def onDidDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
    /**
      * Returns a promise that resolves when the modal will dismiss.
      */
    def onWillDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
    @JSName("render")
    def render_MModal(): js.Any = js.native
    def swipeToCloseChanged(enable: Boolean): Unit = js.native
  }
  
}

