package typingsSlinky.parse.mod._Global_.Parse.Query

import typingsSlinky.parse.mod._Global_.Parse.ErrorOption
import typingsSlinky.parse.mod._Global_.Parse.SessionTokenOption
import typingsSlinky.parse.mod._Global_.Parse.SuccessOption
import typingsSlinky.parse.mod._Global_.Parse.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

