package typingsSlinky.openlayers.mod.olx.source

import typingsSlinky.openlayers.mod.AttributionLike
import typingsSlinky.openlayers.mod.Collection
import typingsSlinky.openlayers.mod.Extent_
import typingsSlinky.openlayers.mod.Feature
import typingsSlinky.openlayers.mod.FeatureLoader_
import typingsSlinky.openlayers.mod.FeatureUrlFunction
import typingsSlinky.openlayers.mod.LoadingStrategy_
import typingsSlinky.openlayers.mod.olx.LogoOptions
import typingsSlinky.openlayers.mod.proj.Projection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.native
  var features: js.UndefOr[js.Array[Feature] | Collection[Feature]] = js.native
  var format: js.UndefOr[typingsSlinky.openlayers.mod.format.Feature] = js.native
  var loader: js.UndefOr[FeatureLoader_] = js.native
  var logo: js.UndefOr[String | LogoOptions] = js.native
  var overlaps: js.UndefOr[Boolean] = js.native
  var strategy: js.UndefOr[LoadingStrategy_] = js.native
  var url: js.UndefOr[String | FeatureUrlFunction] = js.native
  var useSpatialIndex: js.UndefOr[Boolean] = js.native
  var wrapX: js.UndefOr[Boolean] = js.native
}

object VectorOptions {
  @scala.inline
  def apply(): VectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VectorOptions]
  }
  @scala.inline
  implicit class VectorOptionsOps[Self <: VectorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributions(value: AttributionLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributions")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatures(value: js.Array[Feature] | Collection[Feature]): Self = {
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
    def withFormat(value: typingsSlinky.openlayers.mod.format.Feature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withLoader(value: (/* extent */ Extent_, /* resolution */ Double, /* proj */ Projection) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutLoader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(js.undefined)
        ret
    }
    @scala.inline
    def withLogo(value: String | LogoOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlaps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlaps")(js.undefined)
        ret
    }
    @scala.inline
    def withStrategy(value: (/* extent */ Extent_, /* resolution */ Double) => js.Array[Extent_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlFunction3(value: (/* extent */ Extent_, /* resolution */ Double, /* proj */ Projection) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUrl(value: String | FeatureUrlFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSpatialIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSpatialIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSpatialIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSpatialIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapX")(js.undefined)
        ret
    }
  }
  
}

