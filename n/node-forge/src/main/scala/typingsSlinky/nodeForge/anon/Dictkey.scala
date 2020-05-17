package typingsSlinky.nodeForge.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodeForge.mod.pkcs12.Bag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictkey
  extends /* key */ StringDictionary[js.UndefOr[js.Array[Bag]]] {
  var friendlyName: js.UndefOr[js.Array[Bag]] = js.native
  var localKeyId: js.UndefOr[js.Array[Bag]] = js.native
}

object Dictkey {
  @scala.inline
  def apply(): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictkey]
  }
  @scala.inline
  implicit class DictkeyOps[Self <: Dictkey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFriendlyName(value: js.Array[Bag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFriendlyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalKeyId(value: js.Array[Bag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localKeyId")(js.undefined)
        ret
    }
  }
  
}

