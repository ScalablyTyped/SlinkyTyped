package typingsSlinky.reactNativeMaterialKit.mod

import typingsSlinky.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndeterminateProgressProperties extends ViewProps {
  var progressAniDuration: js.UndefOr[Double] = js.native
  var progressColor: js.UndefOr[String] = js.native
}

object IndeterminateProgressProperties {
  @scala.inline
  def apply(): IndeterminateProgressProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndeterminateProgressProperties]
  }
  @scala.inline
  implicit class IndeterminateProgressPropertiesOps[Self <: IndeterminateProgressProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

