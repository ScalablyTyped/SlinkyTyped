package typingsSlinky.angularHttp

import typingsSlinky.angularHttp.enumsMod.RequestMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/http/src/http_utils", JSImport.Namespace)
@js.native
object httpUtilsMod extends js.Object {
  
  def getResponseURL(xhr: js.Any): String | Null = js.native
  
  def isSuccess(status: Double): Boolean = js.native
  
  def normalizeMethodName(method: String): RequestMethod = js.native
  def normalizeMethodName(method: RequestMethod): RequestMethod = js.native
  
  def stringToArrayBuffer(input: String): js.typedarray.ArrayBuffer = js.native
  
  def stringToArrayBuffer8(input: String): js.typedarray.ArrayBuffer = js.native
}
