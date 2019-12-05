package typingsSlinky.rsocketDashTypes

import typingsSlinky.rsocketDashTypes.reactiveSocketTypesMod.ConnectionStatus
import typingsSlinky.rsocketDashTypes.rsocketDashTypesStrings.ERROR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ERROR extends ConnectionStatus {
  var error: js.Error
  var kind: ERROR
}

object Anon_ERROR {
  @scala.inline
  def apply(error: js.Error, kind: ERROR): Anon_ERROR = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ERROR]
  }
}

