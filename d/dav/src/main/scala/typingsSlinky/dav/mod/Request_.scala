package typingsSlinky.dav.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dav", "Request")
@js.native
class Request_ () extends js.Object {
  def this(options: RequestOptions) = this()
  
  var method: String = js.native
  
  var onerror: js.UndefOr[js.Function1[/* error */ js.Error, _]] = js.native
  
  var requestData: js.UndefOr[String] = js.native
  
  var transformRequest: js.UndefOr[js.Function1[/* xhr */ js.Any, _]] = js.native
  
  var transformResponse: js.UndefOr[js.Function1[/* xhr */ js.Any, _]] = js.native
}
