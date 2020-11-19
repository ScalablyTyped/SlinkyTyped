package typingsSlinky.pgProtocol.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pg-protocol/dist/messages", "RowDescriptionMessage")
@js.native
class RowDescriptionMessage protected () extends js.Object {
  def this(length: Double, fieldCount: Double) = this()
  
  val fieldCount: Double = js.native
  
  val fields: js.Array[Field] = js.native
  
  val length: Double = js.native
  
  val name: MessageName = js.native
}
