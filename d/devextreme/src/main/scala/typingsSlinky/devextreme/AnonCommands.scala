package typingsSlinky.devextreme

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

@js.native
trait AnonCommands extends js.Object {
  var commands: js.UndefOr[
    js.Array[
      cut | copy | paste | selectAll | delete | bringToFront | sendToBack | lock | unlock | insertShapeImage | editShapeImage | deleteShapeImage
    ]
  ] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
}

object AnonCommands {
  @scala.inline
  def apply(): AnonCommands = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCommands]
  }
  @scala.inline
  implicit class AnonCommandsOps[Self <: AnonCommands] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommands(
      value: js.Array[
          cut | copy | paste | selectAll | delete | bringToFront | sendToBack | lock | unlock | insertShapeImage | editShapeImage | deleteShapeImage
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
  }
  
}

