package typingsSlinky.escpos.anon

import typingsSlinky.escpos.escposStrings.Datalinkescape
import typingsSlinky.escpos.escposStrings.Graveaccent
import typingsSlinky.escpos.escposStrings.Null
import typingsSlinky.escpos.escposStrings.P
import typingsSlinky.escpos.escposStrings.Space
import typingsSlinky.escpos.escposStrings.`0`
import typingsSlinky.escpos.escposStrings.`@`
import typingsSlinky.escpos.escposStrings.p_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `2` extends js.Object {
  var `1`: Null = js.native
  var `2`: Datalinkescape = js.native
  var `3`: Space = js.native
  var `4`: `0` = js.native
  var `5`: `@` = js.native
  var `6`: P = js.native
  var `7`: Graveaccent = js.native
  var `8`: p_ = js.native
}

object `2` {
  @scala.inline
  def apply(`1`: Null, `2`: Datalinkescape, `3`: Space, `4`: `0`, `5`: `@`, `6`: P, `7`: Graveaccent, `8`: p_): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
    __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
    __obj.updateDynamic("7")(`7`.asInstanceOf[js.Any])
    __obj.updateDynamic("8")(`8`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  @scala.inline
  implicit class `2Ops`[Self <: `2`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with1(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with2(value: Datalinkescape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with3(value: Space): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with4(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with5(value: `@`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with6(value: P): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with7(value: Graveaccent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with8(value: p_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("8")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

