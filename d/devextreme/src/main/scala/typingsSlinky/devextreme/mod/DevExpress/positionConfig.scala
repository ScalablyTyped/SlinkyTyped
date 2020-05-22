package typingsSlinky.devextreme.mod.DevExpress

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Window
import typingsSlinky.devextreme.anon.X
import typingsSlinky.devextreme.anon.XY
import typingsSlinky.devextreme.anon.Y
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
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait positionConfig extends js.Object {
  /** @name positionConfig.at */
  var at: js.UndefOr[
    bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | X
  ] = js.undefined
  /** @name positionConfig.boundary */
  var boundary: js.UndefOr[String | Element | JQuery | Window] = js.undefined
  /** @name positionConfig.boundaryOffset */
  var boundaryOffset: js.UndefOr[String | Y] = js.undefined
  /** @name positionConfig.collision */
  var collision: js.UndefOr[
    fit | (`fit flip`) | (`fit flipfit`) | (`fit none`) | flip | (`flip fit`) | (`flip none`) | flipfit | (`flipfit fit`) | (`flipfit none`) | none | (`none fit`) | (`none flip`) | (`none flipfit`) | XY
  ] = js.undefined
  /** @name positionConfig.my */
  var my: js.UndefOr[
    bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | X
  ] = js.undefined
  /** @name positionConfig.of */
  var of: js.UndefOr[String | Element | JQuery | Window] = js.undefined
  /** @name positionConfig.offset */
  var offset: js.UndefOr[String | Y] = js.undefined
}

object positionConfig {
  @scala.inline
  def apply(
    at: bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | X = null,
    boundary: String | Element | JQuery | Window = null,
    boundaryOffset: String | Y = null,
    collision: fit | (`fit flip`) | (`fit flipfit`) | (`fit none`) | flip | (`flip fit`) | (`flip none`) | flipfit | (`flipfit fit`) | (`flipfit none`) | none | (`none fit`) | (`none flip`) | (`none flipfit`) | XY = null,
    my: bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | X = null,
    of: String | Element | JQuery | Window = null,
    offset: String | Y = null
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

