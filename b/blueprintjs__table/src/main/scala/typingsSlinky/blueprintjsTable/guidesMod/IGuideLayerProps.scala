package typingsSlinky.blueprintjsTable.guidesMod

import typingsSlinky.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGuideLayerProps extends IProps {
  /**
    *  The top-offset location of the horizontal guides
    */
  var horizontalGuides: js.UndefOr[js.Array[Double]] = js.native
  /**
    *  The left-offset location of the vertical guides
    */
  var verticalGuides: js.UndefOr[js.Array[Double]] = js.native
}

object IGuideLayerProps {
  @scala.inline
  def apply(): IGuideLayerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGuideLayerProps]
  }
  @scala.inline
  implicit class IGuideLayerPropsOps[Self <: IGuideLayerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHorizontalGuides(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalGuides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalGuides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalGuides")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalGuides(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalGuides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalGuides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalGuides")(js.undefined)
        ret
    }
  }
  
}

