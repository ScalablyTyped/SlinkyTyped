package typingsSlinky.jsoneditoronline

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONEditorNode extends js.Object {
  var types: js.Array[JSONEditorNodeType] = js.native
  def appendChild(node: JSONEditorNode): Unit = js.native
  def blur(): Unit = js.native
  def changeType(newType: String): Unit = js.native
  def clearDom(): Unit = js.native
  def collapse(recurse: Boolean): Unit = js.native
  def containsNode(node: JSONEditorNode): Boolean = js.native
  def expand(recurse: Boolean): Unit = js.native
  def focus(): Unit = js.native
  def getAppend(): HTMLElement = js.native
  def getDom(): HTMLElement = js.native
  def getField(): String = js.native
  def getLevel(): Double = js.native
  def getParent(): JSONEditorNode = js.native
  def getValue(): js.Any = js.native
  def hide(): Unit = js.native
  def hideChilds(): Unit = js.native
  def insertBefore(node: JSONEditorNode, beforeNode: JSONEditorNode): Unit = js.native
  def moveBefore(node: JSONEditorNode, beforeNode: JSONEditorNode): Unit = js.native
  def moveTo(node: JSONEditorNode, index: Double): Unit = js.native
  def onEvent(event: Event): Unit = js.native
  def removeChild(node: JSONEditorNode): JSONEditorNode = js.native
  def scrollTo(): Unit = js.native
  def search(text: String): js.Array[JSONEditorNode] = js.native
  def setField(field: String, fieldEditable: Boolean): Unit = js.native
  def setHighlight(highlight: Boolean): Unit = js.native
  def setParent(parent: JSONEditorNode): Unit = js.native
  def setValue(value: js.Any): Unit = js.native
  def showChilds(): Unit = js.native
  def updateDom(): Unit = js.native
  def updateField(field: String): Unit = js.native
  def updateValue(value: js.Any): Unit = js.native
}

object JSONEditorNode {
  @scala.inline
  def apply(
    appendChild: JSONEditorNode => Unit,
    blur: () => Unit,
    changeType: String => Unit,
    clearDom: () => Unit,
    collapse: Boolean => Unit,
    containsNode: JSONEditorNode => Boolean,
    expand: Boolean => Unit,
    focus: () => Unit,
    getAppend: () => HTMLElement,
    getDom: () => HTMLElement,
    getField: () => String,
    getLevel: () => Double,
    getParent: () => JSONEditorNode,
    getValue: () => js.Any,
    hide: () => Unit,
    hideChilds: () => Unit,
    insertBefore: (JSONEditorNode, JSONEditorNode) => Unit,
    moveBefore: (JSONEditorNode, JSONEditorNode) => Unit,
    moveTo: (JSONEditorNode, Double) => Unit,
    onEvent: Event => Unit,
    removeChild: JSONEditorNode => JSONEditorNode,
    scrollTo: () => Unit,
    search: String => js.Array[JSONEditorNode],
    setField: (String, Boolean) => Unit,
    setHighlight: Boolean => Unit,
    setParent: JSONEditorNode => Unit,
    setValue: js.Any => Unit,
    showChilds: () => Unit,
    types: js.Array[JSONEditorNodeType],
    updateDom: () => Unit,
    updateField: String => Unit,
    updateValue: js.Any => Unit
  ): JSONEditorNode = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), blur = js.Any.fromFunction0(blur), changeType = js.Any.fromFunction1(changeType), clearDom = js.Any.fromFunction0(clearDom), collapse = js.Any.fromFunction1(collapse), containsNode = js.Any.fromFunction1(containsNode), expand = js.Any.fromFunction1(expand), focus = js.Any.fromFunction0(focus), getAppend = js.Any.fromFunction0(getAppend), getDom = js.Any.fromFunction0(getDom), getField = js.Any.fromFunction0(getField), getLevel = js.Any.fromFunction0(getLevel), getParent = js.Any.fromFunction0(getParent), getValue = js.Any.fromFunction0(getValue), hide = js.Any.fromFunction0(hide), hideChilds = js.Any.fromFunction0(hideChilds), insertBefore = js.Any.fromFunction2(insertBefore), moveBefore = js.Any.fromFunction2(moveBefore), moveTo = js.Any.fromFunction2(moveTo), onEvent = js.Any.fromFunction1(onEvent), removeChild = js.Any.fromFunction1(removeChild), scrollTo = js.Any.fromFunction0(scrollTo), search = js.Any.fromFunction1(search), setField = js.Any.fromFunction2(setField), setHighlight = js.Any.fromFunction1(setHighlight), setParent = js.Any.fromFunction1(setParent), setValue = js.Any.fromFunction1(setValue), showChilds = js.Any.fromFunction0(showChilds), types = types.asInstanceOf[js.Any], updateDom = js.Any.fromFunction0(updateDom), updateField = js.Any.fromFunction1(updateField), updateValue = js.Any.fromFunction1(updateValue))
    __obj.asInstanceOf[JSONEditorNode]
  }
  @scala.inline
  implicit class JSONEditorNodeOps[Self <: JSONEditorNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendChild(value: JSONEditorNode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBlur(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withChangeType(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClearDom(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearDom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCollapse(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContainsNode(value: JSONEditorNode => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExpand(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAppend(value: () => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAppend")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDom(value: () => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetField(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getField")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLevel(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLevel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParent(value: () => JSONEditorNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValue(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHideChilds(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideChilds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInsertBefore(value: (JSONEditorNode, JSONEditorNode) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMoveBefore(value: (JSONEditorNode, JSONEditorNode) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveBefore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMoveTo(value: (JSONEditorNode, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveTo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnEvent(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveChild(value: JSONEditorNode => JSONEditorNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScrollTo(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSearch(value: String => js.Array[JSONEditorNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetField(value: (String, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setField")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetHighlight(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHighlight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetParent(value: JSONEditorNode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValue(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowChilds(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showChilds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[JSONEditorNodeType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateDom(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateField(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateField")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateValue(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateValue")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

