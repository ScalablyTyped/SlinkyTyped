package typingsSlinky.materialSelect.adapterMod

import org.scalajs.dom.raw.Element
import typingsSlinky.materialMenuSurface.constantsMod.Corner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCSelectAdapter extends js.Object {
  
  /**
    * Activates the bottom line, showing a focused state.
    */
  def activateBottomLine(): Unit = js.native
  
  /**
    * Adds class to select anchor element.
    */
  def addClass(className: String): Unit = js.native
  
  /**
    * Adds class to the menu element.
    */
  def addMenuClass(className: String): Unit = js.native
  
  /**
    * Closes the menu.
    */
  def closeMenu(): Unit = js.native
  
  /**
    * Closes notch in outline element, if the outline exists.
    */
  def closeOutline(): Unit = js.native
  
  /**
    * Deactivates the bottom line.
    */
  def deactivateBottomLine(): Unit = js.native
  
  /**
    * Floats label determined based off of the shouldFloat argument.
    */
  def floatLabel(shouldFloat: Boolean): Unit = js.native
  
  /**
    * Focuses the menu item element at the given index.
    */
  def focusMenuItemAtIndex(index: Double): Unit = js.native
  
  /**
    * Returns the select anchor element.
    */
  def getAnchorElement(): Element | Null = js.native
  
  /**
    * Returns width of label in pixels, if the label exists.
    */
  def getLabelWidth(): Double = js.native
  
  /**
    * Returns the number of menu items.
    */
  def getMenuItemCount(): Double = js.native
  
  /**
    * Gets the text content of the menu item element at the given index.
    */
  def getMenuItemTextAtIndex(index: Double): String = js.native
  
  /**
    * Returns an array representing the VALUE_ATTR attributes of each menu item.
    */
  def getMenuItemValues(): js.Array[String] = js.native
  
  /**
    * Gets the given attribute on the select anchor element.
    */
  def getSelectAnchorAttr(attr: String): String | Null = js.native
  
  /**
    * Returns the selected index.
    */
  def getSelectedIndex(): Double = js.native
  
  /**
    * Returns true if the select anchor element contains the given class name.
    */
  def hasClass(className: String): Boolean = js.native
  
  /**
    * Returns true if label exists, false if it doesn't.
    */
  def hasLabel(): Boolean = js.native
  
  /**
    * Returns true if outline element exists, false if it doesn't.
    */
  def hasOutline(): Boolean = js.native
  
  /**
    * Returns whether the select anchor is focused.
    */
  def isSelectAnchorFocused(): Boolean = js.native
  
  /**
    * Returns whether typeahead is in progress in the menu.
    */
  def isTypeaheadInProgress(): Boolean = js.native
  
  /**
    * Only implement if outline element exists.
    */
  def notchOutline(labelWidth: Double): Unit = js.native
  
  /**
    * Emits a change event when an element is selected.
    */
  def notifyChange(value: String): Unit = js.native
  
  /**
    * Opens the menu.
    */
  def openMenu(): Unit = js.native
  
  /**
    * Removes a class from the select anchor element.
    */
  def removeClass(className: String): Unit = js.native
  
  /**
    * Removes a class from the menu element.
    */
  def removeMenuClass(className: String): Unit = js.native
  
  /**
    * Removes the given attribute on the select anchor element.
    */
  def removeSelectAnchorAttr(attr: String): Unit = js.native
  
  /**
    * Styles the label as required, if the label exists.
    */
  def setLabelRequired(isRequired: Boolean): Unit = js.native
  
  /**
    * Sets the menu anchor corner.
    */
  def setMenuAnchorCorner(anchorCorner: Corner): Unit = js.native
  
  /**
    * Sets the menu anchor element.
    */
  def setMenuAnchorElement(anchorEl: Element): Unit = js.native
  
  /**
    * Sets whether the menu should wrap focus.
    */
  def setMenuWrapFocus(wrapFocus: Boolean): Unit = js.native
  
  /**
    * Sets the line ripple transform origin center.
    */
  def setRippleCenter(normalizedX: Double): Unit = js.native
  
  /**
    * Sets the given attribute on the select anchor element.
    */
  def setSelectAnchorAttr(attr: String, value: String): Unit = js.native
  
  /**
    * Sets the selected index in the menu.
    */
  def setSelectedIndex(index: Double): Unit = js.native
  
  /**
    * Sets the text content of the selectedText element to the given string.
    */
  def setSelectedText(text: String): Unit = js.native
  
  /**
    * Adds a character to the list typeahead buffer and returns index of the
    * next item in the list matching the buffer.
    */
  def typeaheadMatchItem(nextChar: String, startingIndex: Double): Double = js.native
}
object MDCSelectAdapter {
  
  @scala.inline
  def apply(
    activateBottomLine: () => Unit,
    addClass: String => Unit,
    addMenuClass: String => Unit,
    closeMenu: () => Unit,
    closeOutline: () => Unit,
    deactivateBottomLine: () => Unit,
    floatLabel: Boolean => Unit,
    focusMenuItemAtIndex: Double => Unit,
    getAnchorElement: () => Element | Null,
    getLabelWidth: () => Double,
    getMenuItemCount: () => Double,
    getMenuItemTextAtIndex: Double => String,
    getMenuItemValues: () => js.Array[String],
    getSelectAnchorAttr: String => String | Null,
    getSelectedIndex: () => Double,
    hasClass: String => Boolean,
    hasLabel: () => Boolean,
    hasOutline: () => Boolean,
    isSelectAnchorFocused: () => Boolean,
    isTypeaheadInProgress: () => Boolean,
    notchOutline: Double => Unit,
    notifyChange: String => Unit,
    openMenu: () => Unit,
    removeClass: String => Unit,
    removeMenuClass: String => Unit,
    removeSelectAnchorAttr: String => Unit,
    setLabelRequired: Boolean => Unit,
    setMenuAnchorCorner: Corner => Unit,
    setMenuAnchorElement: Element => Unit,
    setMenuWrapFocus: Boolean => Unit,
    setRippleCenter: Double => Unit,
    setSelectAnchorAttr: (String, String) => Unit,
    setSelectedIndex: Double => Unit,
    setSelectedText: String => Unit,
    typeaheadMatchItem: (String, Double) => Double
  ): MDCSelectAdapter = {
    val __obj = js.Dynamic.literal(activateBottomLine = js.Any.fromFunction0(activateBottomLine), addClass = js.Any.fromFunction1(addClass), addMenuClass = js.Any.fromFunction1(addMenuClass), closeMenu = js.Any.fromFunction0(closeMenu), closeOutline = js.Any.fromFunction0(closeOutline), deactivateBottomLine = js.Any.fromFunction0(deactivateBottomLine), floatLabel = js.Any.fromFunction1(floatLabel), focusMenuItemAtIndex = js.Any.fromFunction1(focusMenuItemAtIndex), getAnchorElement = js.Any.fromFunction0(getAnchorElement), getLabelWidth = js.Any.fromFunction0(getLabelWidth), getMenuItemCount = js.Any.fromFunction0(getMenuItemCount), getMenuItemTextAtIndex = js.Any.fromFunction1(getMenuItemTextAtIndex), getMenuItemValues = js.Any.fromFunction0(getMenuItemValues), getSelectAnchorAttr = js.Any.fromFunction1(getSelectAnchorAttr), getSelectedIndex = js.Any.fromFunction0(getSelectedIndex), hasClass = js.Any.fromFunction1(hasClass), hasLabel = js.Any.fromFunction0(hasLabel), hasOutline = js.Any.fromFunction0(hasOutline), isSelectAnchorFocused = js.Any.fromFunction0(isSelectAnchorFocused), isTypeaheadInProgress = js.Any.fromFunction0(isTypeaheadInProgress), notchOutline = js.Any.fromFunction1(notchOutline), notifyChange = js.Any.fromFunction1(notifyChange), openMenu = js.Any.fromFunction0(openMenu), removeClass = js.Any.fromFunction1(removeClass), removeMenuClass = js.Any.fromFunction1(removeMenuClass), removeSelectAnchorAttr = js.Any.fromFunction1(removeSelectAnchorAttr), setLabelRequired = js.Any.fromFunction1(setLabelRequired), setMenuAnchorCorner = js.Any.fromFunction1(setMenuAnchorCorner), setMenuAnchorElement = js.Any.fromFunction1(setMenuAnchorElement), setMenuWrapFocus = js.Any.fromFunction1(setMenuWrapFocus), setRippleCenter = js.Any.fromFunction1(setRippleCenter), setSelectAnchorAttr = js.Any.fromFunction2(setSelectAnchorAttr), setSelectedIndex = js.Any.fromFunction1(setSelectedIndex), setSelectedText = js.Any.fromFunction1(setSelectedText), typeaheadMatchItem = js.Any.fromFunction2(typeaheadMatchItem))
    __obj.asInstanceOf[MDCSelectAdapter]
  }
  
  @scala.inline
  implicit class MDCSelectAdapterOps[Self <: MDCSelectAdapter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActivateBottomLine(value: () => Unit): Self = this.set("activateBottomLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAddClass(value: String => Unit): Self = this.set("addClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddMenuClass(value: String => Unit): Self = this.set("addMenuClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseMenu(value: () => Unit): Self = this.set("closeMenu", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloseOutline(value: () => Unit): Self = this.set("closeOutline", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeactivateBottomLine(value: () => Unit): Self = this.set("deactivateBottomLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFloatLabel(value: Boolean => Unit): Self = this.set("floatLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFocusMenuItemAtIndex(value: Double => Unit): Self = this.set("focusMenuItemAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAnchorElement(value: () => Element | Null): Self = this.set("getAnchorElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLabelWidth(value: () => Double): Self = this.set("getLabelWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMenuItemCount(value: () => Double): Self = this.set("getMenuItemCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMenuItemTextAtIndex(value: Double => String): Self = this.set("getMenuItemTextAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMenuItemValues(value: () => js.Array[String]): Self = this.set("getMenuItemValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectAnchorAttr(value: String => String | Null): Self = this.set("getSelectAnchorAttr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSelectedIndex(value: () => Double): Self = this.set("getSelectedIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasClass(value: String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasLabel(value: () => Boolean): Self = this.set("hasLabel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasOutline(value: () => Boolean): Self = this.set("hasOutline", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSelectAnchorFocused(value: () => Boolean): Self = this.set("isSelectAnchorFocused", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsTypeaheadInProgress(value: () => Boolean): Self = this.set("isTypeaheadInProgress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNotchOutline(value: Double => Unit): Self = this.set("notchOutline", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotifyChange(value: String => Unit): Self = this.set("notifyChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenMenu(value: () => Unit): Self = this.set("openMenu", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveClass(value: String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveMenuClass(value: String => Unit): Self = this.set("removeMenuClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveSelectAnchorAttr(value: String => Unit): Self = this.set("removeSelectAnchorAttr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLabelRequired(value: Boolean => Unit): Self = this.set("setLabelRequired", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMenuAnchorCorner(value: Corner => Unit): Self = this.set("setMenuAnchorCorner", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMenuAnchorElement(value: Element => Unit): Self = this.set("setMenuAnchorElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMenuWrapFocus(value: Boolean => Unit): Self = this.set("setMenuWrapFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRippleCenter(value: Double => Unit): Self = this.set("setRippleCenter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSelectAnchorAttr(value: (String, String) => Unit): Self = this.set("setSelectAnchorAttr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetSelectedIndex(value: Double => Unit): Self = this.set("setSelectedIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSelectedText(value: String => Unit): Self = this.set("setSelectedText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTypeaheadMatchItem(value: (String, Double) => Double): Self = this.set("typeaheadMatchItem", js.Any.fromFunction2(value))
  }
}
