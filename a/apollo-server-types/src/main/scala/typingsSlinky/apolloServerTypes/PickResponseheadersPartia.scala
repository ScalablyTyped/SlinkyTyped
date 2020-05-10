package typingsSlinky.apolloServerTypes

import typingsSlinky.apolloServerEnv.fetchMod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<apollo-server-env.apollo-server-env.Response, 'headers'> & std.Partial<std.Pick<apollo-server-types.apollo-server-types.Mutable<apollo-server-env.apollo-server-env.Response>, 'status'>> */
@js.native
trait PickResponseheadersPartia extends js.Object {
  var headers: Headers = js.native
  var status: js.UndefOr[Double] = js.native
}

object PickResponseheadersPartia {
  @scala.inline
  def apply(headers: Headers): PickResponseheadersPartia = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickResponseheadersPartia]
  }
  @scala.inline
  implicit class PickResponseheadersPartiaOps[Self <: PickResponseheadersPartia] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaders(value: Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

