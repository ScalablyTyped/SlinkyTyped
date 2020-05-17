package typingsSlinky.ionicCore

import typingsSlinky.ionicCore.actionSheetInterfaceMod.ActionSheetOptions
import typingsSlinky.ionicCore.alertInterfaceMod.AlertOptions
import typingsSlinky.ionicCore.animationInterfaceMod.Animation
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonActionSheetElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonAlertElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonLoadingElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonMenuElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonModalElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonPickerElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonPopoverElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonToastElement
import typingsSlinky.ionicCore.gestureMod.Gesture
import typingsSlinky.ionicCore.gestureMod.GestureConfig
import typingsSlinky.ionicCore.ionicCoreStrings.android
import typingsSlinky.ionicCore.ionicCoreStrings.capacitor
import typingsSlinky.ionicCore.ionicCoreStrings.cordova
import typingsSlinky.ionicCore.ionicCoreStrings.desktop
import typingsSlinky.ionicCore.ionicCoreStrings.electron
import typingsSlinky.ionicCore.ionicCoreStrings.hybrid
import typingsSlinky.ionicCore.ionicCoreStrings.ios
import typingsSlinky.ionicCore.ionicCoreStrings.ipad
import typingsSlinky.ionicCore.ionicCoreStrings.iphone
import typingsSlinky.ionicCore.ionicCoreStrings.md
import typingsSlinky.ionicCore.ionicCoreStrings.mobile
import typingsSlinky.ionicCore.ionicCoreStrings.mobileweb
import typingsSlinky.ionicCore.ionicCoreStrings.phablet
import typingsSlinky.ionicCore.ionicCoreStrings.pwa
import typingsSlinky.ionicCore.ionicCoreStrings.tablet
import typingsSlinky.ionicCore.loadingInterfaceMod.LoadingOptions
import typingsSlinky.ionicCore.menuInterfaceMod.MenuI
import typingsSlinky.ionicCore.mod.ComponentRef
import typingsSlinky.ionicCore.modalInterfaceMod.ModalOptions
import typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.pickerInterfaceMod.PickerOptions
import typingsSlinky.ionicCore.platformMod.IsPlatformSignature
import typingsSlinky.ionicCore.popoverInterfaceMod.PopoverOptions
import typingsSlinky.ionicCore.toastInterfaceMod.ToastOptions
import typingsSlinky.ionicCore.utilsConfigMod.IonicConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  val LIFECYCLE_DID_ENTER: /* "ionViewDidEnter" */ String = js.native
  val LIFECYCLE_DID_LEAVE: /* "ionViewDidLeave" */ String = js.native
  val LIFECYCLE_WILL_ENTER: /* "ionViewWillEnter" */ String = js.native
  val LIFECYCLE_WILL_LEAVE: /* "ionViewWillLeave" */ String = js.native
  val LIFECYCLE_WILL_UNLOAD: /* "ionViewWillUnload" */ String = js.native
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
  
}

