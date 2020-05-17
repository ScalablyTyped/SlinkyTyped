package typingsSlinky.followRedirects.mod

import typingsSlinky.followRedirects.anon.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrappableResponse extends js.Object {
  var headers: Location = js.native
  var statusCode: js.UndefOr[Double] = js.native
  def destroy(): js.Any = js.native
}

object WrappableResponse {
  @scala.inline
  def apply(destroy: () => js.Any, headers: Location): WrappableResponse = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappableResponse]
  }
  @scala.inline
  implicit class WrappableResponseOps[Self <: WrappableResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeaders(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(js.undefined)
        ret
    }
  }
  
}

