package typingsSlinky.materialUi.withWidthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var largeWidth: js.UndefOr[Double] = js.native
  var mediumWidth: js.UndefOr[Double] = js.native
  var resizeInterval: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLargeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLargeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMediumWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediumWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediumWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediumWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeInterval")(js.undefined)
        ret
    }
  }
  
}

