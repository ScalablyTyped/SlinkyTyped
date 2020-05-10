package typingsSlinky.reactWaypoint.mod.Waypoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaypointProps extends js.Object {
  /**
    * `bottomOffset` is like `topOffset`, but for the bottom of the container.
    */
  var bottomOffset: js.UndefOr[String | Double] = js.native
  /**
    * Use this prop to get debug information in the console log. This slows
    * things down significantly, so it should only be used during development.
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * If the onEnter/onLeave events are to be fired on rapid scrolling.
    * This has no effect on onPositionChange -- it will fire anyway.
    */
  var fireOnRapidScroll: js.UndefOr[Boolean] = js.native
  /**
    * Whether to activate on horizontal scrolling instead of vertical
    */
  var horizontal: js.UndefOr[Boolean] = js.native
  /**
    * Function called when waypoint enters viewport
    * @param {CallbackArgs} args
    */
  var onEnter: js.UndefOr[js.Function1[/* args */ CallbackArgs, Unit]] = js.native
  /**
    * Function called when waypoint leaves viewport
    * @param {CallbackArgs} args
    */
  var onLeave: js.UndefOr[js.Function1[/* args */ CallbackArgs, Unit]] = js.native
  /**
    * Function called when waypoint position changes
    * @param {CallbackArgs} args
    */
  var onPositionChange: js.UndefOr[js.Function1[/* args */ CallbackArgs, Unit]] = js.native
  /**
    * A custom ancestor to determine if the target is visible in it.
    * This is useful in cases where you do not want the immediate scrollable
    * ancestor to be the container. For example, when your target is in a div
    * that has overflow auto but you are detecting onEnter based on the window.
    */
  var scrollableAncestor: js.UndefOr[js.Any] = js.native
  /**
    * `topOffset` can either be a number, in which case its a distance from the
    * top of the container in pixels, or a string value. Valid string values are
    * of the form "20px", which is parsed as pixels, or "20%", which is parsed
    * as a percentage of the height of the containing element.
    * For instance, if you pass "-20%", and the containing element is 100px tall,
    * then the waypoint will be triggered when it has been scrolled 20px beyond
    * the top of the containing element.
    */
  var topOffset: js.UndefOr[String | Double] = js.native
}

object WaypointProps {
  @scala.inline
  def apply(): WaypointProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaypointProps]
  }
  @scala.inline
  implicit class WaypointPropsOps[Self <: WaypointProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottomOffset(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withFireOnRapidScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireOnRapidScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFireOnRapidScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireOnRapidScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnter(value: /* args */ CallbackArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLeave(value: /* args */ CallbackArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPositionChange(value: /* args */ CallbackArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPositionChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPositionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPositionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollableAncestor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollableAncestor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollableAncestor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollableAncestor")(js.undefined)
        ret
    }
    @scala.inline
    def withTopOffset(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topOffset")(js.undefined)
        ret
    }
  }
  
}

