package typingsSlinky.easyXapiSupertest.superagentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuperAgentStatic extends SuperAgent[SuperAgentRequest] {
  
  def apply(method: String, url: String): SuperAgentRequest = js.native
  def apply(url: String): SuperAgentRequest = js.native
  
  def agent(): SuperAgent[SuperAgentRequest] = js.native
}
