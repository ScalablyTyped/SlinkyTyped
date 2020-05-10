package typingsSlinky.micromatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScanOptions extends Options {
  /**
    * When `true`, the returned object will include an array of strings representing each path "segment" in the scanned glob pattern.
    * This is automatically enabled when `options.tokens` is `true`.
    *
    * @default false
    */
  var parts: js.UndefOr[Boolean] = js.native
  /**
    * When `true`, the returned object will include an array of `tokens` (objects), representing each path "segment" in the scanned glob pattern.
    *
    * @default false
    */
  var tokens: js.UndefOr[Boolean] = js.native
}

object ScanOptions {
  @scala.inline
  def apply(): ScanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanOptions]
  }
  @scala.inline
  implicit class ScanOptionsOps[Self <: ScanOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parts")(js.undefined)
        ret
    }
    @scala.inline
    def withTokens(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(js.undefined)
        ret
    }
  }
  
}

