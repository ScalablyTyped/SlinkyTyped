package typingsSlinky.reactOverlays.overlayMod

import typingsSlinky.reactOverlays.anon.Arialabelledby
import typingsSlinky.reactOverlays.anon.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayRenderProps extends js.Object {
  var arrowProps: Ref = js.native
  var outOfBoundaries: js.UndefOr[Boolean] = js.native
  var placement: Placements = js.native
  var props: Arialabelledby = js.native
  var show: Boolean = js.native
  def scheduleUpdate(): Unit = js.native
}

object OverlayRenderProps {
  @scala.inline
  def apply(
    arrowProps: Ref,
    placement: Placements,
    props: Arialabelledby,
    scheduleUpdate: () => Unit,
    show: Boolean
  ): OverlayRenderProps = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], scheduleUpdate = js.Any.fromFunction0(scheduleUpdate), show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayRenderProps]
  }
  @scala.inline
  implicit class OverlayRenderPropsOps[Self <: OverlayRenderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowProps(value: Ref): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlacement(value: Placements): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProps(value: Arialabelledby): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduleUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleUpdate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutOfBoundaries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outOfBoundaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutOfBoundaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outOfBoundaries")(js.undefined)
        ret
    }
  }
  
}

