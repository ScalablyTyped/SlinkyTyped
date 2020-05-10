package typingsSlinky.elasticsearch.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldStatsResponse extends js.Object {
  var _shards: ShardsResponse = js.native
  var conflicts: js.UndefOr[StringDictionary[String]] = js.native
  var indices: StringDictionary[FieldStatsResponseIndex] = js.native
}

object FieldStatsResponse {
  @scala.inline
  def apply(_shards: ShardsResponse, indices: StringDictionary[FieldStatsResponseIndex]): FieldStatsResponse = {
    val __obj = js.Dynamic.literal(_shards = _shards.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldStatsResponse]
  }
  @scala.inline
  implicit class FieldStatsResponseOps[Self <: FieldStatsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_shards(value: ShardsResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_shards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndices(value: StringDictionary[FieldStatsResponseIndex]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConflicts(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflicts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConflicts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflicts")(js.undefined)
        ret
    }
  }
  
}

