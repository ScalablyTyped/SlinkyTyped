package typingsSlinky.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCompressedpagesread extends js.Object {
  var `compressed pages read`: Double = js.native
  var `compressed pages written`: Double = js.native
  var `page written failed to compress`: Double = js.native
  var `page written was too small to compress`: Double = js.native
  @JSName("raw compression call failed, additional data available")
  var `raw compression call failedComma additional data available`: Double = js.native
  @JSName("raw compression call failed, no additional data available")
  var `raw compression call failedComma no additional data available`: Double = js.native
  var `raw compression call succeeded`: Double = js.native
}

object AnonCompressedpagesread {
  @scala.inline
  def apply(
    `compressed pages read`: Double,
    `compressed pages written`: Double,
    `page written failed to compress`: Double,
    `page written was too small to compress`: Double,
    `raw compression call failedComma additional data available`: Double,
    `raw compression call failedComma no additional data available`: Double,
    `raw compression call succeeded`: Double
  ): AnonCompressedpagesread = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compressed pages read")((`compressed pages read`).asInstanceOf[js.Any])
    __obj.updateDynamic("compressed pages written")((`compressed pages written`).asInstanceOf[js.Any])
    __obj.updateDynamic("page written failed to compress")((`page written failed to compress`).asInstanceOf[js.Any])
    __obj.updateDynamic("page written was too small to compress")((`page written was too small to compress`).asInstanceOf[js.Any])
    __obj.updateDynamic("raw compression call failed, additional data available")((`raw compression call failedComma additional data available`).asInstanceOf[js.Any])
    __obj.updateDynamic("raw compression call failed, no additional data available")((`raw compression call failedComma no additional data available`).asInstanceOf[js.Any])
    __obj.updateDynamic("raw compression call succeeded")((`raw compression call succeeded`).asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompressedpagesread]
  }
  @scala.inline
  implicit class AnonCompressedpagesreadOps[Self <: AnonCompressedpagesread] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withCompressed pages read`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressed pages read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withCompressed pages written`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressed pages written")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPage written failed to compress`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page written failed to compress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPage written was too small to compress`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page written was too small to compress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withRaw compression call failedComma additional data available`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw compression call failed, additional data available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withRaw compression call failedComma no additional data available`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw compression call failed, no additional data available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withRaw compression call succeeded`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw compression call succeeded")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

