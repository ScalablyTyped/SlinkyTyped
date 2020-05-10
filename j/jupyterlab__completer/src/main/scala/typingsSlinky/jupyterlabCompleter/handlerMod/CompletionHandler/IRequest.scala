package typingsSlinky.jupyterlabCompleter.handlerMod.CompletionHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The details of a completion request.
  */
@js.native
trait IRequest extends js.Object {
  /**
    * The cursor offset position within the text being completed.
    */
  var offset: Double = js.native
  /**
    * The text being completed.
    */
  var text: String = js.native
}

object IRequest {
  @scala.inline
  def apply(offset: Double, text: String): IRequest = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequest]
  }
  @scala.inline
  implicit class IRequestOps[Self <: IRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

