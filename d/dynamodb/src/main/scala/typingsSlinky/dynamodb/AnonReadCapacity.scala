package typingsSlinky.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReadCapacity extends js.Object {
  var readCapacity: Double = js.native
  var writeCapacity: Double = js.native
}

object AnonReadCapacity {
  @scala.inline
  def apply(readCapacity: Double, writeCapacity: Double): AnonReadCapacity = {
    val __obj = js.Dynamic.literal(readCapacity = readCapacity.asInstanceOf[js.Any], writeCapacity = writeCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReadCapacity]
  }
  @scala.inline
  implicit class AnonReadCapacityOps[Self <: AnonReadCapacity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReadCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWriteCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeCapacity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

