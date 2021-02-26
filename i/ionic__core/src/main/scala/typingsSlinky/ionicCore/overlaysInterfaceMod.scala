package typingsSlinky.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.interfaceMod.HTMLStencilElement
import typingsSlinky.ionicCore.stencilPublicRuntimeMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlaysInterfaceMod {
  
  @js.native
  trait HTMLIonOverlayElement extends HTMLStencilElement {
    
    var backdropDismiss: js.UndefOr[Boolean] = js.native
    
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    
    var lastFocus: js.UndefOr[HTMLElement] = js.native
    
    var overlayIndex: Double = js.native
  }
  
  @js.native
  trait OverlayController extends StObject {
    
    def create(): js.Promise[HTMLElement] = js.native
    def create(opts: js.Any): js.Promise[HTMLElement] = js.native
    
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String, id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    
    def getTop(): js.Promise[js.UndefOr[HTMLIonOverlayElement]] = js.native
  }
  
  @js.native
  trait OverlayEventDetail[T] extends StObject {
    
    var data: js.UndefOr[T] = js.native
    
    var role: js.UndefOr[String] = js.native
  }
  object OverlayEventDetail {
    
    @scala.inline
    def apply[T](): OverlayEventDetail[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverlayEventDetail[T]]
    }
    
    @scala.inline
    implicit class OverlayEventDetailMutableBuilder[Self <: OverlayEventDetail[_], T] (val x: Self with OverlayEventDetail[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
  
  @js.native
  trait OverlayInterface extends StObject {
    
    var animated: Boolean = js.native
    
    var didDismiss: EventEmitter[OverlayEventDetail[_]] = js.native
    
    var didPresent: EventEmitter[Unit] = js.native
    
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    
    var el: HTMLElement = js.native
    
    var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
    
    var keyboardClose: Boolean = js.native
    
    var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
    
    var overlayIndex: Double = js.native
    
    def present(): js.Promise[Unit] = js.native
    
    var presented: Boolean = js.native
    
    var willDismiss: EventEmitter[OverlayEventDetail[_]] = js.native
    
    var willPresent: EventEmitter[Unit] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ionicCore.componentsMod.global.HTMLIonActionSheetElement
    - typingsSlinky.ionicCore.componentsMod.global.HTMLIonAlertElement
    - typingsSlinky.ionicCore.componentsMod.global.HTMLIonPopoverElement
  */
  trait OverlaySelect extends StObject
}
