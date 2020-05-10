package typingsSlinky.jsoneditoronline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONEditorBuffer extends js.Object {
  var text: String = js.native
  def flush(): String = js.native
  def set(text: String): Unit = js.native
}

object JSONEditorBuffer {
  @scala.inline
  def apply(flush: () => String, set: String => Unit, text: String): JSONEditorBuffer = {
    val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush), set = js.Any.fromFunction1(set), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONEditorBuffer]
  }
  @scala.inline
  implicit class JSONEditorBufferOps[Self <: JSONEditorBuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlush(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

