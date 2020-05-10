package typingsSlinky.autoprefixer.mod

import typingsSlinky.autoprefixer.autoprefixerBooleans.`false`
import typingsSlinky.autoprefixer.autoprefixerStrings.`no-2009`
import typingsSlinky.autoprefixer.autoprefixerStrings.`no-autoplace`
import typingsSlinky.autoprefixer.autoprefixerStrings.autoplace
import typingsSlinky.browserslist.mod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** should Autoprefixer add prefixes. */
  var add: js.UndefOr[Boolean] = js.native
  /** @deprecated 'Change `browser` option to `overrideBrowserslist` in Autoprefixer */
  var browser: js.UndefOr[String] = js.native
  /**
    * @deprecated Replace Autoprefixer `browsers` option to Browserslist config.
    * Use `browserslist` key in `package.json` or `.browserslistrc` file.
    */
  var browsers: js.UndefOr[js.Array[String] | String] = js.native
  /** @deprecated Change `browserslist` option to `overrideBrowserslist` in Autoprefixer */
  var browserslist: js.UndefOr[js.Array[String] | String] = js.native
  /** should Autoprefixer use Visual Cascade, if CSS is uncompressed */
  var cascade: js.UndefOr[Boolean] = js.native
  /** environment for `Browserslist` */
  var env: js.UndefOr[String] = js.native
  /** should Autoprefixer add prefixes for flexbox properties */
  var flexbox: js.UndefOr[Boolean | `no-2009`] = js.native
  /** should Autoprefixer add IE 10-11 prefixes for Grid Layout properties */
  var grid: js.UndefOr[`false` | autoplace | `no-autoplace`] = js.native
  /** do not raise error on unknown browser version in `Browserslist` config. */
  var ignoreUnknownVersions: js.UndefOr[Boolean] = js.native
  /**
    * list of queries for target browsers.
    * Try to not use it.
    * The best practice is to use `.browserslistrc` config or `browserslist` key in `package.json`
    * to share target browsers with Babel, ESLint and Stylelint
    */
  var overrideBrowserslist: js.UndefOr[BrowserslistTarget] = js.native
  /** should Autoprefixer [remove outdated] prefixes */
  var remove: js.UndefOr[Boolean] = js.native
  /** custom usage statistics for > 10% in my stats browsers query */
  var stats: js.UndefOr[Stats] = js.native
  /** should Autoprefixer add prefixes for @supports parameters. */
  var supports: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowsers(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browsers")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserslist(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserslist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserslist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserslist")(js.undefined)
        ret
    }
    @scala.inline
    def withCascade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCascade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascade")(js.undefined)
        ret
    }
    @scala.inline
    def withEnv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexbox(value: Boolean | `no-2009`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexbox")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: `false` | autoplace | `no-autoplace`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreUnknownVersions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnknownVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUnknownVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnknownVersions")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideBrowserslist(value: BrowserslistTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideBrowserslist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideBrowserslist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideBrowserslist")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withStats(value: Stats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(js.undefined)
        ret
    }
    @scala.inline
    def withSupports(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supports")(js.undefined)
        ret
    }
  }
  
}

