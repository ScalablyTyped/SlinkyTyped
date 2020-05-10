package typingsSlinky.mapsjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBleedRatio extends js.Object {
  var bleedRatio: js.UndefOr[Double] = js.native
  var clipToRenderBounds: js.UndefOr[Boolean] = js.native
  var fieldNames: js.UndefOr[js.Array[String]] = js.native
  var simplifyEnabled: js.UndefOr[Boolean] = js.native
  var version: js.UndefOr[String] = js.native
}

object AnonBleedRatio {
  @scala.inline
  def apply(): AnonBleedRatio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBleedRatio]
  }
  @scala.inline
  implicit class AnonBleedRatioOps[Self <: AnonBleedRatio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBleedRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bleedRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBleedRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bleedRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withClipToRenderBounds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipToRenderBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipToRenderBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipToRenderBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldNames")(js.undefined)
        ret
    }
    @scala.inline
    def withSimplifyEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplifyEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimplifyEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplifyEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

