package typingsSlinky.nodeForge.mod.pkcs12

import typingsSlinky.nodeForge.anon.Dictkey
import typingsSlinky.nodeForge.anon.Encrypted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pkcs12Pfx extends js.Object {
  var safeContents: js.Array[Encrypted] = js.native
  var version: String = js.native
  def getBags(filter: BagsFilter): Dictkey = js.native
  def getBagsByFriendlyName(fiendlyName: String, bagType: String): js.Array[Bag] = js.native
  def getBagsByLocalKeyId(localKeyId: String, bagType: String): js.Array[Bag] = js.native
}

object Pkcs12Pfx {
  @scala.inline
  def apply(
    getBags: BagsFilter => Dictkey,
    getBagsByFriendlyName: (String, String) => js.Array[Bag],
    getBagsByLocalKeyId: (String, String) => js.Array[Bag],
    safeContents: js.Array[Encrypted],
    version: String
  ): Pkcs12Pfx = {
    val __obj = js.Dynamic.literal(getBags = js.Any.fromFunction1(getBags), getBagsByFriendlyName = js.Any.fromFunction2(getBagsByFriendlyName), getBagsByLocalKeyId = js.Any.fromFunction2(getBagsByLocalKeyId), safeContents = safeContents.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pkcs12Pfx]
  }
  @scala.inline
  implicit class Pkcs12PfxOps[Self <: Pkcs12Pfx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetBags(value: BagsFilter => Dictkey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBags")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetBagsByFriendlyName(value: (String, String) => js.Array[Bag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBagsByFriendlyName")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetBagsByLocalKeyId(value: (String, String) => js.Array[Bag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBagsByLocalKeyId")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSafeContents(value: js.Array[Encrypted]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeContents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

