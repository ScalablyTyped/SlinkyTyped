package typingsSlinky.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorProvider extends js.Object {
  def attachErrorEvents(errorShowing: js.Object, errorShown: js.Object, errorHidden: js.Object): Unit = js.native
  /**
  	 * Create handlers cache
  	 *
  	 * @param callbacks
  	 * @param key
  	 * @param editorOptions
  	 * @param tabIndex
  	 * @param format
  	 * @param element
  	 */
  def createEditor(
    callbacks: js.Object,
    key: js.Object,
    editorOptions: js.Object,
    tabIndex: js.Object,
    format: js.Object,
    element: js.Object
  ): Unit = js.native
  def destroy(): Unit = js.native
  def getEditor(): Unit = js.native
  def getValue(): Unit = js.native
  def isValid(): Unit = js.native
  def keyDown(evt: js.Object, ui: js.Object): Unit = js.native
  def refreshValue(): Unit = js.native
  def removeFromParent(): Unit = js.native
  def requestValidate(evt: js.Object): Unit = js.native
  def setFocus(toggle: js.Object): Unit = js.native
  def setSize(width: js.Object, height: js.Object): Unit = js.native
  def setValue(`val`: js.Object): Unit = js.native
  def validate(): Unit = js.native
  def validator(): Unit = js.native
}

object EditorProvider {
  @scala.inline
  def apply(
    attachErrorEvents: (js.Object, js.Object, js.Object) => Unit,
    createEditor: (js.Object, js.Object, js.Object, js.Object, js.Object, js.Object) => Unit,
    destroy: () => Unit,
    getEditor: () => Unit,
    getValue: () => Unit,
    isValid: () => Unit,
    keyDown: (js.Object, js.Object) => Unit,
    refreshValue: () => Unit,
    removeFromParent: () => Unit,
    requestValidate: js.Object => Unit,
    setFocus: js.Object => Unit,
    setSize: (js.Object, js.Object) => Unit,
    setValue: js.Object => Unit,
    validate: () => Unit,
    validator: () => Unit
  ): EditorProvider = {
    val __obj = js.Dynamic.literal(attachErrorEvents = js.Any.fromFunction3(attachErrorEvents), createEditor = js.Any.fromFunction6(createEditor), destroy = js.Any.fromFunction0(destroy), getEditor = js.Any.fromFunction0(getEditor), getValue = js.Any.fromFunction0(getValue), isValid = js.Any.fromFunction0(isValid), keyDown = js.Any.fromFunction2(keyDown), refreshValue = js.Any.fromFunction0(refreshValue), removeFromParent = js.Any.fromFunction0(removeFromParent), requestValidate = js.Any.fromFunction1(requestValidate), setFocus = js.Any.fromFunction1(setFocus), setSize = js.Any.fromFunction2(setSize), setValue = js.Any.fromFunction1(setValue), validate = js.Any.fromFunction0(validate), validator = js.Any.fromFunction0(validator))
    __obj.asInstanceOf[EditorProvider]
  }
  @scala.inline
  implicit class EditorProviderOps[Self <: EditorProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachErrorEvents(value: (js.Object, js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachErrorEvents")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCreateEditor(value: (js.Object, js.Object, js.Object, js.Object, js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createEditor")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEditor(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEditor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValue(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsValid(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKeyDown(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyDown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRefreshValue(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveFromParent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFromParent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRequestValidate(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestValidate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFocus(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSize(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetValue(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValidate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValidator(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

