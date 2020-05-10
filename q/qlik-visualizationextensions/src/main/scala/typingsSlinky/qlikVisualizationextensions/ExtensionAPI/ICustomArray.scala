package typingsSlinky.qlikVisualizationextensions.ExtensionAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomArray extends ICustomControl {
  var addTranslation: String = js.native
  var allowAdd: Boolean = js.native
  var allowMove: Boolean = js.native
  var allowRemove: Boolean = js.native
  var itemTitleRef: String = js.native
}

object ICustomArray {
  @scala.inline
  def apply(
    addTranslation: String,
    allowAdd: Boolean,
    allowMove: Boolean,
    allowRemove: Boolean,
    itemTitleRef: String,
    label: String,
    ref: String,
    `type`: String
  ): ICustomArray = {
    val __obj = js.Dynamic.literal(addTranslation = addTranslation.asInstanceOf[js.Any], allowAdd = allowAdd.asInstanceOf[js.Any], allowMove = allowMove.asInstanceOf[js.Any], allowRemove = allowRemove.asInstanceOf[js.Any], itemTitleRef = itemTitleRef.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomArray]
  }
  @scala.inline
  implicit class ICustomArrayOps[Self <: ICustomArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddTranslation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTranslation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowAdd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowRemove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemTitleRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTitleRef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

