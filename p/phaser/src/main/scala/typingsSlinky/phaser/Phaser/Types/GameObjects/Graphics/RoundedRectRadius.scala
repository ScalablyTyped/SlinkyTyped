package typingsSlinky.phaser.Phaser.Types.GameObjects.Graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoundedRectRadius extends js.Object {
  /**
    * Bottom left
    */
  var bl: js.UndefOr[Double] = js.native
  /**
    * Bottom right
    */
  var br: js.UndefOr[Double] = js.native
  /**
    * Top left
    */
  var tl: js.UndefOr[Double] = js.native
  /**
    * Top right
    */
  var tr: js.UndefOr[Double] = js.native
}

object RoundedRectRadius {
  @scala.inline
  def apply(): RoundedRectRadius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoundedRectRadius]
  }
  @scala.inline
  implicit class RoundedRectRadiusOps[Self <: RoundedRectRadius] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bl")(js.undefined)
        ret
    }
    @scala.inline
    def withBr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("br")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("br")(js.undefined)
        ret
    }
    @scala.inline
    def withTl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tl")(js.undefined)
        ret
    }
    @scala.inline
    def withTr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tr")(js.undefined)
        ret
    }
  }
  
}

