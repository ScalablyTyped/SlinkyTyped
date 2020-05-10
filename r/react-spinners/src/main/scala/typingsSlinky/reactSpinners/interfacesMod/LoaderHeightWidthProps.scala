package typingsSlinky.reactSpinners.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoaderHeightWidthProps extends CommonProps {
  var height: js.UndefOr[Double] = js.native
  var heightUnit: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
  var widthUnit: js.UndefOr[String] = js.native
}

object LoaderHeightWidthProps {
  @scala.inline
  def apply(): LoaderHeightWidthProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoaderHeightWidthProps]
  }
  @scala.inline
  implicit class LoaderHeightWidthPropsOps[Self <: LoaderHeightWidthProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHeightUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidthUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthUnit")(js.undefined)
        ret
    }
  }
  
}

