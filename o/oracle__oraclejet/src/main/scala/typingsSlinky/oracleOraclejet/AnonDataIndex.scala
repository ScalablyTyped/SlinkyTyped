package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDataIndex[D, K] extends js.Object {
  var data: D = js.native
  var index: Double = js.native
  var key: K = js.native
}

object AnonDataIndex {
  @scala.inline
  def apply[D, K](data: D, index: Double, key: K): AnonDataIndex[D, K] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataIndex[D, K]]
  }
  @scala.inline
  implicit class AnonDataIndexOps[Self[d, k] <: AnonDataIndex[d, k], D, K] (val x: Self[D, K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D, K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D, K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[D, K]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[D, K]) with Other]
    @scala.inline
    def withData(value: D): Self[D, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self[D, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: K): Self[D, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

