package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnidName extends js.Object {
  var column_id: Required = js.native
  var name: Required = js.native
}

object ColumnidName {
  @scala.inline
  def apply(column_id: Required, name: Required): ColumnidName = {
    val __obj = js.Dynamic.literal(column_id = column_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnidName]
  }
  @scala.inline
  implicit class ColumnidNameOps[Self <: ColumnidName] (val x: Self) extends AnyVal {
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
    def withName(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

