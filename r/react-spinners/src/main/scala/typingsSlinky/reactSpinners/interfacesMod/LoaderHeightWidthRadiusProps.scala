package typingsSlinky.reactSpinners.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoaderHeightWidthRadiusProps extends LoaderHeightWidthProps {
  var margin: js.UndefOr[String] = js.native
  var radius: js.UndefOr[Double] = js.native
  var radiusUnit: js.UndefOr[String] = js.native
}

object LoaderHeightWidthRadiusProps {
  @scala.inline
  def apply(): LoaderHeightWidthRadiusProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoaderHeightWidthRadiusProps]
  }
  @scala.inline
  implicit class LoaderHeightWidthRadiusPropsOps[Self <: LoaderHeightWidthRadiusProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMargin(value: String): Self = {
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
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiusUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiusUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusUnit")(js.undefined)
        ret
    }
  }
  
}

