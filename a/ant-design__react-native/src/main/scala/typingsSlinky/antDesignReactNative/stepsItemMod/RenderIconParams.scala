package typingsSlinky.antDesignReactNative.stepsItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderIconParams extends js.Object {
  var error: Boolean = js.native
  var starting: Boolean = js.native
  var waiting: Boolean = js.native
}

object RenderIconParams {
  @scala.inline
  def apply(error: Boolean, starting: Boolean, waiting: Boolean): RenderIconParams = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], starting = starting.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderIconParams]
  }
  @scala.inline
  implicit class RenderIconParamsOps[Self <: RenderIconParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStarting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaiting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waiting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

