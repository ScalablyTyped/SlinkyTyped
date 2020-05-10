package typingsSlinky.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicesOpenParams extends GenericParams {
  var allowNoIndices: js.UndefOr[Boolean] = js.native
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.native
  var ignoreUnavailable: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[NameList] = js.native
  var masterTimeout: js.UndefOr[TimeSpan] = js.native
  var timeout: js.UndefOr[TimeSpan] = js.native
}

object IndicesOpenParams {
  @scala.inline
  def apply(): IndicesOpenParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesOpenParams]
  }
  @scala.inline
  implicit class IndicesOpenParamsOps[Self <: IndicesOpenParams] (val x: Self) extends AnyVal {
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
    def withMasterTimeout(value: TimeSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: TimeSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

