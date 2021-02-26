package typingsSlinky.ngTable

import typingsSlinky.angular.mod.IQService
import typingsSlinky.ngTable.getGroupMod.IGetGroupFunc
import typingsSlinky.ngTable.ngTableDefaultGetDataMod.IDefaultGetData
import typingsSlinky.ngTable.resultsMod.IDataRowGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngTableDefaultGetGroupsMod {
  
  @JSImport("ng-table/src/core/grouping/ngTableDefaultGetGroups", "ngTableDefaultGetGroups")
  @js.native
  def ngTableDefaultGetGroups[T]($q: IQService, ngTableDefaultGetData: IDefaultGetData[IDataRowGroup[T]]): IGetGroupFunc[T] = js.native
}
