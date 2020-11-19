package typingsSlinky.mongoose.mod.Error

import typingsSlinky.mongoose.anon.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidatorError
  extends typingsSlinky.mongoose.mod.Error {
  
  def formatMessage(msg: String, properties: js.Any): String = js.native
  def formatMessage(msg: js.Function, properties: js.Any): String = js.native
  
  var kind: String = js.native
  
  @JSName("name")
  var name_ValidatorError: typingsSlinky.mongoose.mongooseStrings.ValidatorError = js.native
  
  var path: String = js.native
  
  var properties: Message = js.native
  
  var reason: js.Any = js.native
  
  var value: js.Any = js.native
}
