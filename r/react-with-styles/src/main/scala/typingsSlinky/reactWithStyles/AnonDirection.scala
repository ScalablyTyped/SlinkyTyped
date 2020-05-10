package typingsSlinky.reactWithStyles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDirection extends js.Object {
  var direction: js.UndefOr[js.Any] = js.native
  var stylesInterface: js.Any = js.native
  var stylesTheme: js.Any = js.native
}

object AnonDirection {
  @scala.inline
  def apply(stylesInterface: js.Any, stylesTheme: js.Any): AnonDirection = {
    val __obj = js.Dynamic.literal(stylesInterface = stylesInterface.asInstanceOf[js.Any], stylesTheme = stylesTheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDirection]
  }
  @scala.inline
  implicit class AnonDirectionOps[Self <: AnonDirection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStylesInterface(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesInterface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStylesTheme(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
  }
  
}

