package typingsSlinky.ionicCore

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.actionSheetInterfaceMod.ActionSheetOptions
import typingsSlinky.ionicCore.alertInterfaceMod.AlertOptions
import typingsSlinky.ionicCore.animationInterfaceMod.Animation
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonActionSheetElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonAlertElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonLoadingElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonModalElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonPickerElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonPopoverElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonToastElement
import typingsSlinky.ionicCore.ionicCoreStrings._forceStatusbarPadding
import typingsSlinky.ionicCore.ionicCoreStrings._testing
import typingsSlinky.ionicCore.ionicCoreStrings._zoneGate
import typingsSlinky.ionicCore.ionicCoreStrings.actionSheetEnter
import typingsSlinky.ionicCore.ionicCoreStrings.actionSheetLeave
import typingsSlinky.ionicCore.ionicCoreStrings.alertEnter
import typingsSlinky.ionicCore.ionicCoreStrings.alertLeave
import typingsSlinky.ionicCore.ionicCoreStrings.animated
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
import typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.overlaysInterfaceMod.HTMLIonOverlayElement
import typingsSlinky.ionicCore.overlaysInterfaceMod.OverlayInterface
import typingsSlinky.ionicCore.pickerInterfaceMod.PickerOptions
import typingsSlinky.ionicCore.popoverInterfaceMod.PopoverOptions
import typingsSlinky.ionicCore.toastInterfaceMod.ToastOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/overlays", JSImport.Namespace)
@js.native
object overlaysMod extends js.Object {
  val BACKDROP: /* "backdrop" */ String = js.native
  def connectListeners(doc: Document): Unit = js.native
  def createOverlay[T /* <: HTMLIonOverlayElement */](tagName: String): js.Promise[T] = js.native
  def createOverlay[T /* <: HTMLIonOverlayElement */](tagName: String, opts: js.Object): js.Promise[T] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: js.UndefOr[String],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: js.UndefOr[String],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: js.UndefOr[String],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: IonicAnimationInterface
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: js.UndefOr[String],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: IonicAnimationInterface,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: js.UndefOr[String],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: IonicAnimationInterface,
    mdLeaveAnimation: AnimationBuilder
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: js.UndefOr[String],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: IonicAnimationInterface,
    mdLeaveAnimation: AnimationBuilder,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: js.UndefOr[String],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: IonicAnimationInterface,
    mdLeaveAnimation: IonicAnimationInterface
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: js.UndefOr[String],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: IonicAnimationInterface,
    mdLeaveAnimation: IonicAnimationInterface,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismissOverlay(doc: Document, data: js.Any, role: js.UndefOr[String], overlayTag: String): js.Promise[Boolean] = js.native
  def dismissOverlay(doc: Document, data: js.Any, role: js.UndefOr[String], overlayTag: String, id: String): js.Promise[Boolean] = js.native
  def eventMethod[T](element: HTMLElement, eventName: String): js.Promise[T] = js.native
  def getOverlay(doc: Document): js.UndefOr[HTMLIonOverlayElement] = js.native
  def getOverlay(doc: Document, overlayTag: String): js.UndefOr[HTMLIonOverlayElement] = js.native
  def getOverlay(doc: Document, overlayTag: String, id: String): js.UndefOr[HTMLIonOverlayElement] = js.native
  def getOverlays(doc: Document): js.Array[HTMLIonOverlayElement] = js.native
  def getOverlays(doc: Document, selector: String): js.Array[HTMLIonOverlayElement] = js.native
  def isCancel(): Boolean = js.native
  def isCancel(role: String): Boolean = js.native
  def onceEvent(element: HTMLElement, eventName: String, callback: js.Function1[/* ev */ Event, Unit]): Unit = js.native
  def prepareOverlay[T /* <: HTMLIonOverlayElement */](el: T): Unit = js.native
  def present(
    overlay: OverlayInterface,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosEnterAnimation: AnimationBuilder,
    mdEnterAnimation: AnimationBuilder
  ): js.Promise[Unit] = js.native
  def present(
    overlay: OverlayInterface,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosEnterAnimation: AnimationBuilder,
    mdEnterAnimation: AnimationBuilder,
    opts: js.Any
  ): js.Promise[Unit] = js.native
  def present(
    overlay: OverlayInterface,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosEnterAnimation: AnimationBuilder,
    mdEnterAnimation: IonicAnimationInterface
  ): js.Promise[Unit] = js.native
  def present(
    overlay: OverlayInterface,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosEnterAnimation: AnimationBuilder,
    mdEnterAnimation: IonicAnimationInterface,
    opts: js.Any
  ): js.Promise[Unit] = js.native
  def present(
    overlay: OverlayInterface,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosEnterAnimation: IonicAnimationInterface,
    mdEnterAnimation: AnimationBuilder
  ): js.Promise[Unit] = js.native
  def present(
    overlay: OverlayInterface,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosEnterAnimation: IonicAnimationInterface,
    mdEnterAnimation: AnimationBuilder,
    opts: js.Any
  ): js.Promise[Unit] = js.native
  def present(
    overlay: OverlayInterface,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosEnterAnimation: IonicAnimationInterface,
    mdEnterAnimation: IonicAnimationInterface
  ): js.Promise[Unit] = js.native
  def present(
    overlay: OverlayInterface,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosEnterAnimation: IonicAnimationInterface,
    mdEnterAnimation: IonicAnimationInterface,
    opts: js.Any
  ): js.Promise[Unit] = js.native
  def safeCall(handler: js.Any): js.Any = js.native
  def safeCall(handler: js.Any, arg: js.Any): js.Any = js.native
  @js.native
  object actionSheetController extends js.Object {
    def create(options: ActionSheetOptions): js.Promise[HTMLIonActionSheetElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonActionSheetElement]] = js.native
  }
  
  @js.native
  object alertController extends js.Object {
    def create(options: AlertOptions): js.Promise[HTMLIonAlertElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonAlertElement]] = js.native
  }
  
  @js.native
  object loadingController extends js.Object {
    def create(options: LoadingOptions): js.Promise[HTMLIonLoadingElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonLoadingElement]] = js.native
  }
  
  @js.native
  object modalController extends js.Object {
    def create(options: ModalOptions[ComponentRef]): js.Promise[HTMLIonModalElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonModalElement]] = js.native
  }
  
  @js.native
  object pickerController extends js.Object {
    def create(options: PickerOptions): js.Promise[HTMLIonPickerElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonPickerElement]] = js.native
  }
  
  @js.native
  object popoverController extends js.Object {
    def create(options: PopoverOptions[ComponentRef]): js.Promise[HTMLIonPopoverElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonPopoverElement]] = js.native
  }
  
  @js.native
  object toastController extends js.Object {
    def create(options: ToastOptions): js.Promise[HTMLIonToastElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonToastElement]] = js.native
  }
  
  type IonicAnimationInterface = js.Function2[/* baseEl */ js.Any, /* opts */ js.Any, Animation]
}

