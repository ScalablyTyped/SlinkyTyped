package typingsSlinky.lzmaNative.mod

import typingsSlinky.lzmaNative.lzmaNativeStrings.CONCATENATED
import typingsSlinky.lzmaNative.lzmaNativeStrings.TELL_ANY_CHECK
import typingsSlinky.lzmaNative.lzmaNativeStrings.TELL_NO_CHECK
import typingsSlinky.lzmaNative.lzmaNativeStrings.TELL_UNSUPPORTED_CHECK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LzmaOptions extends js.Object {
  var blockSize: js.UndefOr[Double] = js.native
  var bufsize: js.UndefOr[Double] = js.native
  var check: js.UndefOr[Check] = js.native
  var flags: js.UndefOr[TELL_NO_CHECK | TELL_UNSUPPORTED_CHECK | TELL_ANY_CHECK | CONCATENATED] = js.native
  var memlimit: js.UndefOr[Double] = js.native
  var preset: js.UndefOr[Preset] = js.native
  var synchronous: js.UndefOr[Boolean] = js.native
  var threads: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object LzmaOptions {
  @scala.inline
  def apply(): LzmaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LzmaOptions]
  }
  @scala.inline
  implicit class LzmaOptionsOps[Self <: LzmaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBufsize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufsize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufsize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufsize")(js.undefined)
        ret
    }
    @scala.inline
    def withCheck(value: Check): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(js.undefined)
        ret
    }
    @scala.inline
    def withFlags(value: TELL_NO_CHECK | TELL_UNSUPPORTED_CHECK | TELL_ANY_CHECK | CONCATENATED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(js.undefined)
        ret
    }
    @scala.inline
    def withMemlimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memlimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemlimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memlimit")(js.undefined)
        ret
    }
    @scala.inline
    def withPreset(value: Preset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(js.undefined)
        ret
    }
    @scala.inline
    def withSynchronous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSynchronous: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronous")(js.undefined)
        ret
    }
    @scala.inline
    def withThreads(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threads")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
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

