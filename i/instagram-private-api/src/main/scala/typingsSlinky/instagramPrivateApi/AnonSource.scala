package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.commonTypesMod.IgAppModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSource extends js.Object {
  var source: js.UndefOr[IgAppModule] = js.native
  var userIds: js.Array[Double | String] = js.native
}

object AnonSource {
  @scala.inline
  def apply(userIds: js.Array[Double | String]): AnonSource = {
    val __obj = js.Dynamic.literal(userIds = userIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSource]
  }
  @scala.inline
  implicit class AnonSourceOps[Self <: AnonSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserIds(value: js.Array[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: IgAppModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

