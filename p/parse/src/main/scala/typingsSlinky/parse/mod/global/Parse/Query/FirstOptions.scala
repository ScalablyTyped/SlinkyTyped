package typingsSlinky.parse.mod.global.Parse.Query

import typingsSlinky.parse.mod.global.Parse.ErrorOption
import typingsSlinky.parse.mod.global.Parse.SessionTokenOption
import typingsSlinky.parse.mod.global.Parse.SuccessOption
import typingsSlinky.parse.mod.global.Parse.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirstOptions
  extends SuccessOption
     with ErrorOption
     with SessionTokenOption
     with UseMasterKeyOption

object FirstOptions {
  @scala.inline
  def apply(): FirstOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstOptions]
  }
}

