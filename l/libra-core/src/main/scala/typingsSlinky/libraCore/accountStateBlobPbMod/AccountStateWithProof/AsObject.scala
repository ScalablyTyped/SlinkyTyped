package typingsSlinky.libraCore.accountStateBlobPbMod.AccountStateWithProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var blob: js.UndefOr[typingsSlinky.libraCore.accountStateBlobPbMod.AccountStateBlob.AsObject] = js.native
  var proof: js.UndefOr[typingsSlinky.libraCore.proofPbMod.AccountStateProof.AsObject] = js.native
  var version: String = js.native
}

object AsObject {
  @scala.inline
  def apply(version: String): AsObject = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlob(value: typingsSlinky.libraCore.accountStateBlobPbMod.AccountStateBlob.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blob")(js.undefined)
        ret
    }
    @scala.inline
    def withProof(value: typingsSlinky.libraCore.proofPbMod.AccountStateProof.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proof")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProof: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proof")(js.undefined)
        ret
    }
  }
  
}

