package typingsSlinky.ace.AceAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Split extends js.Object {
  /**
    * Blurs the current editor.
    **/
  def blur(): Unit = js.native
  /**
    * Focuses the current editor.
    **/
  def focus(): Unit = js.native
  /**
    * Executes `callback` on all of the available editors.
    * @param callback A callback function to execute
    * @param scope The default scope for the callback
    **/
  def forEach(callback: js.Function, scope: String): Unit = js.native
  /**
    * Returns the current editor.
    **/
  def getCurrentEditor(): Editor = js.native
  /**
    * Returns the editor identified by the index `idx`.
    * @param idx The index of the editor you want
    **/
  def getEditor(idx: Double): Unit = js.native
  /**
    * Returns the orientation.
    **/
  def getOrientation(): Double = js.native
  /**
    * Returns the number of splits.
    **/
  def getSplits(): Double = js.native
  /**
    * Resizes the editor.
    **/
  def resize(): Unit = js.native
  /**
    * Sets the font size, in pixels, for all the available editors.
    * @param size The new font size
    **/
  def setFontSize(size: Double): Unit = js.native
  /**
    * Sets the keyboard handler for the editor.
    * @param keybinding
    **/
  def setKeyboardHandler(keybinding: String): Unit = js.native
  /**
    * Sets the orientation.
    * @param orientation The new orientation value
    **/
  def setOrientation(orientation: Double): Unit = js.native
  /**
    * Sets a new [[EditSession `EditSession`]] for the indicated editor.
    * @param session The new edit session
    * @param idx The editor's index you're interested in
    **/
  def setSession(session: IEditSession, idx: Double): Unit = js.native
  /**
    * Sets a theme for each of the available editors.
    * @param theme The name of the theme to set
    **/
  def setTheme(theme: String): Unit = js.native
}

object Split {
  @scala.inline
  def apply(
    blur: () => Unit,
    focus: () => Unit,
    forEach: (js.Function, String) => Unit,
    getCurrentEditor: () => Editor,
    getEditor: Double => Unit,
    getOrientation: () => Double,
    getSplits: () => Double,
    resize: () => Unit,
    setFontSize: Double => Unit,
    setKeyboardHandler: String => Unit,
    setOrientation: Double => Unit,
    setSession: (IEditSession, Double) => Unit,
    setTheme: String => Unit
  ): Split = {
    val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction0(focus), forEach = js.Any.fromFunction2(forEach), getCurrentEditor = js.Any.fromFunction0(getCurrentEditor), getEditor = js.Any.fromFunction1(getEditor), getOrientation = js.Any.fromFunction0(getOrientation), getSplits = js.Any.fromFunction0(getSplits), resize = js.Any.fromFunction0(resize), setFontSize = js.Any.fromFunction1(setFontSize), setKeyboardHandler = js.Any.fromFunction1(setKeyboardHandler), setOrientation = js.Any.fromFunction1(setOrientation), setSession = js.Any.fromFunction2(setSession), setTheme = js.Any.fromFunction1(setTheme))
    __obj.asInstanceOf[Split]
  }
  @scala.inline
  implicit class SplitOps[Self <: Split] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlur(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withForEach(value: (js.Function, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetCurrentEditor(value: () => Editor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentEditor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEditor(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEditor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetOrientation(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOrientation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSplits(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSplits")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetFontSize(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFontSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetKeyboardHandler(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setKeyboardHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOrientation(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOrientation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSession(value: (IEditSession, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSession")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetTheme(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTheme")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

