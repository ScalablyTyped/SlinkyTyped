package typingsSlinky.mathjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MathJSON extends js.Object {
  var fixPrefix: js.UndefOr[Boolean] = js.native
  var mathjs: js.UndefOr[String] = js.native
  var unit: String = js.native
  var value: Double = js.native
}

object MathJSON {
  @scala.inline
  def apply(unit: String, value: Double): MathJSON = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MathJSON]
  }
  @scala.inline
  implicit class MathJSONOps[Self <: MathJSON] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixPrefix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withMathjs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mathjs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMathjs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mathjs")(js.undefined)
        ret
    }
  }
  
}

