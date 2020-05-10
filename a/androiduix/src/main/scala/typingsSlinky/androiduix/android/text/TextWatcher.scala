package typingsSlinky.androiduix.android.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextWatcher extends js.Object {
  def afterTextChanged(s: String): Unit = js.native
  def beforeTextChanged(s: String, start: Double, count: Double, after: Double): Unit = js.native
  def onTextChanged(s: String, start: Double, before: Double, count: Double): Unit = js.native
}

object TextWatcher {
  @scala.inline
  def apply(
    afterTextChanged: String => Unit,
    beforeTextChanged: (String, Double, Double, Double) => Unit,
    onTextChanged: (String, Double, Double, Double) => Unit
  ): TextWatcher = {
    val __obj = js.Dynamic.literal(afterTextChanged = js.Any.fromFunction1(afterTextChanged), beforeTextChanged = js.Any.fromFunction4(beforeTextChanged), onTextChanged = js.Any.fromFunction4(onTextChanged))
    __obj.asInstanceOf[TextWatcher]
  }
  @scala.inline
  implicit class TextWatcherOps[Self <: TextWatcher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterTextChanged(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterTextChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBeforeTextChanged(value: (String, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeTextChanged")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withOnTextChanged(value: (String, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTextChanged")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

