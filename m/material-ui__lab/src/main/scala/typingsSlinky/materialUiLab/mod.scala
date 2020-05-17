package typingsSlinky.materialUiLab

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
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
import typingsSlinky.materialUiLab.toggleButtonGroupToggleButtonGroupMod.ToggleButtonGroupProps
import typingsSlinky.materialUiLab.treeItemTreeItemMod.TreeItemProps
import typingsSlinky.materialUiLab.treeViewTreeViewMod.TreeViewProps
import typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod.CreateFilterOptionsConfig
import typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod.FilterOptionsState
import typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod.UseAutocompleteProps
import typingsSlinky.materialUiLab.usePaginationMod.UsePaginationProps
import typingsSlinky.materialUiLab.usePaginationMod.UsePaginationResult
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/lab", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Rating protected ()
    extends Component[RatingProps, js.Object, js.Any] {
    def this(props: RatingProps) = this()
    def this(props: RatingProps, context: js.Any) = this()
  }
  
  val PaginationItem: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OverridableComponent<PaginationItemTypeMap> */ js.Any = js.native
  val Skeleton: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OverridableComponent<SkeletonTypeMap> */ js.Any = js.native
  val ToggleButton: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendButtonBase<ToggleButtonTypeMap> */ js.Any = js.native
  def Alert(props: AlertProps): ReactElement = js.native
  def AlertTitle(props: AlertTitleProps): ReactElement = js.native
  def Autocomplete[T](props: AutocompleteProps[T] with UseAutocompleteProps[T]): ReactElement = js.native
  def AvatarGroup(props: AvatarGroupProps): ReactElement = js.native
  def Pagination(props: PaginationProps): ReactElement = js.native
  def SpeedDial(props: SpeedDialProps): ReactElement = js.native
  def SpeedDialAction(props: SpeedDialActionProps): ReactElement = js.native
  def SpeedDialIcon(props: SpeedDialIconProps): ReactElement = js.native
  def ToggleButtonGroup(props: ToggleButtonGroupProps): ReactElement = js.native
  def TreeItem(props: TreeItemProps): ReactElement = js.native
  def TreeView(props: TreeViewProps): ReactElement = js.native
  def createFilterOptions[T](): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = js.native
  def createFilterOptions[T](config: CreateFilterOptionsConfig[T]): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = js.native
  def useAutocomplete[T](props: UseAutocompleteProps[T]): AnchorEl[T] = js.native
  def usePagination(props: UsePaginationProps): UsePaginationResult = js.native
  @js.native
  object Rating extends TopLevel[ReactComponentClass[RatingProps]]
  
}

