package typingsSlinky.sammy

import typingsSlinky.sammy.Sammy.Application
import typingsSlinky.sammy.Sammy.SammyFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends StObject {
  
  var log: js.Function = js.native
  
  def sammy(): Application = js.native
  def sammy(handler: js.Function): Application = js.native
  def sammy(selector: String): Application = js.native
  def sammy(selector: String, handler: js.Function): Application = js.native
  @JSName("sammy")
  var sammy_Original: SammyFunc = js.native
}
