package typingsSlinky.mapbox.mod.global.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureLayerOptions extends js.Object {
  var filter: js.UndefOr[FilterFunction] = js.native
  var sanitizer: js.UndefOr[js.Function1[/* template */ String, String]] = js.native
}

object FeatureLayerOptions {
  @scala.inline
  def apply(): FeatureLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureLayerOptions]
  }
  @scala.inline
  implicit class FeatureLayerOptionsOps[Self <: FeatureLayerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: /* feature */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withSanitizer(value: /* template */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitizer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSanitizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitizer")(js.undefined)
        ret
    }
  }
  
}

