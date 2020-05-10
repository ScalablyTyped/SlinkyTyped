package typingsSlinky.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEllpiticalArcOptions extends IRadiusOptions {
  var clockwise: js.UndefOr[Boolean] = js.native
  var large: js.UndefOr[Boolean] = js.native
  var xaxisrotation: js.UndefOr[Double] = js.native
  var xradius: js.UndefOr[Double] = js.native
  var yradius: js.UndefOr[Double] = js.native
}

object IEllpiticalArcOptions {
  @scala.inline
  def apply(): IEllpiticalArcOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEllpiticalArcOptions]
  }
  @scala.inline
  implicit class IEllpiticalArcOptionsOps[Self <: IEllpiticalArcOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClockwise(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockwise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClockwise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockwise")(js.undefined)
        ret
    }
    @scala.inline
    def withLarge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(js.undefined)
        ret
    }
    @scala.inline
    def withXaxisrotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxisrotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXaxisrotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxisrotation")(js.undefined)
        ret
    }
    @scala.inline
    def withXradius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xradius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXradius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xradius")(js.undefined)
        ret
    }
    @scala.inline
    def withYradius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yradius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYradius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yradius")(js.undefined)
        ret
    }
  }
  
}

