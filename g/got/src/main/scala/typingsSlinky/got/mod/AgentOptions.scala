package typingsSlinky.got.mod

import typingsSlinky.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentOptions extends StObject {
  
  var http: Agent = js.native
  
  var https: typingsSlinky.node.httpsMod.Agent = js.native
}
object AgentOptions {
  
  @scala.inline
  def apply(http: Agent, https: typingsSlinky.node.httpsMod.Agent): AgentOptions = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any], https = https.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentOptions]
  }
  
  @scala.inline
  implicit class AgentOptionsMutableBuilder[Self <: AgentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttp(value: Agent): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttps(value: typingsSlinky.node.httpsMod.Agent): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
  }
}
