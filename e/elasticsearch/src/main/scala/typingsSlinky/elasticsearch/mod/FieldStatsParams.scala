package typingsSlinky.elasticsearch.mod

import typingsSlinky.elasticsearch.elasticsearchStrings.cluster
import typingsSlinky.elasticsearch.elasticsearchStrings.indices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldStatsParams extends GenericParams {
  var allowNoIndices: js.UndefOr[Boolean] = js.native
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.native
  var fields: js.UndefOr[NameList] = js.native
  var ignoreUnavailable: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[NameList] = js.native
  var level: js.UndefOr[indices | cluster] = js.native
}

object FieldStatsParams {
  @scala.inline
  def apply(): FieldStatsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldStatsParams]
  }
  @scala.inline
  implicit class FieldStatsParamsOps[Self <: FieldStatsParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowNoIndices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNoIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowNoIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNoIndices")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandWildcards(value: ExpandWildcards): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandWildcards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandWildcards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandWildcards")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: NameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreUnavailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnavailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUnavailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnavailable")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: NameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: indices | cluster): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
  }
  
}

