package typingsSlinky.ol.geoJSONMod

import typingsSlinky.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var dataProjection: js.UndefOr[ProjectionLike] = js.native
  var extractGeometryName: js.UndefOr[Boolean] = js.native
  var featureProjection: js.UndefOr[ProjectionLike] = js.native
  var geometryName: js.UndefOr[String] = js.native
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
    def withDataProjection(value: ProjectionLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataProjection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataProjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataProjection")(js.undefined)
        ret
    }
    @scala.inline
    def withExtractGeometryName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractGeometryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtractGeometryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractGeometryName")(js.undefined)
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

