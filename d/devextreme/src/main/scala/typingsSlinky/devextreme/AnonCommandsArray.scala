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

@js.native
trait AnonCommandsArray extends js.Object {
  var commands: js.UndefOr[
    js.Array[
      zoomLevel | autoZoom | showGrid | snapToGrid | gridSize | units | pageSize | pageOrientation | pageColor
    ]
  ] = js.native
}

object AnonCommandsArray {
  @scala.inline
  def apply(): AnonCommandsArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCommandsArray]
  }
  @scala.inline
  implicit class AnonCommandsArrayOps[Self <: AnonCommandsArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommands(
      value: js.Array[
          zoomLevel | autoZoom | showGrid | snapToGrid | gridSize | units | pageSize | pageOrientation | pageColor
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(js.undefined)
        ret
    }
  }
  
}

