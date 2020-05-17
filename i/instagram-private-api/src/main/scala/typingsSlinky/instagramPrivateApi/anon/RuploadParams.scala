package typingsSlinky.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuploadParams extends js.Object {
  var name: js.Any = js.native
  var ruploadParams: js.Any = js.native
  var waterfallId: js.Any = js.native
}

object RuploadParams {
  @scala.inline
  def apply(name: js.Any, ruploadParams: js.Any, waterfallId: js.Any): RuploadParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ruploadParams = ruploadParams.asInstanceOf[js.Any], waterfallId = waterfallId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuploadParams]
  }
  @scala.inline
  implicit class RuploadParamsOps[Self <: RuploadParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuploadParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruploadParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaterfallId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waterfallId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

