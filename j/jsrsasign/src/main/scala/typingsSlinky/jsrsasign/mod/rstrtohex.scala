package typingsSlinky.jsrsasign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsrsasign", "rstrtohex")
@js.native
object rstrtohex extends js.Object {
  
  /**
    * convert a raw string including non printable characters to hexadecimal encoded string.
    * @param s raw string
    * @return hexadecimal encoded string
    * @example
    * rstrtohex("a\x00a") → "610061"
    */
  def apply(s: String): String = js.native
}
