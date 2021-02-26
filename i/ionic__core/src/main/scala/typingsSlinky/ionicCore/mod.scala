package typingsSlinky.ionicCore

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import typingsSlinky.ionicCore.actionSheetInterfaceMod.ActionSheetOptions
import typingsSlinky.ionicCore.alertInterfaceMod.AlertOptions
import typingsSlinky.ionicCore.animationInterfaceMod.Animation
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonActionSheet
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonAlert
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonApp
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonAvatar
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonBackButton
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonBackdrop
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonBadge
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonButton
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonButtons
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonCard
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonCardContent
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonCardHeader
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonCardSubtitle
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonCardTitle
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonCheckbox
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonChip
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonCol
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonContent
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonDatetime
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonFab
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonFabButton
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonFabList
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonFooter
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonGrid
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonHeader
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonImg
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonInfiniteScroll
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonInfiniteScrollContent
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonInput
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonItem
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonItemDivider
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonItemGroup
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonItemOption
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonItemOptions
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonItemSliding
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonLabel
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonList
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonListHeader
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonLoading
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonMenu
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonMenuButton
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonMenuToggle
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonModal
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonNav
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonNavLink
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonNote
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonPicker
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonPickerColumn
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonPopover
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonProgressBar
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonRadio
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonRadioGroup
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonRange
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonRefresher
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonRefresherContent
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonReorder
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonReorderGroup
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonRippleEffect
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonRoute
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonRouteRedirect
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonRouter
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonRouterLink
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonRouterOutlet
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonRow
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonSearchbar
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonSegment
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonSegmentButton
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonSelect
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonSelectOption
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonSelectPopover
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonSkeletonText
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonSlide
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonSlides
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonSpinner
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonSplitPane
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonTab
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonTabBar
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonTabButton
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonTabs
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonText
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonTextarea
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonThumbnail
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonTitle
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonToast
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonToggle
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonToolbar
import typingsSlinky.ionicCore.componentsMod.LocalJSX.IonVirtualScroll
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonActionSheetElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonAlertElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonAppElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonAvatarElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonBackButtonElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonBackdropElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonBadgeElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonButtonElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonButtonsElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonCardContentElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonCardElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonCardHeaderElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonCardSubtitleElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonCardTitleElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonCheckboxElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonChipElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonColElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonContentElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonDatetimeElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonFabButtonElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonFabElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonFabListElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonFooterElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonGridElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonHeaderElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonImgElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonInfiniteScrollContentElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonInfiniteScrollElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonInputElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonItemDividerElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonItemElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonItemGroupElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonItemOptionElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonItemOptionsElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonItemSlidingElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonLabelElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonListElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonListHeaderElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonLoadingElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonMenuButtonElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonMenuElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonMenuToggleElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonModalElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonNavElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonNavLinkElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonNoteElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonPickerColumnElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonPickerElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonPopoverElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonProgressBarElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonRadioElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonRadioGroupElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonRangeElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonRefresherContentElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonRefresherElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonReorderElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonReorderGroupElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonRippleEffectElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonRouteElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonRouteRedirectElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonRouterElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonRouterLinkElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonRouterOutletElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonRowElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonSearchbarElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonSegmentButtonElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonSegmentElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonSelectElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonSelectOptionElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonSelectPopoverElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonSkeletonTextElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonSlideElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonSlidesElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonSpinnerElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonSplitPaneElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonTabBarElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonTabButtonElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonTabElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonTabsElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonTextElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonTextareaElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonThumbnailElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonTitleElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonToastElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonToggleElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonToolbarElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonVirtualScrollElement
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
import typingsSlinky.ionicCore.modalInterfaceMod.ModalOptions
import typingsSlinky.ionicCore.pickerInterfaceMod.PickerOptions
import typingsSlinky.ionicCore.platformMod.IsPlatformSignature
import typingsSlinky.ionicCore.popoverInterfaceMod.PopoverOptions
import typingsSlinky.ionicCore.stencilPublicRuntimeMod.JSXBase.HTMLAttributes
import typingsSlinky.ionicCore.toastInterfaceMod.ToastOptions
import typingsSlinky.ionicCore.transitionMod.TransitionOptions
import typingsSlinky.ionicCore.utilsConfigMod.IonicConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ionic/core", "Config")
  @js.native
  class Config_ ()
    extends typingsSlinky.ionicCore.configMod.Config_
  
  @JSImport("@ionic/core", "IonicSafeString")
  @js.native
  class IonicSafeString protected ()
    extends typingsSlinky.ionicCore.typesMod.IonicSafeString {
    def this(value: String) = this()
  }
  
  @JSImport("@ionic/core", "LIFECYCLE_DID_ENTER")
  @js.native
  val LIFECYCLE_DID_ENTER: /* "ionViewDidEnter" */ String = js.native
  
  @JSImport("@ionic/core", "LIFECYCLE_DID_LEAVE")
  @js.native
  val LIFECYCLE_DID_LEAVE: /* "ionViewDidLeave" */ String = js.native
  
  @JSImport("@ionic/core", "LIFECYCLE_WILL_ENTER")
  @js.native
  val LIFECYCLE_WILL_ENTER: /* "ionViewWillEnter" */ String = js.native
  
  @JSImport("@ionic/core", "LIFECYCLE_WILL_LEAVE")
  @js.native
  val LIFECYCLE_WILL_LEAVE: /* "ionViewWillLeave" */ String = js.native
  
  @JSImport("@ionic/core", "LIFECYCLE_WILL_UNLOAD")
  @js.native
  val LIFECYCLE_WILL_UNLOAD: /* "ionViewWillUnload" */ String = js.native
  
  @JSImport("@ionic/core", "ViewController")
  @js.native
  class ViewController protected ()
    extends typingsSlinky.ionicCore.navInterfaceMod.ViewController {
    def this(component: js.Any) = this()
    def this(component: js.Any, params: ComponentProps[Null]) = this()
  }
  
  object actionSheetController {
    
    @JSImport("@ionic/core", "actionSheetController.create")
    @js.native
    def create(options: ActionSheetOptions): js.Promise[HTMLIonActionSheetElement] = js.native
    
    @JSImport("@ionic/core", "actionSheetController.dismiss")
    @js.native
    def dismiss(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "actionSheetController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "actionSheetController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "actionSheetController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String, id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "actionSheetController.dismiss")
    @js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "actionSheetController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "actionSheetController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "actionSheetController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core", "actionSheetController.getTop")
    @js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonActionSheetElement]] = js.native
  }
  
  object alertController {
    
    @JSImport("@ionic/core", "alertController.create")
    @js.native
    def create(options: AlertOptions): js.Promise[HTMLIonAlertElement] = js.native
    
    @JSImport("@ionic/core", "alertController.dismiss")
    @js.native
    def dismiss(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "alertController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "alertController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "alertController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String, id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "alertController.dismiss")
    @js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "alertController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "alertController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "alertController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core", "alertController.getTop")
    @js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonAlertElement]] = js.native
  }
  
  @JSImport("@ionic/core", "config")
  @js.native
  val config: typingsSlinky.ionicCore.configMod.Config_ = js.native
  
  @JSImport("@ionic/core", "configFromSession")
  @js.native
  def configFromSession(win: Window): js.Any = js.native
  
  @JSImport("@ionic/core", "configFromURL")
  @js.native
  def configFromURL(win: Window): js.Any = js.native
  
  @JSImport("@ionic/core", "createAnimation")
  @js.native
  def createAnimation(): Animation = js.native
  @JSImport("@ionic/core", "createAnimation")
  @js.native
  def createAnimation(animationId: String): Animation = js.native
  
  @JSImport("@ionic/core", "createGesture")
  @js.native
  def createGesture(config: GestureConfig): Gesture = js.native
  
  @JSImport("@ionic/core", "getMode")
  @js.native
  def getMode(): Mode = js.native
  
  @JSImport("@ionic/core", "getPlatforms")
  @js.native
  def getPlatforms(): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  @JSImport("@ionic/core", "getPlatforms")
  @js.native
  def getPlatforms(win: js.Any): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  
  @JSImport("@ionic/core", "getTimeGivenProgression")
  @js.native
  def getTimeGivenProgression(
    p0: js.Array[Double],
    p1: js.Array[Double],
    p2: js.Array[Double],
    p3: js.Array[Double],
    progression: Double
  ): js.Array[Double] = js.native
  
  @JSImport("@ionic/core", "iosTransitionAnimation")
  @js.native
  def iosTransitionAnimation(navEl: HTMLElement, opts: TransitionOptions): Animation = js.native
  
  @JSImport("@ionic/core", "isPlatform")
  @js.native
  val isPlatform: IsPlatformSignature = js.native
  
  object loadingController {
    
    @JSImport("@ionic/core", "loadingController.create")
    @js.native
    def create(options: LoadingOptions): js.Promise[HTMLIonLoadingElement] = js.native
    
    @JSImport("@ionic/core", "loadingController.dismiss")
    @js.native
    def dismiss(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "loadingController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "loadingController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "loadingController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String, id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "loadingController.dismiss")
    @js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "loadingController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "loadingController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "loadingController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core", "loadingController.getTop")
    @js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonLoadingElement]] = js.native
  }
  
  @JSImport("@ionic/core", "mdTransitionAnimation")
  @js.native
  def mdTransitionAnimation(_underscore: HTMLElement, opts: TransitionOptions): Animation = js.native
  
  object menuController {
    
    @JSImport("@ionic/core", "menuController.close")
    @js.native
    def close(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "menuController.close")
    @js.native
    def close(menu: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core", "menuController._createAnimation")
    @js.native
    def createAnimation(`type`: String, menuCmp: MenuI): js.Any = js.native
    
    @JSImport("@ionic/core", "menuController.enable")
    @js.native
    def enable(shouldEnable: Boolean): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    @JSImport("@ionic/core", "menuController.enable")
    @js.native
    def enable(shouldEnable: Boolean, menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    
    @JSImport("@ionic/core", "menuController.get")
    @js.native
    def get(): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    @JSImport("@ionic/core", "menuController.get")
    @js.native
    def get(menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    
    @JSImport("@ionic/core", "menuController.getMenus")
    @js.native
    def getMenus(): js.Promise[js.Array[HTMLIonMenuElement]] = js.native
    
    @JSImport("@ionic/core", "menuController.getOpen")
    @js.native
    def getOpen(): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    
    @JSImport("@ionic/core", "menuController._getOpenSync")
    @js.native
    def getOpenSync(): js.UndefOr[HTMLIonMenuElement] = js.native
    
    @JSImport("@ionic/core", "menuController.isAnimating")
    @js.native
    def isAnimating(): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core", "menuController.isEnabled")
    @js.native
    def isEnabled(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "menuController.isEnabled")
    @js.native
    def isEnabled(menu: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core", "menuController.isOpen")
    @js.native
    def isOpen(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "menuController.isOpen")
    @js.native
    def isOpen(menu: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core", "menuController.open")
    @js.native
    def open(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "menuController.open")
    @js.native
    def open(menu: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core", "menuController._register")
    @js.native
    def register(menu: MenuI): Unit = js.native
    
    @JSImport("@ionic/core", "menuController.registerAnimation")
    @js.native
    def registerAnimation(name: String, animation: AnimationBuilder): Unit = js.native
    
    @JSImport("@ionic/core", "menuController._setActiveMenu")
    @js.native
    def setActiveMenu(menu: MenuI): Unit = js.native
    
    @JSImport("@ionic/core", "menuController._setOpen")
    @js.native
    def setOpen(menu: MenuI, shouldOpen: Boolean, animated: Boolean): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core", "menuController.swipeGesture")
    @js.native
    def swipeGesture(shouldEnable: Boolean): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    @JSImport("@ionic/core", "menuController.swipeGesture")
    @js.native
    def swipeGesture(shouldEnable: Boolean, menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    
    @JSImport("@ionic/core", "menuController.toggle")
    @js.native
    def toggle(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "menuController.toggle")
    @js.native
    def toggle(menu: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core", "menuController._unregister")
    @js.native
    def unregister(menu: MenuI): Unit = js.native
  }
  
  object modalController {
    
    @JSImport("@ionic/core", "modalController.create")
    @js.native
    def create(options: ModalOptions[ComponentRef]): js.Promise[HTMLIonModalElement] = js.native
    
    @JSImport("@ionic/core", "modalController.dismiss")
    @js.native
    def dismiss(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "modalController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "modalController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "modalController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String, id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "modalController.dismiss")
    @js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "modalController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "modalController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "modalController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core", "modalController.getTop")
    @js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonModalElement]] = js.native
  }
  
  object pickerController {
    
    @JSImport("@ionic/core", "pickerController.create")
    @js.native
    def create(options: PickerOptions): js.Promise[HTMLIonPickerElement] = js.native
    
    @JSImport("@ionic/core", "pickerController.dismiss")
    @js.native
    def dismiss(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "pickerController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "pickerController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "pickerController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String, id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "pickerController.dismiss")
    @js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "pickerController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "pickerController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "pickerController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core", "pickerController.getTop")
    @js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonPickerElement]] = js.native
  }
  
  object popoverController {
    
    @JSImport("@ionic/core", "popoverController.create")
    @js.native
    def create(options: PopoverOptions[ComponentRef]): js.Promise[HTMLIonPopoverElement] = js.native
    
    @JSImport("@ionic/core", "popoverController.dismiss")
    @js.native
    def dismiss(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "popoverController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "popoverController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "popoverController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String, id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "popoverController.dismiss")
    @js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "popoverController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "popoverController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "popoverController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core", "popoverController.getTop")
    @js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonPopoverElement]] = js.native
  }
  
  @JSImport("@ionic/core", "saveConfig")
  @js.native
  def saveConfig(win: Window, c: js.Any): Unit = js.native
  
  @JSImport("@ionic/core", "setupConfig")
  @js.native
  def setupConfig(config: IonicConfig): js.Any = js.native
  
  object toastController {
    
    @JSImport("@ionic/core", "toastController.create")
    @js.native
    def create(options: ToastOptions): js.Promise[HTMLIonToastElement] = js.native
    
    @JSImport("@ionic/core", "toastController.dismiss")
    @js.native
    def dismiss(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "toastController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "toastController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "toastController.dismiss")
    @js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String, id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "toastController.dismiss")
    @js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "toastController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "toastController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core", "toastController.dismiss")
    @js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core", "toastController.getTop")
    @js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonToastElement]] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ionicCore.ionicCoreStrings.on
    - typingsSlinky.ionicCore.ionicCoreStrings.off
    - typingsSlinky.ionicCore.ionicCoreStrings.name
    - typingsSlinky.ionicCore.ionicCoreStrings.`honorific-prefix`
    - typingsSlinky.ionicCore.ionicCoreStrings.`given-name`
    - typingsSlinky.ionicCore.ionicCoreStrings.`additional-name`
    - typingsSlinky.ionicCore.ionicCoreStrings.`family-name`
    - typingsSlinky.ionicCore.ionicCoreStrings.`honorific-suffix`
    - typingsSlinky.ionicCore.ionicCoreStrings.nickname
    - typingsSlinky.ionicCore.ionicCoreStrings.email
    - typingsSlinky.ionicCore.ionicCoreStrings.username
    - typingsSlinky.ionicCore.ionicCoreStrings.`new-password`
    - typingsSlinky.ionicCore.ionicCoreStrings.`current-password`
    - typingsSlinky.ionicCore.ionicCoreStrings.`one-time-code`
    - typingsSlinky.ionicCore.ionicCoreStrings.`organization-title`
    - typingsSlinky.ionicCore.ionicCoreStrings.organization
    - typingsSlinky.ionicCore.ionicCoreStrings.`street-address`
    - typingsSlinky.ionicCore.ionicCoreStrings.`address-line1`
    - typingsSlinky.ionicCore.ionicCoreStrings.`address-line2`
    - typingsSlinky.ionicCore.ionicCoreStrings.`address-line3`
    - typingsSlinky.ionicCore.ionicCoreStrings.`address-level4`
    - typingsSlinky.ionicCore.ionicCoreStrings.`address-level3`
    - typingsSlinky.ionicCore.ionicCoreStrings.`address-level2`
    - typingsSlinky.ionicCore.ionicCoreStrings.`address-level1`
    - typingsSlinky.ionicCore.ionicCoreStrings.country
    - typingsSlinky.ionicCore.ionicCoreStrings.`country-name`
    - typingsSlinky.ionicCore.ionicCoreStrings.`postal-code`
    - typingsSlinky.ionicCore.ionicCoreStrings.`cc-name`
    - typingsSlinky.ionicCore.ionicCoreStrings.`cc-given-name`
    - typingsSlinky.ionicCore.ionicCoreStrings.`cc-additional-name`
    - typingsSlinky.ionicCore.ionicCoreStrings.`cc-family-name`
    - typingsSlinky.ionicCore.ionicCoreStrings.`cc-number`
    - typingsSlinky.ionicCore.ionicCoreStrings.`cc-exp`
    - typingsSlinky.ionicCore.ionicCoreStrings.`cc-exp-month`
    - typingsSlinky.ionicCore.ionicCoreStrings.`cc-exp-year`
    - typingsSlinky.ionicCore.ionicCoreStrings.`cc-csc`
    - typingsSlinky.ionicCore.ionicCoreStrings.`cc-type`
    - typingsSlinky.ionicCore.ionicCoreStrings.`transaction-currency`
    - typingsSlinky.ionicCore.ionicCoreStrings.`transaction-amount`
    - typingsSlinky.ionicCore.ionicCoreStrings.language
    - typingsSlinky.ionicCore.ionicCoreStrings.bday
    - typingsSlinky.ionicCore.ionicCoreStrings.`bday-day`
    - typingsSlinky.ionicCore.ionicCoreStrings.`bday-month`
    - typingsSlinky.ionicCore.ionicCoreStrings.`bday-year`
    - typingsSlinky.ionicCore.ionicCoreStrings.sex
    - typingsSlinky.ionicCore.ionicCoreStrings.tel
    - typingsSlinky.ionicCore.ionicCoreStrings.`tel-country-code`
    - typingsSlinky.ionicCore.ionicCoreStrings.`tel-national`
    - typingsSlinky.ionicCore.ionicCoreStrings.`tel-area-code`
    - typingsSlinky.ionicCore.ionicCoreStrings.`tel-local`
    - typingsSlinky.ionicCore.ionicCoreStrings.`tel-extension`
    - typingsSlinky.ionicCore.ionicCoreStrings.impp
    - typingsSlinky.ionicCore.ionicCoreStrings.url
    - typingsSlinky.ionicCore.ionicCoreStrings.photo
  */
  trait AutocompleteTypes extends StObject
  object AutocompleteTypes {
    
    @scala.inline
    def `additional-name`: typingsSlinky.ionicCore.ionicCoreStrings.`additional-name` = "additional-name".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`additional-name`]
    
    @scala.inline
    def `address-level1`: typingsSlinky.ionicCore.ionicCoreStrings.`address-level1` = "address-level1".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`address-level1`]
    
    @scala.inline
    def `address-level2`: typingsSlinky.ionicCore.ionicCoreStrings.`address-level2` = "address-level2".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`address-level2`]
    
    @scala.inline
    def `address-level3`: typingsSlinky.ionicCore.ionicCoreStrings.`address-level3` = "address-level3".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`address-level3`]
    
    @scala.inline
    def `address-level4`: typingsSlinky.ionicCore.ionicCoreStrings.`address-level4` = "address-level4".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`address-level4`]
    
    @scala.inline
    def `address-line1`: typingsSlinky.ionicCore.ionicCoreStrings.`address-line1` = "address-line1".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`address-line1`]
    
    @scala.inline
    def `address-line2`: typingsSlinky.ionicCore.ionicCoreStrings.`address-line2` = "address-line2".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`address-line2`]
    
    @scala.inline
    def `address-line3`: typingsSlinky.ionicCore.ionicCoreStrings.`address-line3` = "address-line3".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`address-line3`]
    
    @scala.inline
    def bday: typingsSlinky.ionicCore.ionicCoreStrings.bday = "bday".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.bday]
    
    @scala.inline
    def `bday-day`: typingsSlinky.ionicCore.ionicCoreStrings.`bday-day` = "bday-day".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`bday-day`]
    
    @scala.inline
    def `bday-month`: typingsSlinky.ionicCore.ionicCoreStrings.`bday-month` = "bday-month".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`bday-month`]
    
    @scala.inline
    def `bday-year`: typingsSlinky.ionicCore.ionicCoreStrings.`bday-year` = "bday-year".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`bday-year`]
    
    @scala.inline
    def `cc-additional-name`: typingsSlinky.ionicCore.ionicCoreStrings.`cc-additional-name` = "cc-additional-name".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`cc-additional-name`]
    
    @scala.inline
    def `cc-csc`: typingsSlinky.ionicCore.ionicCoreStrings.`cc-csc` = "cc-csc".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`cc-csc`]
    
    @scala.inline
    def `cc-exp`: typingsSlinky.ionicCore.ionicCoreStrings.`cc-exp` = "cc-exp".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`cc-exp`]
    
    @scala.inline
    def `cc-exp-month`: typingsSlinky.ionicCore.ionicCoreStrings.`cc-exp-month` = "cc-exp-month".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`cc-exp-month`]
    
    @scala.inline
    def `cc-exp-year`: typingsSlinky.ionicCore.ionicCoreStrings.`cc-exp-year` = "cc-exp-year".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`cc-exp-year`]
    
    @scala.inline
    def `cc-family-name`: typingsSlinky.ionicCore.ionicCoreStrings.`cc-family-name` = "cc-family-name".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`cc-family-name`]
    
    @scala.inline
    def `cc-given-name`: typingsSlinky.ionicCore.ionicCoreStrings.`cc-given-name` = "cc-given-name".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`cc-given-name`]
    
    @scala.inline
    def `cc-name`: typingsSlinky.ionicCore.ionicCoreStrings.`cc-name` = "cc-name".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`cc-name`]
    
    @scala.inline
    def `cc-number`: typingsSlinky.ionicCore.ionicCoreStrings.`cc-number` = "cc-number".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`cc-number`]
    
    @scala.inline
    def `cc-type`: typingsSlinky.ionicCore.ionicCoreStrings.`cc-type` = "cc-type".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`cc-type`]
    
    @scala.inline
    def country: typingsSlinky.ionicCore.ionicCoreStrings.country = "country".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.country]
    
    @scala.inline
    def `country-name`: typingsSlinky.ionicCore.ionicCoreStrings.`country-name` = "country-name".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`country-name`]
    
    @scala.inline
    def `current-password`: typingsSlinky.ionicCore.ionicCoreStrings.`current-password` = "current-password".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`current-password`]
    
    @scala.inline
    def email: typingsSlinky.ionicCore.ionicCoreStrings.email = "email".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.email]
    
    @scala.inline
    def `family-name`: typingsSlinky.ionicCore.ionicCoreStrings.`family-name` = "family-name".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`family-name`]
    
    @scala.inline
    def `given-name`: typingsSlinky.ionicCore.ionicCoreStrings.`given-name` = "given-name".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`given-name`]
    
    @scala.inline
    def `honorific-prefix`: typingsSlinky.ionicCore.ionicCoreStrings.`honorific-prefix` = "honorific-prefix".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`honorific-prefix`]
    
    @scala.inline
    def `honorific-suffix`: typingsSlinky.ionicCore.ionicCoreStrings.`honorific-suffix` = "honorific-suffix".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`honorific-suffix`]
    
    @scala.inline
    def impp: typingsSlinky.ionicCore.ionicCoreStrings.impp = "impp".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.impp]
    
    @scala.inline
    def language: typingsSlinky.ionicCore.ionicCoreStrings.language = "language".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.language]
    
    @scala.inline
    def name: typingsSlinky.ionicCore.ionicCoreStrings.name = "name".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.name]
    
    @scala.inline
    def `new-password`: typingsSlinky.ionicCore.ionicCoreStrings.`new-password` = "new-password".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`new-password`]
    
    @scala.inline
    def nickname: typingsSlinky.ionicCore.ionicCoreStrings.nickname = "nickname".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.nickname]
    
    @scala.inline
    def off: typingsSlinky.ionicCore.ionicCoreStrings.off = "off".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.off]
    
    @scala.inline
    def on: typingsSlinky.ionicCore.ionicCoreStrings.on = "on".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.on]
    
    @scala.inline
    def `one-time-code`: typingsSlinky.ionicCore.ionicCoreStrings.`one-time-code` = "one-time-code".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`one-time-code`]
    
    @scala.inline
    def organization: typingsSlinky.ionicCore.ionicCoreStrings.organization = "organization".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.organization]
    
    @scala.inline
    def `organization-title`: typingsSlinky.ionicCore.ionicCoreStrings.`organization-title` = "organization-title".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`organization-title`]
    
    @scala.inline
    def photo: typingsSlinky.ionicCore.ionicCoreStrings.photo = "photo".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.photo]
    
    @scala.inline
    def `postal-code`: typingsSlinky.ionicCore.ionicCoreStrings.`postal-code` = "postal-code".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`postal-code`]
    
    @scala.inline
    def sex: typingsSlinky.ionicCore.ionicCoreStrings.sex = "sex".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.sex]
    
    @scala.inline
    def `street-address`: typingsSlinky.ionicCore.ionicCoreStrings.`street-address` = "street-address".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`street-address`]
    
    @scala.inline
    def tel: typingsSlinky.ionicCore.ionicCoreStrings.tel = "tel".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.tel]
    
    @scala.inline
    def `tel-area-code`: typingsSlinky.ionicCore.ionicCoreStrings.`tel-area-code` = "tel-area-code".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`tel-area-code`]
    
    @scala.inline
    def `tel-country-code`: typingsSlinky.ionicCore.ionicCoreStrings.`tel-country-code` = "tel-country-code".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`tel-country-code`]
    
    @scala.inline
    def `tel-extension`: typingsSlinky.ionicCore.ionicCoreStrings.`tel-extension` = "tel-extension".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`tel-extension`]
    
    @scala.inline
    def `tel-local`: typingsSlinky.ionicCore.ionicCoreStrings.`tel-local` = "tel-local".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`tel-local`]
    
    @scala.inline
    def `tel-national`: typingsSlinky.ionicCore.ionicCoreStrings.`tel-national` = "tel-national".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`tel-national`]
    
    @scala.inline
    def `transaction-amount`: typingsSlinky.ionicCore.ionicCoreStrings.`transaction-amount` = "transaction-amount".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`transaction-amount`]
    
    @scala.inline
    def `transaction-currency`: typingsSlinky.ionicCore.ionicCoreStrings.`transaction-currency` = "transaction-currency".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`transaction-currency`]
    
    @scala.inline
    def url: typingsSlinky.ionicCore.ionicCoreStrings.url = "url".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.url]
    
    @scala.inline
    def username: typingsSlinky.ionicCore.ionicCoreStrings.username = "username".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.username]
  }
  
  type BackButtonEvent = CustomEvent
  
  @js.native
  trait BackButtonEventDetail extends StObject {
    
    def register(
      priority: Double,
      handler: js.Function1[/* processNextHandler */ js.Function0[Unit], js.Promise[_] | Unit]
    ): Unit = js.native
  }
  object BackButtonEventDetail {
    
    @scala.inline
    def apply(
      register: (Double, js.Function1[/* processNextHandler */ js.Function0[Unit], js.Promise[_] | Unit]) => Unit
    ): BackButtonEventDetail = {
      val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
      __obj.asInstanceOf[BackButtonEventDetail]
    }
    
    @scala.inline
    implicit class BackButtonEventDetailMutableBuilder[Self <: BackButtonEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegister(
        value: (Double, js.Function1[/* processNextHandler */ js.Function0[Unit], js.Promise[_] | Unit]) => Unit
      ): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
    }
  }
  
  type Color = PredefinedColors | String
  
  type ComponentProps[T] = StringDictionary[js.Any]
  
  type ComponentRef = js.Function | HTMLElement | String | Null
  
  type ComponentTags = String
  
  type CssClassMap = StringDictionary[Boolean]
  
  @js.native
  trait FrameworkDelegate extends StObject {
    
    def attachViewToDom(container: js.Any, component: js.Any): js.Promise[HTMLElement] = js.native
    def attachViewToDom(
      container: js.Any,
      component: js.Any,
      propsOrDataObj: js.UndefOr[scala.Nothing],
      cssClasses: js.Array[String]
    ): js.Promise[HTMLElement] = js.native
    def attachViewToDom(container: js.Any, component: js.Any, propsOrDataObj: js.Any): js.Promise[HTMLElement] = js.native
    def attachViewToDom(container: js.Any, component: js.Any, propsOrDataObj: js.Any, cssClasses: js.Array[String]): js.Promise[HTMLElement] = js.native
    
    def removeViewFromDom(container: js.Any, component: js.Any): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait KeyboardEventDetail extends StObject {
    
    var keyboardHeight: Double = js.native
  }
  object KeyboardEventDetail {
    
    @scala.inline
    def apply(keyboardHeight: Double): KeyboardEventDetail = {
      val __obj = js.Dynamic.literal(keyboardHeight = keyboardHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyboardEventDetail]
    }
    
    @scala.inline
    implicit class KeyboardEventDetailMutableBuilder[Self <: KeyboardEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyboardHeight(value: Double): Self = StObject.set(x, "keyboardHeight", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ionicCore.ionicCoreStrings.ios
    - typingsSlinky.ionicCore.ionicCoreStrings.md
  */
  trait Mode extends StObject
  object Mode {
    
    @scala.inline
    def ios: typingsSlinky.ionicCore.ionicCoreStrings.ios = "ios".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.ios]
    
    @scala.inline
    def md: typingsSlinky.ionicCore.ionicCoreStrings.md = "md".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.md]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ionicCore.ionicCoreStrings.primary
    - typingsSlinky.ionicCore.ionicCoreStrings.secondary
    - typingsSlinky.ionicCore.ionicCoreStrings.tertiary
    - typingsSlinky.ionicCore.ionicCoreStrings.success
    - typingsSlinky.ionicCore.ionicCoreStrings.warning
    - typingsSlinky.ionicCore.ionicCoreStrings.danger
    - typingsSlinky.ionicCore.ionicCoreStrings.light
    - typingsSlinky.ionicCore.ionicCoreStrings.medium
    - typingsSlinky.ionicCore.ionicCoreStrings.dark
  */
  trait PredefinedColors extends StObject
  object PredefinedColors {
    
    @scala.inline
    def danger: typingsSlinky.ionicCore.ionicCoreStrings.danger = "danger".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.danger]
    
    @scala.inline
    def dark: typingsSlinky.ionicCore.ionicCoreStrings.dark = "dark".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.dark]
    
    @scala.inline
    def light: typingsSlinky.ionicCore.ionicCoreStrings.light = "light".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.light]
    
    @scala.inline
    def medium: typingsSlinky.ionicCore.ionicCoreStrings.medium = "medium".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.medium]
    
    @scala.inline
    def primary: typingsSlinky.ionicCore.ionicCoreStrings.primary = "primary".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.primary]
    
    @scala.inline
    def secondary: typingsSlinky.ionicCore.ionicCoreStrings.secondary = "secondary".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.secondary]
    
    @scala.inline
    def success: typingsSlinky.ionicCore.ionicCoreStrings.success = "success".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.success]
    
    @scala.inline
    def tertiary: typingsSlinky.ionicCore.ionicCoreStrings.tertiary = "tertiary".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.tertiary]
    
    @scala.inline
    def warning: typingsSlinky.ionicCore.ionicCoreStrings.warning = "warning".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.warning]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ionicCore.ionicCoreStrings.start
    - typingsSlinky.ionicCore.ionicCoreStrings.end
  */
  trait Side extends StObject
  object Side {
    
    @scala.inline
    def end: typingsSlinky.ionicCore.ionicCoreStrings.end = "end".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.end]
    
    @scala.inline
    def start: typingsSlinky.ionicCore.ionicCoreStrings.start = "start".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.start]
  }
  
  type StyleEventDetail = StringDictionary[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ionicCore.ionicCoreStrings.date
    - typingsSlinky.ionicCore.ionicCoreStrings.email
    - typingsSlinky.ionicCore.ionicCoreStrings.number
    - typingsSlinky.ionicCore.ionicCoreStrings.password
    - typingsSlinky.ionicCore.ionicCoreStrings.search
    - typingsSlinky.ionicCore.ionicCoreStrings.tel
    - typingsSlinky.ionicCore.ionicCoreStrings.text
    - typingsSlinky.ionicCore.ionicCoreStrings.url
    - typingsSlinky.ionicCore.ionicCoreStrings.time
    - typingsSlinky.ionicCore.ionicCoreStrings.week
    - typingsSlinky.ionicCore.ionicCoreStrings.month
    - typingsSlinky.ionicCore.ionicCoreStrings.`datetime-local`
  */
  trait TextFieldTypes extends StObject
  object TextFieldTypes {
    
    @scala.inline
    def date: typingsSlinky.ionicCore.ionicCoreStrings.date = "date".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.date]
    
    @scala.inline
    def `datetime-local`: typingsSlinky.ionicCore.ionicCoreStrings.`datetime-local` = "datetime-local".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`datetime-local`]
    
    @scala.inline
    def email: typingsSlinky.ionicCore.ionicCoreStrings.email = "email".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.email]
    
    @scala.inline
    def month: typingsSlinky.ionicCore.ionicCoreStrings.month = "month".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.month]
    
    @scala.inline
    def number: typingsSlinky.ionicCore.ionicCoreStrings.number = "number".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.number]
    
    @scala.inline
    def password: typingsSlinky.ionicCore.ionicCoreStrings.password = "password".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.password]
    
    @scala.inline
    def search: typingsSlinky.ionicCore.ionicCoreStrings.search = "search".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.search]
    
    @scala.inline
    def tel: typingsSlinky.ionicCore.ionicCoreStrings.tel = "tel".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.tel]
    
    @scala.inline
    def text: typingsSlinky.ionicCore.ionicCoreStrings.text = "text".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.text]
    
    @scala.inline
    def time: typingsSlinky.ionicCore.ionicCoreStrings.time = "time".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.time]
    
    @scala.inline
    def url: typingsSlinky.ionicCore.ionicCoreStrings.url = "url".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.url]
    
    @scala.inline
    def week: typingsSlinky.ionicCore.ionicCoreStrings.week = "week".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.week]
  }
  
  /* augmented module */
  object ionicCoreDistTypesComponentsAugmentingMod {
    
    object Components {
      
      type IonIcon = typingsSlinky.ionicons.componentsMod.Components.IonIcon
    }
    
    object JSX {
      
      type IonIcon = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IoniconsJSX.IonIcon */ js.Any
    }
  }
  
  object stencilCoreAugmentingMod {
    
    object JSX {
      
      @js.native
      trait IntrinsicElements extends StObject {
        
        var `ion-action-sheet`: IonActionSheet with HTMLAttributes[HTMLIonActionSheetElement] = js.native
        
        var `ion-alert`: IonAlert with HTMLAttributes[HTMLIonAlertElement] = js.native
        
        var `ion-app`: IonApp with HTMLAttributes[HTMLIonAppElement] = js.native
        
        var `ion-avatar`: IonAvatar with HTMLAttributes[HTMLIonAvatarElement] = js.native
        
        var `ion-back-button`: IonBackButton with HTMLAttributes[HTMLIonBackButtonElement] = js.native
        
        var `ion-backdrop`: IonBackdrop with HTMLAttributes[HTMLIonBackdropElement] = js.native
        
        var `ion-badge`: IonBadge with HTMLAttributes[HTMLIonBadgeElement] = js.native
        
        var `ion-button`: IonButton with HTMLAttributes[HTMLIonButtonElement] = js.native
        
        var `ion-buttons`: IonButtons with HTMLAttributes[HTMLIonButtonsElement] = js.native
        
        var `ion-card`: IonCard with HTMLAttributes[HTMLIonCardElement] = js.native
        
        var `ion-card-content`: IonCardContent with HTMLAttributes[HTMLIonCardContentElement] = js.native
        
        var `ion-card-header`: IonCardHeader with HTMLAttributes[HTMLIonCardHeaderElement] = js.native
        
        var `ion-card-subtitle`: IonCardSubtitle with HTMLAttributes[HTMLIonCardSubtitleElement] = js.native
        
        var `ion-card-title`: IonCardTitle with HTMLAttributes[HTMLIonCardTitleElement] = js.native
        
        var `ion-checkbox`: IonCheckbox with HTMLAttributes[HTMLIonCheckboxElement] = js.native
        
        var `ion-chip`: IonChip with HTMLAttributes[HTMLIonChipElement] = js.native
        
        var `ion-col`: IonCol with HTMLAttributes[HTMLIonColElement] = js.native
        
        var `ion-content`: IonContent with HTMLAttributes[HTMLIonContentElement] = js.native
        
        var `ion-datetime`: IonDatetime with HTMLAttributes[HTMLIonDatetimeElement] = js.native
        
        var `ion-fab`: IonFab with HTMLAttributes[HTMLIonFabElement] = js.native
        
        var `ion-fab-button`: IonFabButton with HTMLAttributes[HTMLIonFabButtonElement] = js.native
        
        var `ion-fab-list`: IonFabList with HTMLAttributes[HTMLIonFabListElement] = js.native
        
        var `ion-footer`: IonFooter with HTMLAttributes[HTMLIonFooterElement] = js.native
        
        var `ion-grid`: IonGrid with HTMLAttributes[HTMLIonGridElement] = js.native
        
        var `ion-header`: IonHeader with HTMLAttributes[HTMLIonHeaderElement] = js.native
        
        var `ion-img`: IonImg with HTMLAttributes[HTMLIonImgElement] = js.native
        
        var `ion-infinite-scroll`: IonInfiniteScroll with HTMLAttributes[HTMLIonInfiniteScrollElement] = js.native
        
        var `ion-infinite-scroll-content`: IonInfiniteScrollContent with HTMLAttributes[HTMLIonInfiniteScrollContentElement] = js.native
        
        var `ion-input`: IonInput with HTMLAttributes[HTMLIonInputElement] = js.native
        
        var `ion-item`: IonItem with HTMLAttributes[HTMLIonItemElement] = js.native
        
        var `ion-item-divider`: IonItemDivider with HTMLAttributes[HTMLIonItemDividerElement] = js.native
        
        var `ion-item-group`: IonItemGroup with HTMLAttributes[HTMLIonItemGroupElement] = js.native
        
        var `ion-item-option`: IonItemOption with HTMLAttributes[HTMLIonItemOptionElement] = js.native
        
        var `ion-item-options`: IonItemOptions with HTMLAttributes[HTMLIonItemOptionsElement] = js.native
        
        var `ion-item-sliding`: IonItemSliding with HTMLAttributes[HTMLIonItemSlidingElement] = js.native
        
        var `ion-label`: IonLabel with HTMLAttributes[HTMLIonLabelElement] = js.native
        
        var `ion-list`: IonList with HTMLAttributes[HTMLIonListElement] = js.native
        
        var `ion-list-header`: IonListHeader with HTMLAttributes[HTMLIonListHeaderElement] = js.native
        
        var `ion-loading`: IonLoading with HTMLAttributes[HTMLIonLoadingElement] = js.native
        
        var `ion-menu`: IonMenu with HTMLAttributes[HTMLIonMenuElement] = js.native
        
        var `ion-menu-button`: IonMenuButton with HTMLAttributes[HTMLIonMenuButtonElement] = js.native
        
        var `ion-menu-toggle`: IonMenuToggle with HTMLAttributes[HTMLIonMenuToggleElement] = js.native
        
        var `ion-modal`: IonModal with HTMLAttributes[HTMLIonModalElement] = js.native
        
        var `ion-nav`: IonNav with HTMLAttributes[HTMLIonNavElement] = js.native
        
        var `ion-nav-link`: IonNavLink with HTMLAttributes[HTMLIonNavLinkElement] = js.native
        
        var `ion-note`: IonNote with HTMLAttributes[HTMLIonNoteElement] = js.native
        
        var `ion-picker`: IonPicker with HTMLAttributes[HTMLIonPickerElement] = js.native
        
        var `ion-picker-column`: IonPickerColumn with HTMLAttributes[HTMLIonPickerColumnElement] = js.native
        
        var `ion-popover`: IonPopover with HTMLAttributes[HTMLIonPopoverElement] = js.native
        
        var `ion-progress-bar`: IonProgressBar with HTMLAttributes[HTMLIonProgressBarElement] = js.native
        
        var `ion-radio`: IonRadio with HTMLAttributes[HTMLIonRadioElement] = js.native
        
        var `ion-radio-group`: IonRadioGroup with HTMLAttributes[HTMLIonRadioGroupElement] = js.native
        
        var `ion-range`: IonRange with HTMLAttributes[HTMLIonRangeElement] = js.native
        
        var `ion-refresher`: IonRefresher with HTMLAttributes[HTMLIonRefresherElement] = js.native
        
        var `ion-refresher-content`: IonRefresherContent with HTMLAttributes[HTMLIonRefresherContentElement] = js.native
        
        var `ion-reorder`: IonReorder with HTMLAttributes[HTMLIonReorderElement] = js.native
        
        var `ion-reorder-group`: IonReorderGroup with HTMLAttributes[HTMLIonReorderGroupElement] = js.native
        
        var `ion-ripple-effect`: IonRippleEffect with HTMLAttributes[HTMLIonRippleEffectElement] = js.native
        
        var `ion-route`: IonRoute with HTMLAttributes[HTMLIonRouteElement] = js.native
        
        var `ion-route-redirect`: IonRouteRedirect with HTMLAttributes[HTMLIonRouteRedirectElement] = js.native
        
        var `ion-router`: IonRouter with HTMLAttributes[HTMLIonRouterElement] = js.native
        
        var `ion-router-link`: IonRouterLink with HTMLAttributes[HTMLIonRouterLinkElement] = js.native
        
        var `ion-router-outlet`: IonRouterOutlet with HTMLAttributes[HTMLIonRouterOutletElement] = js.native
        
        var `ion-row`: IonRow with HTMLAttributes[HTMLIonRowElement] = js.native
        
        var `ion-searchbar`: IonSearchbar with HTMLAttributes[HTMLIonSearchbarElement] = js.native
        
        var `ion-segment`: IonSegment with HTMLAttributes[HTMLIonSegmentElement] = js.native
        
        var `ion-segment-button`: IonSegmentButton with HTMLAttributes[HTMLIonSegmentButtonElement] = js.native
        
        var `ion-select`: IonSelect with HTMLAttributes[HTMLIonSelectElement] = js.native
        
        var `ion-select-option`: IonSelectOption with HTMLAttributes[HTMLIonSelectOptionElement] = js.native
        
        var `ion-select-popover`: IonSelectPopover with HTMLAttributes[HTMLIonSelectPopoverElement] = js.native
        
        var `ion-skeleton-text`: IonSkeletonText with HTMLAttributes[HTMLIonSkeletonTextElement] = js.native
        
        var `ion-slide`: IonSlide with HTMLAttributes[HTMLIonSlideElement] = js.native
        
        var `ion-slides`: IonSlides with HTMLAttributes[HTMLIonSlidesElement] = js.native
        
        var `ion-spinner`: IonSpinner with HTMLAttributes[HTMLIonSpinnerElement] = js.native
        
        var `ion-split-pane`: IonSplitPane with HTMLAttributes[HTMLIonSplitPaneElement] = js.native
        
        var `ion-tab`: IonTab with HTMLAttributes[HTMLIonTabElement] = js.native
        
        var `ion-tab-bar`: IonTabBar with HTMLAttributes[HTMLIonTabBarElement] = js.native
        
        var `ion-tab-button`: IonTabButton with HTMLAttributes[HTMLIonTabButtonElement] = js.native
        
        var `ion-tabs`: IonTabs with HTMLAttributes[HTMLIonTabsElement] = js.native
        
        var `ion-text`: IonText with HTMLAttributes[HTMLIonTextElement] = js.native
        
        var `ion-textarea`: IonTextarea with HTMLAttributes[HTMLIonTextareaElement] = js.native
        
        var `ion-thumbnail`: IonThumbnail with HTMLAttributes[HTMLIonThumbnailElement] = js.native
        
        var `ion-title`: IonTitle with HTMLAttributes[HTMLIonTitleElement] = js.native
        
        var `ion-toast`: IonToast with HTMLAttributes[HTMLIonToastElement] = js.native
        
        var `ion-toggle`: IonToggle with HTMLAttributes[HTMLIonToggleElement] = js.native
        
        var `ion-toolbar`: IonToolbar with HTMLAttributes[HTMLIonToolbarElement] = js.native
        
        var `ion-virtual-scroll`: IonVirtualScroll with HTMLAttributes[HTMLIonVirtualScrollElement] = js.native
      }
      object IntrinsicElements {
        
        @scala.inline
        def apply(
          `ion-action-sheet`: IonActionSheet with HTMLAttributes[HTMLIonActionSheetElement],
          `ion-alert`: IonAlert with HTMLAttributes[HTMLIonAlertElement],
          `ion-app`: IonApp with HTMLAttributes[HTMLIonAppElement],
          `ion-avatar`: IonAvatar with HTMLAttributes[HTMLIonAvatarElement],
          `ion-back-button`: IonBackButton with HTMLAttributes[HTMLIonBackButtonElement],
          `ion-backdrop`: IonBackdrop with HTMLAttributes[HTMLIonBackdropElement],
          `ion-badge`: IonBadge with HTMLAttributes[HTMLIonBadgeElement],
          `ion-button`: IonButton with HTMLAttributes[HTMLIonButtonElement],
          `ion-buttons`: IonButtons with HTMLAttributes[HTMLIonButtonsElement],
          `ion-card`: IonCard with HTMLAttributes[HTMLIonCardElement],
          `ion-card-content`: IonCardContent with HTMLAttributes[HTMLIonCardContentElement],
          `ion-card-header`: IonCardHeader with HTMLAttributes[HTMLIonCardHeaderElement],
          `ion-card-subtitle`: IonCardSubtitle with HTMLAttributes[HTMLIonCardSubtitleElement],
          `ion-card-title`: IonCardTitle with HTMLAttributes[HTMLIonCardTitleElement],
          `ion-checkbox`: IonCheckbox with HTMLAttributes[HTMLIonCheckboxElement],
          `ion-chip`: IonChip with HTMLAttributes[HTMLIonChipElement],
          `ion-col`: IonCol with HTMLAttributes[HTMLIonColElement],
          `ion-content`: IonContent with HTMLAttributes[HTMLIonContentElement],
          `ion-datetime`: IonDatetime with HTMLAttributes[HTMLIonDatetimeElement],
          `ion-fab`: IonFab with HTMLAttributes[HTMLIonFabElement],
          `ion-fab-button`: IonFabButton with HTMLAttributes[HTMLIonFabButtonElement],
          `ion-fab-list`: IonFabList with HTMLAttributes[HTMLIonFabListElement],
          `ion-footer`: IonFooter with HTMLAttributes[HTMLIonFooterElement],
          `ion-grid`: IonGrid with HTMLAttributes[HTMLIonGridElement],
          `ion-header`: IonHeader with HTMLAttributes[HTMLIonHeaderElement],
          `ion-img`: IonImg with HTMLAttributes[HTMLIonImgElement],
          `ion-infinite-scroll`: IonInfiniteScroll with HTMLAttributes[HTMLIonInfiniteScrollElement],
          `ion-infinite-scroll-content`: IonInfiniteScrollContent with HTMLAttributes[HTMLIonInfiniteScrollContentElement],
          `ion-input`: IonInput with HTMLAttributes[HTMLIonInputElement],
          `ion-item`: IonItem with HTMLAttributes[HTMLIonItemElement],
          `ion-item-divider`: IonItemDivider with HTMLAttributes[HTMLIonItemDividerElement],
          `ion-item-group`: IonItemGroup with HTMLAttributes[HTMLIonItemGroupElement],
          `ion-item-option`: IonItemOption with HTMLAttributes[HTMLIonItemOptionElement],
          `ion-item-options`: IonItemOptions with HTMLAttributes[HTMLIonItemOptionsElement],
          `ion-item-sliding`: IonItemSliding with HTMLAttributes[HTMLIonItemSlidingElement],
          `ion-label`: IonLabel with HTMLAttributes[HTMLIonLabelElement],
          `ion-list`: IonList with HTMLAttributes[HTMLIonListElement],
          `ion-list-header`: IonListHeader with HTMLAttributes[HTMLIonListHeaderElement],
          `ion-loading`: IonLoading with HTMLAttributes[HTMLIonLoadingElement],
          `ion-menu`: IonMenu with HTMLAttributes[HTMLIonMenuElement],
          `ion-menu-button`: IonMenuButton with HTMLAttributes[HTMLIonMenuButtonElement],
          `ion-menu-toggle`: IonMenuToggle with HTMLAttributes[HTMLIonMenuToggleElement],
          `ion-modal`: IonModal with HTMLAttributes[HTMLIonModalElement],
          `ion-nav`: IonNav with HTMLAttributes[HTMLIonNavElement],
          `ion-nav-link`: IonNavLink with HTMLAttributes[HTMLIonNavLinkElement],
          `ion-note`: IonNote with HTMLAttributes[HTMLIonNoteElement],
          `ion-picker`: IonPicker with HTMLAttributes[HTMLIonPickerElement],
          `ion-picker-column`: IonPickerColumn with HTMLAttributes[HTMLIonPickerColumnElement],
          `ion-popover`: IonPopover with HTMLAttributes[HTMLIonPopoverElement],
          `ion-progress-bar`: IonProgressBar with HTMLAttributes[HTMLIonProgressBarElement],
          `ion-radio`: IonRadio with HTMLAttributes[HTMLIonRadioElement],
          `ion-radio-group`: IonRadioGroup with HTMLAttributes[HTMLIonRadioGroupElement],
          `ion-range`: IonRange with HTMLAttributes[HTMLIonRangeElement],
          `ion-refresher`: IonRefresher with HTMLAttributes[HTMLIonRefresherElement],
          `ion-refresher-content`: IonRefresherContent with HTMLAttributes[HTMLIonRefresherContentElement],
          `ion-reorder`: IonReorder with HTMLAttributes[HTMLIonReorderElement],
          `ion-reorder-group`: IonReorderGroup with HTMLAttributes[HTMLIonReorderGroupElement],
          `ion-ripple-effect`: IonRippleEffect with HTMLAttributes[HTMLIonRippleEffectElement],
          `ion-route`: IonRoute with HTMLAttributes[HTMLIonRouteElement],
          `ion-route-redirect`: IonRouteRedirect with HTMLAttributes[HTMLIonRouteRedirectElement],
          `ion-router`: IonRouter with HTMLAttributes[HTMLIonRouterElement],
          `ion-router-link`: IonRouterLink with HTMLAttributes[HTMLIonRouterLinkElement],
          `ion-router-outlet`: IonRouterOutlet with HTMLAttributes[HTMLIonRouterOutletElement],
          `ion-row`: IonRow with HTMLAttributes[HTMLIonRowElement],
          `ion-searchbar`: IonSearchbar with HTMLAttributes[HTMLIonSearchbarElement],
          `ion-segment`: IonSegment with HTMLAttributes[HTMLIonSegmentElement],
          `ion-segment-button`: IonSegmentButton with HTMLAttributes[HTMLIonSegmentButtonElement],
          `ion-select`: IonSelect with HTMLAttributes[HTMLIonSelectElement],
          `ion-select-option`: IonSelectOption with HTMLAttributes[HTMLIonSelectOptionElement],
          `ion-select-popover`: IonSelectPopover with HTMLAttributes[HTMLIonSelectPopoverElement],
          `ion-skeleton-text`: IonSkeletonText with HTMLAttributes[HTMLIonSkeletonTextElement],
          `ion-slide`: IonSlide with HTMLAttributes[HTMLIonSlideElement],
          `ion-slides`: IonSlides with HTMLAttributes[HTMLIonSlidesElement],
          `ion-spinner`: IonSpinner with HTMLAttributes[HTMLIonSpinnerElement],
          `ion-split-pane`: IonSplitPane with HTMLAttributes[HTMLIonSplitPaneElement],
          `ion-tab`: IonTab with HTMLAttributes[HTMLIonTabElement],
          `ion-tab-bar`: IonTabBar with HTMLAttributes[HTMLIonTabBarElement],
          `ion-tab-button`: IonTabButton with HTMLAttributes[HTMLIonTabButtonElement],
          `ion-tabs`: IonTabs with HTMLAttributes[HTMLIonTabsElement],
          `ion-text`: IonText with HTMLAttributes[HTMLIonTextElement],
          `ion-textarea`: IonTextarea with HTMLAttributes[HTMLIonTextareaElement],
          `ion-thumbnail`: IonThumbnail with HTMLAttributes[HTMLIonThumbnailElement],
          `ion-title`: IonTitle with HTMLAttributes[HTMLIonTitleElement],
          `ion-toast`: IonToast with HTMLAttributes[HTMLIonToastElement],
          `ion-toggle`: IonToggle with HTMLAttributes[HTMLIonToggleElement],
          `ion-toolbar`: IonToolbar with HTMLAttributes[HTMLIonToolbarElement],
          `ion-virtual-scroll`: IonVirtualScroll with HTMLAttributes[HTMLIonVirtualScrollElement]
        ): IntrinsicElements = {
          val __obj = js.Dynamic.literal()
          __obj.updateDynamic("ion-action-sheet")(`ion-action-sheet`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-alert")(`ion-alert`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-app")(`ion-app`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-avatar")(`ion-avatar`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-back-button")(`ion-back-button`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-backdrop")(`ion-backdrop`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-badge")(`ion-badge`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-button")(`ion-button`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-buttons")(`ion-buttons`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-card")(`ion-card`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-card-content")(`ion-card-content`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-card-header")(`ion-card-header`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-card-subtitle")(`ion-card-subtitle`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-card-title")(`ion-card-title`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-checkbox")(`ion-checkbox`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-chip")(`ion-chip`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-col")(`ion-col`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-content")(`ion-content`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-datetime")(`ion-datetime`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-fab")(`ion-fab`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-fab-button")(`ion-fab-button`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-fab-list")(`ion-fab-list`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-footer")(`ion-footer`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-grid")(`ion-grid`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-header")(`ion-header`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-img")(`ion-img`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-infinite-scroll")(`ion-infinite-scroll`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-infinite-scroll-content")(`ion-infinite-scroll-content`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-input")(`ion-input`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-item")(`ion-item`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-item-divider")(`ion-item-divider`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-item-group")(`ion-item-group`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-item-option")(`ion-item-option`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-item-options")(`ion-item-options`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-item-sliding")(`ion-item-sliding`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-label")(`ion-label`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-list")(`ion-list`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-list-header")(`ion-list-header`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-loading")(`ion-loading`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-menu")(`ion-menu`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-menu-button")(`ion-menu-button`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-menu-toggle")(`ion-menu-toggle`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-modal")(`ion-modal`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-nav")(`ion-nav`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-nav-link")(`ion-nav-link`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-note")(`ion-note`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-picker")(`ion-picker`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-picker-column")(`ion-picker-column`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-popover")(`ion-popover`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-progress-bar")(`ion-progress-bar`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-radio")(`ion-radio`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-radio-group")(`ion-radio-group`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-range")(`ion-range`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-refresher")(`ion-refresher`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-refresher-content")(`ion-refresher-content`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-reorder")(`ion-reorder`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-reorder-group")(`ion-reorder-group`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-ripple-effect")(`ion-ripple-effect`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-route")(`ion-route`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-route-redirect")(`ion-route-redirect`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-router")(`ion-router`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-router-link")(`ion-router-link`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-router-outlet")(`ion-router-outlet`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-row")(`ion-row`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-searchbar")(`ion-searchbar`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-segment")(`ion-segment`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-segment-button")(`ion-segment-button`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-select")(`ion-select`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-select-option")(`ion-select-option`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-select-popover")(`ion-select-popover`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-skeleton-text")(`ion-skeleton-text`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-slide")(`ion-slide`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-slides")(`ion-slides`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-spinner")(`ion-spinner`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-split-pane")(`ion-split-pane`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-tab")(`ion-tab`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-tab-bar")(`ion-tab-bar`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-tab-button")(`ion-tab-button`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-tabs")(`ion-tabs`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-text")(`ion-text`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-textarea")(`ion-textarea`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-thumbnail")(`ion-thumbnail`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-title")(`ion-title`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-toast")(`ion-toast`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-toggle")(`ion-toggle`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-toolbar")(`ion-toolbar`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-virtual-scroll")(`ion-virtual-scroll`.asInstanceOf[js.Any])
          __obj.asInstanceOf[IntrinsicElements]
        }
        
        @scala.inline
        implicit class IntrinsicElementsMutableBuilder[Self <: IntrinsicElements] (val x: Self) extends AnyVal {
          
          @scala.inline
          def `setIon-action-sheet`(value: IonActionSheet with HTMLAttributes[HTMLIonActionSheetElement]): Self = StObject.set(x, "ion-action-sheet", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-alert`(value: IonAlert with HTMLAttributes[HTMLIonAlertElement]): Self = StObject.set(x, "ion-alert", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-app`(value: IonApp with HTMLAttributes[HTMLIonAppElement]): Self = StObject.set(x, "ion-app", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-avatar`(value: IonAvatar with HTMLAttributes[HTMLIonAvatarElement]): Self = StObject.set(x, "ion-avatar", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-back-button`(value: IonBackButton with HTMLAttributes[HTMLIonBackButtonElement]): Self = StObject.set(x, "ion-back-button", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-backdrop`(value: IonBackdrop with HTMLAttributes[HTMLIonBackdropElement]): Self = StObject.set(x, "ion-backdrop", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-badge`(value: IonBadge with HTMLAttributes[HTMLIonBadgeElement]): Self = StObject.set(x, "ion-badge", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-button`(value: IonButton with HTMLAttributes[HTMLIonButtonElement]): Self = StObject.set(x, "ion-button", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-buttons`(value: IonButtons with HTMLAttributes[HTMLIonButtonsElement]): Self = StObject.set(x, "ion-buttons", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-card`(value: IonCard with HTMLAttributes[HTMLIonCardElement]): Self = StObject.set(x, "ion-card", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-card-content`(value: IonCardContent with HTMLAttributes[HTMLIonCardContentElement]): Self = StObject.set(x, "ion-card-content", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-card-header`(value: IonCardHeader with HTMLAttributes[HTMLIonCardHeaderElement]): Self = StObject.set(x, "ion-card-header", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-card-subtitle`(value: IonCardSubtitle with HTMLAttributes[HTMLIonCardSubtitleElement]): Self = StObject.set(x, "ion-card-subtitle", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-card-title`(value: IonCardTitle with HTMLAttributes[HTMLIonCardTitleElement]): Self = StObject.set(x, "ion-card-title", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-checkbox`(value: IonCheckbox with HTMLAttributes[HTMLIonCheckboxElement]): Self = StObject.set(x, "ion-checkbox", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-chip`(value: IonChip with HTMLAttributes[HTMLIonChipElement]): Self = StObject.set(x, "ion-chip", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-col`(value: IonCol with HTMLAttributes[HTMLIonColElement]): Self = StObject.set(x, "ion-col", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-content`(value: IonContent with HTMLAttributes[HTMLIonContentElement]): Self = StObject.set(x, "ion-content", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-datetime`(value: IonDatetime with HTMLAttributes[HTMLIonDatetimeElement]): Self = StObject.set(x, "ion-datetime", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-fab`(value: IonFab with HTMLAttributes[HTMLIonFabElement]): Self = StObject.set(x, "ion-fab", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-fab-button`(value: IonFabButton with HTMLAttributes[HTMLIonFabButtonElement]): Self = StObject.set(x, "ion-fab-button", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-fab-list`(value: IonFabList with HTMLAttributes[HTMLIonFabListElement]): Self = StObject.set(x, "ion-fab-list", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-footer`(value: IonFooter with HTMLAttributes[HTMLIonFooterElement]): Self = StObject.set(x, "ion-footer", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-grid`(value: IonGrid with HTMLAttributes[HTMLIonGridElement]): Self = StObject.set(x, "ion-grid", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-header`(value: IonHeader with HTMLAttributes[HTMLIonHeaderElement]): Self = StObject.set(x, "ion-header", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-img`(value: IonImg with HTMLAttributes[HTMLIonImgElement]): Self = StObject.set(x, "ion-img", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-infinite-scroll`(value: IonInfiniteScroll with HTMLAttributes[HTMLIonInfiniteScrollElement]): Self = StObject.set(x, "ion-infinite-scroll", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-infinite-scroll-content`(value: IonInfiniteScrollContent with HTMLAttributes[HTMLIonInfiniteScrollContentElement]): Self = StObject.set(x, "ion-infinite-scroll-content", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-input`(value: IonInput with HTMLAttributes[HTMLIonInputElement]): Self = StObject.set(x, "ion-input", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-item`(value: IonItem with HTMLAttributes[HTMLIonItemElement]): Self = StObject.set(x, "ion-item", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-item-divider`(value: IonItemDivider with HTMLAttributes[HTMLIonItemDividerElement]): Self = StObject.set(x, "ion-item-divider", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-item-group`(value: IonItemGroup with HTMLAttributes[HTMLIonItemGroupElement]): Self = StObject.set(x, "ion-item-group", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-item-option`(value: IonItemOption with HTMLAttributes[HTMLIonItemOptionElement]): Self = StObject.set(x, "ion-item-option", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-item-options`(value: IonItemOptions with HTMLAttributes[HTMLIonItemOptionsElement]): Self = StObject.set(x, "ion-item-options", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-item-sliding`(value: IonItemSliding with HTMLAttributes[HTMLIonItemSlidingElement]): Self = StObject.set(x, "ion-item-sliding", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-label`(value: IonLabel with HTMLAttributes[HTMLIonLabelElement]): Self = StObject.set(x, "ion-label", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-list`(value: IonList with HTMLAttributes[HTMLIonListElement]): Self = StObject.set(x, "ion-list", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-list-header`(value: IonListHeader with HTMLAttributes[HTMLIonListHeaderElement]): Self = StObject.set(x, "ion-list-header", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-loading`(value: IonLoading with HTMLAttributes[HTMLIonLoadingElement]): Self = StObject.set(x, "ion-loading", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-menu`(value: IonMenu with HTMLAttributes[HTMLIonMenuElement]): Self = StObject.set(x, "ion-menu", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-menu-button`(value: IonMenuButton with HTMLAttributes[HTMLIonMenuButtonElement]): Self = StObject.set(x, "ion-menu-button", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-menu-toggle`(value: IonMenuToggle with HTMLAttributes[HTMLIonMenuToggleElement]): Self = StObject.set(x, "ion-menu-toggle", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-modal`(value: IonModal with HTMLAttributes[HTMLIonModalElement]): Self = StObject.set(x, "ion-modal", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-nav`(value: IonNav with HTMLAttributes[HTMLIonNavElement]): Self = StObject.set(x, "ion-nav", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-nav-link`(value: IonNavLink with HTMLAttributes[HTMLIonNavLinkElement]): Self = StObject.set(x, "ion-nav-link", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-note`(value: IonNote with HTMLAttributes[HTMLIonNoteElement]): Self = StObject.set(x, "ion-note", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-picker`(value: IonPicker with HTMLAttributes[HTMLIonPickerElement]): Self = StObject.set(x, "ion-picker", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-picker-column`(value: IonPickerColumn with HTMLAttributes[HTMLIonPickerColumnElement]): Self = StObject.set(x, "ion-picker-column", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-popover`(value: IonPopover with HTMLAttributes[HTMLIonPopoverElement]): Self = StObject.set(x, "ion-popover", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-progress-bar`(value: IonProgressBar with HTMLAttributes[HTMLIonProgressBarElement]): Self = StObject.set(x, "ion-progress-bar", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-radio`(value: IonRadio with HTMLAttributes[HTMLIonRadioElement]): Self = StObject.set(x, "ion-radio", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-radio-group`(value: IonRadioGroup with HTMLAttributes[HTMLIonRadioGroupElement]): Self = StObject.set(x, "ion-radio-group", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-range`(value: IonRange with HTMLAttributes[HTMLIonRangeElement]): Self = StObject.set(x, "ion-range", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-refresher`(value: IonRefresher with HTMLAttributes[HTMLIonRefresherElement]): Self = StObject.set(x, "ion-refresher", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-refresher-content`(value: IonRefresherContent with HTMLAttributes[HTMLIonRefresherContentElement]): Self = StObject.set(x, "ion-refresher-content", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-reorder`(value: IonReorder with HTMLAttributes[HTMLIonReorderElement]): Self = StObject.set(x, "ion-reorder", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-reorder-group`(value: IonReorderGroup with HTMLAttributes[HTMLIonReorderGroupElement]): Self = StObject.set(x, "ion-reorder-group", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-ripple-effect`(value: IonRippleEffect with HTMLAttributes[HTMLIonRippleEffectElement]): Self = StObject.set(x, "ion-ripple-effect", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-route`(value: IonRoute with HTMLAttributes[HTMLIonRouteElement]): Self = StObject.set(x, "ion-route", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-route-redirect`(value: IonRouteRedirect with HTMLAttributes[HTMLIonRouteRedirectElement]): Self = StObject.set(x, "ion-route-redirect", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-router`(value: IonRouter with HTMLAttributes[HTMLIonRouterElement]): Self = StObject.set(x, "ion-router", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-router-link`(value: IonRouterLink with HTMLAttributes[HTMLIonRouterLinkElement]): Self = StObject.set(x, "ion-router-link", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-router-outlet`(value: IonRouterOutlet with HTMLAttributes[HTMLIonRouterOutletElement]): Self = StObject.set(x, "ion-router-outlet", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-row`(value: IonRow with HTMLAttributes[HTMLIonRowElement]): Self = StObject.set(x, "ion-row", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-searchbar`(value: IonSearchbar with HTMLAttributes[HTMLIonSearchbarElement]): Self = StObject.set(x, "ion-searchbar", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-segment`(value: IonSegment with HTMLAttributes[HTMLIonSegmentElement]): Self = StObject.set(x, "ion-segment", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-segment-button`(value: IonSegmentButton with HTMLAttributes[HTMLIonSegmentButtonElement]): Self = StObject.set(x, "ion-segment-button", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-select`(value: IonSelect with HTMLAttributes[HTMLIonSelectElement]): Self = StObject.set(x, "ion-select", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-select-option`(value: IonSelectOption with HTMLAttributes[HTMLIonSelectOptionElement]): Self = StObject.set(x, "ion-select-option", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-select-popover`(value: IonSelectPopover with HTMLAttributes[HTMLIonSelectPopoverElement]): Self = StObject.set(x, "ion-select-popover", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-skeleton-text`(value: IonSkeletonText with HTMLAttributes[HTMLIonSkeletonTextElement]): Self = StObject.set(x, "ion-skeleton-text", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-slide`(value: IonSlide with HTMLAttributes[HTMLIonSlideElement]): Self = StObject.set(x, "ion-slide", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-slides`(value: IonSlides with HTMLAttributes[HTMLIonSlidesElement]): Self = StObject.set(x, "ion-slides", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-spinner`(value: IonSpinner with HTMLAttributes[HTMLIonSpinnerElement]): Self = StObject.set(x, "ion-spinner", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-split-pane`(value: IonSplitPane with HTMLAttributes[HTMLIonSplitPaneElement]): Self = StObject.set(x, "ion-split-pane", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-tab`(value: IonTab with HTMLAttributes[HTMLIonTabElement]): Self = StObject.set(x, "ion-tab", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-tab-bar`(value: IonTabBar with HTMLAttributes[HTMLIonTabBarElement]): Self = StObject.set(x, "ion-tab-bar", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-tab-button`(value: IonTabButton with HTMLAttributes[HTMLIonTabButtonElement]): Self = StObject.set(x, "ion-tab-button", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-tabs`(value: IonTabs with HTMLAttributes[HTMLIonTabsElement]): Self = StObject.set(x, "ion-tabs", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-text`(value: IonText with HTMLAttributes[HTMLIonTextElement]): Self = StObject.set(x, "ion-text", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-textarea`(value: IonTextarea with HTMLAttributes[HTMLIonTextareaElement]): Self = StObject.set(x, "ion-textarea", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-thumbnail`(value: IonThumbnail with HTMLAttributes[HTMLIonThumbnailElement]): Self = StObject.set(x, "ion-thumbnail", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-title`(value: IonTitle with HTMLAttributes[HTMLIonTitleElement]): Self = StObject.set(x, "ion-title", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-toast`(value: IonToast with HTMLAttributes[HTMLIonToastElement]): Self = StObject.set(x, "ion-toast", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-toggle`(value: IonToggle with HTMLAttributes[HTMLIonToggleElement]): Self = StObject.set(x, "ion-toggle", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-toolbar`(value: IonToolbar with HTMLAttributes[HTMLIonToolbarElement]): Self = StObject.set(x, "ion-toolbar", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `setIon-virtual-scroll`(value: IonVirtualScroll with HTMLAttributes[HTMLIonVirtualScrollElement]): Self = StObject.set(x, "ion-virtual-scroll", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
