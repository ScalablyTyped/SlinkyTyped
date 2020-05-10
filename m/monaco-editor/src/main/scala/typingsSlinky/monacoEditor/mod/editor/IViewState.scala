package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.mod.IPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IViewState extends js.Object {
  var firstPosition: IPosition = js.native
  var firstPositionDeltaTop: Double = js.native
  var scrollLeft: Double = js.native
  /** written by previous versions */
  var scrollTop: js.UndefOr[Double] = js.native
  /** written by previous versions */
  var scrollTopWithoutViewZones: js.UndefOr[Double] = js.native
}

object IViewState {
  @scala.inline
  def apply(firstPosition: IPosition, firstPositionDeltaTop: Double, scrollLeft: Double): IViewState = {
    val __obj = js.Dynamic.literal(firstPosition = firstPosition.asInstanceOf[js.Any], firstPositionDeltaTop = firstPositionDeltaTop.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[IViewState]
  }
  @scala.inline
  implicit class IViewStateOps[Self <: IViewState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstPosition(value: IPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstPositionDeltaTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPositionDeltaTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTop")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollTopWithoutViewZones(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTopWithoutViewZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollTopWithoutViewZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTopWithoutViewZones")(js.undefined)
        ret
    }
  }
  
}

