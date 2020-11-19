package typingsSlinky.jsfl.global

import typingsSlinky.jsfl.ElementCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("$")
@js.native
object _empty extends js.Object {
  
  // http://www.xjsfl.com/support/guides/working-with-flash/introduction-to-selectors
  // http://www.xjsfl.com/support/api/elements/ElementSelector
  def apply(selector: String): ElementCollection = js.native
}
