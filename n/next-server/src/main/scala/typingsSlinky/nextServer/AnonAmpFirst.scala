package typingsSlinky.nextServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAmpFirst extends js.Object {
  var ampFirst: js.UndefOr[Boolean] = js.native
  var hasQuery: js.UndefOr[Boolean] = js.native
  var hybrid: js.UndefOr[Boolean] = js.native
}

object AnonAmpFirst {
  @scala.inline
  def apply(): AnonAmpFirst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAmpFirst]
  }
  @scala.inline
  implicit class AnonAmpFirstOps[Self <: AnonAmpFirst] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmpFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmpFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withHasQuery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withHybrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hybrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHybrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hybrid")(js.undefined)
        ret
    }
  }
  
}

