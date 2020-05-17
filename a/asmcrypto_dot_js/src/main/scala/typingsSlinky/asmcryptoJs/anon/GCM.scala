package typingsSlinky.asmcryptoJs.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.asmcryptoJs.asmcryptoJsNumbers.`0`
import typingsSlinky.asmcryptoJs.asmcryptoJsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GCM extends /* key */ StringDictionary[Double] {
  var CBC: `0` = js.native
  var GCM: `1` = js.native
}

object GCM {
  @scala.inline
  def apply(CBC: `0`, GCM: `1`): GCM = {
    val __obj = js.Dynamic.literal(CBC = CBC.asInstanceOf[js.Any], GCM = GCM.asInstanceOf[js.Any])
    __obj.asInstanceOf[GCM]
  }
  @scala.inline
  implicit class GCMOps[Self <: GCM] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCBC(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CBC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGCM(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GCM")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

