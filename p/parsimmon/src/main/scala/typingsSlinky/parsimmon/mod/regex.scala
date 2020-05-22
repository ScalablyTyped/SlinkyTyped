package typingsSlinky.parsimmon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parsimmon", "regex")
@js.native
object regex extends js.Object {
  /**
    * This was the original name for Parsimmon.regexp, but now it is just an alias.
    */
  def apply(myregex: js.RegExp): Parser[String] = js.native
  def apply(myregex: js.RegExp, group: Double): Parser[String] = js.native
}

