package typingsSlinky.reduxThunk

import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.reduxThunk.mod.ThunkMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWithExtraArgument extends js.Object {
  def withExtraArgument[E](extraArgument: E): ThunkMiddleware[js.Object, AnyAction, E] = js.native
}

object AnonWithExtraArgument {
  @scala.inline
  def apply(withExtraArgument: js.Any => ThunkMiddleware[js.Object, AnyAction, js.Any]): AnonWithExtraArgument = {
    val __obj = js.Dynamic.literal(withExtraArgument = js.Any.fromFunction1(withExtraArgument))
    __obj.asInstanceOf[AnonWithExtraArgument]
  }
  @scala.inline
  implicit class AnonWithExtraArgumentOps[Self <: AnonWithExtraArgument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWithExtraArgument(value: js.Any => ThunkMiddleware[js.Object, AnyAction, js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withExtraArgument")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

