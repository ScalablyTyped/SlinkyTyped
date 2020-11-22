package typingsSlinky.officeUiFabricReact.indexBundleMod

import typingsSlinky.officeUiFabricReact.anon.OnRenderCell
import typingsSlinky.officeUiFabricReact.listListMod.IListState
import typingsSlinky.officeUiFabricReact.listTypesMod.IListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/index.bundle", "List")
@js.native
class List[T] protected ()
  extends typingsSlinky.officeUiFabricReact.mod.List[T] {
  def this(props: IListProps[T]) = this()
}
/* static members */
@JSImport("office-ui-fabric-react/lib/index.bundle", "List")
@js.native
object List extends js.Object {
  
  var defaultProps: OnRenderCell = js.native
  
  def getDerivedStateFromProps[T](nextProps: IListProps[T], previousState: IListState[T]): IListState[T] = js.native
}
