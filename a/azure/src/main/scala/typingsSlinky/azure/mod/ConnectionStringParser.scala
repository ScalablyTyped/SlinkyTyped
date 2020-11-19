package typingsSlinky.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure", "ConnectionStringParser")
@js.native
class ConnectionStringParser protected () extends js.Object {
  def this(connectionString: String) = this()
  
  def _extractKey(): String = js.native
  
  def _extractString(quote: String): String = js.native
  
  def _extractValue(): String = js.native
  
  def _parse(options: ConnectionStringParseOptions): Dictionary[String] = js.native
  
  var _pos: Double = js.native
  
  def _skipOperator(operator: String): Unit = js.native
  
  def _skipWhitespaces(): Unit = js.native
  
  var _state: String = js.native
  
  var _value: String = js.native
}
/* static members */
@JSImport("azure", "ConnectionStringParser")
@js.native
object ConnectionStringParser extends js.Object {
  
  def parse(connectionString: String): Dictionary[String] = js.native
}
