package typingsSlinky.ngDashTable

import typingsSlinky.angular.angularMod.IQService
import typingsSlinky.ngDashTable.srcCoreDataNgTableDefaultGetDataMod.IDefaultGetData
import typingsSlinky.ngDashTable.srcCoreDataResultsMod.IDataRowGroup
import typingsSlinky.ngDashTable.srcCoreGroupingGetGroupMod.IGetGroupFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/core/grouping", JSImport.Namespace)
@js.native
object srcCoreGroupingMod extends js.Object {
  def ngTableDefaultGetGroups[T]($q: IQService, ngTableDefaultGetData: IDefaultGetData[IDataRowGroup[T]]): IGetGroupFunc[T] = js.native
}

