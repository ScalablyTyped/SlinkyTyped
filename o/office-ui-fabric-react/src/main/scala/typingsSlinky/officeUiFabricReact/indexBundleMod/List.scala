package typingsSlinky.officeUiFabricReact.indexBundleMod

import typingsSlinky.officeUiFabricReact.anon.OnRenderCell
import typingsSlinky.officeUiFabricReact.listListMod.IListState
import typingsSlinky.officeUiFabricReact.listTypesMod.IListProps
import org.scalablytyped.runtime.StObject
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
object List {
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "List")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "List.defaultProps")
  @js.native
  def defaultProps: OnRenderCell = js.native
  @scala.inline
  def defaultProps_=(x: OnRenderCell): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "List.getDerivedStateFromProps")
  @js.native
  def getDerivedStateFromProps[T](nextProps: IListProps[T], previousState: IListState[T]): IListState[T] = js.native
}
