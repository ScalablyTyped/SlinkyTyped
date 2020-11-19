package typingsSlinky.axon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("axon", "SubSocket")
@js.native
class SubSocket () extends Socket_ {
  
  def clearSubscriptions(): Unit = js.native
  
  def hasSubscriptions(): Boolean = js.native
  
  def matches(topic: String): Boolean = js.native
  
  /**
    * @throws {Error}
    */
  def send(): Unit = js.native
  
  def subscribe(re: String): js.RegExp = js.native
  def subscribe(re: js.RegExp): js.RegExp = js.native
  
  def unsubscribe(re: String): Unit = js.native
  def unsubscribe(re: js.RegExp): Unit = js.native
}
