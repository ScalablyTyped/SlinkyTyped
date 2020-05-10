package typingsSlinky.avoscloudSdk.mod.Object

import typingsSlinky.avoscloudSdk.mod.ErrorOption
import typingsSlinky.avoscloudSdk.mod.SuccessOption
import typingsSlinky.avoscloudSdk.mod.UseMasterKeyOption
import typingsSlinky.avoscloudSdk.mod.WaitOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestroyOptions
  extends SuccessOption
     with ErrorOption
     with WaitOption
     with UseMasterKeyOption

object DestroyOptions {
  @scala.inline
  def apply(): DestroyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestroyOptions]
  }
}

