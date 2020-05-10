package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CropProperties extends js.Object {
  var angle: js.UndefOr[Double] = js.native
  var offsetBottom: js.UndefOr[Double] = js.native
  var offsetLeft: js.UndefOr[Double] = js.native
  var offsetRight: js.UndefOr[Double] = js.native
  var offsetTop: js.UndefOr[Double] = js.native
}

object CropProperties {
  @scala.inline
  def apply(): CropProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropProperties]
  }
  @scala.inline
  implicit class CropPropertiesOps[Self <: CropProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetRight")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetTop")(js.undefined)
        ret
    }
  }
  
}

