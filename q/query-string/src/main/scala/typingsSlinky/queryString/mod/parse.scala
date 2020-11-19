package typingsSlinky.queryString.mod

import typingsSlinky.queryString.anon.parseBooleanstrueParseOpt
import typingsSlinky.queryString.anon.parseBooleanstrueparseNum
import typingsSlinky.queryString.anon.parseNumberstrueParseOpti
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("query-string", "parse")
@js.native
object parse extends js.Object {
  
  def apply(query: String): ParsedQuery[String] = js.native
  def apply(query: String, options: parseBooleanstrueParseOpt): ParsedQuery[String | Boolean] = js.native
  def apply(query: String, options: parseBooleanstrueparseNum): ParsedQuery[String | Boolean | Double] = js.native
  def apply(query: String, options: parseNumberstrueParseOpti): ParsedQuery[String | Double] = js.native
  def apply(query: String, options: ParseOptions): ParsedQuery[String] = js.native
}
