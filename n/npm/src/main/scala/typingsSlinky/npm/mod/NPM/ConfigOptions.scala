package typingsSlinky.npm.mod.NPM

import typingsSlinky.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigOptions extends js.Object {
  var _exit: js.UndefOr[Boolean] = js.native
  var `always-auth`: js.UndefOr[Boolean] = js.native
  var `bin-links`: js.UndefOr[Boolean] = js.native
  var browser: js.UndefOr[String] = js.native
  var ca: js.UndefOr[js.Any] = js.native
  var cache: js.UndefOr[String] = js.native
  var `cache-lock-retries`: js.UndefOr[Double] = js.native
  var `cache-lock-stale`: js.UndefOr[Double] = js.native
  var `cache-lock-wait`: js.UndefOr[Double] = js.native
  var `cache-max`: js.UndefOr[Double] = js.native
  var `cache-min`: js.UndefOr[Double] = js.native
   // string | string[]
  var cafile: js.UndefOr[String] = js.native
  var cert: js.UndefOr[String] = js.native
  var color: js.UndefOr[js.Any] = js.native
   // boolean | string ("always")
  var depth: js.UndefOr[Double] = js.native
  var description: js.UndefOr[Boolean] = js.native
  var dev: js.UndefOr[Boolean] = js.native
  var editor: js.UndefOr[String] = js.native
  var `engine-strict`: js.UndefOr[Boolean] = js.native
  var `fetch-retries`: js.UndefOr[Double] = js.native
  var `fetch-retry-factor`: js.UndefOr[Double] = js.native
  var `fetch-retry-maxtimeout`: js.UndefOr[Double] = js.native
  var `fetch-retry-mintimeout`: js.UndefOr[Double] = js.native
  var force: js.UndefOr[Boolean] = js.native
  var git: js.UndefOr[String] = js.native
  var `git-tag-version`: js.UndefOr[Boolean] = js.native
  var global: js.UndefOr[Boolean] = js.native
  var globalconfig: js.UndefOr[String] = js.native
  var group: js.UndefOr[js.Any] = js.native
   // number | string
  var heading: js.UndefOr[String] = js.native
   // boolean | string
  var `https-proxy`: js.UndefOr[String] = js.native
  var `ignore-scripts`: js.UndefOr[Boolean] = js.native
  var `init-module`: js.UndefOr[String] = js.native
  @JSName("init.author.email")
  var initDotauthorDotemail: js.UndefOr[String] = js.native
  @JSName("init.author.name")
  var initDotauthorDotname: js.UndefOr[String] = js.native
  @JSName("init.author.url")
  var initDotauthorDoturl: js.UndefOr[String] = js.native
  @JSName("init.license")
  var initDotlicense: js.UndefOr[String] = js.native
  @JSName("init.version")
  var initDotversion: js.UndefOr[String] = js.native
  var json: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[String] = js.native
  var link: js.UndefOr[Boolean] = js.native
  var `local-address`: js.UndefOr[String] = js.native
  var loglevel: js.UndefOr[String] = js.native
  var logstream: js.UndefOr[ReadWriteStream] = js.native
  var long: js.UndefOr[Boolean] = js.native
  var message: js.UndefOr[String] = js.native
  var `node-version`: js.UndefOr[String] = js.native
  var npat: js.UndefOr[Boolean] = js.native
  var `onload-script`: js.UndefOr[Boolean] = js.native
  var optional: js.UndefOr[Boolean] = js.native
  var parseable: js.UndefOr[Boolean] = js.native
  var prefix: js.UndefOr[String] = js.native
  var production: js.UndefOr[Boolean] = js.native
  var `proprietary-attribs`: js.UndefOr[Boolean] = js.native
  var proxy: js.UndefOr[js.Any] = js.native
  var `rebuild-bundle`: js.UndefOr[Boolean] = js.native
  var registry: js.UndefOr[String] = js.native
  var rollback: js.UndefOr[Boolean] = js.native
  var save: js.UndefOr[Boolean] = js.native
  var `save-bundle`: js.UndefOr[Boolean] = js.native
  var `save-dev`: js.UndefOr[Boolean] = js.native
  var `save-exact`: js.UndefOr[Boolean] = js.native
  var `save-optional`: js.UndefOr[Boolean] = js.native
  var `save-prefix`: js.UndefOr[String] = js.native
  var scope: js.UndefOr[String] = js.native
  var searchexclude: js.UndefOr[String] = js.native
  var searchopts: js.UndefOr[String] = js.native
  var searchsort: js.UndefOr[String] = js.native
  var shell: js.UndefOr[String] = js.native
  var shrinkwrap: js.UndefOr[Boolean] = js.native
  var `sign-git-tag`: js.UndefOr[Boolean] = js.native
  var spin: js.UndefOr[js.Any] = js.native
   // boolean | string ("always")
  var `strict-ssl`: js.UndefOr[Boolean] = js.native
  var tag: js.UndefOr[String] = js.native
  var tmp: js.UndefOr[String] = js.native
  var umask: js.UndefOr[Double] = js.native
  var unicode: js.UndefOr[Boolean] = js.native
  var `unsafe-perm`: js.UndefOr[Boolean] = js.native
  var usage: js.UndefOr[Boolean] = js.native
  var user: js.UndefOr[js.Any] = js.native
  var `user-agent`: js.UndefOr[String] = js.native
   // string | number
  var userconfig: js.UndefOr[String] = js.native
  var version: js.UndefOr[Boolean] = js.native
  var versions: js.UndefOr[Boolean] = js.native
  var viewer: js.UndefOr[String] = js.native
}

object ConfigOptions {
  @scala.inline
  def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_exit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_exit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_exit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_exit")(js.undefined)
        ret
    }
    @scala.inline
    def `withAlways-auth`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always-auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAlways-auth`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always-auth")(js.undefined)
        ret
    }
    @scala.inline
    def `withBin-links`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bin-links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBin-links`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bin-links")(js.undefined)
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
    def withCa(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ca")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ca")(js.undefined)
        ret
    }
    @scala.inline
    def withCache(value: String): Self = {
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
    def `withCache-lock-retries`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache-lock-retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCache-lock-retries`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache-lock-retries")(js.undefined)
        ret
    }
    @scala.inline
    def `withCache-lock-stale`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache-lock-stale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCache-lock-stale`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache-lock-stale")(js.undefined)
        ret
    }
    @scala.inline
    def `withCache-lock-wait`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache-lock-wait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCache-lock-wait`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache-lock-wait")(js.undefined)
        ret
    }
    @scala.inline
    def `withCache-max`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache-max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCache-max`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache-max")(js.undefined)
        ret
    }
    @scala.inline
    def `withCache-min`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache-min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCache-min`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache-min")(js.undefined)
        ret
    }
    @scala.inline
    def withCafile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cafile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCafile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cafile")(js.undefined)
        ret
    }
    @scala.inline
    def withCert(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDev(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dev")(js.undefined)
        ret
    }
    @scala.inline
    def withEditor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(js.undefined)
        ret
    }
    @scala.inline
    def `withEngine-strict`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine-strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutEngine-strict`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine-strict")(js.undefined)
        ret
    }
    @scala.inline
    def `withFetch-retries`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch-retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFetch-retries`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch-retries")(js.undefined)
        ret
    }
    @scala.inline
    def `withFetch-retry-factor`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch-retry-factor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFetch-retry-factor`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch-retry-factor")(js.undefined)
        ret
    }
    @scala.inline
    def `withFetch-retry-maxtimeout`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch-retry-maxtimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFetch-retry-maxtimeout`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch-retry-maxtimeout")(js.undefined)
        ret
    }
    @scala.inline
    def `withFetch-retry-mintimeout`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch-retry-mintimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFetch-retry-mintimeout`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch-retry-mintimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(js.undefined)
        ret
    }
    @scala.inline
    def withGit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git")(js.undefined)
        ret
    }
    @scala.inline
    def `withGit-tag-version`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git-tag-version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutGit-tag-version`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git-tag-version")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobal(value: Boolean): Self = {
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
    def withGlobalconfig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalconfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalconfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalconfig")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withHeading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(js.undefined)
        ret
    }
    @scala.inline
    def `withHttps-proxy`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("https-proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHttps-proxy`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("https-proxy")(js.undefined)
        ret
    }
    @scala.inline
    def `withIgnore-scripts`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore-scripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIgnore-scripts`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore-scripts")(js.undefined)
        ret
    }
    @scala.inline
    def `withInit-module`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init-module")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInit-module`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init-module")(js.undefined)
        ret
    }
    @scala.inline
    def withInitDotauthorDotemail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init.author.email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitDotauthorDotemail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init.author.email")(js.undefined)
        ret
    }
    @scala.inline
    def withInitDotauthorDotname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init.author.name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitDotauthorDotname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init.author.name")(js.undefined)
        ret
    }
    @scala.inline
    def withInitDotauthorDoturl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init.author.url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitDotauthorDoturl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init.author.url")(js.undefined)
        ret
    }
    @scala.inline
    def withInitDotlicense(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init.license")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitDotlicense: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init.license")(js.undefined)
        ret
    }
    @scala.inline
    def withInitDotversion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init.version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitDotversion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init.version")(js.undefined)
        ret
    }
    @scala.inline
    def withJson(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.undefined)
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
    def withLink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def `withLocal-address`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local-address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLocal-address`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local-address")(js.undefined)
        ret
    }
    @scala.inline
    def withLoglevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loglevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoglevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loglevel")(js.undefined)
        ret
    }
    @scala.inline
    def withLogstream(value: ReadWriteStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logstream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogstream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logstream")(js.undefined)
        ret
    }
    @scala.inline
    def withLong(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLong: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def `withNode-version`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node-version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNode-version`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node-version")(js.undefined)
        ret
    }
    @scala.inline
    def withNpat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("npat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNpat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("npat")(js.undefined)
        ret
    }
    @scala.inline
    def `withOnload-script`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload-script")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOnload-script`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload-script")(js.undefined)
        ret
    }
    @scala.inline
    def withOptional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(js.undefined)
        ret
    }
    @scala.inline
    def withParseable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParseable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseable")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withProduction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("production")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("production")(js.undefined)
        ret
    }
    @scala.inline
    def `withProprietary-attribs`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proprietary-attribs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutProprietary-attribs`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proprietary-attribs")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
    @scala.inline
    def `withRebuild-bundle`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rebuild-bundle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRebuild-bundle`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rebuild-bundle")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registry")(js.undefined)
        ret
    }
    @scala.inline
    def withRollback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRollback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollback")(js.undefined)
        ret
    }
    @scala.inline
    def withSave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.undefined)
        ret
    }
    @scala.inline
    def `withSave-bundle`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save-bundle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSave-bundle`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save-bundle")(js.undefined)
        ret
    }
    @scala.inline
    def `withSave-dev`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save-dev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSave-dev`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save-dev")(js.undefined)
        ret
    }
    @scala.inline
    def `withSave-exact`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save-exact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSave-exact`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save-exact")(js.undefined)
        ret
    }
    @scala.inline
    def `withSave-optional`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save-optional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSave-optional`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save-optional")(js.undefined)
        ret
    }
    @scala.inline
    def `withSave-prefix`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save-prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSave-prefix`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save-prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchexclude(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchexclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchexclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchexclude")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchopts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchopts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchopts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchopts")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchsort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchsort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchsort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchsort")(js.undefined)
        ret
    }
    @scala.inline
    def withShell(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shell")(js.undefined)
        ret
    }
    @scala.inline
    def withShrinkwrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrinkwrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShrinkwrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrinkwrap")(js.undefined)
        ret
    }
    @scala.inline
    def `withSign-git-tag`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign-git-tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSign-git-tag`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign-git-tag")(js.undefined)
        ret
    }
    @scala.inline
    def withSpin(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spin")(js.undefined)
        ret
    }
    @scala.inline
    def `withStrict-ssl`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict-ssl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStrict-ssl`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict-ssl")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
    @scala.inline
    def withTmp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTmp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmp")(js.undefined)
        ret
    }
    @scala.inline
    def withUmask(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("umask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUmask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("umask")(js.undefined)
        ret
    }
    @scala.inline
    def withUnicode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnicode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicode")(js.undefined)
        ret
    }
    @scala.inline
    def `withUnsafe-perm`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafe-perm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUnsafe-perm`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafe-perm")(js.undefined)
        ret
    }
    @scala.inline
    def withUsage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
    @scala.inline
    def `withUser-agent`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user-agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUser-agent`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user-agent")(js.undefined)
        ret
    }
    @scala.inline
    def withUserconfig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userconfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserconfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userconfig")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withVersions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(js.undefined)
        ret
    }
    @scala.inline
    def withViewer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewer")(js.undefined)
        ret
    }
  }
  
}

