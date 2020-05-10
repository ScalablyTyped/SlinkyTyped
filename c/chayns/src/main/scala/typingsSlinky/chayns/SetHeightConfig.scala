package typingsSlinky.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.setHeight()
@js.native
trait SetHeightConfig extends js.Object {
  var full: js.UndefOr[Boolean] = js.native
  var fullViewport: js.UndefOr[Boolean] = js.native
  var growOnly: js.UndefOr[Boolean] = js.native
  var height: Double = js.native
}

object SetHeightConfig {
  @scala.inline
  def apply(height: Double): SetHeightConfig = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetHeightConfig]
  }
  @scala.inline
  implicit class SetHeightConfigOps[Self <: SetHeightConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full")(js.undefined)
        ret
    }
    @scala.inline
    def withFullViewport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullViewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullViewport")(js.undefined)
        ret
    }
    @scala.inline
    def withGrowOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("growOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrowOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("growOnly")(js.undefined)
        ret
    }
  }
  
}

