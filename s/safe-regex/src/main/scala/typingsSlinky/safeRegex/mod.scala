package typingsSlinky.safeRegex

import typingsSlinky.safeRegex.anon.Limit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("safe-regex", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(re: String): Boolean = js.native
  def apply(re: String, opts: Limit): Boolean = js.native
  def apply(re: js.RegExp): Boolean = js.native
  def apply(re: js.RegExp, opts: Limit): Boolean = js.native
}

