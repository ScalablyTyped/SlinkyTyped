package typingsSlinky.officeUiFabricReact.groupedListBaseMod

import typingsSlinky.officeUiFabricReact.anon.Compact
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroupedList
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroupedListProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupedList.base", "GroupedListBase")
@js.native
class GroupedListBase protected ()
  extends Component[IGroupedListProps, IGroupedListState, js.Any]
     with IGroupedList {
  def this(props: IGroupedListProps) = this()
  
  var _classNames: js.Any = js.native
  
  var _computeIsSomeGroupExpanded: js.Any = js.native
  
  var _forceListUpdates: js.Any = js.native
  
  var _getDefaultGroupItemLimit: js.Any = js.native
  
  var _getGroupHeight: js.Any = js.native
  
  var _getGroupItemLimit: js.Any = js.native
  
  var _getGroupKey: js.Any = js.native
  
  var _getGroupNestingDepth: js.Any = js.native
  
  var _getPageHeight: js.Any = js.native
  
  var _getPageSpecification: js.Any = js.native
  
  var _isInnerZoneKeystroke: js.Any = js.native
  
  var _isSomeGroupExpanded: js.Any = js.native
  
  var _list: js.Any = js.native
  
  var _onToggleCollapse: js.Any = js.native
  
  var _onToggleSelectGroup: js.Any = js.native
  
  var _onToggleSummarize: js.Any = js.native
  
  var _renderGroup: js.Any = js.native
  
  var _returnOne: js.Any = js.native
  
  var _setGroupsCollapsedState: js.Any = js.native
  
  var _updateIsSomeGroupExpanded: js.Any = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MGroupedListBase(): Unit = js.native
  
  /* InferMemberOverrides */
  override def forceUpdate(): Unit = js.native
}
/* static members */
@JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupedList.base", "GroupedListBase")
@js.native
object GroupedListBase extends js.Object {
  
  var defaultProps: Compact = js.native
  
  def getDerivedStateFromProps(nextProps: IGroupedListProps, previousState: IGroupedListState): IGroupedListState = js.native
}
