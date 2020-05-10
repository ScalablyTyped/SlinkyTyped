package typingsSlinky.backlogJs.mod.Option.PullRequest

import typingsSlinky.backlogJs.mod.Option.Order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPullRequestCommentsParams extends js.Object {
  var count: js.UndefOr[Double] = js.native
  var maxId: js.UndefOr[Double] = js.native
  var minId: js.UndefOr[Double] = js.native
  var order: js.UndefOr[Order] = js.native
}

object GetPullRequestCommentsParams {
  @scala.inline
  def apply(): GetPullRequestCommentsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPullRequestCommentsParams]
  }
  @scala.inline
  implicit class GetPullRequestCommentsParamsOps[Self <: GetPullRequestCommentsParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxId")(js.undefined)
        ret
    }
    @scala.inline
    def withMinId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minId")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: Order): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
  }
  
}

