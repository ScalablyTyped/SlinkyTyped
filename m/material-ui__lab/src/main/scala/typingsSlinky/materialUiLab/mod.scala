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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material-ui/lab", "Alert")
  @js.native
  def Alert(props: AlertProps): ReactElement = js.native
  
  @JSImport("@material-ui/lab", "AlertTitle")
  @js.native
  def AlertTitle(props: AlertTitleProps): ReactElement = js.native
  
  @JSImport("@material-ui/lab", "Autocomplete")
  @js.native
  def Autocomplete[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](props: AutocompleteProps[T, Multiple, DisableClearable, FreeSolo]): ReactElement = js.native
  
  @JSImport("@material-ui/lab", "AvatarGroup")
  @js.native
  def AvatarGroup(props: AvatarGroupProps): ReactElement = js.native
  
  @JSImport("@material-ui/lab", "Pagination")
  @js.native
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
  @JSImport("@material-ui/lab", "PaginationItem")
  @js.native
  val PaginationItem: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OverridableComponent<PaginationItemTypeMap> */ js.Any = js.native
  
  @JSImport("@material-ui/lab", "Rating")
  @js.native
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
  @JSImport("@material-ui/lab", "Skeleton")
  @js.native
  val Skeleton: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OverridableComponent<SkeletonTypeMap> */ js.Any = js.native
  
  @JSImport("@material-ui/lab", "SpeedDial")
  @js.native
  def SpeedDial(props: SpeedDialProps): ReactElement = js.native
  
  @JSImport("@material-ui/lab", "SpeedDialAction")
  @js.native
  def SpeedDialAction(props: SpeedDialActionProps): ReactElement = js.native
  
  @JSImport("@material-ui/lab", "SpeedDialIcon")
  @js.native
  def SpeedDialIcon(props: SpeedDialIconProps): ReactElement = js.native
  
  @JSImport("@material-ui/lab", "TabContext")
  @js.native
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
  @JSImport("@material-ui/lab", "TabList")
  @js.native
  val TabList: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OverridableComponent<TabListTypeMap> */ js.Any = js.native
  
  @JSImport("@material-ui/lab", "TabPanel")
  @js.native
  def TabPanel(props: TabPanelProps): ReactElement = js.native
  
  @JSImport("@material-ui/lab", "Timeline")
  @js.native
  def Timeline(props: TimelineProps): ReactElement = js.native
  
  @JSImport("@material-ui/lab", "TimelineConnector")
  @js.native
  def TimelineConnector(props: TimelineConnectorProps): ReactElement = js.native
  
  @JSImport("@material-ui/lab", "TimelineContent")
  @js.native
  def TimelineContent(props: TimelineContentProps): ReactElement = js.native
  
  @JSImport("@material-ui/lab", "TimelineDot")
  @js.native
  def TimelineDot(props: TimelineDotProps): ReactElement = js.native
  
  @JSImport("@material-ui/lab", "TimelineItem")
  @js.native
  def TimelineItem(props: TimelineItemProps): ReactElement = js.native
  
  @JSImport("@material-ui/lab", "TimelineOppositeContent")
  @js.native
  def TimelineOppositeContent(props: TimelineOppositeContentProps): ReactElement = js.native
  
  @JSImport("@material-ui/lab", "TimelineSeparator")
  @js.native
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
  @JSImport("@material-ui/lab", "ToggleButton")
  @js.native
  val ToggleButton: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendButtonBase<ToggleButtonTypeMap> */ js.Any = js.native
  
  @JSImport("@material-ui/lab", "ToggleButtonGroup")
  @js.native
  def ToggleButtonGroup(props: ToggleButtonGroupProps): ReactElement = js.native
  
  @JSImport("@material-ui/lab", "TreeItem")
  @js.native
  def TreeItem(props: TreeItemProps): ReactElement = js.native
  
  @JSImport("@material-ui/lab", "TreeView")
  @js.native
  def TreeView(props: TreeViewProps): ReactElement = js.native
  
  @JSImport("@material-ui/lab", "createFilterOptions")
  @js.native
  def createFilterOptions[T](): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = js.native
  @JSImport("@material-ui/lab", "createFilterOptions")
  @js.native
  def createFilterOptions[T](config: CreateFilterOptionsConfig[T]): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = js.native
  
  @JSImport("@material-ui/lab", "getPanelId")
  @js.native
  def getPanelId(context: TabContextValue, tabValue: String): String = js.native
  
  @JSImport("@material-ui/lab", "getTabId")
  @js.native
  def getTabId(context: TabContextValue, tabValue: String): String = js.native
  
  @JSImport("@material-ui/lab", "useAutocomplete")
  @js.native
  def useAutocomplete[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](props: UseAutocompleteProps[T, Multiple, DisableClearable, FreeSolo]): AnchorEl[T, Multiple, DisableClearable, FreeSolo] = js.native
  
  @JSImport("@material-ui/lab", "usePagination")
  @js.native
  def usePagination(props: UsePaginationProps): UsePaginationResult = js.native
  
  @JSImport("@material-ui/lab", "useTabContext")
  @js.native
  def useTabContext(): TabContextValue | Null = js.native
}
