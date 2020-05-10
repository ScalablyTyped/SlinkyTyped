package typingsSlinky.markJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkAccuracyObject extends js.Object {
  var limiters: js.UndefOr[js.Array[String]] = js.native
  var value: MarkAccuracy = js.native
}

object MarkAccuracyObject {
  @scala.inline
  def apply(value: MarkAccuracy): MarkAccuracyObject = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkAccuracyObject]
  }
  @scala.inline
  implicit class MarkAccuracyObjectOps[Self <: MarkAccuracyObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: MarkAccuracy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimiters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limiters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimiters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limiters")(js.undefined)
        ret
    }
  }
  
}

