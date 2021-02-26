package typingsSlinky.antd.mod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.listItemMod.ListItemTypeProps
import typingsSlinky.antd.listMod.ListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object List {
  
  @JSImport("antd", "List")
  @js.native
  def apply[T](
    hasPaginationPrefixClsBorderedSplitClassNameChildrenItemLayoutLoadMoreGridDataSourceSizeHeaderFooterLoadingRowKeyRenderItemLocaleRest: ListProps[T]
  ): ReactElement = js.native
  @JSImport("antd", "List")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd", "List.Item")
  @js.native
  def Item: ListItemTypeProps = js.native
  @scala.inline
  def Item_=(x: ListItemTypeProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
}
