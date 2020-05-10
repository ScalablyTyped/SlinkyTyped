package typingsSlinky.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait eventInfo extends js.Object {
  var data: js.Any = js.native
  var editor: typingsSlinky.ckeditor.CKEDITOR.editor = js.native
  var listenerData: js.Any = js.native
  var name: String = js.native
  var sender: StringDictionary[js.Any] = js.native
  def cancel(): Unit = js.native
  def removeListener(): Unit = js.native
  def stop(): Unit = js.native
}

object eventInfo {
  @scala.inline
  def apply(
    cancel: () => Unit,
    data: js.Any,
    editor: editor,
    listenerData: js.Any,
    name: String,
    removeListener: () => Unit,
    sender: StringDictionary[js.Any],
    stop: () => Unit
  ): eventInfo = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), data = data.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], listenerData = listenerData.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], removeListener = js.Any.fromFunction0(removeListener), sender = sender.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[eventInfo]
  }
  @scala.inline
  implicit class eventInfoOps[Self <: eventInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditor(value: editor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListenerData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listenerData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveListener(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeListener")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSender(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

