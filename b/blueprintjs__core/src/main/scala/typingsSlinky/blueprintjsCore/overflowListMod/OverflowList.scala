package typingsSlinky.blueprintjsCore.overflowListMod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.blueprintjsCore.anon.PartialIOverflowListPropsClassName
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components/overflow-list/overflowList", "OverflowList")
@js.native
class OverflowList[T] ()
  extends Component[IOverflowListProps[T], IOverflowListState[T], js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MOverflowList(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MOverflowList(prevProps: IOverflowListProps[T], prevState: IOverflowListState[T]): Unit = js.native
  
  var maybeRenderOverflow: js.Any = js.native
  
  /** A cache containing the widths of all elements being observed to detect growing/shrinking */
  var previousWidths: js.Any = js.native
  
  var repartition: js.Any = js.native
  
  var resize: js.Any = js.native
  
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MOverflowList(_nextProps: IOverflowListProps[T], nextState: IOverflowListState[T]): Boolean = js.native
  
  var spacer: js.Any = js.native
}
/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/overflow-list/overflowList", "OverflowList")
@js.native
object OverflowList extends js.Object {
  
  var defaultProps: PartialIOverflowListPropsClassName = js.native
  
  var displayName: String = js.native
  
  def ofType[T](): Instantiable1[/* props */ IOverflowListProps[T], OverflowList[T]] = js.native
}
