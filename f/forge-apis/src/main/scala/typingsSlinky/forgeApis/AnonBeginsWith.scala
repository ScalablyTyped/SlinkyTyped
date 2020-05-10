package typingsSlinky.forgeApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBeginsWith extends js.Object {
  var beginsWith: js.UndefOr[String] = js.native
  var limit: js.UndefOr[Double] = js.native
  var startAt: js.UndefOr[String] = js.native
}

object AnonBeginsWith {
  @scala.inline
  def apply(): AnonBeginsWith = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBeginsWith]
  }
  @scala.inline
  implicit class AnonBeginsWithOps[Self <: AnonBeginsWith] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeginsWith(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginsWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeginsWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginsWith")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withStartAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAt")(js.undefined)
        ret
    }
  }
  
}

