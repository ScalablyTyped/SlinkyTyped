package typingsSlinky.openlayers.mod.olx.format

import typingsSlinky.openlayers.mod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoJSONOptions extends js.Object {
  var defaultDataProjection: ProjectionLike = js.native
  var featureProjection: ProjectionLike = js.native
  var geometryName: js.UndefOr[String] = js.native
}

object GeoJSONOptions {
  @scala.inline
  def apply(): GeoJSONOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoJSONOptions]
  }
  @scala.inline
  implicit class GeoJSONOptionsOps[Self <: GeoJSONOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultDataProjection(value: ProjectionLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDataProjection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDataProjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDataProjection")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureProjection(value: ProjectionLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureProjection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureProjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureProjection")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryName")(js.undefined)
        ret
    }
  }
  
}

