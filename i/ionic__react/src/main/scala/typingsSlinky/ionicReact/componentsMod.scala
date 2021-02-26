package typingsSlinky.ionicReact

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.animationInterfaceMod.Animation
import typingsSlinky.ionicCore.gestureMod.Gesture
import typingsSlinky.ionicCore.gestureMod.GestureConfig
import typingsSlinky.ionicCore.mod.Config_
import typingsSlinky.ionicCore.platformMod.Platforms
import typingsSlinky.ionicCore.transitionMod.TransitionOptions
import typingsSlinky.ionicCore.utilsConfigMod.IonicConfig
import typingsSlinky.ionicReact.anon.ActionSheetOptionsReactOv
import typingsSlinky.ionicReact.anon.AlertOptionsReactControll
import typingsSlinky.ionicReact.anon.ClickButton
import typingsSlinky.ionicReact.anon.IonAppPickHTMLAttributesH
import typingsSlinky.ionicReact.anon.IonAvatarPickHTMLAttribut
import typingsSlinky.ionicReact.anon.IonBackdropPickHTMLAttrib
import typingsSlinky.ionicReact.anon.IonBadgePickHTMLAttribute
import typingsSlinky.ionicReact.anon.IonButtonsPickHTMLAttribu
import typingsSlinky.ionicReact.anon.IonCardContentPickHTMLAtt
import typingsSlinky.ionicReact.anon.IonCardHeaderPickHTMLAttr
import typingsSlinky.ionicReact.anon.IonCardSubtitlePickHTMLAt
import typingsSlinky.ionicReact.anon.IonCardTitlePickHTMLAttri
import typingsSlinky.ionicReact.anon.IonCheckboxPickHTMLAttrib
import typingsSlinky.ionicReact.anon.IonChipPickHTMLAttributes
import typingsSlinky.ionicReact.anon.IonColPickHTMLAttributesH
import typingsSlinky.ionicReact.anon.IonContentPickHTMLAttribu
import typingsSlinky.ionicReact.anon.IonDatetimePickHTMLAttrib
import typingsSlinky.ionicReact.anon.IonFabListPickHTMLAttribu
import typingsSlinky.ionicReact.anon.IonFabPickHTMLAttributesH
import typingsSlinky.ionicReact.anon.IonFooterPickHTMLAttribut
import typingsSlinky.ionicReact.anon.IonGridPickHTMLAttributes
import typingsSlinky.ionicReact.anon.IonHeaderPickHTMLAttribut
import typingsSlinky.ionicReact.anon.IonIconPropsIonicReactPro
import typingsSlinky.ionicReact.anon.IonImgPickHTMLAttributesH
import typingsSlinky.ionicReact.anon.IonInfiniteScrollContentP
import typingsSlinky.ionicReact.anon.IonInfiniteScrollPickHTML
import typingsSlinky.ionicReact.anon.IonInputPickHTMLAttribute
import typingsSlinky.ionicReact.anon.IonItemDividerPickHTMLAtt
import typingsSlinky.ionicReact.anon.IonItemGroupPickHTMLAttri
import typingsSlinky.ionicReact.anon.IonItemOptionsPickHTMLAtt
import typingsSlinky.ionicReact.anon.IonItemSlidingPickHTMLAtt
import typingsSlinky.ionicReact.anon.IonLabelPickHTMLAttribute
import typingsSlinky.ionicReact.anon.IonListHeaderPickHTMLAttr
import typingsSlinky.ionicReact.anon.IonListPickHTMLAttributes
import typingsSlinky.ionicReact.anon.IonMenuButtonPickHTMLAttr
import typingsSlinky.ionicReact.anon.IonMenuPickHTMLAttributes
import typingsSlinky.ionicReact.anon.IonMenuTogglePickHTMLAttr
import typingsSlinky.ionicReact.anon.IonNavPickHTMLAttributesH
import typingsSlinky.ionicReact.anon.IonNotePickHTMLAttributes
import typingsSlinky.ionicReact.anon.IonPickerColumnPickHTMLAt
import typingsSlinky.ionicReact.anon.IonProgressBarPickHTMLAtt
import typingsSlinky.ionicReact.anon.IonRadioGroupPickHTMLAttr
import typingsSlinky.ionicReact.anon.IonRadioPickHTMLAttribute
import typingsSlinky.ionicReact.anon.IonRangePickHTMLAttribute
import typingsSlinky.ionicReact.anon.IonRefresherContentPickHT
import typingsSlinky.ionicReact.anon.IonRefresherPickHTMLAttri
import typingsSlinky.ionicReact.anon.IonReorderGroupPickHTMLAt
import typingsSlinky.ionicReact.anon.IonReorderPickHTMLAttribu
import typingsSlinky.ionicReact.anon.IonRippleEffectPickHTMLAt
import typingsSlinky.ionicReact.anon.IonRowPickHTMLAttributesH
import typingsSlinky.ionicReact.anon.IonSearchbarPickHTMLAttri
import typingsSlinky.ionicReact.anon.IonSegmentButtonPickHTMLA
import typingsSlinky.ionicReact.anon.IonSegmentPickHTMLAttribu
import typingsSlinky.ionicReact.anon.IonSelectOptionPickHTMLAt
import typingsSlinky.ionicReact.anon.IonSelectPickHTMLAttribut
import typingsSlinky.ionicReact.anon.IonSelectPopoverPickHTMLA
import typingsSlinky.ionicReact.anon.IonSkeletonTextPickHTMLAt
import typingsSlinky.ionicReact.anon.IonSlidePickHTMLAttribute
import typingsSlinky.ionicReact.anon.IonSlidesPickHTMLAttribut
import typingsSlinky.ionicReact.anon.IonSpinnerPickHTMLAttribu
import typingsSlinky.ionicReact.anon.IonSplitPanePickHTMLAttri
import typingsSlinky.ionicReact.anon.IonTabBarIonicReactPropso
import typingsSlinky.ionicReact.anon.IonTabPickHTMLAttributesH
import typingsSlinky.ionicReact.anon.IonTextPickHTMLAttributes
import typingsSlinky.ionicReact.anon.IonTextareaPickHTMLAttrib
import typingsSlinky.ionicReact.anon.IonThumbnailPickHTMLAttri
import typingsSlinky.ionicReact.anon.IonTitlePickHTMLAttribute
import typingsSlinky.ionicReact.anon.IonTogglePickHTMLAttribut
import typingsSlinky.ionicReact.anon.IonToolbarPickHTMLAttribu
import typingsSlinky.ionicReact.anon.IonVirtualScrollPickHTMLA
import typingsSlinky.ionicReact.anon.LoadingOptionsReactContro
import typingsSlinky.ionicReact.anon.PickHTMLAttributesunknown
import typingsSlinky.ionicReact.anon.PickIonButtondisabledstro
import typingsSlinky.ionicReact.anon.PickIonCarddisabledbutton
import typingsSlinky.ionicReact.anon.PickIonFabButtonshowdisab
import typingsSlinky.ionicReact.anon.PickIonItemOptiondisabled
import typingsSlinky.ionicReact.anon.PickIonItemdisabledbutton
import typingsSlinky.ionicReact.anon.PickIonRouterLinkcolorhre
import typingsSlinky.ionicReact.anon.PickIonicReactExternalPro
import typingsSlinky.ionicReact.anon.PickerOptionsReactControl
import typingsSlinky.ionicReact.anon.ReadonlyProps
import typingsSlinky.ionicReact.anon.ToastOptionsReactControll
import typingsSlinky.ionicReact.anon.childrenReactNodeforwarde
import typingsSlinky.ionicReact.anon.childrenReactNodeforwardeAnimated
import typingsSlinky.ionicReact.createAnimationMod.CreateAnimation
import typingsSlinky.ionicReact.ionBackButtonMod.Props
import typingsSlinky.ionicReact.ionRedirectMod.IonRedirectProps
import typingsSlinky.ionicReact.ionRouteMod.IonRouteProps
import typingsSlinky.ionicReact.ionRouterContextMod.IonRouterContextState
import typingsSlinky.ionicReact.ionTabsContextMod.IonTabsContextState
import typingsSlinky.ionicReact.ionicReactStrings.android
import typingsSlinky.ionicReact.ionicReactStrings.capacitor
import typingsSlinky.ionicReact.ionicReactStrings.cordova
import typingsSlinky.ionicReact.ionicReactStrings.desktop
import typingsSlinky.ionicReact.ionicReactStrings.electron
import typingsSlinky.ionicReact.ionicReactStrings.hybrid
import typingsSlinky.ionicReact.ionicReactStrings.ios
import typingsSlinky.ionicReact.ionicReactStrings.ipad
import typingsSlinky.ionicReact.ionicReactStrings.iphone
import typingsSlinky.ionicReact.ionicReactStrings.mobile
import typingsSlinky.ionicReact.ionicReactStrings.mobileweb
import typingsSlinky.ionicReact.ionicReactStrings.phablet
import typingsSlinky.ionicReact.ionicReactStrings.pwa
import typingsSlinky.ionicReact.ionicReactStrings.tablet
import typingsSlinky.ionicReact.navContextMod.NavContextState
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ForwardRefExoticComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  @JSImport("@ionic/react/dist/types/components", "CreateAnimation")
  @js.native
  class CreateAnimation_ protected () extends CreateAnimation {
    def this(props: js.Any) = this()
  }
  
  @JSImport("@ionic/react/dist/types/components", "IonActionSheet")
  @js.native
  val IonActionSheet: ForwardRefExoticComponent[ActionSheetOptionsReactOv] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonAlert")
  @js.native
  val IonAlert: ForwardRefExoticComponent[AlertOptionsReactControll] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonApp")
  @js.native
  val IonApp: ForwardRefExoticComponent[IonAppPickHTMLAttributesH] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonAvatar")
  @js.native
  val IonAvatar: ForwardRefExoticComponent[IonAvatarPickHTMLAttribut] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@ionic/react/dist/types/components", "IonBackButton")
  @js.native
  class IonBackButton protected () extends ClickButton {
    def this(props: ReadonlyProps) = this()
    def this(props: Props) = this()
    def this(props: Props, context: js.Any) = this()
  }
  object IonBackButton {
    
    @JSImport("@ionic/react/dist/types/components", "IonBackButton.contextType")
    @js.native
    val contextType: Context[NavContextState] = js.native
    
    @JSImport("@ionic/react/dist/types/components", "IonBackButton.displayName")
    @js.native
    val displayName: String = js.native
  }
  
  @JSImport("@ionic/react/dist/types/components", "IonBackdrop")
  @js.native
  val IonBackdrop: ForwardRefExoticComponent[IonBackdropPickHTMLAttrib] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonBadge")
  @js.native
  val IonBadge: ForwardRefExoticComponent[IonBadgePickHTMLAttribute] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonButton")
  @js.native
  val IonButton: ForwardRefExoticComponent[PickIonButtondisabledstro] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonButtons")
  @js.native
  val IonButtons: ForwardRefExoticComponent[IonButtonsPickHTMLAttribu] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonCard")
  @js.native
  val IonCard: ForwardRefExoticComponent[PickIonCarddisabledbutton] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonCardContent")
  @js.native
  val IonCardContent: ForwardRefExoticComponent[IonCardContentPickHTMLAtt] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonCardHeader")
  @js.native
  val IonCardHeader: ForwardRefExoticComponent[IonCardHeaderPickHTMLAttr] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonCardSubtitle")
  @js.native
  val IonCardSubtitle: ForwardRefExoticComponent[IonCardSubtitlePickHTMLAt] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonCardTitle")
  @js.native
  val IonCardTitle: ForwardRefExoticComponent[IonCardTitlePickHTMLAttri] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonCheckbox")
  @js.native
  val IonCheckbox: ForwardRefExoticComponent[IonCheckboxPickHTMLAttrib] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonChip")
  @js.native
  val IonChip: ForwardRefExoticComponent[IonChipPickHTMLAttributes] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonCol")
  @js.native
  val IonCol: ForwardRefExoticComponent[IonColPickHTMLAttributesH] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonContent")
  @js.native
  val IonContent: ForwardRefExoticComponent[IonContentPickHTMLAttribu] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonDatetime")
  @js.native
  val IonDatetime: ForwardRefExoticComponent[IonDatetimePickHTMLAttrib] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonFab")
  @js.native
  val IonFab: ForwardRefExoticComponent[IonFabPickHTMLAttributesH] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonFabButton")
  @js.native
  val IonFabButton: ForwardRefExoticComponent[PickIonFabButtonshowdisab] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonFabList")
  @js.native
  val IonFabList: ForwardRefExoticComponent[IonFabListPickHTMLAttribu] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonFooter")
  @js.native
  val IonFooter: ForwardRefExoticComponent[IonFooterPickHTMLAttribut] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonGrid")
  @js.native
  val IonGrid: ForwardRefExoticComponent[IonGridPickHTMLAttributes] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonHeader")
  @js.native
  val IonHeader: ForwardRefExoticComponent[IonHeaderPickHTMLAttribut] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonIcon")
  @js.native
  val IonIcon: ForwardRefExoticComponent[IonIconPropsIonicReactPro] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonImg")
  @js.native
  val IonImg: ForwardRefExoticComponent[IonImgPickHTMLAttributesH] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonInfiniteScroll")
  @js.native
  val IonInfiniteScroll: ForwardRefExoticComponent[IonInfiniteScrollPickHTML] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonInfiniteScrollContent")
  @js.native
  val IonInfiniteScrollContent: ForwardRefExoticComponent[IonInfiniteScrollContentP] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonInput")
  @js.native
  val IonInput: ForwardRefExoticComponent[IonInputPickHTMLAttribute] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonItem")
  @js.native
  val IonItem: ForwardRefExoticComponent[PickIonItemdisabledbutton] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonItemDivider")
  @js.native
  val IonItemDivider: ForwardRefExoticComponent[IonItemDividerPickHTMLAtt] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonItemGroup")
  @js.native
  val IonItemGroup: ForwardRefExoticComponent[IonItemGroupPickHTMLAttri] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonItemOption")
  @js.native
  val IonItemOption: ForwardRefExoticComponent[PickIonItemOptiondisabled] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonItemOptions")
  @js.native
  val IonItemOptions: ForwardRefExoticComponent[IonItemOptionsPickHTMLAtt] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonItemSliding")
  @js.native
  val IonItemSliding: ForwardRefExoticComponent[IonItemSlidingPickHTMLAtt] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonLabel")
  @js.native
  val IonLabel: ForwardRefExoticComponent[IonLabelPickHTMLAttribute] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonList")
  @js.native
  val IonList: ForwardRefExoticComponent[IonListPickHTMLAttributes] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonListHeader")
  @js.native
  val IonListHeader: ForwardRefExoticComponent[IonListHeaderPickHTMLAttr] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonLoading")
  @js.native
  val IonLoading: ForwardRefExoticComponent[LoadingOptionsReactContro] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonMenu")
  @js.native
  val IonMenu: ForwardRefExoticComponent[IonMenuPickHTMLAttributes] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonMenuButton")
  @js.native
  val IonMenuButton: ForwardRefExoticComponent[IonMenuButtonPickHTMLAttr] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonMenuToggle")
  @js.native
  val IonMenuToggle: ForwardRefExoticComponent[IonMenuTogglePickHTMLAttr] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonModal")
  @js.native
  val IonModal: ForwardRefExoticComponent[childrenReactNodeforwarde] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonNav")
  @js.native
  val IonNav: ForwardRefExoticComponent[IonNavPickHTMLAttributesH] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonNote")
  @js.native
  val IonNote: ForwardRefExoticComponent[IonNotePickHTMLAttributes] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonPage")
  @js.native
  val IonPage: ForwardRefExoticComponent[PickHTMLAttributesunknown] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonPicker")
  @js.native
  val IonPicker: ForwardRefExoticComponent[PickerOptionsReactControl] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonPickerColumn")
  @js.native
  val IonPickerColumn: ForwardRefExoticComponent[IonPickerColumnPickHTMLAt] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonPopover")
  @js.native
  val IonPopover: ForwardRefExoticComponent[childrenReactNodeforwardeAnimated] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonProgressBar")
  @js.native
  val IonProgressBar: ForwardRefExoticComponent[IonProgressBarPickHTMLAtt] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonRadio")
  @js.native
  val IonRadio: ForwardRefExoticComponent[IonRadioPickHTMLAttribute] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonRadioGroup")
  @js.native
  val IonRadioGroup: ForwardRefExoticComponent[IonRadioGroupPickHTMLAttr] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonRange")
  @js.native
  val IonRange: ForwardRefExoticComponent[IonRangePickHTMLAttribute] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonRedirect")
  @js.native
  class IonRedirect protected ()
    extends typingsSlinky.ionicReact.ionRedirectMod.IonRedirect {
    def this(props: IonRedirectProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IonRedirectProps, context: js.Any) = this()
  }
  
  @JSImport("@ionic/react/dist/types/components", "IonRefresher")
  @js.native
  val IonRefresher: ForwardRefExoticComponent[IonRefresherPickHTMLAttri] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonRefresherContent")
  @js.native
  val IonRefresherContent: ForwardRefExoticComponent[IonRefresherContentPickHT] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonReorder")
  @js.native
  val IonReorder: ForwardRefExoticComponent[IonReorderPickHTMLAttribu] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonReorderGroup")
  @js.native
  val IonReorderGroup: ForwardRefExoticComponent[IonReorderGroupPickHTMLAt] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonRippleEffect")
  @js.native
  val IonRippleEffect: ForwardRefExoticComponent[IonRippleEffectPickHTMLAt] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonRoute")
  @js.native
  class IonRoute protected ()
    extends typingsSlinky.ionicReact.ionRouteMod.IonRoute {
    def this(props: IonRouteProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IonRouteProps, context: js.Any) = this()
  }
  
  @JSImport("@ionic/react/dist/types/components", "IonRouterContext")
  @js.native
  val IonRouterContext: Context[IonRouterContextState] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonRouterLink")
  @js.native
  val IonRouterLink: ForwardRefExoticComponent[PickIonRouterLinkcolorhre] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonRouterOutlet")
  @js.native
  val IonRouterOutlet: ForwardRefExoticComponent[PickIonicReactExternalPro] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonRow")
  @js.native
  val IonRow: ForwardRefExoticComponent[IonRowPickHTMLAttributesH] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonSearchbar")
  @js.native
  val IonSearchbar: ForwardRefExoticComponent[IonSearchbarPickHTMLAttri] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonSegment")
  @js.native
  val IonSegment: ForwardRefExoticComponent[IonSegmentPickHTMLAttribu] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonSegmentButton")
  @js.native
  val IonSegmentButton: ForwardRefExoticComponent[IonSegmentButtonPickHTMLA] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonSelect")
  @js.native
  val IonSelect: ForwardRefExoticComponent[IonSelectPickHTMLAttribut] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonSelectOption")
  @js.native
  val IonSelectOption: ForwardRefExoticComponent[IonSelectOptionPickHTMLAt] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonSelectPopover")
  @js.native
  val IonSelectPopover: ForwardRefExoticComponent[IonSelectPopoverPickHTMLA] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonSkeletonText")
  @js.native
  val IonSkeletonText: ForwardRefExoticComponent[IonSkeletonTextPickHTMLAt] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonSlide")
  @js.native
  val IonSlide: ForwardRefExoticComponent[IonSlidePickHTMLAttribute] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonSlides")
  @js.native
  val IonSlides: ForwardRefExoticComponent[IonSlidesPickHTMLAttribut] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonSpinner")
  @js.native
  val IonSpinner: ForwardRefExoticComponent[IonSpinnerPickHTMLAttribu] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonSplitPane")
  @js.native
  val IonSplitPane: ForwardRefExoticComponent[IonSplitPanePickHTMLAttri] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonTab")
  @js.native
  val IonTab: ForwardRefExoticComponent[IonTabPickHTMLAttributesH] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonTabBar")
  @js.native
  val IonTabBar: ForwardRefExoticComponent[IonTabBarIonicReactPropso] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonTabButton")
  @js.native
  class IonTabButton protected ()
    extends typingsSlinky.ionicReact.ionTabButtonMod.IonTabButton {
    def this(props: typingsSlinky.ionicReact.ionTabButtonMod.Props) = this()
  }
  
  @JSImport("@ionic/react/dist/types/components", "IonTabs")
  @js.native
  class IonTabs protected ()
    extends typingsSlinky.ionicReact.ionTabsMod.IonTabs {
    def this(props: typingsSlinky.ionicReact.ionTabsMod.Props) = this()
  }
  
  @JSImport("@ionic/react/dist/types/components", "IonTabsContext")
  @js.native
  val IonTabsContext: Context[IonTabsContextState] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonText")
  @js.native
  val IonText: ForwardRefExoticComponent[IonTextPickHTMLAttributes] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonTextarea")
  @js.native
  val IonTextarea: ForwardRefExoticComponent[IonTextareaPickHTMLAttrib] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonThumbnail")
  @js.native
  val IonThumbnail: ForwardRefExoticComponent[IonThumbnailPickHTMLAttri] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonTitle")
  @js.native
  val IonTitle: ForwardRefExoticComponent[IonTitlePickHTMLAttribute] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonToast")
  @js.native
  val IonToast: ForwardRefExoticComponent[ToastOptionsReactControll] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonToggle")
  @js.native
  val IonToggle: ForwardRefExoticComponent[IonTogglePickHTMLAttribut] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonToolbar")
  @js.native
  val IonToolbar: ForwardRefExoticComponent[IonToolbarPickHTMLAttribu] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonVirtualScroll")
  @js.native
  val IonVirtualScroll: ForwardRefExoticComponent[IonVirtualScrollPickHTMLA] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "IonicSafeString")
  @js.native
  class IonicSafeString protected ()
    extends typingsSlinky.ionicCore.mod.IonicSafeString {
    def this(value: String) = this()
  }
  
  @JSImport("@ionic/react/dist/types/components", "createAnimation")
  @js.native
  def createAnimation(): Animation = js.native
  @JSImport("@ionic/react/dist/types/components", "createAnimation")
  @js.native
  def createAnimation(animationId: String): Animation = js.native
  
  @JSImport("@ionic/react/dist/types/components", "createGesture")
  @js.native
  def createGesture(config: GestureConfig): Gesture = js.native
  
  @JSImport("@ionic/react/dist/types/components", "getConfig")
  @js.native
  def getConfig(): Config_ | Null = js.native
  
  @JSImport("@ionic/react/dist/types/components", "getPlatforms")
  @js.native
  def getPlatforms(): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  
  @JSImport("@ionic/react/dist/types/components", "iosTransitionAnimation")
  @js.native
  def iosTransitionAnimation(navEl: HTMLElement, opts: TransitionOptions): Animation = js.native
  
  @JSImport("@ionic/react/dist/types/components", "isPlatform")
  @js.native
  def isPlatform(platform: Platforms): Boolean = js.native
  
  @JSImport("@ionic/react/dist/types/components", "mdTransitionAnimation")
  @js.native
  def mdTransitionAnimation(_underscore: HTMLElement, opts: TransitionOptions): Animation = js.native
  
  @JSImport("@ionic/react/dist/types/components", "setupConfig")
  @js.native
  def setupConfig(config: IonicConfig): js.Any = js.native
  
  @JSImport("@ionic/react/dist/types/components", "useIonRouter")
  @js.native
  def useIonRouter(): IonRouterContextState = js.native
}
