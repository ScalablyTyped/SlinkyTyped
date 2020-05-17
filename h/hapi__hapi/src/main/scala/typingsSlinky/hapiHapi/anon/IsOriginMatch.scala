package typingsSlinky.hapiHapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsOriginMatch extends js.Object {
  /**
    * true if the request 'Origin' header matches the configured CORS restrictions. Set to false if no 'Origin' header is found or if it does not match. Note that this is only available after
    * the 'onRequest' extension point as CORS is configured per-route and no routing decisions are made at that point in the request lifecycle.
    */
  var isOriginMatch: js.UndefOr[Boolean] = js.native
}

object IsOriginMatch {
  @scala.inline
  def apply(): IsOriginMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsOriginMatch]
  }
  @scala.inline
  implicit class IsOriginMatchOps[Self <: IsOriginMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsOriginMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOriginMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOriginMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOriginMatch")(js.undefined)
        ret
    }
  }
  
}

