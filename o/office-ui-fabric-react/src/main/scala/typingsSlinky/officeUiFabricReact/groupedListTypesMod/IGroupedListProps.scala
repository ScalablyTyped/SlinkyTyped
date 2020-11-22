package typingsSlinky.officeUiFabricReact.groupedListTypesMod

import slinky.core.facade.ReactElement
import typingsSlinky.fluentuiReactFocus.focusZoneTypesMod.IFocusZoneProps
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.anon.Callback
import typingsSlinky.officeUiFabricReact.dragdropInterfacesMod.IDragDropEvents
import typingsSlinky.officeUiFabricReact.dragdropInterfacesMod.IDragDropHelper
import typingsSlinky.officeUiFabricReact.groupedListBaseMod.GroupedListBase
import typingsSlinky.officeUiFabricReact.listTypesMod.IListProps
import typingsSlinky.officeUiFabricReact.withViewportMod.IViewport
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsSlinky.uifabricUtilities.selectionTypesMod.ISelection
import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGroupedListProps extends ClassAttributes[GroupedListBase] {
  
  /** Optional class name to add to the root element. */
  var className: js.UndefOr[String] = js.native
  
  /** Boolean value to indicate if the component should render in compact mode. Set to false by default */
  var compact: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional callback to access the IGroupedList interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IGroupedList]] = js.native
  
  /** Map of callback functions related to drag and drop functionality. */
  var dragDropEvents: js.UndefOr[IDragDropEvents] = js.native
  
  /** helper to manage drag/drop across item and groups */
  var dragDropHelper: js.UndefOr[IDragDropHelper] = js.native
  
  /** Event names and corresponding callbacks that will be registered to groups and rendered elements */
  var eventsToRegister: js.UndefOr[js.Array[Callback]] = js.native
  
  /** Optional properties to pass through to the FocusZone. */
  var focusZoneProps: js.UndefOr[IFocusZoneProps] = js.native
  
  /**
    * Optional function to override default group height calculation used by list virtualization.
    */
  var getGroupHeight: js.UndefOr[js.Function2[/* group */ IGroup, /* groupIndex */ Double, Double]] = js.native
  
  /** Optional override properties to render groups. */
  var groupProps: js.UndefOr[IGroupRenderProps] = js.native
  
  /** Optional grouping instructions. */
  var groups: js.UndefOr[js.Array[IGroup]] = js.native
  
  /** List of items to render. */
  var items: js.Array[_] = js.native
  
  /** Optional properties to pass through to the list components being rendered. */
  var listProps: js.UndefOr[IListProps[_]] = js.native
  
  /** Optional callback when the group expand state changes between all collapsed and at least one group is expanded. */
  var onGroupExpandStateChanged: js.UndefOr[js.Function1[/* isSomeGroupExpanded */ Boolean, Unit]] = js.native
  
  /** Rendering callback to render the group items. */
  def onRenderCell(): ReactElement = js.native
  def onRenderCell(nestingDepth: js.UndefOr[scala.Nothing], item: js.UndefOr[scala.Nothing], index: Double): ReactElement = js.native
  def onRenderCell(nestingDepth: js.UndefOr[scala.Nothing], item: js.Any): ReactElement = js.native
  def onRenderCell(nestingDepth: js.UndefOr[scala.Nothing], item: js.Any, index: Double): ReactElement = js.native
  def onRenderCell(nestingDepth: Double): ReactElement = js.native
  def onRenderCell(nestingDepth: Double, item: js.UndefOr[scala.Nothing], index: Double): ReactElement = js.native
  def onRenderCell(nestingDepth: Double, item: js.Any): ReactElement = js.native
  def onRenderCell(nestingDepth: Double, item: js.Any, index: Double): ReactElement = js.native
  
  /**
    * Optional callback to determine whether the list should be rendered in full, or virtualized.
    * Virtualization will add and remove pages of items as the user scrolls them into the visible range.
    * This benefits larger list scenarios by reducing the DOM on the screen, but can negatively affect performance for
    * smaller lists.
    * The default implementation will virtualize when this callback is not provided.
    */
  var onShouldVirtualize: js.UndefOr[js.Function1[/* props */ IListProps[_], Boolean]] = js.native
  
  /** Override the default role for GroupedList.  */
  var role: js.UndefOr[String] = js.native
  
  /** Optional selection model to track selection state.  */
  var selection: js.UndefOr[ISelection[IObjectWithKey]] = js.native
  
  /** Controls how/if the list manages selection. */
  var selectionMode: js.UndefOr[SelectionMode] = js.native
  
  /**
    * Style function to be passed in to override the themed or default styles
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IGroupedListStyleProps, IGroupedListStyles]] = js.native
  
  /**
    * Theme that is passed in from Higher Order Component
    */
  var theme: js.UndefOr[ITheme] = js.native
  
  /**
    * boolean to control if pages containing unchanged items should be cached, this is a perf optimization
    * The same property in List.Props
    */
  var usePageCache: js.UndefOr[Boolean] = js.native
  
  /** Optional Viewport, provided by the parent component. */
  var viewport: js.UndefOr[IViewport] = js.native
}
