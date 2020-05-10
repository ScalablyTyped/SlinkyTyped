package typingsSlinky.reactNativeMaterialKit.mod

import typingsSlinky.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MKProgressProperties extends ViewProps {
  var buffer: js.UndefOr[Double] = js.native
  var bufferAniDuration: js.UndefOr[Double] = js.native
  var bufferColor: js.UndefOr[String] = js.native
  var progress: js.UndefOr[Double] = js.native
  var progressAniDuration: js.UndefOr[Double] = js.native
  var progressColor: js.UndefOr[String] = js.native
}

object MKProgressProperties {
  @scala.inline
  def apply(): MKProgressProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MKProgressProperties]
  }
  @scala.inline
  implicit class MKProgressPropertiesOps[Self <: MKProgressProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withBufferAniDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferAniDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferAniDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferAniDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withBufferColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferColor")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressAniDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressAniDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressAniDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressAniDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressColor")(js.undefined)
        ret
    }
  }
  
}

