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

trait positionConfig extends js.Object {
  /** The target element position that the widget is positioned against. */
  var at: js.UndefOr[
    bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | AnonX
  ] = js.undefined
  /** The element within which the widget is positioned. */
  var boundary: js.UndefOr[String | Element | JQuery | Window_] = js.undefined
  /** Specifies the horizontal and vertical offset from the window's boundaries. */
  var boundaryOffset: js.UndefOr[String | AnonY] = js.undefined
  /** Specifies how to move the widget if it overflows the screen. */
  var collision: js.UndefOr[
    fit | (`fit flip`) | (`fit flipfit`) | (`fit none`) | flip | (`flip fit`) | (`flip none`) | flipfit | (`flipfit fit`) | (`flipfit none`) | none | (`none fit`) | (`none flip`) | (`none flipfit`) | AnonXY
  ] = js.undefined
  /** The position of the widget to align against the target element. */
  var my: js.UndefOr[
    bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | AnonX
  ] = js.undefined
  /** The target element that the widget is positioned against. */
  var of: js.UndefOr[String | Element | JQuery | Window_] = js.undefined
  /** Specifies horizontal and vertical offset in pixels. */
  var offset: js.UndefOr[String | AnonY] = js.undefined
}

object positionConfig {
  @scala.inline
  def apply(
    at: bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | AnonX = null,
    boundary: String | Element | JQuery | Window_ = null,
    boundaryOffset: String | AnonY = null,
    collision: fit | (`fit flip`) | (`fit flipfit`) | (`fit none`) | flip | (`flip fit`) | (`flip none`) | flipfit | (`flipfit fit`) | (`flipfit none`) | none | (`none fit`) | (`none flip`) | (`none flipfit`) | AnonXY = null,
    my: bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | AnonX = null,
    of: String | Element | JQuery | Window_ = null,
    offset: String | AnonY = null
  ): positionConfig = {
    val __obj = js.Dynamic.literal()
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (boundaryOffset != null) __obj.updateDynamic("boundaryOffset")(boundaryOffset.asInstanceOf[js.Any])
    if (collision != null) __obj.updateDynamic("collision")(collision.asInstanceOf[js.Any])
    if (my != null) __obj.updateDynamic("my")(my.asInstanceOf[js.Any])
    if (of != null) __obj.updateDynamic("of")(of.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[positionConfig]
  }
}

