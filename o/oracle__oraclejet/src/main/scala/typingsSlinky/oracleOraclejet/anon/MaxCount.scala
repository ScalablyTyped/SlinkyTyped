package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxCount extends js.Object {
  var fetchSize: Double = js.native
  var maxCount: Double = js.native
}

object MaxCount {
  @scala.inline
  def apply(fetchSize: Double, maxCount: Double): MaxCount = {
    val __obj = js.Dynamic.literal(fetchSize = fetchSize.asInstanceOf[js.Any], maxCount = maxCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxCount]
  }
  @scala.inline
  implicit class MaxCountOps[Self <: MaxCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFetchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

