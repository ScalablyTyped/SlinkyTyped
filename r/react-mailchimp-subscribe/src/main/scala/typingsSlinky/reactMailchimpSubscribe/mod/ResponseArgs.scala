package typingsSlinky.reactMailchimpSubscribe.mod

import typingsSlinky.reactMailchimpSubscribe.reactMailchimpSubscribeStrings.error
import typingsSlinky.reactMailchimpSubscribe.reactMailchimpSubscribeStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactMailchimpSubscribe.mod.ErrorResponseArgs
  - typingsSlinky.reactMailchimpSubscribe.mod.SuccessResponseArgs
*/
trait ResponseArgs extends js.Object
object ResponseArgs {
  
  @scala.inline
  def ErrorResponseArgs(message: String | js.Error, status: error): ResponseArgs = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseArgs]
  }
  
  @scala.inline
  def SuccessResponseArgs(message: String, status: success): ResponseArgs = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseArgs]
  }
}
