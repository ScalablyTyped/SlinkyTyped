package typingsSlinky.blueprintjsTable.regionsMod

import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.blueprintjsTable.esmRegionsMod.IRegion
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRegionLayerProps extends IProps {
  /**
    * The array of CSS styles to apply to each region. The ith style object in this array will be
    * applied to the ith region in `regions`.
    */
  var regionStyles: js.UndefOr[js.Array[CSSProperties]] = js.native
  /**
    * The array of regions to render.
    */
  var regions: js.UndefOr[js.Array[IRegion]] = js.native
}

object IRegionLayerProps {
  @scala.inline
  def apply(): IRegionLayerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRegionLayerProps]
  }
  @scala.inline
  implicit class IRegionLayerPropsOps[Self <: IRegionLayerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegionStyles(value: js.Array[CSSProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withRegions(value: js.Array[IRegion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(js.undefined)
        ret
    }
  }
  
}

