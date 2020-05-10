package typingsSlinky.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item extends js.Object {
  var data: js.Object = js.native
  def destroy(callback: CbCallback): Unit = js.native
  def refresh(callback: CbCallback): Unit = js.native
  def save(callback: CbCallback): Unit = js.native
}

object Item {
  @scala.inline
  def apply(
    data: js.Object,
    destroy: CbCallback => Unit,
    refresh: CbCallback => Unit,
    save: CbCallback => Unit
  ): Item = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], destroy = js.Any.fromFunction1(destroy), refresh = js.Any.fromFunction1(refresh), save = js.Any.fromFunction1(save))
    __obj.asInstanceOf[Item]
  }
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroy(value: CbCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRefresh(value: CbCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSave(value: CbCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

