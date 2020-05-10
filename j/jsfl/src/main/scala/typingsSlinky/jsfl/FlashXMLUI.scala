package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashXMLUI extends js.Object {
  def accept(): js.Any = js.native
  def cancel(): js.Any = js.native
  def get(): js.Any = js.native
  def getControlItemElement(): js.Any = js.native
  def getEnabled(): js.Any = js.native
  def getVisible(): js.Any = js.native
  def set(): js.Any = js.native
  def setControItemElement(): js.Any = js.native
  def setControItemElements(): js.Any = js.native
  def setEnabled(): js.Any = js.native
  def setVisible(): js.Any = js.native
}

object FlashXMLUI {
  @scala.inline
  def apply(
    accept: () => js.Any,
    cancel: () => js.Any,
    get: () => js.Any,
    getControlItemElement: () => js.Any,
    getEnabled: () => js.Any,
    getVisible: () => js.Any,
    set: () => js.Any,
    setControItemElement: () => js.Any,
    setControItemElements: () => js.Any,
    setEnabled: () => js.Any,
    setVisible: () => js.Any
  ): FlashXMLUI = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), cancel = js.Any.fromFunction0(cancel), get = js.Any.fromFunction0(get), getControlItemElement = js.Any.fromFunction0(getControlItemElement), getEnabled = js.Any.fromFunction0(getEnabled), getVisible = js.Any.fromFunction0(getVisible), set = js.Any.fromFunction0(set), setControItemElement = js.Any.fromFunction0(setControItemElement), setControItemElements = js.Any.fromFunction0(setControItemElements), setEnabled = js.Any.fromFunction0(setEnabled), setVisible = js.Any.fromFunction0(setVisible))
    __obj.asInstanceOf[FlashXMLUI]
  }
  @scala.inline
  implicit class FlashXMLUIOps[Self <: FlashXMLUI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCancel(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetControlItemElement(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getControlItemElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEnabled(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVisible(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetControItemElement(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setControItemElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetControItemElements(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setControItemElements")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetEnabled(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetVisible(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVisible")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

