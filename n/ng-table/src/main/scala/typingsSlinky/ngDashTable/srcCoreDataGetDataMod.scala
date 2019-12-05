package typingsSlinky.ngDashTable

import typingsSlinky.angular.angularMod.IPromise
import typingsSlinky.ngDashTable.srcCoreNgTableParamsMod.NgTableParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/core/data/getData", JSImport.Namespace)
@js.native
object srcCoreDataGetDataMod extends js.Object {
  type IGetDataFunc[T] = js.Function1[/* params */ NgTableParams[T], js.Array[T] | IPromise[js.Array[T]]]
  type IInterceptableGetDataFunc[T] = js.Function1[/* params */ NgTableParams[T], js.Any]
}

