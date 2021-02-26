package typingsSlinky.reactMdUtils

import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.Window
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.DependencyList
import typingsSlinky.react.mod.EffectCallback
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.react.mod.ProviderProps
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdUtils.anon.AppSizeinitializedboolean
import typingsSlinky.reactMdUtils.appSizeListenerMod.AppSizeListenerProps
import typingsSlinky.reactMdUtils.bemMod.BEMResult
import typingsSlinky.reactMdUtils.bemMod.Block
import typingsSlinky.reactMdUtils.caseInsensitiveFilterMod.CaseInsensitiveOptions
import typingsSlinky.reactMdUtils.containsElementMod.CheckableThing
import typingsSlinky.reactMdUtils.delegateEventMod.DelegatedEventHandler
import typingsSlinky.reactMdUtils.delegateEventMod.DelegatedEventTarget
import typingsSlinky.reactMdUtils.dirMod.DirProps
import typingsSlinky.reactMdUtils.dirMod.WritingDirection
import typingsSlinky.reactMdUtils.dirMod.WritingDirectionContext
import typingsSlinky.reactMdUtils.focusContainerMod.FocusContainerProps
import typingsSlinky.reactMdUtils.focusElementWithinMod.Focus
import typingsSlinky.reactMdUtils.getInstanceMod.RefOrInstance
import typingsSlinky.reactMdUtils.gridCellMod.GridCellProps
import typingsSlinky.reactMdUtils.gridListCellMod.GridListCellProps
import typingsSlinky.reactMdUtils.gridListMod.GridListProps
import typingsSlinky.reactMdUtils.gridMod.GridProps
import typingsSlinky.reactMdUtils.hexToRGBMod.BlueBit
import typingsSlinky.reactMdUtils.hexToRGBMod.GreenBit
import typingsSlinky.reactMdUtils.hexToRGBMod.HexString
import typingsSlinky.reactMdUtils.hexToRGBMod.RedBit
import typingsSlinky.reactMdUtils.interactionModeMod.InteractionModeListenerProps
import typingsSlinky.reactMdUtils.isContrastCompliantMod.ContrastRatioCompliance
import typingsSlinky.reactMdUtils.mediaOnlyMod.MediaOnlyProps
import typingsSlinky.reactMdUtils.movementTypesMod.MovementConfig
import typingsSlinky.reactMdUtils.reactMdUtilsStrings.height
import typingsSlinky.reactMdUtils.reactMdUtilsStrings.max
import typingsSlinky.reactMdUtils.reactMdUtilsStrings.min
import typingsSlinky.reactMdUtils.reactMdUtilsStrings.width
import typingsSlinky.reactMdUtils.resizeListenerMod.ResizeListenerProps
import typingsSlinky.reactMdUtils.resizeObserverMod.ResizeObserverProps
import typingsSlinky.reactMdUtils.scrollListenerMod.ScrollListenerProps
import typingsSlinky.reactMdUtils.sizingConstantsMod.QuerySize
import typingsSlinky.reactMdUtils.throttleMod.ThrottleableFunction
import typingsSlinky.reactMdUtils.throttleMod.ThrottledFunction
import typingsSlinky.reactMdUtils.touchesMod.TouchTypes
import typingsSlinky.reactMdUtils.typesMod.Coords
import typingsSlinky.reactMdUtils.typesMod.FixedPosition
import typingsSlinky.reactMdUtils.typesMod.FixedPositionOptions
import typingsSlinky.reactMdUtils.typesMod.PositionAnchor
import typingsSlinky.reactMdUtils.typesTypesMod.PropsWithRef
import typingsSlinky.reactMdUtils.unitToNumberMod.UnitToNumberOptions
import typingsSlinky.reactMdUtils.useActiveDescendantMovementMod.ActiveDescendantMovementProviders
import typingsSlinky.reactMdUtils.useActiveDescendantMovementMod.ActiveDescendantOptions
import typingsSlinky.reactMdUtils.useAppSizeMediaMod.AppSize
import typingsSlinky.reactMdUtils.useAppSizeMediaMod.AppSizeOptions
import typingsSlinky.reactMdUtils.useCloseOnOutsideClickMod.CloseOnOutsideClickOptions
import typingsSlinky.reactMdUtils.useEnsuredRefMod.EnsuredRefs
import typingsSlinky.reactMdUtils.useFocusMovementMod.KeyboardFocusOptions
import typingsSlinky.reactMdUtils.useGridListMod.GridListSize
import typingsSlinky.reactMdUtils.useGridListMod.UseGridListOptions
import typingsSlinky.reactMdUtils.useGridListMod.UseGridListReturnValue
import typingsSlinky.reactMdUtils.useIntervalMod.ReturnValue
import typingsSlinky.reactMdUtils.useKeyboardMovementMod.KeyboardMovementOptions
import typingsSlinky.reactMdUtils.useKeyboardMovementMod.KeyboardMovementProviders
import typingsSlinky.reactMdUtils.useKeyboardSearchMod.KeyboardSearchOptions
import typingsSlinky.reactMdUtils.useModeDetectionMod.UserInteractionMode
import typingsSlinky.reactMdUtils.usePreviousFocusMod.FocusFallback
import typingsSlinky.reactMdUtils.useResizeListenerMod.ResizeListenerOptions
import typingsSlinky.reactMdUtils.useResizeObserverMod.OnResizeObserverChange
import typingsSlinky.reactMdUtils.useResizeObserverMod.UseResizeObserverOptions
import typingsSlinky.reactMdUtils.useResizeObserverV1Mod.UseResizeObserverV1Options
import typingsSlinky.reactMdUtils.useScrollListenerMod.Options
import typingsSlinky.reactMdUtils.useWidthMediaQueryMod.WidthMediaQuery
import typingsSlinky.reactMdUtils.useWidthMediaQueryMod.WidthMediaQuerys
import typingsSlinky.reactMdUtils.utilsMod.GetItemValue_
import typingsSlinky.reactMdUtils.utilsMod.SearchOptions
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.DOMRect
import typingsSlinky.std.Omit
import typingsSlinky.std.OrientationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/utils", "AAA_CONTRAST_RATIO")
  @js.native
  val AAA_CONTRAST_RATIO: /* 7 */ Double = js.native
  
  @JSImport("@react-md/utils", "ABOVE_CENTER_ANCHOR")
  @js.native
  val ABOVE_CENTER_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "ABOVE_INNER_LEFT_ANCHOR")
  @js.native
  val ABOVE_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "ABOVE_INNER_RIGHT_ANCHOR")
  @js.native
  val ABOVE_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "ABOVE_LEFT_ANCHOR")
  @js.native
  val ABOVE_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "ABOVE_RIGHT_ANCHOR")
  @js.native
  val ABOVE_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "AppSizeContext")
  @js.native
  val AppSizeContext: Context[AppSizeinitializedboolean] = js.native
  
  object AppSizeListener {
    
    @JSImport("@react-md/utils", "AppSizeListener")
    @js.native
    def apply(
      hasChildrenOnChangePhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSize: AppSizeListenerProps
    ): ReactElement = js.native
    
    object propTypes {
      
      @JSImport("@react-md/utils", "AppSizeListener.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/utils", "AppSizeListener.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils", "AppSizeListener.propTypes.defaultSize")
      @js.native
      def defaultSize: js.Any = js.native
      @scala.inline
      def defaultSize_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSize")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils", "AppSizeListener.propTypes.desktopLargeMinWidth")
      @js.native
      def desktopLargeMinWidth: js.Any = js.native
      @scala.inline
      def desktopLargeMinWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desktopLargeMinWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils", "AppSizeListener.propTypes.desktopMinWidth")
      @js.native
      def desktopMinWidth: js.Any = js.native
      @scala.inline
      def desktopMinWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desktopMinWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils", "AppSizeListener.propTypes.onChange")
      @js.native
      def onChange: js.Any = js.native
      @scala.inline
      def onChange_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils", "AppSizeListener.propTypes.phoneMaxWidth")
      @js.native
      def phoneMaxWidth: js.Any = js.native
      @scala.inline
      def phoneMaxWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phoneMaxWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils", "AppSizeListener.propTypes.tabletMaxWidth")
      @js.native
      def tabletMaxWidth: js.Any = js.native
      @scala.inline
      def tabletMaxWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabletMaxWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils", "AppSizeListener.propTypes.tabletMinWidth")
      @js.native
      def tabletMinWidth: js.Any = js.native
      @scala.inline
      def tabletMinWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabletMinWidth")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/utils", "BELOW_CENTER_ANCHOR")
  @js.native
  val BELOW_CENTER_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "BELOW_INNER_LEFT_ANCHOR")
  @js.native
  val BELOW_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "BELOW_INNER_RIGHT_ANCHOR")
  @js.native
  val BELOW_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "BELOW_LEFT_ANCHOR")
  @js.native
  val BELOW_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "BELOW_RIGHT_ANCHOR")
  @js.native
  val BELOW_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "BOTTOM_CENTER_ANCHOR")
  @js.native
  val BOTTOM_CENTER_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "BOTTOM_INNER_LEFT_ANCHOR")
  @js.native
  val BOTTOM_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "BOTTOM_INNER_RIGHT_ANCHOR")
  @js.native
  val BOTTOM_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "BOTTOM_LEFT_ANCHOR")
  @js.native
  val BOTTOM_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "BOTTOM_RIGHT_ANCHOR")
  @js.native
  val BOTTOM_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "CELL_MARGIN_VAR")
  @js.native
  val CELL_MARGIN_VAR: /* "--rmd-cell-margin" */ String = js.native
  
  @JSImport("@react-md/utils", "CELL_SIZE_VAR")
  @js.native
  val CELL_SIZE_VAR: /* "--rmd-cell-size" */ String = js.native
  
  @JSImport("@react-md/utils", "CENTER_CENTER_ANCHOR")
  @js.native
  val CENTER_CENTER_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "CENTER_INNER_LEFT_ANCHOR")
  @js.native
  val CENTER_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "CENTER_INNER_RIGHT_ANCHOR")
  @js.native
  val CENTER_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "CENTER_LEFT_ANCHOR")
  @js.native
  val CENTER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "CENTER_RIGHT_ANCHOR")
  @js.native
  val CENTER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "DATA_RMD_NOSCROLL")
  @js.native
  val DATA_RMD_NOSCROLL: /* "data-rmd-noscroll" */ String = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_APP_SIZE")
  @js.native
  val DEFAULT_APP_SIZE: AppSize = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_DESKTOP_LARGE_MIN_WIDTH")
  @js.native
  val DEFAULT_DESKTOP_LARGE_MIN_WIDTH: QuerySize = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_DESKTOP_MIN_WIDTH")
  @js.native
  val DEFAULT_DESKTOP_MIN_WIDTH: QuerySize = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_DIR")
  @js.native
  def DEFAULT_DIR(): WritingDirection = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_GET_ITEM_VALUE")
  @js.native
  val DEFAULT_GET_ITEM_VALUE: js.Function2[/* item */ js.Any, /* valueKey */ js.UndefOr[String], String] = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_GRID_LIST_MAX_CELL_SIZE")
  @js.native
  val DEFAULT_GRID_LIST_MAX_CELL_SIZE: /* 150 */ Double = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_GRID_LIST_PADDING")
  @js.native
  val DEFAULT_GRID_LIST_PADDING: /* 16 */ Double = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_IGNORE_WHITESPACE")
  @js.native
  val DEFAULT_IGNORE_WHITESPACE: /* false */ Boolean = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_PHONE_MAX_WIDTH")
  @js.native
  val DEFAULT_PHONE_MAX_WIDTH: QuerySize = js.native
  
  /* Inlined std.Required<@react-md/utils.@react-md/utils/types/search/utils.SearchOptions<unknown>> */
  object DEFAULT_SEARCH_OPTIONS {
    
    @JSImport("@react-md/utils", "DEFAULT_SEARCH_OPTIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-md/utils", "DEFAULT_SEARCH_OPTIONS.getItemValue")
    @js.native
    def getItemValue: GetItemValue_[js.Any] = js.native
    @scala.inline
    def getItemValue_=(x: GetItemValue_[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getItemValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-md/utils", "DEFAULT_SEARCH_OPTIONS.ignoreWhitespace")
    @js.native
    def ignoreWhitespace: Boolean = js.native
    @scala.inline
    def ignoreWhitespace_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreWhitespace")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-md/utils", "DEFAULT_SEARCH_OPTIONS.trim")
    @js.native
    def trim: Boolean = js.native
    @scala.inline
    def trim_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trim")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-md/utils", "DEFAULT_SEARCH_OPTIONS.valueKey")
    @js.native
    def valueKey: String = js.native
    @scala.inline
    def valueKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valueKey")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@react-md/utils", "DEFAULT_SEARCH_RESET_TIME")
  @js.native
  val DEFAULT_SEARCH_RESET_TIME: /* 500 */ Double = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_TABLET_MAX_WIDTH")
  @js.native
  val DEFAULT_TABLET_MAX_WIDTH: QuerySize = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_TABLET_MIN_WIDTH")
  @js.native
  val DEFAULT_TABLET_MIN_WIDTH: QuerySize = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_TRIM")
  @js.native
  val DEFAULT_TRIM: /* true */ Boolean = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_VALUE_KEY")
  @js.native
  val DEFAULT_VALUE_KEY: /* "value" */ String = js.native
  
  @JSImport("@react-md/utils", "DesktopOnly")
  @js.native
  val DesktopOnly: ReactComponentClass[MediaOnlyProps] = js.native
  
  object Dir {
    
    @JSImport("@react-md/utils", "Dir")
    @js.native
    def apply(hasChildrenDefaultDir: DirProps): ReactElement = js.native
    
    object propTypes {
      
      @JSImport("@react-md/utils", "Dir.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/utils", "Dir.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils", "Dir.propTypes.defaultDir")
      @js.native
      def defaultDir: js.Any = js.native
      @scala.inline
      def defaultDir_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultDir")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/utils", "FocusContainer")
  @js.native
  val FocusContainer: ForwardRefExoticComponent[FocusContainerProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/utils", "GRID_COLUMNS_VAR")
  @js.native
  val GRID_COLUMNS_VAR: /* "--rmd-grid-cols" */ String = js.native
  
  @JSImport("@react-md/utils", "GRID_GUTTER_VAR")
  @js.native
  val GRID_GUTTER_VAR: /* "--rmd-grid-gutter" */ String = js.native
  
  @JSImport("@react-md/utils", "Grid")
  @js.native
  val Grid: ForwardRefExoticComponent[GridProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/utils", "GridCell")
  @js.native
  val GridCell: ForwardRefExoticComponent[GridCellProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/utils", "GridList")
  @js.native
  val GridList: ForwardRefExoticComponent[GridListProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/utils", "GridListCell")
  @js.native
  val GridListCell: ForwardRefExoticComponent[GridListCellProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/utils", "GridListSizeProvider")
  @js.native
  val GridListSizeProvider: ReactComponentClass[ProviderProps[GridListSize]] = js.native
  
  @JSImport("@react-md/utils", "IncrementMovementKey")
  @js.native
  object IncrementMovementKey extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey with String] = js.native
    
    /* "Alt+ArrowDown" */ val AltArrowDown: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.AltArrowDown with String = js.native
    
    /* "Alt+ArrowLeft" */ val AltArrowLeft: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.AltArrowLeft with String = js.native
    
    /* "Alt+ArrowRight" */ val AltArrowRight: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.AltArrowRight with String = js.native
    
    /* "Alt+ArrowUp" */ val AltArrowUp: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.AltArrowUp with String = js.native
    
    /* "Alt+PageDown" */ val AltPageDown: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.AltPageDown with String = js.native
    
    /* "Alt+PageUp" */ val AltPageUp: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.AltPageUp with String = js.native
    
    /* "ArrowDown" */ val ArrowDown: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.ArrowDown with String = js.native
    
    /* "ArrowLeft" */ val ArrowLeft: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.ArrowLeft with String = js.native
    
    /* "ArrowRight" */ val ArrowRight: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.ArrowRight with String = js.native
    
    /* "ArrowUp" */ val ArrowUp: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.ArrowUp with String = js.native
    
    /* "Control+ArrowDown" */ val ControlArrowDown: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.ControlArrowDown with String = js.native
    
    /* "Control+ArrowUp" */ val ControlArrowUp: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.ControlArrowUp with String = js.native
    
    /* "PageDown" */ val PageDown: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.PageDown with String = js.native
    
    /* "PageUp" */ val PageUp: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.PageUp with String = js.native
    
    /* "Shift+ArrowDown" */ val ShiftArrowDown: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.ShiftArrowDown with String = js.native
    
    /* "Shift+ArrowLeft" */ val ShiftArrowLeft: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.ShiftArrowLeft with String = js.native
    
    /* "Shift+ArrowRight" */ val ShiftArrowRight: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.ShiftArrowRight with String = js.native
    
    /* "Shift+ArrowUp" */ val ShiftArrowUp: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.ShiftArrowUp with String = js.native
  }
  
  object InteractionModeListener {
    
    @JSImport("@react-md/utils", "InteractionModeListener")
    @js.native
    def apply(hasChildren: InteractionModeListenerProps): ReactElement = js.native
    
    object propTypes {
      
      @JSImport("@react-md/utils", "InteractionModeListener.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/utils", "InteractionModeListener.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/utils", "JumpMovementKey")
  @js.native
  object JumpMovementKey extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.reactMdUtils.movementTypesMod.JumpMovementKey with String] = js.native
    
    /* "Alt+End" */ val AltEnd: typingsSlinky.reactMdUtils.movementTypesMod.JumpMovementKey.AltEnd with String = js.native
    
    /* "Alt+Home" */ val AltHome: typingsSlinky.reactMdUtils.movementTypesMod.JumpMovementKey.AltHome with String = js.native
    
    /* "Control+End" */ val ControlEnd: typingsSlinky.reactMdUtils.movementTypesMod.JumpMovementKey.ControlEnd with String = js.native
    
    /* "Control+Home" */ val ControlHome: typingsSlinky.reactMdUtils.movementTypesMod.JumpMovementKey.ControlHome with String = js.native
    
    /* "Control+Shift+End" */ val ControlShiftEnd: typingsSlinky.reactMdUtils.movementTypesMod.JumpMovementKey.ControlShiftEnd with String = js.native
    
    /* "Control+Shift+Home" */ val ControlShiftHome: typingsSlinky.reactMdUtils.movementTypesMod.JumpMovementKey.ControlShiftHome with String = js.native
    
    /* "End" */ val End: typingsSlinky.reactMdUtils.movementTypesMod.JumpMovementKey.End with String = js.native
    
    /* "Home" */ val Home: typingsSlinky.reactMdUtils.movementTypesMod.JumpMovementKey.Home with String = js.native
  }
  
  @JSImport("@react-md/utils", "LARGE_TEXT_CONTRAST_RATIO")
  @js.native
  val LARGE_TEXT_CONTRAST_RATIO: /* 3 */ Double = js.native
  
  @JSImport("@react-md/utils", "MobileOnly")
  @js.native
  val MobileOnly: ReactComponentClass[MediaOnlyProps] = js.native
  
  object MovementPresets {
    
    @JSImport("@react-md/utils", "MovementPresets.HORIZONTAL_COMBOBOX")
    @js.native
    val HORIZONTAL_COMBOBOX: MovementConfig = js.native
    
    @JSImport("@react-md/utils", "MovementPresets.HORIZONTAL_LISTBOX")
    @js.native
    val HORIZONTAL_LISTBOX: MovementConfig = js.native
    
    @JSImport("@react-md/utils", "MovementPresets.HORIZONTAL_MENU")
    @js.native
    val HORIZONTAL_MENU: MovementConfig = js.native
    
    @JSImport("@react-md/utils", "MovementPresets.HORIZONTAL_TABS")
    @js.native
    val HORIZONTAL_TABS: MovementConfig = js.native
    
    @JSImport("@react-md/utils", "MovementPresets.HORIZONTAL_TREE")
    @js.native
    val HORIZONTAL_TREE: MovementConfig = js.native
    
    @JSImport("@react-md/utils", "MovementPresets.VERTICAL_COMBOBOX")
    @js.native
    val VERTICAL_COMBOBOX: MovementConfig = js.native
    
    @JSImport("@react-md/utils", "MovementPresets.VERTICAL_LISTBOX")
    @js.native
    val VERTICAL_LISTBOX: MovementConfig = js.native
    
    @JSImport("@react-md/utils", "MovementPresets.VERTICAL_MENU")
    @js.native
    val VERTICAL_MENU: MovementConfig = js.native
    
    @JSImport("@react-md/utils", "MovementPresets.VERTICAL_TABS")
    @js.native
    val VERTICAL_TABS: MovementConfig = js.native
    
    @JSImport("@react-md/utils", "MovementPresets.VERTICAL_TREE")
    @js.native
    val VERTICAL_TREE: MovementConfig = js.native
  }
  
  @JSImport("@react-md/utils", "NORMAL_TEXT_CONTRAST_RATIO")
  @js.native
  val NORMAL_TEXT_CONTRAST_RATIO: /* 4.5 */ Double = js.native
  
  object PassiveEvents {
    
    @JSImport("@react-md/utils", "PassiveEvents")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-md/utils", "PassiveEvents.isSupported")
    @js.native
    def isSupported: Boolean = js.native
    @scala.inline
    def isSupported_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSupported")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-md/utils", "PassiveEvents.update")
    @js.native
    def update(): Boolean = js.native
  }
  
  @JSImport("@react-md/utils", "PhoneOnly")
  @js.native
  val PhoneOnly: ReactComponentClass[MediaOnlyProps] = js.native
  
  object ResizeListener {
    
    @JSImport("@react-md/utils", "ResizeListener")
    @js.native
    def apply(hasOnResizeOptionsImmediate: ResizeListenerProps): Null = js.native
    
    object propTypes {
      
      @JSImport("@react-md/utils", "ResizeListener.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/utils", "ResizeListener.propTypes.immediate")
      @js.native
      def immediate: js.Any = js.native
      @scala.inline
      def immediate_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("immediate")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils", "ResizeListener.propTypes.onResize")
      @js.native
      def onResize: js.Any = js.native
      @scala.inline
      def onResize_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResize")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils", "ResizeListener.propTypes.options")
      @js.native
      def options: js.Any = js.native
      @scala.inline
      def options_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
    }
  }
  
  object ResizeObserver {
    
    @JSImport("@react-md/utils", "ResizeObserver")
    @js.native
    def apply(hasDisableHeightDisableWidthClassNameComponentTargetOnResize: ResizeObserverProps): ReactElement | Null = js.native
    
    object propTypes {
      
      @JSImport("@react-md/utils", "ResizeObserver.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/utils", "ResizeObserver.propTypes.className")
      @js.native
      def className: js.Any = js.native
      @scala.inline
      def className_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils", "ResizeObserver.propTypes.component")
      @js.native
      def component: js.Any = js.native
      @scala.inline
      def component_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils", "ResizeObserver.propTypes.disableHeight")
      @js.native
      def disableHeight: js.Any = js.native
      @scala.inline
      def disableHeight_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableHeight")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils", "ResizeObserver.propTypes.disableWidth")
      @js.native
      def disableWidth: js.Any = js.native
      @scala.inline
      def disableWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils", "ResizeObserver.propTypes.target")
      @js.native
      def target: js.Any = js.native
      @scala.inline
      def target_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("target")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/utils", "ScrollListener")
  @js.native
  def ScrollListener(props: ScrollListenerProps): Null = js.native
  
  @JSImport("@react-md/utils", "TOP_CENTER_ANCHOR")
  @js.native
  val TOP_CENTER_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "TOP_INNER_LEFT_ANCHOR")
  @js.native
  val TOP_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "TOP_INNER_RIGHT_ANCHOR")
  @js.native
  val TOP_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "TOP_LEFT_ANCHOR")
  @js.native
  val TOP_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "TOP_RIGHT_ANCHOR")
  @js.native
  val TOP_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "TabletOnly")
  @js.native
  val TabletOnly: ReactComponentClass[MediaOnlyProps] = js.native
  
  @JSImport("@react-md/utils", "addTouchEvent")
  @js.native
  def addTouchEvent(
    /**
    * The element to add the touch event to.
    */
  el: HTMLElement,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit]
  ): Unit = js.native
  @JSImport("@react-md/utils", "addTouchEvent")
  @js.native
  def addTouchEvent(
    /**
    * The element to add the touch event to.
    */
  el: HTMLElement,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: js.UndefOr[scala.Nothing],
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@react-md/utils", "addTouchEvent")
  @js.native
  def addTouchEvent(
    /**
    * The element to add the touch event to.
    */
  el: HTMLElement,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean
  ): Unit = js.native
  @JSImport("@react-md/utils", "addTouchEvent")
  @js.native
  def addTouchEvent(
    /**
    * The element to add the touch event to.
    */
  el: HTMLElement,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@react-md/utils", "addTouchEvent")
  @js.native
  def addTouchEvent(
    /**
    * The element to add the touch event to.
    */
  el: Window,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit]
  ): Unit = js.native
  @JSImport("@react-md/utils", "addTouchEvent")
  @js.native
  def addTouchEvent(
    /**
    * The element to add the touch event to.
    */
  el: Window,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: js.UndefOr[scala.Nothing],
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@react-md/utils", "addTouchEvent")
  @js.native
  def addTouchEvent(
    /**
    * The element to add the touch event to.
    */
  el: Window,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean
  ): Unit = js.native
  @JSImport("@react-md/utils", "addTouchEvent")
  @js.native
  def addTouchEvent(
    /**
    * The element to add the touch event to.
    */
  el: Window,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = js.native
  
  @JSImport("@react-md/utils", "applyRef")
  @js.native
  def applyRef[E](): Unit = js.native
  @JSImport("@react-md/utils", "applyRef")
  @js.native
  def applyRef[E](instance: E): Unit = js.native
  @JSImport("@react-md/utils", "applyRef")
  @js.native
  def applyRef[E](instance: E, ref: Ref[E]): Unit = js.native
  @JSImport("@react-md/utils", "applyRef")
  @js.native
  def applyRef[E](instance: Null, ref: Ref[E]): Unit = js.native
  
  @JSImport("@react-md/utils", "bem")
  @js.native
  def bem(base: Block): BEMResult = js.native
  
  @JSImport("@react-md/utils", "caseInsensitiveFilter")
  @js.native
  def caseInsensitiveFilter[T](query: String, searchable: js.Array[T]): js.Array[T] = js.native
  @JSImport("@react-md/utils", "caseInsensitiveFilter")
  @js.native
  def caseInsensitiveFilter[T](query: String, searchable: js.Array[T], options: CaseInsensitiveOptions[T]): js.Array[T] = js.native
  
  @JSImport("@react-md/utils", "containsElement")
  @js.native
  def containsElement(container: CheckableThing, child: CheckableThing): Boolean = js.native
  
  @JSImport("@react-md/utils", "defaults")
  @js.native
  def defaults[O /* <: js.Object */, R /* <: js.Object */](optional: O, required: R): O with R = js.native
  
  @JSImport("@react-md/utils", "delegateEvent")
  @js.native
  def delegateEvent(eventType: String): DelegatedEventHandler = js.native
  @JSImport("@react-md/utils", "delegateEvent")
  @js.native
  def delegateEvent(
    eventType: String,
    eventTarget: js.UndefOr[DelegatedEventTarget],
    throttle: js.UndefOr[scala.Nothing],
    options: Boolean
  ): DelegatedEventHandler = js.native
  @JSImport("@react-md/utils", "delegateEvent")
  @js.native
  def delegateEvent(
    eventType: String,
    eventTarget: js.UndefOr[DelegatedEventTarget],
    throttle: js.UndefOr[scala.Nothing],
    options: AddEventListenerOptions
  ): DelegatedEventHandler = js.native
  @JSImport("@react-md/utils", "delegateEvent")
  @js.native
  def delegateEvent(eventType: String, eventTarget: js.UndefOr[DelegatedEventTarget], throttle: Boolean): DelegatedEventHandler = js.native
  @JSImport("@react-md/utils", "delegateEvent")
  @js.native
  def delegateEvent(
    eventType: String,
    eventTarget: js.UndefOr[DelegatedEventTarget],
    throttle: Boolean,
    options: Boolean
  ): DelegatedEventHandler = js.native
  @JSImport("@react-md/utils", "delegateEvent")
  @js.native
  def delegateEvent(
    eventType: String,
    eventTarget: js.UndefOr[DelegatedEventTarget],
    throttle: Boolean,
    options: AddEventListenerOptions
  ): DelegatedEventHandler = js.native
  @JSImport("@react-md/utils", "delegateEvent")
  @js.native
  def delegateEvent(eventType: String, eventTarget: DelegatedEventTarget): DelegatedEventHandler = js.native
  
  @JSImport("@react-md/utils", "disable")
  @js.native
  def disable(element: HTMLElement): Unit = js.native
  
  @JSImport("@react-md/utils", "enable")
  @js.native
  def enable(element: HTMLElement): Unit = js.native
  
  @JSImport("@react-md/utils", "extractTextContent")
  @js.native
  def extractTextContent(stringOrElement: String): String = js.native
  @JSImport("@react-md/utils", "extractTextContent")
  @js.native
  def extractTextContent(stringOrElement: String, fontIconQuerySelector: String): String = js.native
  @JSImport("@react-md/utils", "extractTextContent")
  @js.native
  def extractTextContent(stringOrElement: HTMLElement): String = js.native
  @JSImport("@react-md/utils", "extractTextContent")
  @js.native
  def extractTextContent(stringOrElement: HTMLElement, fontIconQuerySelector: String): String = js.native
  
  @JSImport("@react-md/utils", "findIgnoreCase")
  @js.native
  def findIgnoreCase[T](query: String, searchable: js.Array[T]): T | Null = js.native
  @JSImport("@react-md/utils", "findIgnoreCase")
  @js.native
  def findIgnoreCase[T](query: String, searchable: js.Array[T], options: SearchOptions[T]): T | Null = js.native
  
  @JSImport("@react-md/utils", "findMatchInRange")
  @js.native
  def findMatchInRange(value: String, values: js.Array[String], startIndex: Double, endIndex: Double): Double = js.native
  
  @JSImport("@react-md/utils", "findMatchIndex")
  @js.native
  def findMatchIndex(value: String, values: js.Array[String], startIndex: Double): Double = js.native
  @JSImport("@react-md/utils", "findMatchIndex")
  @js.native
  def findMatchIndex(value: String, values: js.Array[String], startIndex: Double, isSelfMatchable: Boolean): Double = js.native
  
  @JSImport("@react-md/utils", "findSizingContainer")
  @js.native
  def findSizingContainer(): HTMLElement | Null = js.native
  @JSImport("@react-md/utils", "findSizingContainer")
  @js.native
  def findSizingContainer(el: HTMLElement): HTMLElement | Null = js.native
  
  @JSImport("@react-md/utils", "focusElementWithin")
  @js.native
  def focusElementWithin(container: Document, focus: Focus): Unit = js.native
  @JSImport("@react-md/utils", "focusElementWithin")
  @js.native
  def focusElementWithin(
    container: Document,
    focus: Focus,
    programatic: js.UndefOr[scala.Nothing],
    preventScroll: js.UndefOr[scala.Nothing],
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  @JSImport("@react-md/utils", "focusElementWithin")
  @js.native
  def focusElementWithin(container: Document, focus: Focus, programatic: js.UndefOr[scala.Nothing], preventScroll: Boolean): Unit = js.native
  @JSImport("@react-md/utils", "focusElementWithin")
  @js.native
  def focusElementWithin(
    container: Document,
    focus: Focus,
    programatic: js.UndefOr[scala.Nothing],
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  @JSImport("@react-md/utils", "focusElementWithin")
  @js.native
  def focusElementWithin(container: Document, focus: Focus, programatic: Boolean): Unit = js.native
  @JSImport("@react-md/utils", "focusElementWithin")
  @js.native
  def focusElementWithin(
    container: Document,
    focus: Focus,
    programatic: Boolean,
    preventScroll: js.UndefOr[scala.Nothing],
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  @JSImport("@react-md/utils", "focusElementWithin")
  @js.native
  def focusElementWithin(container: Document, focus: Focus, programatic: Boolean, preventScroll: Boolean): Unit = js.native
  @JSImport("@react-md/utils", "focusElementWithin")
  @js.native
  def focusElementWithin(
    container: Document,
    focus: Focus,
    programatic: Boolean,
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  @JSImport("@react-md/utils", "focusElementWithin")
  @js.native
  def focusElementWithin(container: HTMLElement, focus: Focus): Unit = js.native
  @JSImport("@react-md/utils", "focusElementWithin")
  @js.native
  def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programatic: js.UndefOr[scala.Nothing],
    preventScroll: js.UndefOr[scala.Nothing],
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  @JSImport("@react-md/utils", "focusElementWithin")
  @js.native
  def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programatic: js.UndefOr[scala.Nothing],
    preventScroll: Boolean
  ): Unit = js.native
  @JSImport("@react-md/utils", "focusElementWithin")
  @js.native
  def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programatic: js.UndefOr[scala.Nothing],
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  @JSImport("@react-md/utils", "focusElementWithin")
  @js.native
  def focusElementWithin(container: HTMLElement, focus: Focus, programatic: Boolean): Unit = js.native
  @JSImport("@react-md/utils", "focusElementWithin")
  @js.native
  def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programatic: Boolean,
    preventScroll: js.UndefOr[scala.Nothing],
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  @JSImport("@react-md/utils", "focusElementWithin")
  @js.native
  def focusElementWithin(container: HTMLElement, focus: Focus, programatic: Boolean, preventScroll: Boolean): Unit = js.native
  @JSImport("@react-md/utils", "focusElementWithin")
  @js.native
  def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programatic: Boolean,
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  
  @JSImport("@react-md/utils", "fuzzyFilter")
  @js.native
  def fuzzyFilter[T](query: String, searchable: js.Array[T]): js.Array[T] = js.native
  @JSImport("@react-md/utils", "fuzzyFilter")
  @js.native
  def fuzzyFilter[T](query: String, searchable: js.Array[T], options: SearchOptions[T]): js.Array[T] = js.native
  
  @JSImport("@react-md/utils", "getContrastRatio")
  @js.native
  def getContrastRatio(background: HexString, foreground: HexString): Double = js.native
  
  @JSImport("@react-md/utils", "getElement")
  @js.native
  def getElement[E /* <: HTMLElement */](): E | Null = js.native
  @JSImport("@react-md/utils", "getElement")
  @js.native
  def getElement[E /* <: HTMLElement */](element: E): E | Null = js.native
  @JSImport("@react-md/utils", "getElement")
  @js.native
  def getElement[E /* <: HTMLElement */](element: MutableRefObject[E | Null]): E | Null = js.native
  
  @JSImport("@react-md/utils", "getElementRect")
  @js.native
  def getElementRect(element: HTMLElement): DOMRect | ClientRect = js.native
  @JSImport("@react-md/utils", "getElementRect")
  @js.native
  def getElementRect(element: HTMLElement, coords: Coords): DOMRect | ClientRect = js.native
  
  @JSImport("@react-md/utils", "getFixedPosition")
  @js.native
  def getFixedPosition(
    hasContainerElementAnchorInitialXInitialYVwMarginVhMarginXMarginYMarginWidthPreventOverlapTransformOriginDisableSwappingDisableVHBounds: FixedPositionOptions
  ): FixedPosition = js.native
  
  @JSImport("@react-md/utils", "getFocusableElements")
  @js.native
  def getFocusableElements(container: Document): js.Array[HTMLElement] = js.native
  @JSImport("@react-md/utils", "getFocusableElements")
  @js.native
  def getFocusableElements(container: Document, programatic: Boolean): js.Array[HTMLElement] = js.native
  @JSImport("@react-md/utils", "getFocusableElements")
  @js.native
  def getFocusableElements(container: HTMLElement): js.Array[HTMLElement] = js.native
  @JSImport("@react-md/utils", "getFocusableElements")
  @js.native
  def getFocusableElements(container: HTMLElement, programatic: Boolean): js.Array[HTMLElement] = js.native
  
  @JSImport("@react-md/utils", "getFuzzyRegExp")
  @js.native
  def getFuzzyRegExp(query: String): js.RegExp = js.native
  
  @JSImport("@react-md/utils", "getItemId")
  @js.native
  def getItemId(id: String, i: Double): String = js.native
  
  @JSImport("@react-md/utils", "getItemValue")
  @js.native
  def getItemValue(item: js.Any): String = js.native
  @JSImport("@react-md/utils", "getItemValue")
  @js.native
  def getItemValue(item: js.Any, valueKey: String): String = js.native
  
  @JSImport("@react-md/utils", "getOrientationType")
  @js.native
  def getOrientationType(): OrientationType = js.native
  
  @JSImport("@react-md/utils", "getPercentage")
  @js.native
  def getPercentage(min: Double, max: Double, value: Double): Double = js.native
  
  @JSImport("@react-md/utils", "getSearchString")
  @js.native
  def getSearchString(value: String): String = js.native
  @JSImport("@react-md/utils", "getSearchString")
  @js.native
  def getSearchString(
    value: String,
    lowercase: js.UndefOr[scala.Nothing],
    trim: js.UndefOr[scala.Nothing],
    ignoreWhitespace: Boolean
  ): String = js.native
  @JSImport("@react-md/utils", "getSearchString")
  @js.native
  def getSearchString(value: String, lowercase: js.UndefOr[scala.Nothing], trim: Boolean): String = js.native
  @JSImport("@react-md/utils", "getSearchString")
  @js.native
  def getSearchString(value: String, lowercase: js.UndefOr[scala.Nothing], trim: Boolean, ignoreWhitespace: Boolean): String = js.native
  @JSImport("@react-md/utils", "getSearchString")
  @js.native
  def getSearchString(value: String, lowercase: Boolean): String = js.native
  @JSImport("@react-md/utils", "getSearchString")
  @js.native
  def getSearchString(value: String, lowercase: Boolean, trim: js.UndefOr[scala.Nothing], ignoreWhitespace: Boolean): String = js.native
  @JSImport("@react-md/utils", "getSearchString")
  @js.native
  def getSearchString(value: String, lowercase: Boolean, trim: Boolean): String = js.native
  @JSImport("@react-md/utils", "getSearchString")
  @js.native
  def getSearchString(value: String, lowercase: Boolean, trim: Boolean, ignoreWhitespace: Boolean): String = js.native
  
  @JSImport("@react-md/utils", "getViewportSize")
  @js.native
  def getViewportSize_height(direction: height): Double = js.native
  @JSImport("@react-md/utils", "getViewportSize")
  @js.native
  def getViewportSize_width(direction: width): Double = js.native
  
  @JSImport("@react-md/utils", "hexToRGB")
  @js.native
  def hexToRGB(hex: HexString): js.Tuple3[RedBit, GreenBit, BlueBit] = js.native
  
  @JSImport("@react-md/utils", "isContrastCompliant")
  @js.native
  def isContrastCompliant(background: HexString, foreground: HexString): Boolean = js.native
  @JSImport("@react-md/utils", "isContrastCompliant")
  @js.native
  def isContrastCompliant(background: HexString, foreground: HexString, compliance: Double): Boolean = js.native
  @JSImport("@react-md/utils", "isContrastCompliant")
  @js.native
  def isContrastCompliant(background: HexString, foreground: HexString, compliance: ContrastRatioCompliance): Boolean = js.native
  
  @JSImport("@react-md/utils", "loop")
  @js.native
  def loop(x: Double, max: Double, increment: Boolean): Double = js.native
  @JSImport("@react-md/utils", "loop")
  @js.native
  def loop(x: Double, max: Double, increment: Boolean, minmax: Boolean): Double = js.native
  
  @JSImport("@react-md/utils", "nearest")
  @js.native
  def nearest(value: Double, min: Double, max: Double, steps: Double): Double = js.native
  
  @JSImport("@react-md/utils", "omit")
  @js.native
  def omit[T /* <: js.Object */, K /* <: /* keyof T */ String */](`object`: T, omitKeys: js.Array[K | String]): Omit[T, K] = js.native
  
  @JSImport("@react-md/utils", "removeTouchEvent")
  @js.native
  def removeTouchEvent(
    el: HTMLElement,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit]
  ): Unit = js.native
  @JSImport("@react-md/utils", "removeTouchEvent")
  @js.native
  def removeTouchEvent(
    el: HTMLElement,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: js.UndefOr[scala.Nothing],
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@react-md/utils", "removeTouchEvent")
  @js.native
  def removeTouchEvent(
    el: HTMLElement,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean
  ): Unit = js.native
  @JSImport("@react-md/utils", "removeTouchEvent")
  @js.native
  def removeTouchEvent(
    el: HTMLElement,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@react-md/utils", "removeTouchEvent")
  @js.native
  def removeTouchEvent(
    el: Window,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit]
  ): Unit = js.native
  @JSImport("@react-md/utils", "removeTouchEvent")
  @js.native
  def removeTouchEvent(
    el: Window,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: js.UndefOr[scala.Nothing],
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@react-md/utils", "removeTouchEvent")
  @js.native
  def removeTouchEvent(
    el: Window,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean
  ): Unit = js.native
  @JSImport("@react-md/utils", "removeTouchEvent")
  @js.native
  def removeTouchEvent(
    el: Window,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = js.native
  
  @JSImport("@react-md/utils", "scrollIntoView")
  @js.native
  def scrollIntoView(): Unit = js.native
  @JSImport("@react-md/utils", "scrollIntoView")
  @js.native
  def scrollIntoView(container: HTMLElement): Unit = js.native
  @JSImport("@react-md/utils", "scrollIntoView")
  @js.native
  def scrollIntoView(container: HTMLElement, element: HTMLElement): Unit = js.native
  @JSImport("@react-md/utils", "scrollIntoView")
  @js.native
  def scrollIntoView(container: Null, element: HTMLElement): Unit = js.native
  
  @JSImport("@react-md/utils", "setTouchEvent")
  @js.native
  def setTouchEvent(
    /**
    * Boolean if the event should be added or removed.
    */
  add: Boolean,
    /**
    * The element to add the touch event to.
    */
  el: HTMLElement,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit]
  ): Unit = js.native
  @JSImport("@react-md/utils", "setTouchEvent")
  @js.native
  def setTouchEvent(
    /**
    * Boolean if the event should be added or removed.
    */
  add: Boolean,
    /**
    * The element to add the touch event to.
    */
  el: HTMLElement,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: js.UndefOr[scala.Nothing],
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@react-md/utils", "setTouchEvent")
  @js.native
  def setTouchEvent(
    /**
    * Boolean if the event should be added or removed.
    */
  add: Boolean,
    /**
    * The element to add the touch event to.
    */
  el: HTMLElement,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean
  ): Unit = js.native
  @JSImport("@react-md/utils", "setTouchEvent")
  @js.native
  def setTouchEvent(
    /**
    * Boolean if the event should be added or removed.
    */
  add: Boolean,
    /**
    * The element to add the touch event to.
    */
  el: HTMLElement,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@react-md/utils", "setTouchEvent")
  @js.native
  def setTouchEvent(
    /**
    * Boolean if the event should be added or removed.
    */
  add: Boolean,
    /**
    * The element to add the touch event to.
    */
  el: Window,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit]
  ): Unit = js.native
  @JSImport("@react-md/utils", "setTouchEvent")
  @js.native
  def setTouchEvent(
    /**
    * Boolean if the event should be added or removed.
    */
  add: Boolean,
    /**
    * The element to add the touch event to.
    */
  el: Window,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: js.UndefOr[scala.Nothing],
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@react-md/utils", "setTouchEvent")
  @js.native
  def setTouchEvent(
    /**
    * Boolean if the event should be added or removed.
    */
  add: Boolean,
    /**
    * The element to add the touch event to.
    */
  el: Window,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean
  ): Unit = js.native
  @JSImport("@react-md/utils", "setTouchEvent")
  @js.native
  def setTouchEvent(
    /**
    * Boolean if the event should be added or removed.
    */
  add: Boolean,
    /**
    * The element to add the touch event to.
    */
  el: Window,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = js.native
  
  @JSImport("@react-md/utils", "throttle")
  @js.native
  def throttle[F /* <: ThrottleableFunction */](fn: F, wait: Double): ThrottledFunction[F] = js.native
  
  @JSImport("@react-md/utils", "toWidthPart")
  @js.native
  def toWidthPart_max(v: js.UndefOr[QuerySize], prefix: max): String = js.native
  @JSImport("@react-md/utils", "toWidthPart")
  @js.native
  def toWidthPart_min(v: js.UndefOr[QuerySize], prefix: min): String = js.native
  
  @JSImport("@react-md/utils", "unitToNumber")
  @js.native
  def unitToNumber(unit: String): Double = js.native
  @JSImport("@react-md/utils", "unitToNumber")
  @js.native
  def unitToNumber(unit: String, options: UnitToNumberOptions): Double = js.native
  @JSImport("@react-md/utils", "unitToNumber")
  @js.native
  def unitToNumber(unit: Double): Double = js.native
  @JSImport("@react-md/utils", "unitToNumber")
  @js.native
  def unitToNumber(unit: Double, options: UnitToNumberOptions): Double = js.native
  
  @JSImport("@react-md/utils", "useActiveDescendantMovement")
  @js.native
  def useActiveDescendantMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](
    hasBaseIdGetIdDefaultFocusedIndexItemsOnChangeGetItemValueValueKeyOnKeyDownOnEnterOnSpaceOptions: ActiveDescendantOptions[D, CE, IE]
  ): ActiveDescendantMovementProviders[CE, IE] = js.native
  
  @JSImport("@react-md/utils", "useAppSize")
  @js.native
  def useAppSize(): AppSize = js.native
  
  @JSImport("@react-md/utils", "useAppSizeMedia")
  @js.native
  def useAppSizeMedia(): AppSize = js.native
  @JSImport("@react-md/utils", "useAppSizeMedia")
  @js.native
  def useAppSizeMedia(
    hasPhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSize: AppSizeOptions
  ): AppSize = js.native
  
  @JSImport("@react-md/utils", "useCloseOnEscape")
  @js.native
  def useCloseOnEscape[E /* <: HTMLElement */](onRequestClose: js.Function0[Unit], disabled: Boolean): js.UndefOr[KeyboardEventHandler[E]] = js.native
  @JSImport("@react-md/utils", "useCloseOnEscape")
  @js.native
  def useCloseOnEscape[E /* <: HTMLElement */](onRequestClose: js.Function0[Unit], disabled: Boolean, onKeyDown: KeyboardEventHandler[E]): js.UndefOr[KeyboardEventHandler[E]] = js.native
  
  @JSImport("@react-md/utils", "useCloseOnOutsideClick")
  @js.native
  def useCloseOnOutsideClick[E /* <: HTMLElement */](hasEnabledElementOnOutsideClick: CloseOnOutsideClickOptions[E]): Unit = js.native
  
  @JSImport("@react-md/utils", "useDir")
  @js.native
  def useDir(): WritingDirectionContext = js.native
  
  @JSImport("@react-md/utils", "useEnsuredRef")
  @js.native
  def useEnsuredRef[E /* <: HTMLElement */](): EnsuredRefs[E] = js.native
  @JSImport("@react-md/utils", "useEnsuredRef")
  @js.native
  def useEnsuredRef[E /* <: HTMLElement */](propRef: Ref[E | Null]): EnsuredRefs[E] = js.native
  
  @JSImport("@react-md/utils", "useFocusMovement")
  @js.native
  def useFocusMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](hasDefaultFocusedIndexOnChangeOptions: KeyboardFocusOptions[D, CE, IE]): KeyboardMovementProviders[CE, IE] = js.native
  
  @JSImport("@react-md/utils", "useFocusOnMount")
  @js.native
  def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus): Unit = js.native
  @JSImport("@react-md/utils", "useFocusOnMount")
  @js.native
  def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: js.UndefOr[scala.Nothing],
    programatic: js.UndefOr[scala.Nothing],
    disabled: Boolean
  ): Unit = js.native
  @JSImport("@react-md/utils", "useFocusOnMount")
  @js.native
  def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: js.UndefOr[scala.Nothing],
    programatic: Boolean
  ): Unit = js.native
  @JSImport("@react-md/utils", "useFocusOnMount")
  @js.native
  def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: js.UndefOr[scala.Nothing],
    programatic: Boolean,
    disabled: Boolean
  ): Unit = js.native
  @JSImport("@react-md/utils", "useFocusOnMount")
  @js.native
  def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus, preventScroll: Boolean): Unit = js.native
  @JSImport("@react-md/utils", "useFocusOnMount")
  @js.native
  def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: Boolean,
    programatic: js.UndefOr[scala.Nothing],
    disabled: Boolean
  ): Unit = js.native
  @JSImport("@react-md/utils", "useFocusOnMount")
  @js.native
  def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus, preventScroll: Boolean, programatic: Boolean): Unit = js.native
  @JSImport("@react-md/utils", "useFocusOnMount")
  @js.native
  def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: Boolean,
    programatic: Boolean,
    disabled: Boolean
  ): Unit = js.native
  
  @JSImport("@react-md/utils", "useGridList")
  @js.native
  def useGridList[E /* <: HTMLElement */](): UseGridListReturnValue[E] = js.native
  @JSImport("@react-md/utils", "useGridList")
  @js.native
  def useGridList[E /* <: HTMLElement */](
    hasRefStyleClassNameCellMarginDefaultSizeMaxCellSizeDisableHeightDisableWidthContainerPadding: PropsWithRef[UseGridListOptions, E]
  ): UseGridListReturnValue[E] = js.native
  
  @JSImport("@react-md/utils", "useGridListSize")
  @js.native
  def useGridListSize(): GridListSize = js.native
  
  @JSImport("@react-md/utils", "useInterval")
  @js.native
  def useInterval(callback: js.Function1[/* stop */ js.Function0[Unit], Unit], delay: Double): ReturnValue = js.native
  @JSImport("@react-md/utils", "useInterval")
  @js.native
  def useInterval(
    callback: js.Function1[/* stop */ js.Function0[Unit], Unit],
    delay: Double,
    defaultRunning: Boolean
  ): ReturnValue = js.native
  
  @JSImport("@react-md/utils", "useIsUserInteractionMode")
  @js.native
  def useIsUserInteractionMode(mode: UserInteractionMode): Boolean = js.native
  
  @JSImport("@react-md/utils", "useIsomorphicLayoutEffect")
  @js.native
  def useIsomorphicLayoutEffect(effect: EffectCallback): Unit = js.native
  @JSImport("@react-md/utils", "useIsomorphicLayoutEffect")
  @js.native
  def useIsomorphicLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = js.native
  
  @JSImport("@react-md/utils", "useKeyboardMovement")
  @js.native
  def useKeyboardMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](
    hasOnKeyDownIncrementKeysDecrementKeysJumpToFirstKeysJumpToLastKeysStopPropagationOnChangeItemsResetTimeFindMatchIndexFocusedIndexLoopableSearchableValueKeyGetItemValue: KeyboardMovementOptions[D, CE, IE]
  ): KeyboardMovementProviders[CE, IE] = js.native
  
  @JSImport("@react-md/utils", "useKeyboardSearch")
  @js.native
  def useKeyboardSearch[D, E /* <: HTMLElement */](
    hasItemsOnChangeOnKeyDownResetTimeSearchIndexValueKeyGetItemValueFindMatchIndex: KeyboardSearchOptions[D, E]
  ): typingsSlinky.reactMdUtils.useKeyboardSearchMod.ReturnValue[E] = js.native
  
  @JSImport("@react-md/utils", "useMediaQuery")
  @js.native
  def useMediaQuery(query: String): Boolean = js.native
  @JSImport("@react-md/utils", "useMediaQuery")
  @js.native
  def useMediaQuery(
    query: String,
    defaultValue: js.UndefOr[scala.Nothing],
    disabled: js.UndefOr[scala.Nothing],
    checkImmediately: Boolean
  ): Boolean = js.native
  @JSImport("@react-md/utils", "useMediaQuery")
  @js.native
  def useMediaQuery(query: String, defaultValue: js.UndefOr[scala.Nothing], disabled: Boolean): Boolean = js.native
  @JSImport("@react-md/utils", "useMediaQuery")
  @js.native
  def useMediaQuery(
    query: String,
    defaultValue: js.UndefOr[scala.Nothing],
    disabled: Boolean,
    checkImmediately: Boolean
  ): Boolean = js.native
  @JSImport("@react-md/utils", "useMediaQuery")
  @js.native
  def useMediaQuery(query: String, defaultValue: Boolean): Boolean = js.native
  @JSImport("@react-md/utils", "useMediaQuery")
  @js.native
  def useMediaQuery(
    query: String,
    defaultValue: Boolean,
    disabled: js.UndefOr[scala.Nothing],
    checkImmediately: Boolean
  ): Boolean = js.native
  @JSImport("@react-md/utils", "useMediaQuery")
  @js.native
  def useMediaQuery(query: String, defaultValue: Boolean, disabled: Boolean): Boolean = js.native
  @JSImport("@react-md/utils", "useMediaQuery")
  @js.native
  def useMediaQuery(query: String, defaultValue: Boolean, disabled: Boolean, checkImmediately: Boolean): Boolean = js.native
  
  @JSImport("@react-md/utils", "useOrientation")
  @js.native
  def useOrientation(): OrientationType = js.native
  @JSImport("@react-md/utils", "useOrientation")
  @js.native
  def useOrientation(defaultValue: OrientationType): OrientationType = js.native
  
  @JSImport("@react-md/utils", "usePreviousFocus")
  @js.native
  def usePreviousFocus(disabled: Boolean): Unit = js.native
  @JSImport("@react-md/utils", "usePreviousFocus")
  @js.native
  def usePreviousFocus(disabled: Boolean, fallback: js.UndefOr[FocusFallback], previousElement: HTMLElement): Unit = js.native
  @JSImport("@react-md/utils", "usePreviousFocus")
  @js.native
  def usePreviousFocus(disabled: Boolean, fallback: FocusFallback): Unit = js.native
  
  @JSImport("@react-md/utils", "useRefCache")
  @js.native
  def useRefCache[T](cacheable: T): MutableRefObject[T] = js.native
  
  @JSImport("@react-md/utils", "useResizeListener")
  @js.native
  def useResizeListener(hasOnResizeOptionsImmediateEnabled: ResizeListenerOptions): Unit = js.native
  
  @JSImport("@react-md/utils", "useResizeObserver")
  @js.native
  def useResizeObserver[E /* <: HTMLElement */](onResize: OnResizeObserverChange[E]): EnsuredRefs[E] = js.native
  @JSImport("@react-md/utils", "useResizeObserver")
  @js.native
  def useResizeObserver[E /* <: HTMLElement */](onResize: OnResizeObserverChange[E], options: UseResizeObserverOptions[E]): EnsuredRefs[E] = js.native
  @JSImport("@react-md/utils", "useResizeObserver")
  @js.native
  def useResizeObserver[E /* <: HTMLElement */](options: UseResizeObserverV1Options[E]): Unit = js.native
  
  @JSImport("@react-md/utils", "useScrollListener")
  @js.native
  def useScrollListener[E /* <: HTMLElement */](hasEnabledOnScrollElementOptions: Options[E]): Unit = js.native
  
  @JSImport("@react-md/utils", "useScrollLock")
  @js.native
  def useScrollLock(enabled: Boolean): Unit = js.native
  @JSImport("@react-md/utils", "useScrollLock")
  @js.native
  def useScrollLock(enabled: Boolean, selectorOrElement: String): Unit = js.native
  @JSImport("@react-md/utils", "useScrollLock")
  @js.native
  def useScrollLock(enabled: Boolean, selectorOrElement: js.Function0[HTMLElement]): Unit = js.native
  @JSImport("@react-md/utils", "useScrollLock")
  @js.native
  def useScrollLock(enabled: Boolean, selectorOrElement: HTMLElement): Unit = js.native
  
  @JSImport("@react-md/utils", "useTempValue")
  @js.native
  def useTempValue[T](defaultValue: T): typingsSlinky.reactMdUtils.useTempValueMod.ReturnValue[T] = js.native
  @JSImport("@react-md/utils", "useTempValue")
  @js.native
  def useTempValue[T](defaultValue: T, resetTime: Double): typingsSlinky.reactMdUtils.useTempValueMod.ReturnValue[T] = js.native
  
  @JSImport("@react-md/utils", "useTimeout")
  @js.native
  def useTimeout(cb: js.Function0[Unit], delay: Double): typingsSlinky.reactMdUtils.useTimeoutMod.ReturnValue = js.native
  @JSImport("@react-md/utils", "useTimeout")
  @js.native
  def useTimeout(cb: js.Function0[Unit], delay: Double, defaultStarted: js.Function0[Boolean]): typingsSlinky.reactMdUtils.useTimeoutMod.ReturnValue = js.native
  @JSImport("@react-md/utils", "useTimeout")
  @js.native
  def useTimeout(cb: js.Function0[Unit], delay: Double, defaultStarted: Boolean): typingsSlinky.reactMdUtils.useTimeoutMod.ReturnValue = js.native
  
  @JSImport("@react-md/utils", "useToggle")
  @js.native
  def useToggle(defaultToggled: js.Function0[Boolean]): typingsSlinky.reactMdUtils.useToggleMod.ReturnValue = js.native
  @JSImport("@react-md/utils", "useToggle")
  @js.native
  def useToggle(defaultToggled: Boolean): typingsSlinky.reactMdUtils.useToggleMod.ReturnValue = js.native
  
  @JSImport("@react-md/utils", "useUserInteractionMode")
  @js.native
  def useUserInteractionMode(): UserInteractionMode = js.native
  
  @JSImport("@react-md/utils", "useWidthMediaQuery")
  @js.native
  def useWidthMediaQuery(hasMinMax: WidthMediaQuery with WidthMediaQuerys): Boolean = js.native
}
