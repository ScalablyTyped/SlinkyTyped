package typingsSlinky.cliTable3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Border extends js.Object {
  var border: js.Array[String] = js.native
  var compact: Boolean = js.native
  var head: js.Array[String] = js.native
  var `padding-left`: Double = js.native
  var `padding-right`: Double = js.native
}

object Border {
  @scala.inline
  def apply(
    border: js.Array[String],
    compact: Boolean,
    head: js.Array[String],
    `padding-left`: Double,
    `padding-right`: Double
  ): Border = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], compact = compact.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
    __obj.updateDynamic("padding-left")(`padding-left`.asInstanceOf[js.Any])
    __obj.updateDynamic("padding-right")(`padding-right`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
  @scala.inline
  implicit class BorderOps[Self <: Border] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorder(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHead(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPadding-left`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPadding-right`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-right")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

