package typingsSlinky.officeUiFabricReact.groupedListSectionMod

import slinky.core.TagMod
import typingsSlinky.officeUiFabricReact.AnonCallback
import typingsSlinky.officeUiFabricReact.IClassNamesIGroupedListSt
import typingsSlinky.officeUiFabricReact.dragdropInterfacesMod.IDragDropEvents
import typingsSlinky.officeUiFabricReact.dragdropInterfacesMod.IDragDropHelper
import typingsSlinky.officeUiFabricReact.groupFooterTypesMod.IGroupFooterProps
import typingsSlinky.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps
import typingsSlinky.officeUiFabricReact.groupShowAllTypesMod.IGroupShowAllProps
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroup
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroupRenderProps
import typingsSlinky.officeUiFabricReact.listTypesMod.IListProps
import typingsSlinky.officeUiFabricReact.withViewportMod.IViewport
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsSlinky.uifabricUtilities.selectionTypesMod.ISelection
import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroupedListSectionProps extends ClassAttributes[GroupedListSection] {
  /** Whether to render in compact mode */
  var compact: js.UndefOr[Boolean] = js.native
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[js.Function0[Unit]] = js.native
  /** Map of callback functions related to drag and drop functionality. */
  var dragDropEvents: js.UndefOr[IDragDropEvents] = js.native
  /** helper to manage drag/drop across item rows and groups */
  var dragDropHelper: js.UndefOr[IDragDropHelper] = js.native
  /** Event names and corresponding callbacks that will be registered to the group and the rendered elements */
  var eventsToRegister: js.UndefOr[js.Array[AnonCallback]] = js.native
  /** Information to pass in to the group footer. */
  var footerProps: js.UndefOr[IGroupFooterProps] = js.native
  /** Grouping item limit. */
  var getGroupItemLimit: js.UndefOr[js.Function1[/* group */ IGroup, Double]] = js.native
  /** Optional grouping instructions. */
  var group: js.UndefOr[IGroup] = js.native
  /** Optional grouping instructions. */
  var groupIndex: js.UndefOr[Double] = js.native
  /** Optional group nesting level. */
  var groupNestingDepth: js.UndefOr[Double] = js.native
  /** Optional override properties to render groups. */
  var groupProps: js.UndefOr[IGroupRenderProps] = js.native
  /** GroupedList resolved class names */
  var groupedListClassNames: js.UndefOr[IClassNamesIGroupedListSt] = js.native
  /** Stores parent group's children. */
  var groups: js.UndefOr[js.Array[IGroup]] = js.native
  /** Information to pass in to the group header. */
  var headerProps: js.UndefOr[IGroupHeaderProps] = js.native
  /** List of items to render. */
  var items: js.Array[_] = js.native
  /** Optional list props to pass to list renderer.  */
  var listProps: js.UndefOr[IListProps[_]] = js.native
  /** Override for rendering the group footer. */
  var onRenderGroupFooter: js.UndefOr[IRenderFunction[IGroupFooterProps]] = js.native
  /** Override for rendering the group header. */
  var onRenderGroupHeader: js.UndefOr[IRenderFunction[IGroupHeaderProps]] = js.native
  /** Override for rendering the group Show All link. */
  var onRenderGroupShowAll: js.UndefOr[IRenderFunction[IGroupShowAllProps]] = js.native
  /**
    * Optional callback to determine whether the list should be rendered in full, or virtualized.
    * Virtualization will add and remove pages of items as the user scrolls them into the visible range.
    * This benefits larger list scenarios by reducing the DOM on the screen, but can negatively affect performance for smaller lists.
    * The default implementation will virtualize when this callback is not provided.
    */
  var onShouldVirtualize: js.UndefOr[js.Function1[/* props */ IListProps[_], Boolean]] = js.native
  /** Optional selection model to track selection state.  */
  var selection: js.UndefOr[ISelection[IObjectWithKey]] = js.native
  /** Controls how/if the details list manages selection. */
  var selectionMode: js.UndefOr[SelectionMode] = js.native
  /** Information to pass in to the group Show All footer. */
  var showAllProps: js.UndefOr[IGroupShowAllProps] = js.native
  /** Optional Viewport, provided by the parent component. */
  var viewport: js.UndefOr[IViewport] = js.native
  /** Rendering callback to render the group items. */
  def onRenderCell(): TagMod[Any] = js.native
  def onRenderCell(nestingDepth: Double): TagMod[Any] = js.native
  def onRenderCell(nestingDepth: Double, item: js.Any): TagMod[Any] = js.native
  def onRenderCell(nestingDepth: Double, item: js.Any, index: Double): TagMod[Any] = js.native
}

