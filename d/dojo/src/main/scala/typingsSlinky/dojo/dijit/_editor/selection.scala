package typingsSlinky.dojo.dijit._editor

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/selection.html
  *
  * Deprecated text selection API.  Will be removed in 2.0.  New code should use dijit/selection.
  * 
  */
@js.native
trait selection extends js.Object {
  /**
    * Function to collapse (clear), the current selection
    * 
    * @param beginning Indicates whether to collapse the cursor to the beginning of the selection or end.             
    */
  def collapse(beginning: Boolean): Unit = js.native
  /**
    * Return the parent element of the current selection which is of
    * type tagName (or one of the other specified tagName)
    * 
    * @param tagName The tag name to determine if it has an ancestor of.             
    */
  def getAncestorElement(tagName: String): js.Any = js.native
  /**
    * Get the parent element of the current selection
    * 
    */
  def getParentElement(): js.Any = js.native
  /**
    * Function to locate a parent node that matches one of a set of tags
    * 
    * @param node The node to inspect.             
    * @param tags             
    */
  def getParentOfType(node: HTMLElement, tags: js.Array[String]): HTMLElement = js.native
  /**
    * Retrieves the selected element (if any), just in the case that
    * a single element (object like and image or a table) is
    * selected.
    * 
    */
  def getSelectedElement(): js.Any = js.native
  /**
    * Return the html text of the current selection or null if unavailable
    * 
    */
  def getSelectedHtml(): String = js.native
  /**
    * Return the text (no html tags) included in the current selection or null if no text is selected
    * 
    */
  def getSelectedText(): String = js.native
  /**
    * Get the selection type (like win.doc.select.type in IE).
    * 
    */
  def getType(): String = js.native
  /**
    * Check whether current selection has a  parent element which is
    * of type tagName (or one of the other specified tagName)
    * 
    * @param tagName The tag name to determine if it has an ancestor of.             
    */
  def hasAncestorElement(tagName: String): Boolean = js.native
  /**
    * This function determines if 'node' is
    * in the current selection.
    * 
    * @param node             
    */
  def inSelection(node: js.Any): Boolean = js.native
  /**
    * Function to determine if a node is one of an array of tags.
    * 
    * @param node The node to inspect.             
    * @param tags             
    */
  def isTag(node: HTMLElement, tags: js.Array[String]): js.Any = js.native
  /**
    * Function to delete the currently selected content from the document.
    * 
    */
  def remove(): js.Any = js.native
  /**
    * clear previous selection and select element (including all its children)
    * 
    * @param element The element to select.             
    * @param nochangefocus               OptionalBoolean indicating if the focus should be changed.  IE only.             
    */
  def selectElement(element: HTMLElement, nochangefocus: Boolean): Unit = js.native
  /**
    * clear previous selection and select the content of the node
    * (excluding the node itself)
    * 
    * @param element The element you wish to select the children content of.             
    * @param nochangefocus               OptionalIndicates if the focus should change or not.             
    */
  def selectElementChildren(element: HTMLElement, nochangefocus: Boolean): Unit = js.native
}

object selection {
  @scala.inline
  def apply(
    collapse: Boolean => Unit,
    getAncestorElement: String => js.Any,
    getParentElement: () => js.Any,
    getParentOfType: (HTMLElement, js.Array[String]) => HTMLElement,
    getSelectedElement: () => js.Any,
    getSelectedHtml: () => String,
    getSelectedText: () => String,
    getType: () => String,
    hasAncestorElement: String => Boolean,
    inSelection: js.Any => Boolean,
    isTag: (HTMLElement, js.Array[String]) => js.Any,
    remove: () => js.Any,
    selectElement: (HTMLElement, Boolean) => Unit,
    selectElementChildren: (HTMLElement, Boolean) => Unit
  ): selection = {
    val __obj = js.Dynamic.literal(collapse = js.Any.fromFunction1(collapse), getAncestorElement = js.Any.fromFunction1(getAncestorElement), getParentElement = js.Any.fromFunction0(getParentElement), getParentOfType = js.Any.fromFunction2(getParentOfType), getSelectedElement = js.Any.fromFunction0(getSelectedElement), getSelectedHtml = js.Any.fromFunction0(getSelectedHtml), getSelectedText = js.Any.fromFunction0(getSelectedText), getType = js.Any.fromFunction0(getType), hasAncestorElement = js.Any.fromFunction1(hasAncestorElement), inSelection = js.Any.fromFunction1(inSelection), isTag = js.Any.fromFunction2(isTag), remove = js.Any.fromFunction0(remove), selectElement = js.Any.fromFunction2(selectElement), selectElementChildren = js.Any.fromFunction2(selectElementChildren))
    __obj.asInstanceOf[selection]
  }
  @scala.inline
  implicit class selectionOps[Self <: selection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapse(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAncestorElement(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAncestorElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetParentElement(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParentElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParentOfType(value: (HTMLElement, js.Array[String]) => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParentOfType")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetSelectedElement(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSelectedHtml(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedHtml")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSelectedText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasAncestorElement(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAncestorElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInSelection(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inSelection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsTag(value: (HTMLElement, js.Array[String]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemove(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelectElement(value: (HTMLElement, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectElement")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSelectElementChildren(value: (HTMLElement, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectElementChildren")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

