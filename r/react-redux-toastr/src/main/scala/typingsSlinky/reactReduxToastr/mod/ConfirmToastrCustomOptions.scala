package typingsSlinky.reactReduxToastr.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmToastrCustomOptions extends js.Object {
  var component: ReactElement
}

object ConfirmToastrCustomOptions {
  @scala.inline
  def apply(component: ReactElement): ConfirmToastrCustomOptions = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConfirmToastrCustomOptions]
  }
}

