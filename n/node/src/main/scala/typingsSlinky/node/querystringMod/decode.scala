package typingsSlinky.node.querystringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("querystring", "decode")
@js.native
object decode extends js.Object {
  /**
    * The querystring.decode() function is an alias for querystring.parse().
    */
  def apply(str: String): ParsedUrlQuery = js.native
  def apply(str: String, sep: String): ParsedUrlQuery = js.native
  def apply(str: String, sep: String, eq: String): ParsedUrlQuery = js.native
  def apply(str: String, sep: String, eq: String, options: ParseOptions): ParsedUrlQuery = js.native
}

