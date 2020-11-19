package typingsSlinky.ouibounce.mod

import typingsSlinky.ouibounce.anon.CookieDomain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ouibounce extends js.Object {
  
  /**
    * Disables the ouibounce event.
    */
  def disable(): Unit = js.native
  def disable(custom_options: CookieDomain): Unit = js.native
  
  /**
    * Fires the ouibounce event immediately.
    */
  def fire(): Unit = js.native
}
