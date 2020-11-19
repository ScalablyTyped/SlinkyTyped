package typingsSlinky.chaiHttp.mod.global

import typingsSlinky.superagent.mod.SuperAgentStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ChaiHttp")
@js.native
object ChaiHttp extends js.Object {
  
  @js.native
  trait Agent extends SuperAgentStatic {
    
    def close(): Agent = js.native
    def close(callback: js.Function1[/* err */ js.Any, Unit]): Agent = js.native
    
    def keepOpen(): Agent = js.native
  }
  
  type Response = typingsSlinky.superagent.mod.Response
}
