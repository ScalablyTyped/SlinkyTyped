package typingsSlinky.parse.mod.global.Parse.Query

import typingsSlinky.parse.mod.global.Parse.ErrorOption
import typingsSlinky.parse.mod.global.Parse.SessionTokenOption
import typingsSlinky.parse.mod.global.Parse.SuccessOption
import typingsSlinky.parse.mod.global.Parse.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountOptions
  extends SuccessOption
     with ErrorOption
     with SessionTokenOption
     with UseMasterKeyOption
object CountOptions {
  
  @scala.inline
  def apply(): CountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountOptions]
  }
}
