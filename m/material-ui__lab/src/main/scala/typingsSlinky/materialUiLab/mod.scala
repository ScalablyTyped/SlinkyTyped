package typingsSlinky.materialUiLab

import slinky.core.facade.ReactElement
import typingsSlinky.materialUiLab.alertAlertMod.AlertProps
import typingsSlinky.materialUiLab.alertTitleAlertTitleMod.AlertTitleProps
import typingsSlinky.materialUiLab.anon.AnchorEl
import typingsSlinky.materialUiLab.autocompleteAutocompleteMod.AutocompleteProps
import typingsSlinky.materialUiLab.avatarGroupAvatarGroupMod.AvatarGroupProps
import typingsSlinky.materialUiLab.paginationPaginationMod.PaginationProps
import typingsSlinky.materialUiLab.ratingRatingMod.RatingProps
import typingsSlinky.materialUiLab.speedDialActionSpeedDialActionMod.SpeedDialActionProps
import typingsSlinky.materialUiLab.speedDialIconSpeedDialIconMod.SpeedDialIconProps
import typingsSlinky.materialUiLab.speedDialSpeedDialMod.SpeedDialProps
import typingsSlinky.materialUiLab.tabContextTabContextMod.TabContextProps
import typingsSlinky.materialUiLab.tabContextTabContextMod.TabContextValue
import typingsSlinky.materialUiLab.tabPanelTabPanelMod.TabPanelProps
import typingsSlinky.materialUiLab.timelineConnectorTimelineConnectorMod.TimelineConnectorProps
import typingsSlinky.materialUiLab.timelineContentTimelineContentMod.TimelineContentProps
import typingsSlinky.materialUiLab.timelineDotTimelineDotMod.TimelineDotProps
import typingsSlinky.materialUiLab.timelineItemTimelineItemMod.TimelineItemProps
import typingsSlinky.materialUiLab.timelineOppositeContentTimelineOppositeContentMod.TimelineOppositeContentProps
import typingsSlinky.materialUiLab.timelineSeparatorTimelineSeparatorMod.TimelineSeparatorProps
import typingsSlinky.materialUiLab.timelineTimelineMod.TimelineProps
import typingsSlinky.materialUiLab.toggleButtonGroupToggleButtonGroupMod.ToggleButtonGroupProps
import typingsSlinky.materialUiLab.treeItemTreeItemMod.TreeItemProps
import typingsSlinky.materialUiLab.treeViewTreeViewMod.TreeViewProps
import typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod.CreateFilterOptionsConfig
import typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod.FilterOptionsState
import typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod.UseAutocompleteProps
import typingsSlinky.materialUiLab.usePaginationMod.UsePaginationProps
import typingsSlinky.materialUiLab.usePaginationMod.UsePaginationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material-ui/lab", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def Alert(props: AlertProps): ReactElement = js.native
  
  def AlertTitle(props: AlertTitleProps): ReactElement = js.native
  
  def Autocomplete[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](props: AutocompleteProps[T, Multiple, DisableClearable, FreeSolo]): ReactElement = js.native
  
  def AvatarGroup(props: AvatarGroupProps): ReactElement = js.native
  
  def Pagination(props: PaginationProps): ReactElement = js.native
  
  /**
    *
    * Demos:
    *
    * - [Pagination](https://material-ui.com/components/pagination/)
    *
    * API:
    *
    * - [PaginationItem API](https://material-ui.com/api/pagination-item/)
    */
  val PaginationItem: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OverridableComponent<PaginationItemTypeMap> */ js.Any = js.native
  
  def Rating(props: RatingProps): ReactElement = js.native
  
  /**
    *
    * Demos:
    *
    * - [Skeleton](https://material-ui.com/components/skeleton/)
    *
    * API:
    *
    * - [Skeleton API](https://material-ui.com/api/skeleton/)
    */
  val Skeleton: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OverridableComponent<SkeletonTypeMap> */ js.Any = js.native
  
  def SpeedDial(props: SpeedDialProps): ReactElement = js.native
  
  def SpeedDialAction(props: SpeedDialActionProps): ReactElement = js.native
  
  def SpeedDialIcon(props: SpeedDialIconProps): ReactElement = js.native
  
  def TabContext(props: TabContextProps): ReactElement = js.native
  
  /**
    *
    * Demos:
    *
    * - [Tabs](https://material-ui.com/components/tabs/)
    *
    * API:
    *
    * - [TabList API](https://material-ui.com/api/tab-list/)
    * - inherits [Tabs API](https://material-ui.com/api/tabs/)
    */
  val TabList: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OverridableComponent<TabListTypeMap> */ js.Any = js.native
  
  def TabPanel(props: TabPanelProps): ReactElement = js.native
  
  def Timeline(props: TimelineProps): ReactElement = js.native
  
  def TimelineConnector(props: TimelineConnectorProps): ReactElement = js.native
  
  def TimelineContent(props: TimelineContentProps): ReactElement = js.native
  
  def TimelineDot(props: TimelineDotProps): ReactElement = js.native
  
  def TimelineItem(props: TimelineItemProps): ReactElement = js.native
  
  def TimelineOppositeContent(props: TimelineOppositeContentProps): ReactElement = js.native
  
  def TimelineSeparator(props: TimelineSeparatorProps): ReactElement = js.native
  
  /**
    *
    * Demos:
    *
    * - [Toggle Button](https://material-ui.com/components/toggle-button/)
    *
    * API:
    *
    * - [ToggleButton API](https://material-ui.com/api/toggle-button/)
    * - inherits [ButtonBase API](https://material-ui.com/api/button-base/)
    */
  val ToggleButton: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendButtonBase<ToggleButtonTypeMap> */ js.Any = js.native
  
  def ToggleButtonGroup(props: ToggleButtonGroupProps): ReactElement = js.native
  
  def TreeItem(props: TreeItemProps): ReactElement = js.native
  
  def TreeView(props: TreeViewProps): ReactElement = js.native
  
  def createFilterOptions[T](): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = js.native
  def createFilterOptions[T](config: CreateFilterOptionsConfig[T]): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = js.native
  
  def getPanelId(context: TabContextValue, tabValue: String): String = js.native
  
  def getTabId(context: TabContextValue, tabValue: String): String = js.native
  
  def useAutocomplete[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](props: UseAutocompleteProps[T, Multiple, DisableClearable, FreeSolo]): AnchorEl[T, Multiple, DisableClearable, FreeSolo] = js.native
  
  def usePagination(props: UsePaginationProps): UsePaginationResult = js.native
  
  def useTabContext(): TabContextValue | Null = js.native
}
