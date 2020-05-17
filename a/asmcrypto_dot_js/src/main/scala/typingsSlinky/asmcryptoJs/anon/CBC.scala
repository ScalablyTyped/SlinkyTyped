package typingsSlinky.asmcryptoJs.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.asmcryptoJs.asmcryptoJsNumbers.`1`
import typingsSlinky.asmcryptoJs.asmcryptoJsNumbers.`3`
import typingsSlinky.asmcryptoJs.asmcryptoJsNumbers.`5`
import typingsSlinky.asmcryptoJs.asmcryptoJsNumbers.`6`
import typingsSlinky.asmcryptoJs.asmcryptoJsNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CBC extends /* key */ StringDictionary[Double] {
  var CBC: `3` = js.native
  var CFB: `5` = js.native
  var CTR: `7` = js.native
  var ECB: `1` = js.native
  var OFB: `6` = js.native
}

object CBC {
  @scala.inline
  def apply(CBC: `3`, CFB: `5`, CTR: `7`, ECB: `1`, OFB: `6`): CBC = {
    val __obj = js.Dynamic.literal(CBC = CBC.asInstanceOf[js.Any], CFB = CFB.asInstanceOf[js.Any], CTR = CTR.asInstanceOf[js.Any], ECB = ECB.asInstanceOf[js.Any], OFB = OFB.asInstanceOf[js.Any])
    __obj.asInstanceOf[CBC]
  }
  @scala.inline
  implicit class CBCOps[Self <: CBC] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCBC(value: `3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CBC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCFB(value: `5`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CFB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCTR(value: `7`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CTR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withECB(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ECB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOFB(value: `6`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OFB")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

