package typingsSlinky.getenv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("getenv", "bool")
@js.native
object bool extends js.Object {
  
  /**
    * Return as boolean. Only allows true/false as valid values.
    */
  def apply(name: String): Boolean = js.native
  def apply(name: String, fallback: Boolean): Boolean = js.native
}
