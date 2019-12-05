package typingsSlinky.atIonicCore

import typingsSlinky.atIonicCore.atIonicCoreMod.ComponentRef
import typingsSlinky.atIonicCore.atIonicCoreStrings.android
import typingsSlinky.atIonicCore.atIonicCoreStrings.capacitor
import typingsSlinky.atIonicCore.atIonicCoreStrings.cordova
import typingsSlinky.atIonicCore.atIonicCoreStrings.desktop
import typingsSlinky.atIonicCore.atIonicCoreStrings.electron
import typingsSlinky.atIonicCore.atIonicCoreStrings.hybrid
import typingsSlinky.atIonicCore.atIonicCoreStrings.ionViewDidEnter
import typingsSlinky.atIonicCore.atIonicCoreStrings.ionViewDidLeave
import typingsSlinky.atIonicCore.atIonicCoreStrings.ionViewWillEnter
import typingsSlinky.atIonicCore.atIonicCoreStrings.ionViewWillLeave
import typingsSlinky.atIonicCore.atIonicCoreStrings.ionViewWillUnload
import typingsSlinky.atIonicCore.atIonicCoreStrings.ios
import typingsSlinky.atIonicCore.atIonicCoreStrings.ipad
import typingsSlinky.atIonicCore.atIonicCoreStrings.iphone
import typingsSlinky.atIonicCore.atIonicCoreStrings.md
import typingsSlinky.atIonicCore.atIonicCoreStrings.mobile
import typingsSlinky.atIonicCore.atIonicCoreStrings.mobileweb
import typingsSlinky.atIonicCore.atIonicCoreStrings.phablet
import typingsSlinky.atIonicCore.atIonicCoreStrings.pwa
import typingsSlinky.atIonicCore.atIonicCoreStrings.tablet
import typingsSlinky.atIonicCore.distTypesComponentsActionDashSheetActionDashSheetDashInterfaceMod.ActionSheetOptions
import typingsSlinky.atIonicCore.distTypesComponentsAlertAlertDashInterfaceMod.AlertOptions
import typingsSlinky.atIonicCore.distTypesComponentsLoadingLoadingDashInterfaceMod.LoadingOptions
import typingsSlinky.atIonicCore.distTypesComponentsMenuMenuDashInterfaceMod.MenuI
import typingsSlinky.atIonicCore.distTypesComponentsMod._Global_.HTMLIonActionSheetElement
import typingsSlinky.atIonicCore.distTypesComponentsMod._Global_.HTMLIonAlertElement
import typingsSlinky.atIonicCore.distTypesComponentsMod._Global_.HTMLIonLoadingElement
import typingsSlinky.atIonicCore.distTypesComponentsMod._Global_.HTMLIonMenuElement
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
import typingsSlinky.atIonicCore.distTypesUtilsConfigMod.IonicConfig
import typingsSlinky.atIonicCore.distTypesUtilsGestureMod.Gesture
import typingsSlinky.atIonicCore.distTypesUtilsGestureMod.GestureConfig
import typingsSlinky.atIonicCore.distTypesUtilsPlatformMod.IsPlatformSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types", JSImport.Namespace)
@js.native
object distTypesMod extends js.Object {
  val LIFECYCLE_DID_ENTER: ionViewDidEnter = js.native
  val LIFECYCLE_DID_LEAVE: ionViewDidLeave = js.native
  val LIFECYCLE_WILL_ENTER: ionViewWillEnter = js.native
  val LIFECYCLE_WILL_LEAVE: ionViewWillLeave = js.native
  val LIFECYCLE_WILL_UNLOAD: ionViewWillUnload = js.native
  val isPlatform: IsPlatformSignature = js.native
  def createAnimation(): Animation = js.native
  def createGesture(config: GestureConfig): Gesture = js.native
  def getMode(): ios | md = js.native
  def getPlatforms(win: js.Any): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  def setupConfig(config: IonicConfig): js.Any = js.native
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
  object menuController extends js.Object {
    def _createAnimation(`type`: String, menuCmp: MenuI): js.Any = js.native
    def _getOpenSync(): js.UndefOr[HTMLIonMenuElement] = js.native
    def _register(menu: MenuI): Unit = js.native
    def _setActiveMenu(menu: MenuI): Unit = js.native
    def _setOpen(menu: MenuI, shouldOpen: Boolean, animated: Boolean): js.Promise[Boolean] = js.native
    def _unregister(menu: MenuI): Unit = js.native
    def close(): js.Promise[Boolean] = js.native
    def close(menu: String): js.Promise[Boolean] = js.native
    def enable(shouldEnable: Boolean): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def enable(shouldEnable: Boolean, menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def get(): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def get(menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def getMenus(): js.Promise[js.Array[HTMLIonMenuElement]] = js.native
    def getOpen(): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def isAnimating(): js.Promise[Boolean] = js.native
    def isEnabled(): js.Promise[Boolean] = js.native
    def isEnabled(menu: String): js.Promise[Boolean] = js.native
    def isOpen(): js.Promise[Boolean] = js.native
    def isOpen(menu: String): js.Promise[Boolean] = js.native
    def open(): js.Promise[Boolean] = js.native
    def open(menu: String): js.Promise[Boolean] = js.native
    def registerAnimation(name: String, animation: js.Function1[/* menu */ MenuI, Animation]): Unit = js.native
    def registerAnimation(name: String, animation: AnimationBuilder): Unit = js.native
    def swipeGesture(shouldEnable: Boolean): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def swipeGesture(shouldEnable: Boolean, menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def toggle(): js.Promise[Boolean] = js.native
    def toggle(menu: String): js.Promise[Boolean] = js.native
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
  
}

