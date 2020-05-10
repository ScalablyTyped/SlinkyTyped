package typingsSlinky.bingmaps.Microsoft.Maps.Directions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDirectionsErrorEventArgs extends js.Object {
  /** The error message. */
  var message: String = js.native
  /** The code which identifies the error that occurred. */
  var responseCode: RouteResponseCode = js.native
}

object IDirectionsErrorEventArgs {
  @scala.inline
  def apply(message: String, responseCode: RouteResponseCode): IDirectionsErrorEventArgs = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], responseCode = responseCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDirectionsErrorEventArgs]
  }
  @scala.inline
  implicit class IDirectionsErrorEventArgsOps[Self <: IDirectionsErrorEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseCode(value: RouteResponseCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

