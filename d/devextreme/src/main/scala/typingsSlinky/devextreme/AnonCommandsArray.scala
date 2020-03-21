package typingsSlinky.devextreme

import typingsSlinky.devextreme.devextremeStrings.autoZoom
import typingsSlinky.devextreme.devextremeStrings.gridSize
import typingsSlinky.devextreme.devextremeStrings.pageColor
import typingsSlinky.devextreme.devextremeStrings.pageOrientation
import typingsSlinky.devextreme.devextremeStrings.pageSize
import typingsSlinky.devextreme.devextremeStrings.showGrid
import typingsSlinky.devextreme.devextremeStrings.snapToGrid
import typingsSlinky.devextreme.devextremeStrings.units
import typingsSlinky.devextreme.devextremeStrings.zoomLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommandsArray extends js.Object {
  var commands: js.UndefOr[
    js.Array[
      zoomLevel | autoZoom | showGrid | snapToGrid | gridSize | units | pageSize | pageOrientation | pageColor
    ]
  ] = js.undefined
}

object AnonCommandsArray {
  @scala.inline
  def apply(
    commands: js.Array[
      zoomLevel | autoZoom | showGrid | snapToGrid | gridSize | units | pageSize | pageOrientation | pageColor
    ] = null
  ): AnonCommandsArray = {
    val __obj = js.Dynamic.literal()
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommandsArray]
  }
}

