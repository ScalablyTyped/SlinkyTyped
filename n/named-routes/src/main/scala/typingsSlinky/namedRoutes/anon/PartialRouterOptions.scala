package typingsSlinky.namedRoutes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<named-routes.named-routes.RouterOptions> */
@js.native
trait PartialRouterOptions extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.native
}

object PartialRouterOptions {
  @scala.inline
  def apply(): PartialRouterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRouterOptions]
  }
  @scala.inline
  implicit class PartialRouterOptionsOps[Self <: PartialRouterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(js.undefined)
        ret
    }
  }
  
}

