package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.mod.Domain
import typingsSlinky.plotlyJs.mod.LayoutAxis
import typingsSlinky.plotlyJs.plotlyJsStrings.circular
import typingsSlinky.plotlyJs.plotlyJsStrings.linear
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.PolarLayout> */
@js.native
trait PartialPolarLayoutBgcolor extends js.Object {
  var angularaxis: js.UndefOr[Partial[LayoutAxis]] = js.native
  var bgcolor: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  var domain: js.UndefOr[Partial[Domain]] = js.native
  var gridshape: js.UndefOr[circular | linear] = js.native
  var hole: js.UndefOr[Double] = js.native
  var radialaxis: js.UndefOr[Partial[LayoutAxis]] = js.native
  var sector: js.UndefOr[js.Array[Double]] = js.native
  var uirevision: js.UndefOr[String | Double] = js.native
}

object PartialPolarLayoutBgcolor {
  @scala.inline
  def apply(): PartialPolarLayoutBgcolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPolarLayoutBgcolor]
  }
  @scala.inline
  implicit class PartialPolarLayoutBgcolorOps[Self <: PartialPolarLayoutBgcolor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngularaxis(value: Partial[LayoutAxis]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularaxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngularaxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularaxis")(js.undefined)
        ret
    }
    @scala.inline
    def withBgcolor(value: typingsSlinky.plotlyJs.mod.Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgcolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgcolor")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: Partial[Domain]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withGridshape(value: circular | linear): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridshape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridshape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridshape")(js.undefined)
        ret
    }
    @scala.inline
    def withHole(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hole")(js.undefined)
        ret
    }
    @scala.inline
    def withRadialaxis(value: Partial[LayoutAxis]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialaxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadialaxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialaxis")(js.undefined)
        ret
    }
    @scala.inline
    def withSector(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sector")(js.undefined)
        ret
    }
    @scala.inline
    def withUirevision(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uirevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUirevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uirevision")(js.undefined)
        ret
    }
  }
  
}

