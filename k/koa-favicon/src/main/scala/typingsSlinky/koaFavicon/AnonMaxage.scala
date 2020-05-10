package typingsSlinky.koaFavicon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxage extends js.Object {
  /**
    * cache-control max-age directive in ms, defaulting to 1 day.
    */
  var maxage: js.UndefOr[Double] = js.native
}

object AnonMaxage {
  @scala.inline
  def apply(): AnonMaxage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMaxage]
  }
  @scala.inline
  implicit class AnonMaxageOps[Self <: AnonMaxage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxage")(js.undefined)
        ret
    }
  }
  
}

