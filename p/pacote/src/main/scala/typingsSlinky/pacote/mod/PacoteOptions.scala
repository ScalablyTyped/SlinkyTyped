package typingsSlinky.pacote.mod

import typingsSlinky.npmlog.mod.Logger
import typingsSlinky.ssri.mod.Integrity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PacoteOptions extends js.Object {
  /**
    * When picking a manifest from a packument, only consider packages
    * published before the specified date. Default `null`.
    */
  var before: js.UndefOr[js.Date | Null] = js.native
  /**
    * Where to store cache entries and temp files. Passed to
    * [`cacache`](http://npm.im/cacache). Defaults to the same cache directory
    * that npm will use by default, based on platform and environment.
    */
  var cache: js.UndefOr[String] = js.native
  /**
    * The default `dist-tag` to use when choosing a manifest from a packument.
    * Defaults to `latest`.
    */
  var defaultTag: js.UndefOr[String] = js.native
  /**
    * Minimum permission mode for extracted directories. Defaults to `0o777`.
    */
  var dmode: js.UndefOr[Double] = js.native
  /**
    * Minimum permission mode for extracted files. Defaults to `0o666`.
    */
  var fmode: js.UndefOr[Double] = js.native
  /**
    * Fetch the full metadata from the registry for packuments, including
    * information not strictly required for installation (author, description,
    * etc.) Defaults to `true` when `before` is set, since the version publish
    * time is part of the extended packument metadata.
    */
  var fullMetadata: js.UndefOr[Boolean] = js.native
  /**
    * Expected integrity of fetched package tarball. If specified, tarballs
    * with mismatched integrity values will raise an `EINTEGRITY` error.
    */
  var integrity: js.UndefOr[String | Integrity] = js.native
  /**
    * A logger object with methods for various log levels. Typically, this will
    * be [`npmlog`](http://npm.im/npmlog) in the npm CLI use case, but if not
    * specified, the default is a logger that emits 'log' events on the process
    * object.
    */
  var log: js.UndefOr[Logger] = js.native
  /**
    * Prefer to revalidate cache entries, even when it would not be strictly
    * necessary. Default `false`.
    */
  var preferOnline: js.UndefOr[Boolean] = js.native
  /**
    * The npm registry to use by default. Defaults to
    * `https://registry.npmjs.org/`.
    */
  var registry: js.UndefOr[String] = js.native
  /**
    * Shortcut for looking up resolved values. Should be specified if known.
    */
  var resolved: js.UndefOr[String] = js.native
  /**
    * Permission mode mask for extracted files and directories. Defaults to
    * `0o22`.
    */
  var umask: js.UndefOr[Double] = js.native
  /**
    * Base folder for resolving relative `file:` dependencies.
    */
  var where: js.UndefOr[String] = js.native
}

object PacoteOptions {
  @scala.inline
  def apply(): PacoteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PacoteOptions]
  }
  @scala.inline
  implicit class PacoteOptionsOps[Self <: PacoteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBefore(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(null)
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
    def withDefaultTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTag")(js.undefined)
        ret
    }
    @scala.inline
    def withDmode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDmode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dmode")(js.undefined)
        ret
    }
    @scala.inline
    def withFmode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFmode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fmode")(js.undefined)
        ret
    }
    @scala.inline
    def withFullMetadata(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegrity(value: String | Integrity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegrity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrity")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: Logger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferOnline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferOnline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferOnline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferOnline")(js.undefined)
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
    def withResolved(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolved")(js.undefined)
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
    def withWhere(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhere: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(js.undefined)
        ret
    }
  }
  
}

