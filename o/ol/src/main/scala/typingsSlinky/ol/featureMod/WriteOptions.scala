package typingsSlinky.ol.featureMod

import typingsSlinky.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteOptions extends js.Object {
  var dataProjection: js.UndefOr[ProjectionLike] = js.native
  var decimals: js.UndefOr[Double] = js.native
  var featureProjection: js.UndefOr[ProjectionLike] = js.native
  var rightHanded: js.UndefOr[Boolean] = js.native
}

object WriteOptions {
  @scala.inline
  def apply(): WriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteOptions]
  }
  @scala.inline
  implicit class WriteOptionsOps[Self <: WriteOptions] (val x: Self) extends AnyVal {
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
    def withDecimals(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimals")(js.undefined)
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
    def withRightHanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightHanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightHanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightHanded")(js.undefined)
        ret
    }
  }
  
}

