package typingsSlinky.marko.expressMod

import typingsSlinky.bodyParser.mod.OptionsJson
import typingsSlinky.connect.mod.NextHandleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
  * @since 4.16.0
  */
@JSImport("marko/express", "json")
@js.native
object json extends js.Object {
  
  def apply(): NextHandleFunction = js.native
  def apply(options: OptionsJson): NextHandleFunction = js.native
}
