package typingsSlinky.dojo.dijit.layout.AccordionContainer

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.dojo.AnonUnwatch
import typingsSlinky.dojo.dijit.Widget
import typingsSlinky.dojo.dojoStrings.active
import typingsSlinky.dojo.dojoStrings.buttonWidget
import typingsSlinky.dojo.dojoStrings.contentWidget
import typingsSlinky.dojo.dojoStrings.cssStateNodes
import typingsSlinky.dojo.dojoStrings.hovering
import typingsSlinky.dojo.dojoStrings.isLayoutContainer
import typingsSlinky.dojo.dojoStrings.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/AccordionContainer._InnerContainer.html
  *
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsSlinky.dojo.dijit.CssStateMixin because Inheritance from two classes. Inlined active, cssStateNodes, hovering */ @JSGlobal("dijit.layout.AccordionContainer._InnerContainer")
@js.native
class InnerContainer () extends Widget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * True if mouse was pressed while over this widget, and hasn't been released yet
    * 
    */
  var active: Boolean = js.native
  /**
    * Class to use to instantiate title
    * (Wish we didn't have a separate widget for just the title but maintaining it
    * for backwards compatibility, is it worth it?)
    * 
    */
  var buttonWidget: js.Function = js.native
  /**
    * Pointer to the real child widget
    * 
    */
  var contentWidget: js.Object = js.native
  /**
    * Subclasses may define a cssStateNodes property that lists sub-nodes within the widget that
    * need CSS classes applied on mouse hover/press and focus.
    * 
    * Each entry in this optional hash is a an attach-point name (like "upArrowButton") mapped to a CSS class name
    * (like "dijitUpArrowButton"). Example:
    * 
    * {
    *     "upArrowButton": "dijitUpArrowButton",
    *     "downArrowButton": "dijitDownArrowButton"
    * }
    * The above will set the CSS class dijitUpArrowButton to the this.upArrowButton DOMNode when it
    * 
    * is hovered, etc.
    * 
    */
  var cssStateNodes: js.Object = js.native
  /**
    * True if cursor is over this widget
    * 
    */
  var hovering: Boolean = js.native
  /**
    * 
    */
  var isLayoutContainer: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    * 
    */
  @JSName("style")
  var style_InnerContainer: String = js.native
  @JSName("get")
  def get_active(property: active): Boolean = js.native
  @JSName("get")
  def get_buttonWidget(property: buttonWidget): js.Function = js.native
  @JSName("get")
  def get_contentWidget(property: contentWidget): js.Object = js.native
  @JSName("get")
  def get_cssStateNodes(property: cssStateNodes): js.Object = js.native
  @JSName("get")
  def get_hovering(property: hovering): Boolean = js.native
  @JSName("get")
  def get_isLayoutContainer(property: isLayoutContainer): Boolean = js.native
  @JSName("set")
  def set_active(property: active, value: Boolean): Unit = js.native
  @JSName("set")
  def set_buttonWidget(property: buttonWidget, value: js.Function): Unit = js.native
  @JSName("set")
  def set_contentWidget(property: contentWidget, value: js.Object): Unit = js.native
  @JSName("set")
  def set_cssStateNodes(property: cssStateNodes, value: js.Object): Unit = js.native
  @JSName("set")
  def set_hovering(property: hovering, value: Boolean): Unit = js.native
  @JSName("set")
  def set_isLayoutContainer(property: isLayoutContainer, value: Boolean): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("watch")
  def watch_active(
    property: active,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_buttonWidget(
    property: buttonWidget,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Function], 
      /* newValue */ js.UndefOr[js.Function], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_contentWidget(
    property: contentWidget,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_cssStateNodes(
    property: cssStateNodes,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_hovering(
    property: hovering,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_isLayoutContainer(
    property: isLayoutContainer,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

