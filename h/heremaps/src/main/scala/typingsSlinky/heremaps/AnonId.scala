package typingsSlinky.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonId extends js.Object {
  var _type: String = js.native
  var id: String = js.native
  var instruction: String = js.native
  var length: Double = js.native
  var note: js.Array[String] = js.native
  var position: AnonLatitude = js.native
  var shape: js.Array[String] = js.native
  var travelTime: Double = js.native
}

object AnonId {
  @scala.inline
  def apply(
    _type: String,
    id: String,
    instruction: String,
    length: Double,
    note: js.Array[String],
    position: AnonLatitude,
    shape: js.Array[String],
    travelTime: Double
  ): AnonId = {
    val __obj = js.Dynamic.literal(_type = _type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], travelTime = travelTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
  @scala.inline
  implicit class AnonIdOps[Self <: AnonId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstruction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instruction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNote(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: AnonLatitude): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShape(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTravelTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("travelTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

