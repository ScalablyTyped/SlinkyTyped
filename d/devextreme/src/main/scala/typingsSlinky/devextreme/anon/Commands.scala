package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.bringToFront
import typingsSlinky.devextreme.devextremeStrings.copy
import typingsSlinky.devextreme.devextremeStrings.cut
import typingsSlinky.devextreme.devextremeStrings.delete
import typingsSlinky.devextreme.devextremeStrings.deleteShapeImage
import typingsSlinky.devextreme.devextremeStrings.editShapeImage
import typingsSlinky.devextreme.devextremeStrings.insertShapeImage
import typingsSlinky.devextreme.devextremeStrings.lock
import typingsSlinky.devextreme.devextremeStrings.paste
import typingsSlinky.devextreme.devextremeStrings.selectAll
import typingsSlinky.devextreme.devextremeStrings.sendToBack
import typingsSlinky.devextreme.devextremeStrings.unlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commands extends js.Object {
  var commands: js.UndefOr[
    js.Array[
      cut | copy | paste | selectAll | delete | bringToFront | sendToBack | lock | unlock | insertShapeImage | editShapeImage | deleteShapeImage
    ]
  ] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object Commands {
  @scala.inline
  def apply(
    commands: js.Array[
      cut | copy | paste | selectAll | delete | bringToFront | sendToBack | lock | unlock | insertShapeImage | editShapeImage | deleteShapeImage
    ] = null,
    enabled: js.UndefOr[Boolean] = js.undefined
  ): Commands = {
    val __obj = js.Dynamic.literal()
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commands]
  }
}

