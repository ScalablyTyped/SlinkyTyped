package typingsSlinky.pixiJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoPlay extends js.Object {
  var autoLoad: js.UndefOr[Boolean] = js.native
  var autoPlay: js.UndefOr[Boolean] = js.native
  var crossorigin: js.UndefOr[Boolean] = js.native
  var updateFPS: js.UndefOr[Double] = js.native
}

object AutoPlay {
  @scala.inline
  def apply(): AutoPlay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoPlay]
  }
  @scala.inline
  implicit class AutoPlayOps[Self <: AutoPlay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossorigin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossorigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossorigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossorigin")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateFPS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateFPS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateFPS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateFPS")(js.undefined)
        ret
    }
  }
  
}

