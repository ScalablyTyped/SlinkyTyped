package typingsSlinky.jsgraph.mod

import typingsSlinky.jsgraph.jsgraphNumbers.`0`
import typingsSlinky.jsgraph.jsgraphNumbers.`1`
import typingsSlinky.jsgraph.jsgraphNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait colors extends js.Object {
  var black: `2` = js.native
  var gray: `1` = js.native
  var white: `0` = js.native
}

object colors {
  @scala.inline
  def apply(black: `2`, gray: `1`, white: `0`): colors = {
    val __obj = js.Dynamic.literal(black = black.asInstanceOf[js.Any], gray = gray.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any])
    __obj.asInstanceOf[colors]
  }
  @scala.inline
  implicit class colorsOps[Self <: colors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlack(value: `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("black")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGray(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhite(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("white")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

