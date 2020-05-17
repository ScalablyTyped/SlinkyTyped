package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.anon.PartialDomain
import typingsSlinky.plotlyJs.anon.PartialLayoutAxis
import typingsSlinky.plotlyJs.plotlyJsStrings.circular
import typingsSlinky.plotlyJs.plotlyJsStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolarLayout extends js.Object {
  var angularaxis: PartialLayoutAxis = js.native
  var bgcolor: Color = js.native
  var domain: PartialDomain = js.native
  var gridshape: circular | linear = js.native
  var hole: Double = js.native
  var radialaxis: PartialLayoutAxis = js.native
  var sector: js.Array[Double] = js.native
  var uirevision: String | Double = js.native
}

object PolarLayout {
  @scala.inline
  def apply(
    angularaxis: PartialLayoutAxis,
    bgcolor: Color,
    domain: PartialDomain,
    gridshape: circular | linear,
    hole: Double,
    radialaxis: PartialLayoutAxis,
    sector: js.Array[Double],
    uirevision: String | Double
  ): PolarLayout = {
    val __obj = js.Dynamic.literal(angularaxis = angularaxis.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], gridshape = gridshape.asInstanceOf[js.Any], hole = hole.asInstanceOf[js.Any], radialaxis = radialaxis.asInstanceOf[js.Any], sector = sector.asInstanceOf[js.Any], uirevision = uirevision.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolarLayout]
  }
  @scala.inline
  implicit class PolarLayoutOps[Self <: PolarLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngularaxis(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularaxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgcolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomain(value: PartialDomain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridshape(value: circular | linear): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridshape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHole(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadialaxis(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialaxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSector(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUirevision(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uirevision")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

