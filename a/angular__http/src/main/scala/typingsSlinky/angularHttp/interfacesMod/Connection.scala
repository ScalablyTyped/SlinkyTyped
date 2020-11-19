package typingsSlinky.angularHttp.interfacesMod

import typingsSlinky.angularHttp.enumsMod.ReadyState
import typingsSlinky.angularHttp.staticRequestMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/http/src/interfaces", "Connection")
@js.native
abstract class Connection () extends js.Object {
  
  var readyState: ReadyState = js.native
  
  var request: Request = js.native
  
  var response: js.Any = js.native
}
