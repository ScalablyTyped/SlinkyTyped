package typingsSlinky.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Panel extends js.Object {
  
  /**Notifies panel that height of DOM node has changed */
  def changed(): Unit = js.native
  def changed(height: Double): Unit = js.native
  
  /**Removes the panel from the editor */
  def clear(): Unit = js.native
}
