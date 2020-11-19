package typingsSlinky.avoscloudSdk.mod.Collection

import typingsSlinky.avoscloudSdk.mod.ErrorOption
import typingsSlinky.avoscloudSdk.mod.SilentOption
import typingsSlinky.avoscloudSdk.mod.SuccessOption
import typingsSlinky.avoscloudSdk.mod.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchOptions
  extends SuccessOption
     with ErrorOption
     with SilentOption
     with UseMasterKeyOption
object FetchOptions {
  
  @scala.inline
  def apply(): FetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchOptions]
  }
}
