package typingsSlinky.ffiNapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRTLDDEFAUL extends js.Object {
  var RTLD_DEFAUL: Buffer = js.native
  var RTLD_GLOBAL: Double = js.native
  var RTLD_LAZY: Double = js.native
  var RTLD_LOCAL: Double = js.native
  var RTLD_NEXT: Buffer = js.native
  var RTLD_NODELETE: Double = js.native
  var RTLD_NOLOAD: Double = js.native
  var RTLD_NOW: Double = js.native
}

object AnonRTLDDEFAUL {
  @scala.inline
  def apply(
    RTLD_DEFAUL: Buffer,
    RTLD_GLOBAL: Double,
    RTLD_LAZY: Double,
    RTLD_LOCAL: Double,
    RTLD_NEXT: Buffer,
    RTLD_NODELETE: Double,
    RTLD_NOLOAD: Double,
    RTLD_NOW: Double
  ): AnonRTLDDEFAUL = {
    val __obj = js.Dynamic.literal(RTLD_DEFAUL = RTLD_DEFAUL.asInstanceOf[js.Any], RTLD_GLOBAL = RTLD_GLOBAL.asInstanceOf[js.Any], RTLD_LAZY = RTLD_LAZY.asInstanceOf[js.Any], RTLD_LOCAL = RTLD_LOCAL.asInstanceOf[js.Any], RTLD_NEXT = RTLD_NEXT.asInstanceOf[js.Any], RTLD_NODELETE = RTLD_NODELETE.asInstanceOf[js.Any], RTLD_NOLOAD = RTLD_NOLOAD.asInstanceOf[js.Any], RTLD_NOW = RTLD_NOW.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRTLDDEFAUL]
  }
  @scala.inline
  implicit class AnonRTLDDEFAULOps[Self <: AnonRTLDDEFAUL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRTLD_DEFAUL(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RTLD_DEFAUL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRTLD_GLOBAL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RTLD_GLOBAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRTLD_LAZY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RTLD_LAZY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRTLD_LOCAL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RTLD_LOCAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRTLD_NEXT(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RTLD_NEXT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRTLD_NODELETE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RTLD_NODELETE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRTLD_NOLOAD(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RTLD_NOLOAD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRTLD_NOW(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RTLD_NOW")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

