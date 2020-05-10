package typingsSlinky.forgeApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWith extends js.Object {
  var _with: js.UndefOr[String] = js.native
  var ifModifiedSince: js.UndefOr[js.Date] = js.native
}

object AnonWith {
  @scala.inline
  def apply(): AnonWith = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonWith]
  }
  @scala.inline
  implicit class AnonWithOps[Self <: AnonWith] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_with(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_with")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_with: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_with")(js.undefined)
        ret
    }
    @scala.inline
    def withIfModifiedSince(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifModifiedSince")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfModifiedSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifModifiedSince")(js.undefined)
        ret
    }
  }
  
}

