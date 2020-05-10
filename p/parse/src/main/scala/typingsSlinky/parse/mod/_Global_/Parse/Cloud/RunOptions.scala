package typingsSlinky.parse.mod._Global_.Parse.Cloud

import typingsSlinky.parse.mod._Global_.Parse.ErrorOption
import typingsSlinky.parse.mod._Global_.Parse.SessionTokenOption
import typingsSlinky.parse.mod._Global_.Parse.SuccessOption
import typingsSlinky.parse.mod._Global_.Parse.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunOptions
  extends SuccessOption
     with ErrorOption
     with SessionTokenOption
     with UseMasterKeyOption

object RunOptions {
  @scala.inline
  def apply(): RunOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunOptions]
  }
}

