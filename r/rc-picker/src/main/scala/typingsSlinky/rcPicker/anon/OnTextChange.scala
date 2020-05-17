package typingsSlinky.rcPicker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnTextChange extends js.Object {
  /** Must useMemo, to assume that `valueTexts` only match on the first change */
  var valueTexts: js.Array[String] = js.native
  def onTextChange(text: String): Unit = js.native
}

object OnTextChange {
  @scala.inline
  def apply(onTextChange: String => Unit, valueTexts: js.Array[String]): OnTextChange = {
    val __obj = js.Dynamic.literal(onTextChange = js.Any.fromFunction1(onTextChange), valueTexts = valueTexts.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnTextChange]
  }
  @scala.inline
  implicit class OnTextChangeOps[Self <: OnTextChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnTextChange(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTextChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValueTexts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueTexts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

