package typingsSlinky.braces.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Braces extends js.Object {
  
  def apply(pattern: String): js.Array[String] = js.native
  def apply(pattern: String, options: Options): js.Array[String] = js.native
  
  def expand(pattern: String): js.Array[String] = js.native
}
