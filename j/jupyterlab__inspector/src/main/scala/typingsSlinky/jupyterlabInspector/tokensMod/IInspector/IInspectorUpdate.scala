package typingsSlinky.jupyterlabInspector.tokensMod.IInspector

import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An update value for code inspectors.
  */
@js.native
trait IInspectorUpdate extends js.Object {
  /**
    * The content being sent to the inspector for display.
    */
  var content: Widget | Null = js.native
}

object IInspectorUpdate {
  @scala.inline
  def apply(): IInspectorUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInspectorUpdate]
  }
  @scala.inline
  implicit class IInspectorUpdateOps[Self <: IInspectorUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: Widget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(null)
        ret
    }
  }
  
}

