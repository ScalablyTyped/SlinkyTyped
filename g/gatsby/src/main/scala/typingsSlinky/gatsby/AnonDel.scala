package typingsSlinky.gatsby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDel extends js.Object {
  var del: js.Function = js.native
  var get: js.Function = js.native
  var getAndPassUp: js.Function = js.native
  var mget: js.Function = js.native
  var mset: js.Function = js.native
  var reset: js.Function = js.native
  var set: js.Function = js.native
  var wrap: js.Function = js.native
}

object AnonDel {
  @scala.inline
  def apply(
    del: js.Function,
    get: js.Function,
    getAndPassUp: js.Function,
    mget: js.Function,
    mset: js.Function,
    reset: js.Function,
    set: js.Function,
    wrap: js.Function
  ): AnonDel = {
    val __obj = js.Dynamic.literal(del = del.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getAndPassUp = getAndPassUp.asInstanceOf[js.Any], mget = mget.asInstanceOf[js.Any], mset = mset.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDel]
  }
  @scala.inline
  implicit class AnonDelOps[Self <: AnonDel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDel(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("del")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAndPassUp(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAndPassUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMget(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMset(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrap(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

