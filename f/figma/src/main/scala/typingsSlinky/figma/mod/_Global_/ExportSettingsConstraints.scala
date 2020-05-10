package typingsSlinky.figma.mod._Global_

import typingsSlinky.figma.figmaStrings.HEIGHT
import typingsSlinky.figma.figmaStrings.SCALE
import typingsSlinky.figma.figmaStrings.WIDTH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportSettingsConstraints extends js.Object {
  val `type`: SCALE | WIDTH | HEIGHT = js.native
  val value: Double = js.native
}

object ExportSettingsConstraints {
  @scala.inline
  def apply(`type`: SCALE | WIDTH | HEIGHT, value: Double): ExportSettingsConstraints = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettingsConstraints]
  }
  @scala.inline
  implicit class ExportSettingsConstraintsOps[Self <: ExportSettingsConstraints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: SCALE | WIDTH | HEIGHT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

