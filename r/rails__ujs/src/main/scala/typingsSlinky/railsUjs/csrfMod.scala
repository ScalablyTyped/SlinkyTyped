package typingsSlinky.railsUjs

import org.scalajs.dom.raw.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@rails/ujs/utils/csrf", JSImport.Namespace)
@js.native
object csrfMod extends js.Object {
  
  def CSRFProtection(xhr: XMLHttpRequest): Unit = js.native
  
  def csrfParam(): String | Null = js.native
  
  def csrfToken(): String | Null = js.native
  
  def refreshCSRFTokens(): Unit = js.native
}
