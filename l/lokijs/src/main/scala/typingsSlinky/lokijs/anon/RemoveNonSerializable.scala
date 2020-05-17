package typingsSlinky.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveNonSerializable extends js.Object {
  var removeNonSerializable: js.UndefOr[Boolean] = js.native
}

object RemoveNonSerializable {
  @scala.inline
  def apply(): RemoveNonSerializable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveNonSerializable]
  }
  @scala.inline
  implicit class RemoveNonSerializableOps[Self <: RemoveNonSerializable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoveNonSerializable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeNonSerializable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveNonSerializable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeNonSerializable")(js.undefined)
        ret
    }
  }
  
}

