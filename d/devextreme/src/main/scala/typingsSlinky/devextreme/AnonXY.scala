package typingsSlinky.devextreme

import typingsSlinky.devextreme.devextremeStrings.fit
import typingsSlinky.devextreme.devextremeStrings.flip
import typingsSlinky.devextreme.devextremeStrings.flipfit
import typingsSlinky.devextreme.devextremeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonXY extends js.Object {
  var x: js.UndefOr[fit | flip | flipfit | none] = js.native
  var y: js.UndefOr[fit | flip | flipfit | none] = js.native
}

object AnonXY {
  @scala.inline
  def apply(): AnonXY = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonXY]
  }
  @scala.inline
  implicit class AnonXYOps[Self <: AnonXY] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withX(value: fit | flip | flipfit | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: fit | flip | flipfit | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

