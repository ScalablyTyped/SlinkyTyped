package typingsSlinky.rsocketTypes.anon

import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import typingsSlinky.rsocketTypes.rsocketTypesStrings.ERROR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends ConnectionStatus {
  var error: js.Error
  var kind: ERROR
}

object Error {
  @scala.inline
  def apply(error: js.Error, kind: ERROR): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

