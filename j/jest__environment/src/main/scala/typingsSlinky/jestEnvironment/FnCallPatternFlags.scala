package typingsSlinky.jestEnvironment

import typingsSlinky.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallPatternFlags extends js.Object {
  def apply(pattern: String): js.RegExp = js.native
  def apply(pattern: String, flags: String): js.RegExp = js.native
  def apply(pattern: RegExp): js.RegExp = js.native
  def apply(pattern: RegExp, flags: String): js.RegExp = js.native
}

