package typingsSlinky.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataErr extends js.Object {
  var DataErr: Double = js.native
  var Response: Double = js.native
}

object DataErr {
  @scala.inline
  def apply(DataErr: Double, Response: Double): DataErr = {
    val __obj = js.Dynamic.literal(DataErr = DataErr.asInstanceOf[js.Any], Response = Response.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataErr]
  }
  @scala.inline
  implicit class DataErrOps[Self <: DataErr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataErr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataErr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Response")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

