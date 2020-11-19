package typingsSlinky.bodyParser.mod

import typingsSlinky.connect.mod.NextHandleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("body-parser", "json")
@js.native
object json extends js.Object {
  
  /**
    * Returns middleware that only parses json and only looks at requests
    * where the Content-Type header matches the type option.
    */
  def apply(): NextHandleFunction = js.native
  def apply(options: OptionsJson): NextHandleFunction = js.native
}
