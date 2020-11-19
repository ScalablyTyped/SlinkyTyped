package typingsSlinky.hapiHapi.mod

import typingsSlinky.hapiHapi.mod.Lifecycle.Method
import typingsSlinky.hapiHapi.mod.Lifecycle.ReturnValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteExtObject extends js.Object {
  
  def method(request: Request, h: ResponseToolkit): ReturnValue = js.native
  def method(request: Request, h: ResponseToolkit, err: js.Error): ReturnValue = js.native
  @JSName("method")
  var method_Original: Method = js.native
  
  var options: js.UndefOr[ServerExtOptions] = js.native
}
