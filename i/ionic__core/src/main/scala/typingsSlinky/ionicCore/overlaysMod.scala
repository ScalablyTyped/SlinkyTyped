package typingsSlinky.ionicCore

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.actionSheetInterfaceMod.ActionSheetOptions
import typingsSlinky.ionicCore.alertInterfaceMod.AlertOptions
import typingsSlinky.ionicCore.animationInterfaceMod.Animation
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonActionSheetElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonAlertElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonLoadingElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonModalElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonPickerElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonPopoverElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonToastElement
import typingsSlinky.ionicCore.ionicCoreStrings._ael
import typingsSlinky.ionicCore.ionicCoreStrings._forceStatusbarPadding
import typingsSlinky.ionicCore.ionicCoreStrings._rel
import typingsSlinky.ionicCore.ionicCoreStrings._testing
import typingsSlinky.ionicCore.ionicCoreStrings._zoneGate
import typingsSlinky.ionicCore.ionicCoreStrings.actionSheetEnter
import typingsSlinky.ionicCore.ionicCoreStrings.actionSheetLeave
import typingsSlinky.ionicCore.ionicCoreStrings.alertEnter
import typingsSlinky.ionicCore.ionicCoreStrings.alertLeave
import typingsSlinky.ionicCore.ionicCoreStrings.animated
import typingsSlinky.ionicCore.ionicCoreStrings.backButtonDefaultHref
import typingsSlinky.ionicCore.ionicCoreStrings.backButtonIcon
import typingsSlinky.ionicCore.ionicCoreStrings.backButtonText
import typingsSlinky.ionicCore.ionicCoreStrings.experimentalTransitionShadow
import typingsSlinky.ionicCore.ionicCoreStrings.hardwareBackButton
import typingsSlinky.ionicCore.ionicCoreStrings.hideCaretOnScroll
import typingsSlinky.ionicCore.ionicCoreStrings.infiniteLoadingSpinner
import typingsSlinky.ionicCore.ionicCoreStrings.inputBlurring
import typingsSlinky.ionicCore.ionicCoreStrings.inputShims
import typingsSlinky.ionicCore.ionicCoreStrings.keyboardHeight
import typingsSlinky.ionicCore.ionicCoreStrings.loadingEnter
import typingsSlinky.ionicCore.ionicCoreStrings.loadingLeave
import typingsSlinky.ionicCore.ionicCoreStrings.loadingSpinner
import typingsSlinky.ionicCore.ionicCoreStrings.menuIcon
import typingsSlinky.ionicCore.ionicCoreStrings.menuType
import typingsSlinky.ionicCore.ionicCoreStrings.modalEnter
import typingsSlinky.ionicCore.ionicCoreStrings.modalLeave
import typingsSlinky.ionicCore.ionicCoreStrings.mode
import typingsSlinky.ionicCore.ionicCoreStrings.navAnimation
import typingsSlinky.ionicCore.ionicCoreStrings.persistConfig
import typingsSlinky.ionicCore.ionicCoreStrings.pickerEnter
import typingsSlinky.ionicCore.ionicCoreStrings.pickerLeave
import typingsSlinky.ionicCore.ionicCoreStrings.popoverEnter
import typingsSlinky.ionicCore.ionicCoreStrings.popoverLeave
import typingsSlinky.ionicCore.ionicCoreStrings.refreshingIcon
import typingsSlinky.ionicCore.ionicCoreStrings.refreshingSpinner
import typingsSlinky.ionicCore.ionicCoreStrings.rippleEffect
import typingsSlinky.ionicCore.ionicCoreStrings.sanitizerEnabled
import typingsSlinky.ionicCore.ionicCoreStrings.scrollAssist
import typingsSlinky.ionicCore.ionicCoreStrings.scrollPadding
import typingsSlinky.ionicCore.ionicCoreStrings.spinner
import typingsSlinky.ionicCore.ionicCoreStrings.statusTap
import typingsSlinky.ionicCore.ionicCoreStrings.swipeBackEnabled
import typingsSlinky.ionicCore.ionicCoreStrings.tabButtonLayout
import typingsSlinky.ionicCore.ionicCoreStrings.toastEnter
import typingsSlinky.ionicCore.ionicCoreStrings.toastLeave
import typingsSlinky.ionicCore.loadingInterfaceMod.LoadingOptions
import typingsSlinky.ionicCore.mod.ComponentRef
import typingsSlinky.ionicCore.modalInterfaceMod.ModalOptions
import typingsSlinky.ionicCore.overlaysInterfaceMod.HTMLIonOverlayElement
import typingsSlinky.ionicCore.overlaysInterfaceMod.OverlayInterface
import typingsSlinky.ionicCore.pickerInterfaceMod.PickerOptions
import typingsSlinky.ionicCore.popoverInterfaceMod.PopoverOptions
import typingsSlinky.ionicCore.toastInterfaceMod.ToastOptions
import typingsSlinky.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlaysMod {
  
  @JSImport("@ionic/core/dist/types/utils/overlays", "BACKDROP")
  @js.native
  val BACKDROP: /* "backdrop" */ String = js.native
  
  object actionSheetController {
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "actionSheetController.create")
    @js.native
    def create(options: ActionSheetOptions): js.Promise[HTMLIonActionSheetElement] = js.native
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "actionSheetController.dismiss")
    @js.native
    def dismiss(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "actionSheetController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "actionSheetController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "actionSheetController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String, id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "actionSheetController.dismiss")
    @js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "actionSheetController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "actionSheetController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "actionSheetController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "actionSheetController.getTop")
    @js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonActionSheetElement]] = js.native
  }
  
  @JSImport("@ionic/core/dist/types/utils/overlays", "activeAnimations")
  @js.native
  val activeAnimations: WeakMap[OverlayInterface, js.Array[Animation]] = js.native
  
  object alertController {
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "alertController.create")
    @js.native
    def create(options: AlertOptions): js.Promise[HTMLIonAlertElement] = js.native
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "alertController.dismiss")
    @js.native
    def dismiss(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "alertController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "alertController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "alertController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String, id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "alertController.dismiss")
    @js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "alertController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "alertController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "alertController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "alertController.getTop")
    @js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonAlertElement]] = js.native
  }
  
  @JSImport("@ionic/core/dist/types/utils/overlays", "connectListeners")
  @js.native
  def connectListeners(doc: Document): Unit = js.native
  
  @JSImport("@ionic/core/dist/types/utils/overlays", "createOverlay")
  @js.native
  def createOverlay[T /* <: HTMLIonOverlayElement */](tagName: String): js.Promise[T] = js.native
  @JSImport("@ionic/core/dist/types/utils/overlays", "createOverlay")
  @js.native
  def createOverlay[T /* <: HTMLIonOverlayElement */](tagName: String, opts: js.Object): js.Promise[T] = js.native
  
  @JSImport("@ionic/core/dist/types/utils/overlays", "dismiss")
  @js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.UndefOr[scala.Nothing],
    role: js.UndefOr[scala.Nothing],
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | sanitizerEnabled | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder
  ): js.Promise[Boolean] = js.native
  @JSImport("@ionic/core/dist/types/utils/overlays", "dismiss")
  @js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.UndefOr[scala.Nothing],
    role: js.UndefOr[scala.Nothing],
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | sanitizerEnabled | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  @JSImport("@ionic/core/dist/types/utils/overlays", "dismiss")
  @js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.UndefOr[scala.Nothing],
    role: String,
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | sanitizerEnabled | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder
  ): js.Promise[Boolean] = js.native
  @JSImport("@ionic/core/dist/types/utils/overlays", "dismiss")
  @js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.UndefOr[scala.Nothing],
    role: String,
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | sanitizerEnabled | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  @JSImport("@ionic/core/dist/types/utils/overlays", "dismiss")
  @js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | sanitizerEnabled | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder
  ): js.Promise[Boolean] = js.native
  @JSImport("@ionic/core/dist/types/utils/overlays", "dismiss")
  @js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | sanitizerEnabled | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  @JSImport("@ionic/core/dist/types/utils/overlays", "dismiss")
  @js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: String,
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | sanitizerEnabled | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder
  ): js.Promise[Boolean] = js.native
  @JSImport("@ionic/core/dist/types/utils/overlays", "dismiss")
  @js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: String,
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | sanitizerEnabled | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  
  @JSImport("@ionic/core/dist/types/utils/overlays", "dismissOverlay")
  @js.native
  def dismissOverlay(doc: Document, data: js.Any, role: js.UndefOr[scala.Nothing], overlayTag: String): js.Promise[Boolean] = js.native
  @JSImport("@ionic/core/dist/types/utils/overlays", "dismissOverlay")
  @js.native
  def dismissOverlay(doc: Document, data: js.Any, role: js.UndefOr[scala.Nothing], overlayTag: String, id: String): js.Promise[Boolean] = js.native
  @JSImport("@ionic/core/dist/types/utils/overlays", "dismissOverlay")
  @js.native
  def dismissOverlay(doc: Document, data: js.Any, role: String, overlayTag: String): js.Promise[Boolean] = js.native
  @JSImport("@ionic/core/dist/types/utils/overlays", "dismissOverlay")
  @js.native
  def dismissOverlay(doc: Document, data: js.Any, role: String, overlayTag: String, id: String): js.Promise[Boolean] = js.native
  
  @JSImport("@ionic/core/dist/types/utils/overlays", "eventMethod")
  @js.native
  def eventMethod[T](element: HTMLElement, eventName: String): js.Promise[T] = js.native
  
  @JSImport("@ionic/core/dist/types/utils/overlays", "getOverlay")
  @js.native
  def getOverlay(doc: Document): js.UndefOr[HTMLIonOverlayElement] = js.native
  @JSImport("@ionic/core/dist/types/utils/overlays", "getOverlay")
  @js.native
  def getOverlay(doc: Document, overlayTag: js.UndefOr[scala.Nothing], id: String): js.UndefOr[HTMLIonOverlayElement] = js.native
  @JSImport("@ionic/core/dist/types/utils/overlays", "getOverlay")
  @js.native
  def getOverlay(doc: Document, overlayTag: String): js.UndefOr[HTMLIonOverlayElement] = js.native
  @JSImport("@ionic/core/dist/types/utils/overlays", "getOverlay")
  @js.native
  def getOverlay(doc: Document, overlayTag: String, id: String): js.UndefOr[HTMLIonOverlayElement] = js.native
  
  @JSImport("@ionic/core/dist/types/utils/overlays", "getOverlays")
  @js.native
  def getOverlays(doc: Document): js.Array[HTMLIonOverlayElement] = js.native
  @JSImport("@ionic/core/dist/types/utils/overlays", "getOverlays")
  @js.native
  def getOverlays(doc: Document, selector: String): js.Array[HTMLIonOverlayElement] = js.native
  
  @JSImport("@ionic/core/dist/types/utils/overlays", "isCancel")
  @js.native
  def isCancel(): Boolean = js.native
  @JSImport("@ionic/core/dist/types/utils/overlays", "isCancel")
  @js.native
  def isCancel(role: String): Boolean = js.native
  
  object loadingController {
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "loadingController.create")
    @js.native
    def create(options: LoadingOptions): js.Promise[HTMLIonLoadingElement] = js.native
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "loadingController.dismiss")
    @js.native
    def dismiss(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "loadingController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "loadingController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "loadingController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String, id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "loadingController.dismiss")
    @js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "loadingController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "loadingController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "loadingController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "loadingController.getTop")
    @js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonLoadingElement]] = js.native
  }
  
  object modalController {
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "modalController.create")
    @js.native
    def create(options: ModalOptions[ComponentRef]): js.Promise[HTMLIonModalElement] = js.native
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "modalController.dismiss")
    @js.native
    def dismiss(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "modalController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "modalController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "modalController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String, id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "modalController.dismiss")
    @js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "modalController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "modalController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "modalController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "modalController.getTop")
    @js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonModalElement]] = js.native
  }
  
  @JSImport("@ionic/core/dist/types/utils/overlays", "onceEvent")
  @js.native
  def onceEvent(element: HTMLElement, eventName: String, callback: js.Function1[/* ev */ Event, Unit]): Unit = js.native
  
  object pickerController {
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "pickerController.create")
    @js.native
    def create(options: PickerOptions): js.Promise[HTMLIonPickerElement] = js.native
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "pickerController.dismiss")
    @js.native
    def dismiss(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "pickerController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "pickerController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "pickerController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String, id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "pickerController.dismiss")
    @js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "pickerController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "pickerController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "pickerController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "pickerController.getTop")
    @js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonPickerElement]] = js.native
  }
  
  object popoverController {
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "popoverController.create")
    @js.native
    def create(options: PopoverOptions[ComponentRef]): js.Promise[HTMLIonPopoverElement] = js.native
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "popoverController.dismiss")
    @js.native
    def dismiss(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "popoverController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "popoverController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "popoverController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String, id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "popoverController.dismiss")
    @js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "popoverController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "popoverController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "popoverController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "popoverController.getTop")
    @js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonPopoverElement]] = js.native
  }
  
  @JSImport("@ionic/core/dist/types/utils/overlays", "prepareOverlay")
  @js.native
  def prepareOverlay[T /* <: HTMLIonOverlayElement */](el: T): Unit = js.native
  
  @JSImport("@ionic/core/dist/types/utils/overlays", "present")
  @js.native
  def present(
    overlay: OverlayInterface,
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | sanitizerEnabled | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel,
    iosEnterAnimation: AnimationBuilder,
    mdEnterAnimation: AnimationBuilder
  ): js.Promise[Unit] = js.native
  @JSImport("@ionic/core/dist/types/utils/overlays", "present")
  @js.native
  def present(
    overlay: OverlayInterface,
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | sanitizerEnabled | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel,
    iosEnterAnimation: AnimationBuilder,
    mdEnterAnimation: AnimationBuilder,
    opts: js.Any
  ): js.Promise[Unit] = js.native
  
  @JSImport("@ionic/core/dist/types/utils/overlays", "safeCall")
  @js.native
  def safeCall(handler: js.Any): js.Any = js.native
  @JSImport("@ionic/core/dist/types/utils/overlays", "safeCall")
  @js.native
  def safeCall(handler: js.Any, arg: js.Any): js.Any = js.native
  
  object toastController {
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "toastController.create")
    @js.native
    def create(options: ToastOptions): js.Promise[HTMLIonToastElement] = js.native
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "toastController.dismiss")
    @js.native
    def dismiss(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "toastController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "toastController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "toastController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String, id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "toastController.dismiss")
    @js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "toastController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "toastController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/overlays", "toastController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "toastController.getTop")
    @js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonToastElement]] = js.native
  }
}
