package typingsSlinky.avoscloudSdk.mod.Collection

import typingsSlinky.avoscloudSdk.mod.ErrorOption
import typingsSlinky.avoscloudSdk.mod.SilentOption
import typingsSlinky.avoscloudSdk.mod.SuccessOption
import typingsSlinky.avoscloudSdk.mod.UseMasterKeyOption
import typingsSlinky.avoscloudSdk.mod.WaitOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOptions
  extends SuccessOption
     with ErrorOption
     with WaitOption
     with SilentOption
     with UseMasterKeyOption

object CreateOptions {
  @scala.inline
  def apply(): CreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOptions]
  }
}

