package typingsSlinky.avoscloudSdk.mod.Query

import typingsSlinky.avoscloudSdk.mod.ErrorOption
import typingsSlinky.avoscloudSdk.mod.SuccessOption
import typingsSlinky.avoscloudSdk.mod.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindOptions
  extends SuccessOption
     with ErrorOption
     with UseMasterKeyOption

object FindOptions {
  @scala.inline
  def apply(): FindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOptions]
  }
}

