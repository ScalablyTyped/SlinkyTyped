package typingsSlinky.avoscloudSdk.mod.Object

import typingsSlinky.avoscloudSdk.mod.ErrorOption
import typingsSlinky.avoscloudSdk.mod.SilentOption
import typingsSlinky.avoscloudSdk.mod.SuccessOption
import typingsSlinky.avoscloudSdk.mod.UseMasterKeyOption
import typingsSlinky.avoscloudSdk.mod.WaitOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveOptions
  extends SuccessOption
     with ErrorOption
     with SilentOption
     with UseMasterKeyOption
     with WaitOption
object SaveOptions {
  
  @scala.inline
  def apply(): SaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveOptions]
  }
}
