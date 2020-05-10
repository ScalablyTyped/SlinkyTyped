package typingsSlinky.openlayers.mod.olx.interaction

import typingsSlinky.openlayers.mod.Collection
import typingsSlinky.openlayers.mod.Feature
import typingsSlinky.openlayers.mod.layer.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslateOptions extends js.Object {
  var features: js.UndefOr[Collection[Feature]] = js.native
  var layers: js.UndefOr[js.Array[Layer] | (js.Function1[/* layer */ Layer, Boolean])] = js.native
}

object TranslateOptions {
  @scala.inline
  def apply(): TranslateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranslateOptions]
  }
  @scala.inline
  implicit class TranslateOptionsOps[Self <: TranslateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatures(value: Collection[Feature]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(js.undefined)
        ret
    }
    @scala.inline
    def withLayersFunction1(value: /* layer */ Layer => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLayers(value: js.Array[Layer] | (js.Function1[/* layer */ Layer, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.undefined)
        ret
    }
  }
  
}

