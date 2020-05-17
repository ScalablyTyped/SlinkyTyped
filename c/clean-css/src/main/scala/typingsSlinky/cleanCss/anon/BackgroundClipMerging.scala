package typingsSlinky.cleanCss.anon

import typingsSlinky.cleanCss.cleanCssBooleans.`false`
import typingsSlinky.cleanCss.cleanCssBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundClipMerging extends js.Object {
  /**
    * Controls background-clip merging into shorthand; defaults to `true`
    */
  var backgroundClipMerging: js.UndefOr[Boolean] = js.native
  /**
    * Controls background-origin merging into shorthand; defaults to `true`
    */
  var backgroundOriginMerging: js.UndefOr[Boolean] = js.native
  /**
    * Controls background-size merging into shorthand; defaults to `true`
    */
  var backgroundSizeMerging: js.UndefOr[Boolean] = js.native
  /**
    * controls color optimizations; defaults to `true`
    */
  var colors: js.UndefOr[Boolean] = js.native
  /**
    * Controls keeping IE bang hack; defaults to `false`
    */
  var ieBangHack: js.UndefOr[Boolean] = js.native
  /**
    * Controls keeping IE `filter` / `-ms-filter`; defaults to `false`
    */
  var ieFilters: js.UndefOr[Boolean] = js.native
  /**
    * Controls keeping IE prefix hack; defaults to `false`
    */
  var iePrefixHack: js.UndefOr[Boolean] = js.native
  /**
    * Controls keeping IE suffix hack; defaults to `false`
    */
  var ieSuffixHack: js.UndefOr[Boolean] = js.native
  /**
    * Controls property merging based on understandably; defaults to `true`
    */
  var merging: js.UndefOr[Boolean] = js.native
  /**
    * Controls shortening pixel units into `pc`, `pt`, or `in` units; defaults to `false`
    */
  var shorterLengthUnits: js.UndefOr[`false`] = js.native
  /**
    * Controls keeping space after closing brace - `url() no-repeat` into `url()no-repeat`; defaults to `true`
    */
  var spaceAfterClosingBrace: js.UndefOr[`true`] = js.native
  /**
    * Controls keeping quoting inside `url()`; defaults to `false`
    */
  var urlQuotes: js.UndefOr[Boolean] = js.native
  /**
    * Controls removal of units `0` value; defaults to `true`
    */
  var zeroUnits: js.UndefOr[Boolean] = js.native
}

object BackgroundClipMerging {
  @scala.inline
  def apply(): BackgroundClipMerging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundClipMerging]
  }
  @scala.inline
  implicit class BackgroundClipMergingOps[Self <: BackgroundClipMerging] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundClipMerging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundClipMerging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundClipMerging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundClipMerging")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundOriginMerging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundOriginMerging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundOriginMerging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundOriginMerging")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundSizeMerging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundSizeMerging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundSizeMerging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundSizeMerging")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withIeBangHack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ieBangHack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIeBangHack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ieBangHack")(js.undefined)
        ret
    }
    @scala.inline
    def withIeFilters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ieFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIeFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ieFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withIePrefixHack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iePrefixHack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIePrefixHack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iePrefixHack")(js.undefined)
        ret
    }
    @scala.inline
    def withIeSuffixHack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ieSuffixHack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIeSuffixHack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ieSuffixHack")(js.undefined)
        ret
    }
    @scala.inline
    def withMerging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merging")(js.undefined)
        ret
    }
    @scala.inline
    def withShorterLengthUnits(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shorterLengthUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShorterLengthUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shorterLengthUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaceAfterClosingBrace(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceAfterClosingBrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaceAfterClosingBrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceAfterClosingBrace")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlQuotes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlQuotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlQuotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlQuotes")(js.undefined)
        ret
    }
    @scala.inline
    def withZeroUnits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZeroUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroUnits")(js.undefined)
        ret
    }
  }
  
}

