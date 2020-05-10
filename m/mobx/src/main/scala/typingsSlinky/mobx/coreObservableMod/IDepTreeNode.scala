package typingsSlinky.mobx.coreObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDepTreeNode extends js.Object {
  var name: String = js.native
  var observing: js.UndefOr[js.Array[IObservable]] = js.native
}

object IDepTreeNode {
  @scala.inline
  def apply(name: String): IDepTreeNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDepTreeNode]
  }
  @scala.inline
  implicit class IDepTreeNodeOps[Self <: IDepTreeNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObserving(value: js.Array[IObservable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObserving: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observing")(js.undefined)
        ret
    }
  }
  
}

