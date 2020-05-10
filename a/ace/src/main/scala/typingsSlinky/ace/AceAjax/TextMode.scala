package typingsSlinky.ace.AceAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextMode extends js.Object {
  def autoOutdent(state: js.Any, doc: js.Any, row: js.Any): Unit = js.native
  def checkOutdent(state: js.Any, line: js.Any, input: js.Any): Boolean = js.native
  def createModeDelegates(mapping: js.Any): Unit = js.native
  def createWorker(session: js.Any): js.Any = js.native
  def getNextLineIndent(state: js.Any, line: js.Any, tab: js.Any): String = js.native
  def getTokenizer(): js.Any = js.native
  def toggleCommentLines(state: js.Any, doc: js.Any, startRow: js.Any, endRow: js.Any): Unit = js.native
  def transformAction(state: js.Any, action: js.Any, editor: js.Any, session: js.Any, param: js.Any): js.Any = js.native
}

object TextMode {
  @scala.inline
  def apply(
    autoOutdent: (js.Any, js.Any, js.Any) => Unit,
    checkOutdent: (js.Any, js.Any, js.Any) => Boolean,
    createModeDelegates: js.Any => Unit,
    createWorker: js.Any => js.Any,
    getNextLineIndent: (js.Any, js.Any, js.Any) => String,
    getTokenizer: () => js.Any,
    toggleCommentLines: (js.Any, js.Any, js.Any, js.Any) => Unit,
    transformAction: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any
  ): TextMode = {
    val __obj = js.Dynamic.literal(autoOutdent = js.Any.fromFunction3(autoOutdent), checkOutdent = js.Any.fromFunction3(checkOutdent), createModeDelegates = js.Any.fromFunction1(createModeDelegates), createWorker = js.Any.fromFunction1(createWorker), getNextLineIndent = js.Any.fromFunction3(getNextLineIndent), getTokenizer = js.Any.fromFunction0(getTokenizer), toggleCommentLines = js.Any.fromFunction4(toggleCommentLines), transformAction = js.Any.fromFunction5(transformAction))
    __obj.asInstanceOf[TextMode]
  }
  @scala.inline
  implicit class TextModeOps[Self <: TextMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoOutdent(value: (js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoOutdent")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCheckOutdent(value: (js.Any, js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkOutdent")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCreateModeDelegates(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createModeDelegates")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateWorker(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createWorker")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNextLineIndent(value: (js.Any, js.Any, js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNextLineIndent")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetTokenizer(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTokenizer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToggleCommentLines(value: (js.Any, js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleCommentLines")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withTransformAction(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformAction")(js.Any.fromFunction5(value))
        ret
    }
  }
  
}

