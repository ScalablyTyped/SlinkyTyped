package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModelChangedEvent extends js.Object {
  /**
    * The `uri` of the new model or null.
    */
  val newModelUrl: Uri | Null = js.native
  /**
    * The `uri` of the previous model or null.
    */
  val oldModelUrl: Uri | Null = js.native
}

object IModelChangedEvent {
  @scala.inline
  def apply(): IModelChangedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModelChangedEvent]
  }
  @scala.inline
  implicit class IModelChangedEventOps[Self <: IModelChangedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewModelUrl(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newModelUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewModelUrlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newModelUrl")(null)
        ret
    }
    @scala.inline
    def withOldModelUrl(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldModelUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldModelUrlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldModelUrl")(null)
        ret
    }
  }
  
}

