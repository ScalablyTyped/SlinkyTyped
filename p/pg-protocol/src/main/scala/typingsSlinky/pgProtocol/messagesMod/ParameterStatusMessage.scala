package typingsSlinky.pgProtocol.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pg-protocol/dist/messages", "ParameterStatusMessage")
@js.native
class ParameterStatusMessage protected () extends js.Object {
  def this(length: Double, parameterName: String, parameterValue: String) = this()
  
  val length: Double = js.native
  
  val name: MessageName = js.native
  
  val parameterName: String = js.native
  
  val parameterValue: String = js.native
}
