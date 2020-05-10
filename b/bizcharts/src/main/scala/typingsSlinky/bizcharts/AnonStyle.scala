package typingsSlinky.bizcharts

import typingsSlinky.antvG2.mod.Styles.background
import typingsSlinky.antvG2.mod.Styles.line
import typingsSlinky.bizcharts.mod.CrosshairsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStyle extends js.Object {
  var style: js.UndefOr[background | line] = js.native
  var `type`: js.UndefOr[CrosshairsType] = js.native
}

object AnonStyle {
  @scala.inline
  def apply(): AnonStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonStyle]
  }
  @scala.inline
  implicit class AnonStyleOps[Self <: AnonStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyle(value: background | line): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: CrosshairsType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

