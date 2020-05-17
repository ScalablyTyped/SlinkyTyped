package typingsSlinky.nivoGeo.mod

import typingsSlinky.nivoGeo.anon.PartialBox
import typingsSlinky.nivoGeo.anon.PartialTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonProps extends js.Object {
  var enableGraticule: js.UndefOr[Boolean] = js.native
  var features: js.Array[_] = js.native
  var graticuleLineColor: js.UndefOr[String] = js.native
  var graticuleLineWidth: js.UndefOr[Double] = js.native
  var isInteractive: js.UndefOr[Boolean] = js.native
  var margin: js.UndefOr[PartialBox] = js.native
  var projectionRotation: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.native
  var projectionScale: js.UndefOr[Double] = js.native
  var projectionTranslation: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var projectionType: js.UndefOr[GeoProjectionType] = js.native
  var theme: js.UndefOr[PartialTheme] = js.native
}

object CommonProps {
  @scala.inline
  def apply(features: js.Array[_]): CommonProps = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonProps]
  }
  @scala.inline
  implicit class CommonPropsOps[Self <: CommonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatures(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableGraticule(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGraticule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGraticule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGraticule")(js.undefined)
        ret
    }
    @scala.inline
    def withGraticuleLineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graticuleLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraticuleLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graticuleLineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withGraticuleLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graticuleLineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraticuleLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graticuleLineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInteractive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInteractive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: PartialBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectionRotation(value: js.Tuple3[Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectionRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectionRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectionRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectionScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectionScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectionScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectionScale")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectionTranslation(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectionTranslation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectionTranslation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectionTranslation")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectionType(value: GeoProjectionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectionType")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: PartialTheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

