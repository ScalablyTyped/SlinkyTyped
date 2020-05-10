package typingsSlinky.reactAdaptiveHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-adaptive-hooks.react-adaptive-hooks/media-capabilities.MediaConfigurationInfo> */
@js.native
trait PartialMediaConfiguration extends js.Object {
  var powerEfficient: js.UndefOr[Boolean] = js.native
  var smooth: js.UndefOr[Boolean] = js.native
  var supported: js.UndefOr[Boolean] = js.native
}

object PartialMediaConfiguration {
  @scala.inline
  def apply(): PartialMediaConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMediaConfiguration]
  }
  @scala.inline
  implicit class PartialMediaConfigurationOps[Self <: PartialMediaConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPowerEfficient(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerEfficient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPowerEfficient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerEfficient")(js.undefined)
        ret
    }
    @scala.inline
    def withSmooth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smooth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmooth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smooth")(js.undefined)
        ret
    }
    @scala.inline
    def withSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supported")(js.undefined)
        ret
    }
  }
  
}

