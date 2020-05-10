package typingsSlinky.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicesPutSettingsParams extends GenericParams {
  var allowNoIndices: js.UndefOr[Boolean] = js.native
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.native
  var flatSettings: js.UndefOr[Boolean] = js.native
  var ignoreUnavailable: js.UndefOr[Boolean] = js.native
  var index: NameList = js.native
  var masterTimeout: js.UndefOr[TimeSpan] = js.native
  var preserveExisting: js.UndefOr[Boolean] = js.native
}

object IndicesPutSettingsParams {
  @scala.inline
  def apply(index: NameList): IndicesPutSettingsParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesPutSettingsParams]
  }
  @scala.inline
  implicit class IndicesPutSettingsParamsOps[Self <: IndicesPutSettingsParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: NameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withFlatSettings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlatSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatSettings")(js.undefined)
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
    def withPreserveExisting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveExisting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveExisting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveExisting")(js.undefined)
        ret
    }
  }
  
}

