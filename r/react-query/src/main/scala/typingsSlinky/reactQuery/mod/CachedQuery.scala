package typingsSlinky.reactQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CachedQuery extends js.Object {
  
  var config: QueryOptions[_] = js.native
  
  def queryFn(args: js.Any*): js.Any = js.native
  
  var queryKey: AnyQueryKey = js.native
  
  var queryVariables: AnyVariables = js.native
  
  def setData(dataOrUpdater: js.Any): Unit = js.native
  def setData(dataOrUpdater: js.Function1[/* oldData */ js.UndefOr[js.Any], _]): Unit = js.native
  
  var state: js.Any = js.native
}
