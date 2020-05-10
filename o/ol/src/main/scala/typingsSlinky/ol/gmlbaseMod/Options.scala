package typingsSlinky.ol.gmlbaseMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var curve: js.UndefOr[Boolean] = js.native
  var featureNS: js.UndefOr[StringDictionary[String] | String] = js.native
  var featureType: js.UndefOr[js.Array[String] | String] = js.native
  var hasZ: js.UndefOr[Boolean] = js.native
  var multiCurve: js.UndefOr[Boolean] = js.native
  var multiSurface: js.UndefOr[Boolean] = js.native
  var schemaLocation: js.UndefOr[String] = js.native
  var srsName: String = js.native
  var surface: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(srsName: String): Options = {
    val __obj = js.Dynamic.literal(srsName = srsName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSrsName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurve(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureNS(value: StringDictionary[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureNS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureNS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureNS")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureType(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureType")(js.undefined)
        ret
    }
    @scala.inline
    def withHasZ(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasZ")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiCurve(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiCurve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiCurve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiCurve")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiSurface(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSurface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiSurface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSurface")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withSurface(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSurface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surface")(js.undefined)
        ret
    }
  }
  
}

