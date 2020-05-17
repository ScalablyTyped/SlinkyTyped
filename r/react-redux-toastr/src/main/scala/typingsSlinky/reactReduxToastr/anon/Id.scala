package typingsSlinky.reactReduxToastr.anon

import typingsSlinky.reactReduxToastr.mod.ConfirmToastrCustomOptions
import typingsSlinky.reactReduxToastr.mod.ConfirmToastrOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Id extends js.Object {
  var id: String = js.native
  var message: String = js.native
  var options: ConfirmToastrOptions | ConfirmToastrCustomOptions = js.native
  var show: Boolean = js.native
}

object Id {
  @scala.inline
  def apply(
    id: String,
    message: String,
    options: ConfirmToastrOptions | ConfirmToastrCustomOptions,
    show: Boolean
  ): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  @scala.inline
  implicit class IdOps[Self <: Id] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: ConfirmToastrOptions | ConfirmToastrCustomOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

