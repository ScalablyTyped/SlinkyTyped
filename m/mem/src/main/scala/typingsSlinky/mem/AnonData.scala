package typingsSlinky.mem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonData[ReturnType] extends js.Object {
  var data: ReturnType = js.native
  var maxAge: Double = js.native
}

object AnonData {
  @scala.inline
  def apply[ReturnType](data: ReturnType, maxAge: Double): AnonData[ReturnType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData[ReturnType]]
  }
  @scala.inline
  implicit class AnonDataOps[Self[returntype] <: AnonData[returntype], ReturnType] (val x: Self[ReturnType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ReturnType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ReturnType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ReturnType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ReturnType] with Other]
    @scala.inline
    def withData(value: ReturnType): Self[ReturnType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxAge(value: Double): Self[ReturnType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

