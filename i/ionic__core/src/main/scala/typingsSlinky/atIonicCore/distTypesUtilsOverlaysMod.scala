package typingsSlinky.atIonicCore

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atIonicCore.atIonicCoreMod.ComponentRef
import typingsSlinky.atIonicCore.atIonicCoreStrings._forceStatusbarPadding
import typingsSlinky.atIonicCore.atIonicCoreStrings._testing
import typingsSlinky.atIonicCore.atIonicCoreStrings._zoneGate
import typingsSlinky.atIonicCore.atIonicCoreStrings.actionSheetEnter
import typingsSlinky.atIonicCore.atIonicCoreStrings.actionSheetLeave
import typingsSlinky.atIonicCore.atIonicCoreStrings.alertEnter
import typingsSlinky.atIonicCore.atIonicCoreStrings.alertLeave
import typingsSlinky.atIonicCore.atIonicCoreStrings.animated
import typingsSlinky.atIonicCore.atIonicCoreStrings.backButtonIcon
import typingsSlinky.atIonicCore.atIonicCoreStrings.backButtonText
import typingsSlinky.atIonicCore.atIonicCoreStrings.backdrop
import typingsSlinky.atIonicCore.atIonicCoreStrings.experimentalTransitionShadow
import typingsSlinky.atIonicCore.atIonicCoreStrings.hardwareBackButton
import typingsSlinky.atIonicCore.atIonicCoreStrings.hideCaretOnScroll
import typingsSlinky.atIonicCore.atIonicCoreStrings.infiniteLoadingSpinner
import typingsSlinky.atIonicCore.atIonicCoreStrings.inputBlurring
import typingsSlinky.atIonicCore.atIonicCoreStrings.inputShims
import typingsSlinky.atIonicCore.atIonicCoreStrings.keyboardHeight
import typingsSlinky.atIonicCore.atIonicCoreStrings.loadingEnter
import typingsSlinky.atIonicCore.atIonicCoreStrings.loadingLeave
import typingsSlinky.atIonicCore.atIonicCoreStrings.loadingSpinner
import typingsSlinky.atIonicCore.atIonicCoreStrings.menuIcon
import typingsSlinky.atIonicCore.atIonicCoreStrings.menuType
import typingsSlinky.atIonicCore.atIonicCoreStrings.modalEnter
import typingsSlinky.atIonicCore.atIonicCoreStrings.modalLeave
import typingsSlinky.atIonicCore.atIonicCoreStrings.mode
import typingsSlinky.atIonicCore.atIonicCoreStrings.navAnimation
import typingsSlinky.atIonicCore.atIonicCoreStrings.persistConfig
import typingsSlinky.atIonicCore.atIonicCoreStrings.pickerEnter
import typingsSlinky.atIonicCore.atIonicCoreStrings.pickerLeave
import typingsSlinky.atIonicCore.atIonicCoreStrings.popoverEnter
import typingsSlinky.atIonicCore.atIonicCoreStrings.popoverLeave
import typingsSlinky.atIonicCore.atIonicCoreStrings.refreshingIcon
import typingsSlinky.atIonicCore.atIonicCoreStrings.refreshingSpinner
import typingsSlinky.atIonicCore.atIonicCoreStrings.rippleEffect
import typingsSlinky.atIonicCore.atIonicCoreStrings.scrollAssist
import typingsSlinky.atIonicCore.atIonicCoreStrings.scrollPadding
import typingsSlinky.atIonicCore.atIonicCoreStrings.spinner
import typingsSlinky.atIonicCore.atIonicCoreStrings.statusTap
import typingsSlinky.atIonicCore.atIonicCoreStrings.swipeBackEnabled
import typingsSlinky.atIonicCore.atIonicCoreStrings.tabButtonLayout
import typingsSlinky.atIonicCore.atIonicCoreStrings.toastEnter
import typingsSlinky.atIonicCore.atIonicCoreStrings.toastLeave
import typingsSlinky.atIonicCore.distTypesComponentsActionDashSheetActionDashSheetDashInterfaceMod.ActionSheetOptions
import typingsSlinky.atIonicCore.distTypesComponentsAlertAlertDashInterfaceMod.AlertOptions
import typingsSlinky.atIonicCore.distTypesComponentsLoadingLoadingDashInterfaceMod.LoadingOptions
import typingsSlinky.atIonicCore.distTypesComponentsMod._Global_.HTMLIonActionSheetElement
import typingsSlinky.atIonicCore.distTypesComponentsMod._Global_.HTMLIonAlertElement
import typingsSlinky.atIonicCore.distTypesComponentsMod._Global_.HTMLIonLoadingElement
import typingsSlinky.atIonicCore.distTypesComponentsMod._Global_.HTMLIonModalElement
import typingsSlinky.atIonicCore.distTypesComponentsMod._Global_.HTMLIonPickerElement
import typingsSlinky.atIonicCore.distTypesComponentsMod._Global_.HTMLIonPopoverElement
import typingsSlinky.atIonicCore.distTypesComponentsMod._Global_.HTMLIonToastElement
import typingsSlinky.atIonicCore.distTypesComponentsModalModalDashInterfaceMod.ModalOptions
import typingsSlinky.atIonicCore.distTypesComponentsPickerPickerDashInterfaceMod.PickerOptions
import typingsSlinky.atIonicCore.distTypesComponentsPopoverPopoverDashInterfaceMod.PopoverOptions
import typingsSlinky.atIonicCore.distTypesComponentsToastToastDashInterfaceMod.ToastOptions
import typingsSlinky.atIonicCore.distTypesUtilsAnimationAnimationDashInterfaceMod.Animation
import typingsSlinky.atIonicCore.distTypesUtilsAnimationOldDashAnimationAnimationDashInterfaceMod.AnimationBuilder
import typingsSlinky.atIonicCore.distTypesUtilsOverlaysDashInterfaceMod.HTMLIonOverlayElement
import typingsSlinky.atIonicCore.distTypesUtilsOverlaysDashInterfaceMod.OverlayInterface
import typingsSlinky.atIonicCore.distTypesUtilsOverlaysMod.IonicAnimationInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/overlays", JSImport.Namespace)
@js.native
object distTypesUtilsOverlaysMod extends js.Object {
  val BACKDROP: backdrop = js.native
  def connectListeners(doc: Document): Unit = js.native
  def createOverlay[T /* <: HTMLIonOverlayElement */](tagName: String): js.Promise[T] = js.native
  def createOverlay[T /* <: HTMLIonOverlayElement */](tagName: String, opts: js.Object): js.Promise[T] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: IonicAnimationInterface
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: IonicAnimationInterface,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: IonicAnimationInterface,
    mdLeaveAnimation: AnimationBuilder
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: IonicAnimationInterface,
    mdLeaveAnimation: AnimationBuilder,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: IonicAnimationInterface,
    mdLeaveAnimation: IonicAnimationInterface
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: IonicAnimationInterface,
    mdLeaveAnimation: IonicAnimationInterface,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: String,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: String,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: String,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: IonicAnimationInterface
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: String,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: IonicAnimationInterface,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: String,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: IonicAnimationInterface,
    mdLeaveAnimation: AnimationBuilder
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: String,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: IonicAnimationInterface,
    mdLeaveAnimation: AnimationBuilder,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: String,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: IonicAnimationInterface,
    mdLeaveAnimation: IonicAnimationInterface
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: String,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: IonicAnimationInterface,
    mdLeaveAnimation: IonicAnimationInterface,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismissOverlay(doc: Document, data: js.Any, role: js.UndefOr[scala.Nothing], overlayTag: String): js.Promise[Boolean] = js.native
  def dismissOverlay(doc: Document, data: js.Any, role: js.UndefOr[scala.Nothing], overlayTag: String, id: String): js.Promise[Boolean] = js.native
  def dismissOverlay(doc: Document, data: js.Any, role: String, overlayTag: String): js.Promise[Boolean] = js.native
  def dismissOverlay(doc: Document, data: js.Any, role: String, overlayTag: String, id: String): js.Promise[Boolean] = js.native
  def eventMethod[T](element: HTMLElement, eventName: String): js.Promise[T] = js.native
  def getOverlay(doc: Document): js.UndefOr[HTMLIonOverlayElement] = js.native
  def getOverlay(doc: Document, overlayTag: js.UndefOr[scala.Nothing], id: String): js.UndefOr[HTMLIonOverlayElement] = js.native
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
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonActionSheetElement]] = js.native
  }
  
  @js.native
  object alertController extends js.Object {
    def create(options: AlertOptions): js.Promise[HTMLIonAlertElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonAlertElement]] = js.native
  }
  
  @js.native
  object loadingController extends js.Object {
    def create(options: LoadingOptions): js.Promise[HTMLIonLoadingElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonLoadingElement]] = js.native
  }
  
  @js.native
  object modalController extends js.Object {
    def create(options: ModalOptions[ComponentRef]): js.Promise[HTMLIonModalElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonModalElement]] = js.native
  }
  
  @js.native
  object pickerController extends js.Object {
    def create(options: PickerOptions): js.Promise[HTMLIonPickerElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonPickerElement]] = js.native
  }
  
  @js.native
  object popoverController extends js.Object {
    def create(options: PopoverOptions[ComponentRef]): js.Promise[HTMLIonPopoverElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonPopoverElement]] = js.native
  }
  
  @js.native
  object toastController extends js.Object {
    def create(options: ToastOptions): js.Promise[HTMLIonToastElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonToastElement]] = js.native
  }
  
  type IonicAnimationInterface = js.Function2[/* baseEl */ js.Any, /* opts */ js.Any, Animation]
}

