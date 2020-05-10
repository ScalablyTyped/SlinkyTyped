package typingsSlinky.elasticsearch.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldStatsResponseIndex extends js.Object {
  var fields: StringDictionary[FieldStatsResponseField] = js.native
}

object FieldStatsResponseIndex {
  @scala.inline
  def apply(fields: StringDictionary[FieldStatsResponseField]): FieldStatsResponseIndex = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldStatsResponseIndex]
  }
  @scala.inline
  implicit class FieldStatsResponseIndexOps[Self <: FieldStatsResponseIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: StringDictionary[FieldStatsResponseField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

