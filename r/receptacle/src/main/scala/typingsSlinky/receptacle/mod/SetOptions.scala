package typingsSlinky.receptacle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetOptions[X] extends js.Object {
  var meta: js.UndefOr[X] = js.native
  var refresh: js.UndefOr[Boolean] = js.native
  var ttl: js.UndefOr[Double] = js.native
}

object SetOptions {
  @scala.inline
  def apply[X](): SetOptions[X] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetOptions[X]]
  }
  @scala.inline
  implicit class SetOptionsOps[Self[x] <: SetOptions[x], X] (val x: Self[X]) extends AnyVal {
    @scala.inline
    def duplicate: Self[X] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[X]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[X] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[X] with Other]
    @scala.inline
    def withMeta(value: X): Self[X] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeta: Self[X] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.undefined)
        ret
    }
    @scala.inline
    def withRefresh(value: Boolean): Self[X] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefresh: Self[X] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.undefined)
        ret
    }
    @scala.inline
    def withTtl(value: Double): Self[X] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTtl: Self[X] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(js.undefined)
        ret
    }
  }
  
}

