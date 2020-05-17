package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Columnid extends js.Object {
  var column_id: Required = js.native
  var content_id: Type = js.native
  var content_type: Type = js.native
  var note: Type = js.native
}

object Columnid {
  @scala.inline
  def apply(column_id: Required, content_id: Type, content_type: Type, note: Type): Columnid = {
    val __obj = js.Dynamic.literal(column_id = column_id.asInstanceOf[js.Any], content_id = content_id.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columnid]
  }
  @scala.inline
  implicit class ColumnidOps[Self <: Columnid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent_id(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent_type(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNote(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

