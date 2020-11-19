package typingsSlinky.jsfl.global

import typingsSlinky.jsfl.ItemCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("$$")
@js.native
object $ extends js.Object {
  
  // http://www.xjsfl.com/support/api/elements/ItemSelector
  def apply(selector: String): ItemCollection = js.native
}
