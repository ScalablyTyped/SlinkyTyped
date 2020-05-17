package typingsSlinky.autolinker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnCloseTag extends js.Object {
  def onCloseTag(tagName: String, offset: Double): Unit = js.native
  def onComment(offset: Double): Unit = js.native
  def onDoctype(offset: Double): Unit = js.native
  def onOpenTag(tagName: String, offset: Double): Unit = js.native
  def onText(text: String, offset: Double): Unit = js.native
}

object OnCloseTag {
  @scala.inline
  def apply(
    onCloseTag: (String, Double) => Unit,
    onComment: Double => Unit,
    onDoctype: Double => Unit,
    onOpenTag: (String, Double) => Unit,
    onText: (String, Double) => Unit
  ): OnCloseTag = {
    val __obj = js.Dynamic.literal(onCloseTag = js.Any.fromFunction2(onCloseTag), onComment = js.Any.fromFunction1(onComment), onDoctype = js.Any.fromFunction1(onDoctype), onOpenTag = js.Any.fromFunction2(onOpenTag), onText = js.Any.fromFunction2(onText))
    __obj.asInstanceOf[OnCloseTag]
  }
  @scala.inline
  implicit class OnCloseTagOps[Self <: OnCloseTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnCloseTag(value: (String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseTag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnComment(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnDoctype(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoctype")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnOpenTag(value: (String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenTag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnText(value: (String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onText")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

