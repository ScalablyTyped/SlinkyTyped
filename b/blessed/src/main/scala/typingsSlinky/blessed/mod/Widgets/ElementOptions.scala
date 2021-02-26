package typingsSlinky.blessed.mod.Widgets

import typingsSlinky.blessed.blessedStrings.bg
import typingsSlinky.blessed.blessedStrings.bottom
import typingsSlinky.blessed.blessedStrings.center
import typingsSlinky.blessed.blessedStrings.left
import typingsSlinky.blessed.blessedStrings.line
import typingsSlinky.blessed.blessedStrings.middle
import typingsSlinky.blessed.blessedStrings.right
import typingsSlinky.blessed.blessedStrings.top
import typingsSlinky.blessed.mod.Widgets.Types.TPosition
import typingsSlinky.blessed.mod.Widgets.Types.TTopLeft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementOptions extends INodeOptions {
  
  /**
    * Text alignment: left, center, or right.
    */
  var align: js.UndefOr[left | center | right] = js.native
  
  var bg: js.UndefOr[String] = js.native
  
  var bold: js.UndefOr[String] = js.native
  
  /**
    * Border object, see below.
    */
  var border: js.UndefOr[Border | line | bg] = js.native
  
  var bottom: js.UndefOr[TPosition] = js.native
  
  /**
    * Background character (default is whitespace ).
    */
  var ch: js.UndefOr[String] = js.native
  
  /**
    * Element is clickable.
    */
  var clickable: js.UndefOr[Boolean] = js.native
  
  /**
    * Element's text content.
    */
  var content: js.UndefOr[String] = js.native
  
  /**
    * Allow the element to be dragged with the mouse.
    */
  var draggable: js.UndefOr[Boolean] = js.native
  
  var fg: js.UndefOr[String] = js.native
  
  /**
    * Element is focused.
    */
  var focused: js.UndefOr[BlessedElement] = js.native
  
  /**
    * Offsets of the element relative to its parent. Can be a number, percentage (0-100%), or
    * keyword (center). right and bottom do not accept keywords. Percentages can also have
    * offsets (50%+1, 50%-1).
    */
  var height: js.UndefOr[Double | String] = js.native
  
  /**
    * Whether the element is hidden.
    */
  var hidden: js.UndefOr[Boolean] = js.native
  
  /**
    * A floating text label for the element which appears on mouseover.
    */
  var hoverText: js.UndefOr[String] = js.native
  
  /**
    * Element is focusable and can receive key input.
    */
  var input: js.UndefOr[Boolean] = js.native
  
  var keyable: js.UndefOr[Boolean] = js.native
  
  /**
    * A simple text label for the element.
    */
  var label: js.UndefOr[String] = js.native
  
  var left: js.UndefOr[TTopLeft] = js.native
  
  /**
    * Amount of padding on the inside of the element. Can be a number or an object containing
    * the properties: left, right, top, and bottom.
    */
  var padding: js.UndefOr[Double | Padding] = js.native
  
  /**
    * Can contain the above options.
    */
  var position: js.UndefOr[Position] = js.native
  
  var right: js.UndefOr[TPosition] = js.native
  
  /**
    * Whether the element is scrollable or not.
    */
  var scrollable: js.UndefOr[Boolean] = js.native
  
  /**
    * Draw a translucent offset shadow behind the element.
    */
  var shadow: js.UndefOr[Boolean] = js.native
  
  /**
    * Shrink/flex/grow to content and child elements. Width/height during render.
    */
  var shrink: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[js.Any] = js.native
  
  var tags: js.UndefOr[Boolean] = js.native
  
  var top: js.UndefOr[TTopLeft] = js.native
  
  var underline: js.UndefOr[String] = js.native
  
  /**
    * Vertical text alignment: top, middle, or bottom.
    */
  var valign: js.UndefOr[top | middle | bottom] = js.native
  
  /**
    * Width/height of the element, can be a number, percentage (0-100%), or keyword (half or shrink).
    * Percentages can also have offsets (50%+1, 50%-1).
    */
  var width: js.UndefOr[Double | String] = js.native
}
object ElementOptions {
  
  @scala.inline
  def apply(): ElementOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementOptions]
  }
  
  @scala.inline
  implicit class ElementOptionsMutableBuilder[Self <: ElementOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
    
    @scala.inline
    def setBold(value: String): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    @scala.inline
    def setBorder(value: Border | line | bg): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setBottom(value: TPosition): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setCh(value: String): Self = StObject.set(x, "ch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChUndefined: Self = StObject.set(x, "ch", js.undefined)
    
    @scala.inline
    def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setFg(value: String): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFgUndefined: Self = StObject.set(x, "fg", js.undefined)
    
    @scala.inline
    def setFocused(value: BlessedElement): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setHoverText(value: String): Self = StObject.set(x, "hoverText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverTextUndefined: Self = StObject.set(x, "hoverText", js.undefined)
    
    @scala.inline
    def setInput(value: Boolean): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setKeyable(value: Boolean): Self = StObject.set(x, "keyable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyableUndefined: Self = StObject.set(x, "keyable", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLeft(value: TTopLeft): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setPadding(value: Double | Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRight(value: TPosition): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
    
    @scala.inline
    def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    @scala.inline
    def setShrink(value: Boolean): Self = StObject.set(x, "shrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShrinkUndefined: Self = StObject.set(x, "shrink", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTags(value: Boolean): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTop(value: TTopLeft): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setUnderline(value: String): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    
    @scala.inline
    def setValign(value: top | middle | bottom): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValignUndefined: Self = StObject.set(x, "valign", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
