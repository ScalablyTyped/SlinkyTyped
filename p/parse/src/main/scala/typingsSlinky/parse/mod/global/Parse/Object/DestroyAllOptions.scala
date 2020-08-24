package typingsSlinky.parse.mod.global.Parse.Object

import typingsSlinky.parse.mod.global.Parse.BatchSizeOption
import typingsSlinky.parse.mod.global.Parse.SessionTokenOption
import typingsSlinky.parse.mod.global.Parse.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestroyAllOptions
  extends BatchSizeOption
     with SessionTokenOption
     with UseMasterKeyOption

object DestroyAllOptions {
  @scala.inline
  def apply(): DestroyAllOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestroyAllOptions]
  }
}

