package typingsSlinky.ngTable

import typingsSlinky.angular.mod.IQService
import typingsSlinky.ngTable.getGroupMod.IGetGroupFunc
import typingsSlinky.ngTable.ngTableDefaultGetDataMod.IDefaultGetData
import typingsSlinky.ngTable.resultsMod.IDataRowGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ng-table/src/core/grouping/ngTableDefaultGetGroups", JSImport.Namespace)
@js.native
object ngTableDefaultGetGroupsMod extends js.Object {
  
  def ngTableDefaultGetGroups[T]($q: IQService, ngTableDefaultGetData: IDefaultGetData[IDataRowGroup[T]]): IGetGroupFunc[T] = js.native
}
