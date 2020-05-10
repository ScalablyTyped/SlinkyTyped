package typingsSlinky.inboxsdk.mod.Common

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PositionOptions extends js.Object {
  var bottomBuffer: js.UndefOr[Double] = js.native
  var buffer: js.UndefOr[Double] = js.native
  var forceHAlign: js.UndefOr[Boolean] = js.native
  var forcePosition: js.UndefOr[Boolean] = js.native
  var forceVAlign: js.UndefOr[Boolean] = js.native
  var hAlign: js.UndefOr[String] = js.native
  var leftBuffer: js.UndefOr[Double] = js.native
  var position: js.UndefOr[String] = js.native
  var rightBuffer: js.UndefOr[Double] = js.native
  var topBuffer: js.UndefOr[Double] = js.native
  var vAlign: js.UndefOr[String] = js.native
}

object PositionOptions {
  @scala.inline
  def apply(): PositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionOptions]
  }
  @scala.inline
  implicit class PositionOptionsOps[Self <: PositionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottomBuffer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withBuffer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(js.undefined)
        ret
    }
    @scala.inline
    def withForceHAlign(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceHAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceHAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceHAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withForcePosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forcePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForcePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forcePosition")(js.undefined)
        ret
    }
    @scala.inline
    def withForceVAlign(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceVAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceVAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceVAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withHAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftBuffer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withRightBuffer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withTopBuffer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withVAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vAlign")(js.undefined)
        ret
    }
  }
  
}

