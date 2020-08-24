package typingsSlinky.reactMdUtils

import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.Window
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdUtils.appSizeListenerMod.AppSizeListenerProps
import typingsSlinky.reactMdUtils.bemMod.BEMResult
import typingsSlinky.reactMdUtils.bemMod.Block
import typingsSlinky.reactMdUtils.caseInsensitiveFilterMod.CaseInsensitiveOptions
import typingsSlinky.reactMdUtils.containsElementMod.CheckableThing
import typingsSlinky.reactMdUtils.delegateEventMod.DelegatedEventHandler
import typingsSlinky.reactMdUtils.delegateEventMod.DelegatedEventTarget
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
import typingsSlinky.reactMdUtils.reactMdUtilsStrings.width
import typingsSlinky.reactMdUtils.resizeListenerMod.ResizeListenerProps
import typingsSlinky.reactMdUtils.resizeObserverMod.ResizeObserverProps
import typingsSlinky.reactMdUtils.scrollListenerMod.ScrollListenerProps
import typingsSlinky.reactMdUtils.scrollbarSizeMod.SizingType
import typingsSlinky.reactMdUtils.sizingConstantsMod.QuerySize
import typingsSlinky.reactMdUtils.throttleMod.ThrottleableFunction
import typingsSlinky.reactMdUtils.throttleMod.ThrottledFunction
import typingsSlinky.reactMdUtils.touchesMod.TouchTypes
import typingsSlinky.reactMdUtils.typesMod.Coords
import typingsSlinky.reactMdUtils.typesMod.FixedPosition
import typingsSlinky.reactMdUtils.typesMod.FixedPositionOptions
import typingsSlinky.reactMdUtils.typesMod.PositionAnchor
import typingsSlinky.reactMdUtils.unitToNumberMod.UnitToNumberOptions
import typingsSlinky.reactMdUtils.useActiveDescendantMovementMod.ActiveDescendantMovementProviders
import typingsSlinky.reactMdUtils.useActiveDescendantMovementMod.ActiveDescendantOptions
import typingsSlinky.reactMdUtils.useAppSizeMediaMod.AppSize
import typingsSlinky.reactMdUtils.useCloseOnOutsideClickMod.CloseOnOutsideClickOptions
import typingsSlinky.reactMdUtils.useFocusMovementMod.KeyboardFocusOptions
import typingsSlinky.reactMdUtils.useIntervalMod.ReturnValue
import typingsSlinky.reactMdUtils.useKeyboardMovementMod.KeyboardMovementOptions
import typingsSlinky.reactMdUtils.useKeyboardMovementMod.KeyboardMovementProviders
import typingsSlinky.reactMdUtils.useKeyboardSearchMod.KeyboardSearchOptions
import typingsSlinky.reactMdUtils.useModeDetectionMod.UserInteractionMode
import typingsSlinky.reactMdUtils.usePreviousFocusMod.FocusFallback
import typingsSlinky.reactMdUtils.useResizeListenerMod.ResizeListenerOptions
import typingsSlinky.reactMdUtils.useResizeObserverMod.ResizeObserverOptions
import typingsSlinky.reactMdUtils.useScrollListenerMod.Options
import typingsSlinky.reactMdUtils.useWidthMediaQueryMod.WidthMediaQuery
import typingsSlinky.reactMdUtils.useWidthMediaQueryMod.WidthMediaQuerys
import typingsSlinky.reactMdUtils.utilsMod.GetItemValue_
import typingsSlinky.reactMdUtils.utilsMod.SearchOptions
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.DOMRect
import typingsSlinky.std.Omit
import typingsSlinky.std.OrientationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val ABOVE_CENTER_ANCHOR: PositionAnchor = js.native
  val ABOVE_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  val ABOVE_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  val ABOVE_LEFT_ANCHOR: PositionAnchor = js.native
  val ABOVE_RIGHT_ANCHOR: PositionAnchor = js.native
  val BELOW_CENTER_ANCHOR: PositionAnchor = js.native
  val BELOW_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  val BELOW_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  val BELOW_LEFT_ANCHOR: PositionAnchor = js.native
  val BELOW_RIGHT_ANCHOR: PositionAnchor = js.native
  val BOTTOM_CENTER_ANCHOR: PositionAnchor = js.native
  val BOTTOM_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  val BOTTOM_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  val BOTTOM_LEFT_ANCHOR: PositionAnchor = js.native
  val BOTTOM_RIGHT_ANCHOR: PositionAnchor = js.native
  val CELL_MARGIN_VAR: /* "--rmd-cell-margin" */ String = js.native
  val CELL_SIZE_VAR: /* "--rmd-cell-size" */ String = js.native
  val CENTER_CENTER_ANCHOR: PositionAnchor = js.native
  val CENTER_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  val CENTER_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  val CENTER_LEFT_ANCHOR: PositionAnchor = js.native
  val CENTER_RIGHT_ANCHOR: PositionAnchor = js.native
  val DATA_RMD_NOSCROLL: /* "data-rmd-noscroll" */ String = js.native
  val DEFAULT_APP_SIZE: AppSize = js.native
  val DEFAULT_DESKTOP_LARGE_MIN_WIDTH: QuerySize = js.native
  val DEFAULT_DESKTOP_MIN_WIDTH: QuerySize = js.native
  val DEFAULT_GET_ITEM_VALUE: js.Function2[/* item */ js.Any, /* valueKey */ js.UndefOr[String], String] = js.native
  val DEFAULT_IGNORE_WHITESPACE: /* false */ Boolean = js.native
  val DEFAULT_PHONE_MAX_WIDTH: QuerySize = js.native
  val DEFAULT_SEARCH_RESET_TIME: /* 500 */ Double = js.native
  val DEFAULT_TABLET_MAX_WIDTH: QuerySize = js.native
  val DEFAULT_TABLET_MIN_WIDTH: QuerySize = js.native
  val DEFAULT_TRIM: /* true */ Boolean = js.native
  val DEFAULT_VALUE_KEY: /* "value" */ String = js.native
  val DesktopOnly: ReactComponentClass[MediaOnlyProps] = js.native
  /**
    * The `FocusContainer` is a wrapper for a few of the accessibility hooks to
    * maintain focus within an element.
    */
  val FocusContainer: ForwardRefExoticComponent[FocusContainerProps with RefAttributes[HTMLDivElement]] = js.native
  val GRID_COLUMNS_VAR: /* "--rmd-grid-cols" */ String = js.native
  val GRID_GUTTER_VAR: /* "--rmd-grid-gutter" */ String = js.native
  /**
    * The grid component is generally used for a base layout in your app to provide
    * nice padding and spacing between each item.
    *
    * Note: This component relies on the `AppSizeListener` as a parent component to
    * work and will throw an error if it does not exist as a parent.
    */
  val Grid: ForwardRefExoticComponent[GridProps with RefAttributes[HTMLDivElement]] = js.native
  val GridCell: ForwardRefExoticComponent[GridCellProps with RefAttributes[HTMLDivElement]] = js.native
  /**
    * The `GridList` component is a different way to render a list of data where
    * the number of columns is dynamic and based on the max-width for each cell.
    * Instead of setting a percentage width to each cell based on the number of
    * columns, this will dynamically add columns to fill up the remaining space and
    * have each cell grow up to a set max-width. A really good use-case for this is
    * displaying a list of images or thumbnails and allowing the user to see a full
    * screen preview once selected/clicked.
    */
  val GridList: ForwardRefExoticComponent[GridListProps with RefAttributes[HTMLDivElement]] = js.native
  val GridListCell: ForwardRefExoticComponent[GridListCellProps with RefAttributes[HTMLDivElement]] = js.native
  val MobileOnly: ReactComponentClass[MediaOnlyProps] = js.native
  val PhoneOnly: ReactComponentClass[MediaOnlyProps] = js.native
  val TOP_CENTER_ANCHOR: PositionAnchor = js.native
  val TOP_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  val TOP_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  val TOP_LEFT_ANCHOR: PositionAnchor = js.native
  val TOP_RIGHT_ANCHOR: PositionAnchor = js.native
  val TabletOnly: ReactComponentClass[MediaOnlyProps] = js.native
  def ScrollListener(props: ScrollListenerProps): Null = js.native
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
  def applyRef[E](): Unit = js.native
  def applyRef[E](instance: E): Unit = js.native
  def applyRef[E](instance: E, ref: Ref[E]): Unit = js.native
  def applyRef[E](instance: Null, ref: Ref[E]): Unit = js.native
  def bem(base: Block): BEMResult = js.native
  def caseInsensitiveFilter[T](query: String, searchable: js.Array[T]): js.Array[T] = js.native
  def caseInsensitiveFilter[T](query: String, searchable: js.Array[T], options: CaseInsensitiveOptions[T]): js.Array[T] = js.native
  def containsElement(container: CheckableThing, child: CheckableThing): Boolean = js.native
  def defaults[O /* <: js.Object */, R /* <: js.Object */](optional: O, required: R): O with R = js.native
  def delegateEvent(eventType: String): DelegatedEventHandler = js.native
  def delegateEvent(
    eventType: String,
    eventTarget: js.UndefOr[DelegatedEventTarget],
    throttle: js.UndefOr[scala.Nothing],
    options: Boolean
  ): DelegatedEventHandler = js.native
  def delegateEvent(
    eventType: String,
    eventTarget: js.UndefOr[DelegatedEventTarget],
    throttle: js.UndefOr[scala.Nothing],
    options: AddEventListenerOptions
  ): DelegatedEventHandler = js.native
  def delegateEvent(eventType: String, eventTarget: js.UndefOr[DelegatedEventTarget], throttle: Boolean): DelegatedEventHandler = js.native
  def delegateEvent(
    eventType: String,
    eventTarget: js.UndefOr[DelegatedEventTarget],
    throttle: Boolean,
    options: Boolean
  ): DelegatedEventHandler = js.native
  def delegateEvent(
    eventType: String,
    eventTarget: js.UndefOr[DelegatedEventTarget],
    throttle: Boolean,
    options: AddEventListenerOptions
  ): DelegatedEventHandler = js.native
  def delegateEvent(eventType: String, eventTarget: DelegatedEventTarget): DelegatedEventHandler = js.native
  def extractTextContent(stringOrElement: String): String = js.native
  def extractTextContent(stringOrElement: String, fontIconQuerySelector: String): String = js.native
  def extractTextContent(stringOrElement: HTMLElement): String = js.native
  def extractTextContent(stringOrElement: HTMLElement, fontIconQuerySelector: String): String = js.native
  def findIgnoreCase[T](query: String, searchable: js.Array[T]): T | Null = js.native
  def findIgnoreCase[T](query: String, searchable: js.Array[T], options: SearchOptions[T]): T | Null = js.native
  def findMatchIndex(value: String, values: js.Array[String], startIndex: Double): Double = js.native
  def findMatchIndex(value: String, values: js.Array[String], startIndex: Double, isSelfMatchable: Boolean): Double = js.native
  def findSizingContainer(): HTMLElement | Null = js.native
  def findSizingContainer(el: HTMLElement): HTMLElement | Null = js.native
  def focusElementWithin(container: Document, focus: Focus): Unit = js.native
  def focusElementWithin(
    container: Document,
    focus: Focus,
    programatic: js.UndefOr[scala.Nothing],
    preventScroll: js.UndefOr[scala.Nothing],
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  def focusElementWithin(container: Document, focus: Focus, programatic: js.UndefOr[scala.Nothing], preventScroll: Boolean): Unit = js.native
  def focusElementWithin(
    container: Document,
    focus: Focus,
    programatic: js.UndefOr[scala.Nothing],
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  def focusElementWithin(container: Document, focus: Focus, programatic: Boolean): Unit = js.native
  def focusElementWithin(
    container: Document,
    focus: Focus,
    programatic: Boolean,
    preventScroll: js.UndefOr[scala.Nothing],
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  def focusElementWithin(container: Document, focus: Focus, programatic: Boolean, preventScroll: Boolean): Unit = js.native
  def focusElementWithin(
    container: Document,
    focus: Focus,
    programatic: Boolean,
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  def focusElementWithin(container: HTMLElement, focus: Focus): Unit = js.native
  def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programatic: js.UndefOr[scala.Nothing],
    preventScroll: js.UndefOr[scala.Nothing],
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programatic: js.UndefOr[scala.Nothing],
    preventScroll: Boolean
  ): Unit = js.native
  def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programatic: js.UndefOr[scala.Nothing],
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  def focusElementWithin(container: HTMLElement, focus: Focus, programatic: Boolean): Unit = js.native
  def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programatic: Boolean,
    preventScroll: js.UndefOr[scala.Nothing],
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  def focusElementWithin(container: HTMLElement, focus: Focus, programatic: Boolean, preventScroll: Boolean): Unit = js.native
  def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programatic: Boolean,
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  def fuzzyFilter[T](query: String, searchable: js.Array[T]): js.Array[T] = js.native
  def fuzzyFilter[T](query: String, searchable: js.Array[T], options: SearchOptions[T]): js.Array[T] = js.native
  def getContrastRatio(background: HexString, foreground: HexString): Double = js.native
  def getElementRect(element: HTMLElement): DOMRect | ClientRect = js.native
  def getElementRect(element: HTMLElement, coords: Coords): DOMRect | ClientRect = js.native
  def getFixedPosition(
    hasContainerElementAnchorInitialXInitialYVwMarginVhMarginXMarginYMarginWidthPreventOverlapTransformOriginDisableSwappingDisableVHBounds: FixedPositionOptions
  ): FixedPosition = js.native
  def getFocusableElements(container: Document): js.Array[HTMLElement] = js.native
  def getFocusableElements(container: Document, programatic: Boolean): js.Array[HTMLElement] = js.native
  def getFocusableElements(container: HTMLElement): js.Array[HTMLElement] = js.native
  def getFocusableElements(container: HTMLElement, programatic: Boolean): js.Array[HTMLElement] = js.native
  def getFuzzyRegExp(query: String): js.RegExp = js.native
  def getItemId(id: String, i: Double): String = js.native
  def getItemValue(item: js.Any): String = js.native
  def getItemValue(item: js.Any, valueKey: String): String = js.native
  def getSearchString(value: String): String = js.native
  def getSearchString(
    value: String,
    lowercase: js.UndefOr[scala.Nothing],
    trim: js.UndefOr[scala.Nothing],
    ignoreWhitespace: Boolean
  ): String = js.native
  def getSearchString(value: String, lowercase: js.UndefOr[scala.Nothing], trim: Boolean): String = js.native
  def getSearchString(value: String, lowercase: js.UndefOr[scala.Nothing], trim: Boolean, ignoreWhitespace: Boolean): String = js.native
  def getSearchString(value: String, lowercase: Boolean): String = js.native
  def getSearchString(value: String, lowercase: Boolean, trim: js.UndefOr[scala.Nothing], ignoreWhitespace: Boolean): String = js.native
  def getSearchString(value: String, lowercase: Boolean, trim: Boolean): String = js.native
  def getSearchString(value: String, lowercase: Boolean, trim: Boolean, ignoreWhitespace: Boolean): String = js.native
  @JSName("getViewportSize")
  def getViewportSize_height(direction: height): Double = js.native
  @JSName("getViewportSize")
  def getViewportSize_width(direction: width): Double = js.native
  def hexToRGB(hex: HexString): js.Tuple3[RedBit, GreenBit, BlueBit] = js.native
  def isContrastCompliant(background: HexString, foreground: HexString): Boolean = js.native
  def isContrastCompliant(background: HexString, foreground: HexString, compliance: Double): Boolean = js.native
  def isContrastCompliant(background: HexString, foreground: HexString, compliance: ContrastRatioCompliance): Boolean = js.native
  def loop(x: Double, max: Double, increment: Boolean): Double = js.native
  def loop(x: Double, max: Double, increment: Boolean, minmax: Boolean): Double = js.native
  def omit[T /* <: js.Object */, K /* <: /* keyof T */ String */](`object`: T, omitKeys: js.Array[K | String]): Omit[T, K] = js.native
  def removeTouchEvent(
    el: HTMLElement,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit]
  ): Unit = js.native
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
  def removeTouchEvent(
    el: Window,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit]
  ): Unit = js.native
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
  def scrollIntoView(): Unit = js.native
  def scrollIntoView(container: Null, element: HTMLElement): Unit = js.native
  def scrollIntoView(container: HTMLElement): Unit = js.native
  def scrollIntoView(container: HTMLElement, element: HTMLElement): Unit = js.native
  def scrollbarSize(): Double = js.native
  def scrollbarSize(`type`: js.UndefOr[scala.Nothing], forced: Boolean): Double = js.native
  def scrollbarSize(`type`: SizingType): Double = js.native
  def scrollbarSize(`type`: SizingType, forced: Boolean): Double = js.native
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
  def throttle[F /* <: ThrottleableFunction */](fn: F, wait: Double): ThrottledFunction[F] = js.native
  def unitToNumber(unit: String): Double = js.native
  def unitToNumber(unit: String, options: UnitToNumberOptions): Double = js.native
  def unitToNumber(unit: Double): Double = js.native
  def unitToNumber(unit: Double, options: UnitToNumberOptions): Double = js.native
  def useActiveDescendantMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](
    hasBaseIdGetIdDefaultFocusedIndexItemsOnChangeGetItemValueValueKeyOnKeyDownOnEnterOnSpaceOptions: ActiveDescendantOptions[D, CE, IE]
  ): ActiveDescendantMovementProviders[CE, IE] = js.native
  def useAppSize(): AppSize = js.native
  def useCloseOnEscape[E /* <: HTMLElement */](onRequestClose: js.Function0[Unit], disabled: Boolean): js.UndefOr[KeyboardEventHandler[E]] = js.native
  def useCloseOnEscape[E /* <: HTMLElement */](onRequestClose: js.Function0[Unit], disabled: Boolean, onKeyDown: KeyboardEventHandler[E]): js.UndefOr[KeyboardEventHandler[E]] = js.native
  def useCloseOnOutsideClick[E /* <: HTMLElement */](hasEnabledElementOnOutsideClick: CloseOnOutsideClickOptions[E]): Unit = js.native
  def useFocusMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](hasDefaultFocusedIndexOnChangeOptions: KeyboardFocusOptions[D, CE, IE]): KeyboardMovementProviders[CE, IE] = js.native
  def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus): Unit = js.native
  def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: js.UndefOr[scala.Nothing],
    programatic: js.UndefOr[scala.Nothing],
    disabled: Boolean
  ): Unit = js.native
  def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: js.UndefOr[scala.Nothing],
    programatic: Boolean
  ): Unit = js.native
  def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: js.UndefOr[scala.Nothing],
    programatic: Boolean,
    disabled: Boolean
  ): Unit = js.native
  def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus, preventScroll: Boolean): Unit = js.native
  def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: Boolean,
    programatic: js.UndefOr[scala.Nothing],
    disabled: Boolean
  ): Unit = js.native
  def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus, preventScroll: Boolean, programatic: Boolean): Unit = js.native
  def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: Boolean,
    programatic: Boolean,
    disabled: Boolean
  ): Unit = js.native
  def useInterval(callback: js.Function1[/* stop */ js.Function0[Unit], Unit], delay: Double): ReturnValue = js.native
  def useInterval(
    callback: js.Function1[/* stop */ js.Function0[Unit], Unit],
    delay: Double,
    defaultRunning: Boolean
  ): ReturnValue = js.native
  def useIsUserInteractionMode(mode: UserInteractionMode): Boolean = js.native
  def useKeyboardMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](
    hasOnKeyDownIncrementKeysDecrementKeysJumpToFirstKeysJumpToLastKeysStopPropagationOnChangeItemsResetTimeFindMatchIndexFocusedIndexLoopableSearchableValueKeyGetItemValue: KeyboardMovementOptions[D, CE, IE]
  ): KeyboardMovementProviders[CE, IE] = js.native
  def useKeyboardSearch[D, E /* <: HTMLElement */](
    hasItemsOnChangeOnKeyDownResetTimeSearchIndexValueKeyGetItemValueFindMatchIndex: KeyboardSearchOptions[D, E]
  ): typingsSlinky.reactMdUtils.useKeyboardSearchMod.ReturnValue[E] = js.native
  def useMediaQuery(query: String): Boolean = js.native
  def useMediaQuery(
    query: String,
    defaultValue: js.UndefOr[scala.Nothing],
    disabled: js.UndefOr[scala.Nothing],
    checkImmediately: Boolean
  ): Boolean = js.native
  def useMediaQuery(query: String, defaultValue: js.UndefOr[scala.Nothing], disabled: Boolean): Boolean = js.native
  def useMediaQuery(
    query: String,
    defaultValue: js.UndefOr[scala.Nothing],
    disabled: Boolean,
    checkImmediately: Boolean
  ): Boolean = js.native
  def useMediaQuery(query: String, defaultValue: Boolean): Boolean = js.native
  def useMediaQuery(
    query: String,
    defaultValue: Boolean,
    disabled: js.UndefOr[scala.Nothing],
    checkImmediately: Boolean
  ): Boolean = js.native
  def useMediaQuery(query: String, defaultValue: Boolean, disabled: Boolean): Boolean = js.native
  def useMediaQuery(query: String, defaultValue: Boolean, disabled: Boolean, checkImmediately: Boolean): Boolean = js.native
  def useOrientation(): OrientationType = js.native
  def useOrientation(defaultValue: OrientationType): OrientationType = js.native
  def usePreviousFocus(disabled: Boolean): Unit = js.native
  def usePreviousFocus(disabled: Boolean, fallback: js.UndefOr[FocusFallback], previousElement: HTMLElement): Unit = js.native
  def usePreviousFocus(disabled: Boolean, fallback: FocusFallback): Unit = js.native
  def useRefCache[T](cacheable: T): MutableRefObject[T] = js.native
  def useResizeListener(hasOnResizeOptionsImmediateEnabled: ResizeListenerOptions): Unit = js.native
  def useResizeObserver[E /* <: HTMLElement */](hasDisableHeightDisableWidthOnResizeTarget: ResizeObserverOptions[E]): Unit = js.native
  def useScrollListener[E /* <: HTMLElement */](hasEnabledOnScrollElementOptions: Options[E]): Unit = js.native
  def useScrollLock(enabled: Boolean): Unit = js.native
  def useScrollLock(enabled: Boolean, selectorOrElement: String): Unit = js.native
  def useScrollLock(enabled: Boolean, selectorOrElement: js.Function0[HTMLElement]): Unit = js.native
  def useScrollLock(enabled: Boolean, selectorOrElement: HTMLElement): Unit = js.native
  def useTempValue[T](defaultValue: T): typingsSlinky.reactMdUtils.useTempValueMod.ReturnValue[T] = js.native
  def useTempValue[T](defaultValue: T, resetTime: Double): typingsSlinky.reactMdUtils.useTempValueMod.ReturnValue[T] = js.native
  def useTimeout(cb: js.Function0[Unit], delay: Double): typingsSlinky.reactMdUtils.useTimeoutMod.ReturnValue = js.native
  def useTimeout(cb: js.Function0[Unit], delay: Double, defaultStarted: js.Function0[Boolean]): typingsSlinky.reactMdUtils.useTimeoutMod.ReturnValue = js.native
  def useTimeout(cb: js.Function0[Unit], delay: Double, defaultStarted: Boolean): typingsSlinky.reactMdUtils.useTimeoutMod.ReturnValue = js.native
  def useToggle(defaultToggled: js.Function0[Boolean]): typingsSlinky.reactMdUtils.useToggleMod.ReturnValue = js.native
  def useToggle(defaultToggled: Boolean): typingsSlinky.reactMdUtils.useToggleMod.ReturnValue = js.native
  def useUserInteractionMode(): UserInteractionMode = js.native
  def useWidthMediaQuery(hasMinMax: WidthMediaQuery with WidthMediaQuerys): Boolean = js.native
  @js.native
  object AppSizeListener extends js.Object {
    /**
      * This component should be mounted near the top of your app as it will keep
      * track of the current app size based on the provided breakpoint widths.
      */
    def apply(
      hasChildrenOnChangePhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSize: AppSizeListenerProps
    ): ReactElement = js.native
    @js.native
    object propTypes extends js.Object {
      var children: js.Any = js.native
      var defaultSize: js.Any = js.native
      var desktopLargeMinWidth: js.Any = js.native
      var desktopMinWidth: js.Any = js.native
      var onChange: js.Any = js.native
      var phoneMaxWidth: js.Any = js.native
      var tabletMaxWidth: js.Any = js.native
      var tabletMinWidth: js.Any = js.native
    }
    
  }
  
  @js.native
  object DEFAULT_SEARCH_OPTIONS extends js.Object {
    var getItemValue: GetItemValue_[_] = js.native
    var ignoreWhitespace: Boolean = js.native
    var trim: Boolean = js.native
    var valueKey: String = js.native
  }
  
  @js.native
  object IncrementMovementKey extends js.Object {
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
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey with String] = js.native
  }
  
  @js.native
  object InteractionModeListener extends js.Object {
    def apply(hasChildren: InteractionModeListenerProps): ReactElement = js.native
    @js.native
    object propTypes extends js.Object {
      var children: js.Any = js.native
    }
    
  }
  
  @js.native
  object JumpMovementKey extends js.Object {
    /* "Alt+End" */ val AltEnd: typingsSlinky.reactMdUtils.movementTypesMod.JumpMovementKey.AltEnd with String = js.native
    /* "Alt+Home" */ val AltHome: typingsSlinky.reactMdUtils.movementTypesMod.JumpMovementKey.AltHome with String = js.native
    /* "Control+End" */ val ControlEnd: typingsSlinky.reactMdUtils.movementTypesMod.JumpMovementKey.ControlEnd with String = js.native
    /* "Control+Home" */ val ControlHome: typingsSlinky.reactMdUtils.movementTypesMod.JumpMovementKey.ControlHome with String = js.native
    /* "Control+Shift+End" */ val ControlShiftEnd: typingsSlinky.reactMdUtils.movementTypesMod.JumpMovementKey.ControlShiftEnd with String = js.native
    /* "Control+Shift+Home" */ val ControlShiftHome: typingsSlinky.reactMdUtils.movementTypesMod.JumpMovementKey.ControlShiftHome with String = js.native
    /* "End" */ val End: typingsSlinky.reactMdUtils.movementTypesMod.JumpMovementKey.End with String = js.native
    /* "Home" */ val Home: typingsSlinky.reactMdUtils.movementTypesMod.JumpMovementKey.Home with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.reactMdUtils.movementTypesMod.JumpMovementKey with String] = js.native
  }
  
  @js.native
  object MovementPresets extends js.Object {
    val HORIZONTAL_COMBOBOX: MovementConfig = js.native
    val HORIZONTAL_LISTBOX: MovementConfig = js.native
    val HORIZONTAL_MENU: MovementConfig = js.native
    val HORIZONTAL_TABS: MovementConfig = js.native
    val HORIZONTAL_TREE: MovementConfig = js.native
    val VERTICAL_COMBOBOX: MovementConfig = js.native
    val VERTICAL_LISTBOX: MovementConfig = js.native
    val VERTICAL_MENU: MovementConfig = js.native
    val VERTICAL_TABS: MovementConfig = js.native
    val VERTICAL_TREE: MovementConfig = js.native
  }
  
  @js.native
  object PassiveEvents extends js.Object {
    var isSupported: Boolean = js.native
    def update(): Boolean = js.native
  }
  
  @js.native
  object ResizeListener extends js.Object {
    /**
      * This is a simple component that will attach a throttled resize event listener
      * when mounted, and detach when it unmounts.
      *
      * This component only works for entire app resize events. If you are looking
      * for specific element resize events, check out the `ResizeObserver` component
      * instead.
      */
    def apply(hasOnResizeOptionsImmediate: ResizeListenerProps): Null = js.native
    @js.native
    object propTypes extends js.Object {
      var immediate: js.Any = js.native
      var onResize: js.Any = js.native
      var options: js.Any = js.native
    }
    
  }
  
  @js.native
  object ResizeObserver extends js.Object {
    /**
      * The resize observer is used to track the size changes for a single element in
      * a page.  This is a bit different than a normal `ResizeListener` since it does
      * not rely on entire page size changes.
      */
    def apply(hasDisableHeightDisableWidthClassNameComponentTargetOnResize: ResizeObserverProps): ReactElement | Null = js.native
    @js.native
    object propTypes extends js.Object {
      var className: js.Any = js.native
      var component: js.Any = js.native
      var disableHeight: js.Any = js.native
      var disableWidth: js.Any = js.native
      var target: js.Any = js.native
    }
    
  }
  
}

