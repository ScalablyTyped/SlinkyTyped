package typingsSlinky.ngTable

import typingsSlinky.angular.mod.IPromise
import typingsSlinky.ngTable.ngTableParamsMod.NgTableParams
import typingsSlinky.ngTable.resultsMod.IDataRowGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/core/grouping/getGroup", JSImport.Namespace)
@js.native
object getGroupMod extends js.Object {
  type IGetGroupFunc[T] = js.Function1[
    /* params */ NgTableParams[T], 
    js.Array[IDataRowGroup[T]] | IPromise[js.Array[IDataRowGroup[T]]]
  ]
}

