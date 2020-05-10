package typingsSlinky.redisInfo.mod

import typingsSlinky.redisInfo.mod.Flag.OFF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersistenceLoadingOffInfo extends js.Object {
  var loading: OFF = js.native
}

object PersistenceLoadingOffInfo {
  @scala.inline
  def apply(loading: OFF): PersistenceLoadingOffInfo = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistenceLoadingOffInfo]
  }
  @scala.inline
  implicit class PersistenceLoadingOffInfoOps[Self <: PersistenceLoadingOffInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoading(value: OFF): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

