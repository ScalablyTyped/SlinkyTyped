package typingsSlinky.original

import typingsSlinky.original.anon.Host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("original", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(url: String): String = js.native
  def apply(url: js.Object): String = js.native
  def apply(url: Host): String = js.native
  
  /**
    * Check if the origins are the same.
    *
    * @param a URL or origin of a.
    * @param b URL or origin of b.
    * @returns true if origins are the same, false otherwise
    * @api public
    */
  def same(a: String, b: String): Boolean = js.native
}
