package typingsSlinky.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.actionSheetInterfaceMod.ActionSheetOptions
import typingsSlinky.ionicCore.alertInterfaceMod.AlertOptions
import typingsSlinky.ionicCore.animationInterfaceMod.Animation
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
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
import typingsSlinky.ionicCore.ionicCoreStrings.mobile
import typingsSlinky.ionicCore.ionicCoreStrings.mobileweb
import typingsSlinky.ionicCore.ionicCoreStrings.phablet
import typingsSlinky.ionicCore.ionicCoreStrings.pwa
import typingsSlinky.ionicCore.ionicCoreStrings.tablet
import typingsSlinky.ionicCore.loadingInterfaceMod.LoadingOptions
import typingsSlinky.ionicCore.menuInterfaceMod.MenuI
import typingsSlinky.ionicCore.mod.ComponentRef
import typingsSlinky.ionicCore.mod.Mode
import typingsSlinky.ionicCore.modalInterfaceMod.ModalOptions
import typingsSlinky.ionicCore.pickerInterfaceMod.PickerOptions
import typingsSlinky.ionicCore.platformMod.IsPlatformSignature
import typingsSlinky.ionicCore.popoverInterfaceMod.PopoverOptions
import typingsSlinky.ionicCore.toastInterfaceMod.ToastOptions
import typingsSlinky.ionicCore.transitionMod.TransitionOptions
import typingsSlinky.ionicCore.utilsConfigMod.IonicConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("@ionic/core/dist/types", "IonicSafeString")
  @js.native
  class IonicSafeString protected ()
    extends typingsSlinky.ionicCore.sanitizationMod.IonicSafeString {
    def this(value: String) = this()
  }
  
  @JSImport("@ionic/core/dist/types", "LIFECYCLE_DID_ENTER")
  @js.native
  val LIFECYCLE_DID_ENTER: /* "ionViewDidEnter" */ String = js.native
  
  @JSImport("@ionic/core/dist/types", "LIFECYCLE_DID_LEAVE")
  @js.native
  val LIFECYCLE_DID_LEAVE: /* "ionViewDidLeave" */ String = js.native
  
  @JSImport("@ionic/core/dist/types", "LIFECYCLE_WILL_ENTER")
  @js.native
  val LIFECYCLE_WILL_ENTER: /* "ionViewWillEnter" */ String = js.native
  
  @JSImport("@ionic/core/dist/types", "LIFECYCLE_WILL_LEAVE")
  @js.native
  val LIFECYCLE_WILL_LEAVE: /* "ionViewWillLeave" */ String = js.native
  
  @JSImport("@ionic/core/dist/types", "LIFECYCLE_WILL_UNLOAD")
  @js.native
  val LIFECYCLE_WILL_UNLOAD: /* "ionViewWillUnload" */ String = js.native
  
  object actionSheetController {
    
    @JSImport("@ionic/core/dist/types", "actionSheetController.create")
    @js.native
    def create(options: ActionSheetOptions): js.Promise[HTMLIonActionSheetElement] = js.native
    
    @JSImport("@ionic/core/dist/types", "actionSheetController.dismiss")
    @js.native
    def dismiss(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "actionSheetController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "actionSheetController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "actionSheetController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String, id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "actionSheetController.dismiss")
    @js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "actionSheetController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "actionSheetController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "actionSheetController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core/dist/types", "actionSheetController.getTop")
    @js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonActionSheetElement]] = js.native
  }
  
  object alertController {
    
    @JSImport("@ionic/core/dist/types", "alertController.create")
    @js.native
    def create(options: AlertOptions): js.Promise[HTMLIonAlertElement] = js.native
    
    @JSImport("@ionic/core/dist/types", "alertController.dismiss")
    @js.native
    def dismiss(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "alertController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "alertController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "alertController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String, id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "alertController.dismiss")
    @js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "alertController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "alertController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "alertController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core/dist/types", "alertController.getTop")
    @js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonAlertElement]] = js.native
  }
  
  @JSImport("@ionic/core/dist/types", "createAnimation")
  @js.native
  def createAnimation(): Animation = js.native
  @JSImport("@ionic/core/dist/types", "createAnimation")
  @js.native
  def createAnimation(animationId: String): Animation = js.native
  
  @JSImport("@ionic/core/dist/types", "createGesture")
  @js.native
  def createGesture(config: GestureConfig): Gesture = js.native
  
  @JSImport("@ionic/core/dist/types", "getMode")
  @js.native
  def getMode(): Mode = js.native
  
  @JSImport("@ionic/core/dist/types", "getPlatforms")
  @js.native
  def getPlatforms(): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  @JSImport("@ionic/core/dist/types", "getPlatforms")
  @js.native
  def getPlatforms(win: js.Any): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  
  @JSImport("@ionic/core/dist/types", "getTimeGivenProgression")
  @js.native
  def getTimeGivenProgression(
    p0: js.Array[Double],
    p1: js.Array[Double],
    p2: js.Array[Double],
    p3: js.Array[Double],
    progression: Double
  ): js.Array[Double] = js.native
  
  @JSImport("@ionic/core/dist/types", "iosTransitionAnimation")
  @js.native
  def iosTransitionAnimation(navEl: HTMLElement, opts: TransitionOptions): Animation = js.native
  
  @JSImport("@ionic/core/dist/types", "isPlatform")
  @js.native
  val isPlatform: IsPlatformSignature = js.native
  
  object loadingController {
    
    @JSImport("@ionic/core/dist/types", "loadingController.create")
    @js.native
    def create(options: LoadingOptions): js.Promise[HTMLIonLoadingElement] = js.native
    
    @JSImport("@ionic/core/dist/types", "loadingController.dismiss")
    @js.native
    def dismiss(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "loadingController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "loadingController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "loadingController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String, id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "loadingController.dismiss")
    @js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "loadingController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "loadingController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "loadingController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core/dist/types", "loadingController.getTop")
    @js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonLoadingElement]] = js.native
  }
  
  @JSImport("@ionic/core/dist/types", "mdTransitionAnimation")
  @js.native
  def mdTransitionAnimation(_underscore: HTMLElement, opts: TransitionOptions): Animation = js.native
  
  object menuController {
    
    @JSImport("@ionic/core/dist/types", "menuController.close")
    @js.native
    def close(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "menuController.close")
    @js.native
    def close(menu: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core/dist/types", "menuController._createAnimation")
    @js.native
    def createAnimation(`type`: String, menuCmp: MenuI): js.Any = js.native
    
    @JSImport("@ionic/core/dist/types", "menuController.enable")
    @js.native
    def enable(shouldEnable: Boolean): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    @JSImport("@ionic/core/dist/types", "menuController.enable")
    @js.native
    def enable(shouldEnable: Boolean, menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    
    @JSImport("@ionic/core/dist/types", "menuController.get")
    @js.native
    def get(): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    @JSImport("@ionic/core/dist/types", "menuController.get")
    @js.native
    def get(menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    
    @JSImport("@ionic/core/dist/types", "menuController.getMenus")
    @js.native
    def getMenus(): js.Promise[js.Array[HTMLIonMenuElement]] = js.native
    
    @JSImport("@ionic/core/dist/types", "menuController.getOpen")
    @js.native
    def getOpen(): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    
    @JSImport("@ionic/core/dist/types", "menuController._getOpenSync")
    @js.native
    def getOpenSync(): js.UndefOr[HTMLIonMenuElement] = js.native
    
    @JSImport("@ionic/core/dist/types", "menuController.isAnimating")
    @js.native
    def isAnimating(): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core/dist/types", "menuController.isEnabled")
    @js.native
    def isEnabled(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "menuController.isEnabled")
    @js.native
    def isEnabled(menu: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core/dist/types", "menuController.isOpen")
    @js.native
    def isOpen(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "menuController.isOpen")
    @js.native
    def isOpen(menu: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core/dist/types", "menuController.open")
    @js.native
    def open(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "menuController.open")
    @js.native
    def open(menu: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core/dist/types", "menuController._register")
    @js.native
    def register(menu: MenuI): Unit = js.native
    
    @JSImport("@ionic/core/dist/types", "menuController.registerAnimation")
    @js.native
    def registerAnimation(name: String, animation: AnimationBuilder): Unit = js.native
    
    @JSImport("@ionic/core/dist/types", "menuController._setActiveMenu")
    @js.native
    def setActiveMenu(menu: MenuI): Unit = js.native
    
    @JSImport("@ionic/core/dist/types", "menuController._setOpen")
    @js.native
    def setOpen(menu: MenuI, shouldOpen: Boolean, animated: Boolean): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core/dist/types", "menuController.swipeGesture")
    @js.native
    def swipeGesture(shouldEnable: Boolean): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    @JSImport("@ionic/core/dist/types", "menuController.swipeGesture")
    @js.native
    def swipeGesture(shouldEnable: Boolean, menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    
    @JSImport("@ionic/core/dist/types", "menuController.toggle")
    @js.native
    def toggle(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "menuController.toggle")
    @js.native
    def toggle(menu: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core/dist/types", "menuController._unregister")
    @js.native
    def unregister(menu: MenuI): Unit = js.native
  }
  
  object modalController {
    
    @JSImport("@ionic/core/dist/types", "modalController.create")
    @js.native
    def create(options: ModalOptions[ComponentRef]): js.Promise[HTMLIonModalElement] = js.native
    
    @JSImport("@ionic/core/dist/types", "modalController.dismiss")
    @js.native
    def dismiss(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "modalController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "modalController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "modalController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String, id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "modalController.dismiss")
    @js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "modalController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "modalController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "modalController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core/dist/types", "modalController.getTop")
    @js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonModalElement]] = js.native
  }
  
  object pickerController {
    
    @JSImport("@ionic/core/dist/types", "pickerController.create")
    @js.native
    def create(options: PickerOptions): js.Promise[HTMLIonPickerElement] = js.native
    
    @JSImport("@ionic/core/dist/types", "pickerController.dismiss")
    @js.native
    def dismiss(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "pickerController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "pickerController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "pickerController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String, id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "pickerController.dismiss")
    @js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "pickerController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "pickerController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "pickerController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core/dist/types", "pickerController.getTop")
    @js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonPickerElement]] = js.native
  }
  
  object popoverController {
    
    @JSImport("@ionic/core/dist/types", "popoverController.create")
    @js.native
    def create(options: PopoverOptions[ComponentRef]): js.Promise[HTMLIonPopoverElement] = js.native
    
    @JSImport("@ionic/core/dist/types", "popoverController.dismiss")
    @js.native
    def dismiss(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "popoverController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "popoverController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "popoverController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String, id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "popoverController.dismiss")
    @js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "popoverController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "popoverController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "popoverController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core/dist/types", "popoverController.getTop")
    @js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonPopoverElement]] = js.native
  }
  
  @JSImport("@ionic/core/dist/types", "setupConfig")
  @js.native
  def setupConfig(config: IonicConfig): js.Any = js.native
  
  object toastController {
    
    @JSImport("@ionic/core/dist/types", "toastController.create")
    @js.native
    def create(options: ToastOptions): js.Promise[HTMLIonToastElement] = js.native
    
    @JSImport("@ionic/core/dist/types", "toastController.dismiss")
    @js.native
    def dismiss(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "toastController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "toastController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "toastController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String, id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "toastController.dismiss")
    @js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "toastController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "toastController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types", "toastController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core/dist/types", "toastController.getTop")
    @js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonToastElement]] = js.native
  }
}
