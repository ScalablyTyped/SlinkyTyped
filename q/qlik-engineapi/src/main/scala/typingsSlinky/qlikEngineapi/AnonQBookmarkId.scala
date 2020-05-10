package typingsSlinky.qlikEngineapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQBookmarkId extends js.Object {
  var qBookmarkId: js.UndefOr[String] = js.native
  var qExpires: js.UndefOr[Double] = js.native
}

object AnonQBookmarkId {
  @scala.inline
  def apply(): AnonQBookmarkId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonQBookmarkId]
  }
  @scala.inline
  implicit class AnonQBookmarkIdOps[Self <: AnonQBookmarkId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQBookmarkId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qBookmarkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQBookmarkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qBookmarkId")(js.undefined)
        ret
    }
    @scala.inline
    def withQExpires(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qExpires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQExpires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qExpires")(js.undefined)
        ret
    }
  }
  
}

