package typingsSlinky.jsNacl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxKeyPair extends js.Object {
  var boxPk: js.typedarray.Uint8Array = js.native
  var boxSk: js.typedarray.Uint8Array = js.native
}

object BoxKeyPair {
  @scala.inline
  def apply(boxPk: js.typedarray.Uint8Array, boxSk: js.typedarray.Uint8Array): BoxKeyPair = {
    val __obj = js.Dynamic.literal(boxPk = boxPk.asInstanceOf[js.Any], boxSk = boxSk.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxKeyPair]
  }
  @scala.inline
  implicit class BoxKeyPairOps[Self <: BoxKeyPair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoxPk(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxPk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoxSk(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxSk")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

