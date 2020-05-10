package typingsSlinky.angularGridster

import typingsSlinky.angular.mod.IAngularEvent
import typingsSlinky.angular.mod.IAugmentedJQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDrag extends js.Object {
  // optional callback fired when item is moved,
  var drag: js.UndefOr[
    js.Function3[/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any, Unit]
  ] = js.native
  // whether the items are resizable
  var enabled: js.UndefOr[Boolean] = js.native
  // optional selector for drag handle
  var handle: js.UndefOr[String] = js.native
  // Distance in pixels from the edge of the viewport after which the viewport should scroll, relative to pointer
  var scrollSensitivity: js.UndefOr[Double] = js.native
  // Speed at which the window should scroll once the mouse pointer gets within scrollSensitivity distance
  var scrollSpeed: js.UndefOr[Double] = js.native
  // optional callback fired when drag is started
  var start: js.UndefOr[
    js.Function3[/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any, Unit]
  ] = js.native
  // optional callback fired when item is finished dragging
  var stop: js.UndefOr[
    js.Function3[/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any, Unit]
  ] = js.native
}

object AnonDrag {
  @scala.inline
  def apply(): AnonDrag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDrag]
  }
  @scala.inline
  implicit class AnonDragOps[Self <: AnonDrag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrag(value: (/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHandle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollSensitivity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollSensitivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSensitivity")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: (/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStop(value: (/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.undefined)
        ret
    }
  }
  
}

