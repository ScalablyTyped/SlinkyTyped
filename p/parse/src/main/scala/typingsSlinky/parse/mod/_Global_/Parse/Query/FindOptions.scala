package typingsSlinky.parse.mod._Global_.Parse.Query

import typingsSlinky.parse.mod._Global_.Parse.ErrorOption
import typingsSlinky.parse.mod._Global_.Parse.SessionTokenOption
import typingsSlinky.parse.mod._Global_.Parse.SuccessOption
import typingsSlinky.parse.mod._Global_.Parse.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindOptions
  extends SuccessOption
     with ErrorOption
     with SessionTokenOption
     with UseMasterKeyOption

object FindOptions {
  @scala.inline
  def apply(): FindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOptions]
  }
}

