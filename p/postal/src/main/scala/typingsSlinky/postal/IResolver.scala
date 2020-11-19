package typingsSlinky.postal

import typingsSlinky.postal.anon.Binding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResolver extends js.Object {
  
  def compare(binding: String, topic: String, headerOptions: js.Object): Boolean = js.native
  
  def purge(): Unit = js.native
  def purge(options: Binding): Unit = js.native
  
  def reset(): Unit = js.native
}
