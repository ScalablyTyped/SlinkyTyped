package typingsSlinky.javascriptTimeAgo.localeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuantifyType extends js.Object {
  var few: js.UndefOr[String] = js.native
  var one: String = js.native
  var other: String = js.native
  var two: js.UndefOr[String] = js.native
}

object QuantifyType {
  @scala.inline
  def apply(one: String, other: String): QuantifyType = {
    val __obj = js.Dynamic.literal(one = one.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantifyType]
  }
  @scala.inline
  implicit class QuantifyTypeOps[Self <: QuantifyType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOne(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("one")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOther(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFew(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("few")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFew: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("few")(js.undefined)
        ret
    }
    @scala.inline
    def withTwo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("two")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTwo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("two")(js.undefined)
        ret
    }
  }
  
}

