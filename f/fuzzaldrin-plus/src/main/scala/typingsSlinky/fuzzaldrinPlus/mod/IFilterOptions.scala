package typingsSlinky.fuzzaldrinPlus.mod

import typingsSlinky.fuzzaldrinPlus.anon.TagClass
import typingsSlinky.fuzzaldrinPlus.fuzzaldrinPlusStrings.Backslash
import typingsSlinky.fuzzaldrinPlus.fuzzaldrinPlusStrings.Slash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined fuzzaldrin-plus.fuzzaldrin-plus.IOptions & {  key ? :string,   maxResults ? :number,   maxInners ? :number} */
@js.native
trait IFilterOptions extends js.Object {
  var allowErrors: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[String] = js.native
  var maxInners: js.UndefOr[Double] = js.native
  var maxResults: js.UndefOr[Double] = js.native
  var optCharRegEx: js.UndefOr[js.RegExp] = js.native
  var pathSeparator: js.UndefOr[Slash | Backslash | String] = js.native
  var preparedQuery: js.UndefOr[Query] = js.native
  var useExtensionBonus: js.UndefOr[Boolean] = js.native
  var usePathScoring: js.UndefOr[Boolean] = js.native
  var wrap: js.UndefOr[TagClass] = js.native
}

object IFilterOptions {
  @scala.inline
  def apply(): IFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFilterOptions]
  }
  @scala.inline
  implicit class IFilterOptionsOps[Self <: IFilterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxInners(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxInners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInners")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withOptCharRegEx(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optCharRegEx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptCharRegEx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optCharRegEx")(js.undefined)
        ret
    }
    @scala.inline
    def withPathSeparator(value: Slash | Backslash | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withPreparedQuery(value: Query): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preparedQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreparedQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preparedQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withUseExtensionBonus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useExtensionBonus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseExtensionBonus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useExtensionBonus")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePathScoring(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePathScoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePathScoring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePathScoring")(js.undefined)
        ret
    }
    @scala.inline
    def withWrap(value: TagClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.undefined)
        ret
    }
  }
  
}

