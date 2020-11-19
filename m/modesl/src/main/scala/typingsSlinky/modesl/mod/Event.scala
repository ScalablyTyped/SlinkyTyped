package typingsSlinky.modesl.mod

import typingsSlinky.modesl.anon.HIGH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("modesl", "Event")
@js.native
class Event protected () extends js.Object {
  def this(`type`: js.Any, subclass: js.Any) = this()
  
  def addBody(value: js.Any): js.Any = js.native
  
  def addHeader(name: js.Any, value: js.Any): js.Any = js.native
  
  def delHeader(name: js.Any): js.Any = js.native
  
  def firstHeader(): js.Any = js.native
  
  def getBody(): js.Any = js.native
  
  def getHeader(name: js.Any): String = js.native
  
  def getType(): js.Any = js.native
  
  var headers: js.Array[Header] = js.native
  
  def nextHeader(): js.Any = js.native
  
  def serialize(format: js.Any): js.Any = js.native
  
  def setPriority(priority: js.Any): Unit = js.native
}
/* static members */
@JSImport("modesl", "Event")
@js.native
object Event extends js.Object {
  
  val PRIORITY: HIGH = js.native
}
