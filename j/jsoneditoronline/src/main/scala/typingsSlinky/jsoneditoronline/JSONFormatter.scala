package typingsSlinky.jsoneditoronline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONFormatter extends js.Object {
  def get(): js.Object = js.native
  def getText(): String = js.native
  def onError(err: String): Unit = js.native
  def set(json: js.Object): Unit = js.native
  def setText(jsonString: String): Unit = js.native
}

object JSONFormatter {
  @scala.inline
  def apply(
    get: () => js.Object,
    getText: () => String,
    onError: String => Unit,
    set: js.Object => Unit,
    setText: String => Unit
  ): JSONFormatter = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), getText = js.Any.fromFunction0(getText), onError = js.Any.fromFunction1(onError), set = js.Any.fromFunction1(set), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[JSONFormatter]
  }
  @scala.inline
  implicit class JSONFormatterOps[Self <: JSONFormatter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnError(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

