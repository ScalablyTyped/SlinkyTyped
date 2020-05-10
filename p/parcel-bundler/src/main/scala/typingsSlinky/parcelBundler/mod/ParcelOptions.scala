package typingsSlinky.parcelBundler.mod

import typingsSlinky.parcelBundler.parcelBundlerBooleans.`false`
import typingsSlinky.parcelBundler.parcelBundlerBooleans.`true`
import typingsSlinky.parcelBundler.parcelBundlerNumbers.`0`
import typingsSlinky.parcelBundler.parcelBundlerNumbers.`1`
import typingsSlinky.parcelBundler.parcelBundlerNumbers.`2`
import typingsSlinky.parcelBundler.parcelBundlerNumbers.`3`
import typingsSlinky.parcelBundler.parcelBundlerStrings.browser
import typingsSlinky.parcelBundler.parcelBundlerStrings.electron
import typingsSlinky.parcelBundler.parcelBundlerStrings.node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParcelOptions extends js.Object {
  /**
    * By default, package.json dependencies are not included when using 'node' or 'electron' with the 'target' option.
    *
    * Set to true to add them to the bundle.
    *
    * @default false
    */
  var bundleNodeModules: js.UndefOr[`true` | `false`] = js.native
  /**
    * Enabled or disables caching
    *
    * @default true
    */
  var cache: js.UndefOr[Boolean] = js.native
  /**
    * The directory cache gets put in
    *
    * @default ".cache"
    */
  var cacheDir: js.UndefOr[String] = js.native
  /**
    * Disable content hash from being included on the filename
    *
    * @default false
    */
  var contentHash: js.UndefOr[Boolean] = js.native
  /**
    * Prints a detailed report of the bundles, assets, filesizes and times
    *
    * Reports are only printed if watch is disabled
    *
    * @default false
    */
  var detailedReport: js.UndefOr[Boolean] = js.native
  /**
    * Expose modules as UMD under this name, disabled by default
    */
  var global: js.UndefOr[String] = js.native
  /**
    * Enable or disable HMR while watching
    *
    * @default false
    */
  var hmr: js.UndefOr[`true` | `false`] = js.native
  /**
    * A hostname for hot module reload
    *
    * @default ""
    */
  var hmrHostname: js.UndefOr[String] = js.native
  /**
    * The port the HMR socket runs on
    *
    * Defaults to a random free port (0 in node.js resolves to a random free port)
    *
    * @default 0
    */
  var hmrPort: js.UndefOr[`0` | Double] = js.native
  /**
    * Define a custom {key, cert} pair
    *
    * Use true to generate one or false to use http
    */
  var https: js.UndefOr[`true` | `false` | HttpsOptions] = js.native
  /**
    * 3 = log everything, 2 = log warnings & errors, 1 = log errors
    *
    * @default 3
    */
  var logLevel: js.UndefOr[`3` | `2` | `1`] = js.native
  /**
    * Minify files
    *
    * @default process.env.NODE_ENV === 'production'
    */
  var minify: js.UndefOr[Boolean] = js.native
  /**
    * The out directory to put the build files in
    *
    * @default "./dist"
    */
  var outDir: js.UndefOr[String] = js.native
  /**
    * The name of the outputFile
    *
    * @default "index.html"
    */
  var outFile: js.UndefOr[String] = js.native
  /**
    * The url to server on
    *
    * @default "./"
    */
  var publicUrl: js.UndefOr[String] = js.native
  /**
    * Turn on experimental scope hoisting/tree shaking flag, for smaller production bundles
    *
    * @default false
    */
  var scopeHoist: js.UndefOr[Boolean] = js.native
  /**
    * Enable or disable sourcemaps
    *
    * Defaults to enabled (not supported in minified builds yet)
    *
    * @default true
    */
  var sourceMaps: js.UndefOr[Boolean] = js.native
  /**
    * @default "browser"
    */
  var target: js.UndefOr[browser | node | electron] = js.native
  /**
    * Whether to watch the files and rebuild them on change
    *
    * @default process.env.NODE_ENV !== 'production'
    */
  var watch: js.UndefOr[Boolean] = js.native
}

object ParcelOptions {
  @scala.inline
  def apply(): ParcelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParcelOptions]
  }
  @scala.inline
  implicit class ParcelOptionsOps[Self <: ParcelOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBundleNodeModules(value: `true` | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleNodeModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundleNodeModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleNodeModules")(js.undefined)
        ret
    }
    @scala.inline
    def withCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheDir")(js.undefined)
        ret
    }
    @scala.inline
    def withContentHash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHash")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailedReport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailedReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailedReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailedReport")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(js.undefined)
        ret
    }
    @scala.inline
    def withHmr(value: `true` | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hmr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHmr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hmr")(js.undefined)
        ret
    }
    @scala.inline
    def withHmrHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hmrHostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHmrHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hmrHostname")(js.undefined)
        ret
    }
    @scala.inline
    def withHmrPort(value: `0` | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hmrPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHmrPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hmrPort")(js.undefined)
        ret
    }
    @scala.inline
    def withHttps(value: `true` | `false` | HttpsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("https")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("https")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: `3` | `2` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMinify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minify")(js.undefined)
        ret
    }
    @scala.inline
    def withOutDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outDir")(js.undefined)
        ret
    }
    @scala.inline
    def withOutFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outFile")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withScopeHoist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeHoist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopeHoist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeHoist")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMaps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMaps")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: browser | node | electron): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withWatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.undefined)
        ret
    }
  }
  
}

