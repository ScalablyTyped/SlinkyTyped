package typingsSlinky.rsocketTypes.anon

import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import typingsSlinky.rsocketTypes.rsocketTypesStrings.ERROR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error extends ConnectionStatus {
  var error: js.Error = js.native
  var kind: ERROR = js.native
}

object Error {
  @scala.inline
  def apply(error: js.Error, kind: ERROR): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: ERROR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

