package typingsSlinky.parse.mod._Global_.Parse.Object

import typingsSlinky.parse.mod._Global_.Parse.ErrorOption
import typingsSlinky.parse.mod._Global_.Parse.SessionTokenOption
import typingsSlinky.parse.mod._Global_.Parse.SuccessOption
import typingsSlinky.parse.mod._Global_.Parse.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchAllOptions
  extends SuccessOption
     with ErrorOption
     with SessionTokenOption
     with UseMasterKeyOption

object FetchAllOptions {
  @scala.inline
  def apply(): FetchAllOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchAllOptions]
  }
}

