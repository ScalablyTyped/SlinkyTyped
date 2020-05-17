package typingsSlinky.asmcryptoJs.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.asmcryptoJs.asmcryptoJsNumbers.`0`
import typingsSlinky.asmcryptoJs.asmcryptoJsNumbers.`2`
import typingsSlinky.asmcryptoJs.asmcryptoJsNumbers.`4`
import typingsSlinky.asmcryptoJs.asmcryptoJsNumbers.`6`
import typingsSlinky.asmcryptoJs.asmcryptoJsNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictkey extends /* key */ StringDictionary[Double] {
  var CBC: `2` = js.native
  var CFB: `4` = js.native
  var CTR: `7` = js.native
  var ECB: `0` = js.native
  var OFB: `6` = js.native
}

object Dictkey {
  @scala.inline
  def apply(CBC: `2`, CFB: `4`, CTR: `7`, ECB: `0`, OFB: `6`): Dictkey = {
    val __obj = js.Dynamic.literal(CBC = CBC.asInstanceOf[js.Any], CFB = CFB.asInstanceOf[js.Any], CTR = CTR.asInstanceOf[js.Any], ECB = ECB.asInstanceOf[js.Any], OFB = OFB.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  @scala.inline
  implicit class DictkeyOps[Self <: Dictkey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCBC(value: `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CBC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCFB(value: `4`): Self = {
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
    def withECB(value: `0`): Self = {
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

