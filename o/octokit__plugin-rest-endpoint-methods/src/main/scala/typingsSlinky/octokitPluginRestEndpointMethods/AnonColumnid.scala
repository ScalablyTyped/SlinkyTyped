package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColumnid extends js.Object {
  var column_id: AnonRequired = js.native
  var content_id: AnonType = js.native
  var content_type: AnonType = js.native
  var note: AnonType = js.native
}

object AnonColumnid {
  @scala.inline
  def apply(column_id: AnonRequired, content_id: AnonType, content_type: AnonType, note: AnonType): AnonColumnid = {
    val __obj = js.Dynamic.literal(column_id = column_id.asInstanceOf[js.Any], content_id = content_id.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumnid]
  }
  @scala.inline
  implicit class AnonColumnidOps[Self <: AnonColumnid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn_id(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent_id(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent_type(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNote(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

