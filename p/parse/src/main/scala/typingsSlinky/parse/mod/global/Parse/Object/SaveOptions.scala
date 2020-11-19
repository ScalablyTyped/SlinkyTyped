package typingsSlinky.parse.mod.global.Parse.Object

import typingsSlinky.parse.mod.global.Parse.CascadeSaveOption
import typingsSlinky.parse.mod.global.Parse.ErrorOption
import typingsSlinky.parse.mod.global.Parse.SessionTokenOption
import typingsSlinky.parse.mod.global.Parse.SilentOption
import typingsSlinky.parse.mod.global.Parse.SuccessOption
import typingsSlinky.parse.mod.global.Parse.UseMasterKeyOption
import typingsSlinky.parse.mod.global.Parse.WaitOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveOptions
  extends CascadeSaveOption
     with SuccessOption
     with ErrorOption
     with SilentOption
     with SessionTokenOption
     with UseMasterKeyOption
     with WaitOption
object SaveOptions {
  
  @scala.inline
  def apply(): SaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveOptions]
  }
}
