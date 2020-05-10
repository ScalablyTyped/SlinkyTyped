package typingsSlinky.nodemailer.dkimMod

import typingsSlinky.nodemailer.nodemailerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionalOptions extends js.Object {
  /** optional location for cached messages. If not set then caching is not used. */
  var cacheDir: js.UndefOr[String | `false`] = js.native
  /** optional size in bytes, if message is larger than this treshold it gets cached to disk (assuming cacheDir is set and writable). Defaults to 131072 (128 kB). */
  var cacheTreshold: js.UndefOr[Double] = js.native
  /** optional algorithm for the body hash, defaults to ‘sha256’ */
  var hashAlgo: js.UndefOr[String] = js.native
  /** an optional colon separated list of header keys to sign (eg. message-id:date:from:to...') */
  var headerFieldNames: js.UndefOr[String] = js.native
  /** optional colon separated list of header keys not to sign. This is useful if you want to sign all the relevant keys but your provider changes some values, ie Message-ID and Date. In this case you should use 'message-id:date' to prevent signing these values. */
  var skipFields: js.UndefOr[String] = js.native
}

object OptionalOptions {
  @scala.inline
  def apply(): OptionalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalOptions]
  }
  @scala.inline
  implicit class OptionalOptionsOps[Self <: OptionalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheDir(value: String | `false`): Self = {
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
    def withCacheTreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheTreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheTreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheTreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withHashAlgo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashAlgo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashAlgo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashAlgo")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFieldNames(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFieldNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderFieldNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFieldNames")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipFields")(js.undefined)
        ret
    }
  }
  
}

