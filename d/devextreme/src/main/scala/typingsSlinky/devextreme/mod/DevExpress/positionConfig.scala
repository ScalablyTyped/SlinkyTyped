package typingsSlinky.devextreme.mod.DevExpress

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.AnonX
import typingsSlinky.devextreme.AnonXY
import typingsSlinky.devextreme.AnonY
import typingsSlinky.devextreme.devextremeStrings.`fit flip`
import typingsSlinky.devextreme.devextremeStrings.`fit flipfit`
import typingsSlinky.devextreme.devextremeStrings.`fit none`
import typingsSlinky.devextreme.devextremeStrings.`flip fit`
import typingsSlinky.devextreme.devextremeStrings.`flip none`
import typingsSlinky.devextreme.devextremeStrings.`flipfit fit`
import typingsSlinky.devextreme.devextremeStrings.`flipfit none`
import typingsSlinky.devextreme.devextremeStrings.`left bottom`
import typingsSlinky.devextreme.devextremeStrings.`left top`
import typingsSlinky.devextreme.devextremeStrings.`none fit`
import typingsSlinky.devextreme.devextremeStrings.`none flip`
import typingsSlinky.devextreme.devextremeStrings.`none flipfit`
import typingsSlinky.devextreme.devextremeStrings.`right bottom`
import typingsSlinky.devextreme.devextremeStrings.`right top`
import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.center
import typingsSlinky.devextreme.devextremeStrings.fit
import typingsSlinky.devextreme.devextremeStrings.flip
import typingsSlinky.devextreme.devextremeStrings.flipfit
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.top
import typingsSlinky.devextreme.mod._Global_.JQuery
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait positionConfig extends js.Object {
  /** The target element position that the widget is positioned against. */
  var at: js.UndefOr[
    bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | AnonX
  ] = js.native
  /** The element within which the widget is positioned. */
  var boundary: js.UndefOr[String | Element | JQuery | Window_] = js.native
  /** Specifies the horizontal and vertical offset from the window's boundaries. */
  var boundaryOffset: js.UndefOr[String | AnonY] = js.native
  /** Specifies how to move the widget if it overflows the screen. */
  var collision: js.UndefOr[
    fit | (`fit flip`) | (`fit flipfit`) | (`fit none`) | flip | (`flip fit`) | (`flip none`) | flipfit | (`flipfit fit`) | (`flipfit none`) | none | (`none fit`) | (`none flip`) | (`none flipfit`) | AnonXY
  ] = js.native
  /** The position of the widget to align against the target element. */
  var my: js.UndefOr[
    bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | AnonX
  ] = js.native
  /** The target element that the widget is positioned against. */
  var of: js.UndefOr[String | Element | JQuery | Window_] = js.native
  /** Specifies horizontal and vertical offset in pixels. */
  var offset: js.UndefOr[String | AnonY] = js.native
}

object positionConfig {
  @scala.inline
  def apply(): positionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[positionConfig]
  }
  @scala.inline
  implicit class positionConfigOps[Self <: positionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAt(
      value: bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | AnonX
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("at")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundaryElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoundary(value: String | Element | JQuery | Window_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundaryOffset(value: String | AnonY): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundaryOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withCollision(
      value: fit | (`fit flip`) | (`fit flipfit`) | (`fit none`) | flip | (`flip fit`) | (`flip none`) | flipfit | (`flipfit fit`) | (`flipfit none`) | none | (`none fit`) | (`none flip`) | (`none flipfit`) | AnonXY
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collision")(js.undefined)
        ret
    }
    @scala.inline
    def withMy(
      value: bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | AnonX
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("my")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("my")(js.undefined)
        ret
    }
    @scala.inline
    def withOfElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("of")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOf(value: String | Element | JQuery | Window_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("of")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("of")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: String | AnonY): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
  }
  
}

