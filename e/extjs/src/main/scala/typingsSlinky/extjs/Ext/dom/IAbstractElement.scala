package typingsSlinky.extjs.Ext.dom

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstractElement extends IBase {
  /** [Property] (Number) */
  var ASCLASS: js.UndefOr[Double] = js.native
  /** [Property] (Number) */
  var DISPLAY: js.UndefOr[Double] = js.native
  /** [Property] (Number) */
  var OFFSETS: js.UndefOr[Double] = js.native
  /** [Property] (Number) */
  var VISIBILITY: js.UndefOr[Double] = js.native
  /** [Method] Adds one or more CSS classes to the element
  		* @param className String/String[] The CSS classes to add separated by space, or an array of classes
  		* @returns Ext.dom.Element this
  		*/
  var addCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[js.Any], IElement]] = js.native
  /** [Method] Appends the passed element s to this element Defined in override Ext dom AbstractElement_insertion
  		* @param el String/HTMLElement/Ext.dom.AbstractElement/Object The id or element to insert or a DomHelper config The id of the node, a DOM Node or an existing Element.
  		* @param returnDom Boolean True to return the raw DOM element instead of Ext.dom.AbstractElement
  		* @returns Ext.dom.AbstractElement The inserted Element.
  		*/
  var appendChild: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[js.Any], /* returnDom */ js.UndefOr[Boolean], this.type]
  ] = js.native
  /** [Method] Appends this element to the passed element Defined in override Ext dom AbstractElement_insertion
  		* @param el String/HTMLElement/Ext.dom.AbstractElement The new parent element. The id of the node, a DOM Node or an existing Element.
  		* @returns Ext.dom.AbstractElement This element
  		*/
  var appendTo: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] More flexible version of setStyle for setting style properties
  		* @param styles String/Object/Function A style specification string, e.g. "width:100px", or object in the form {width:"100px"}, or a function which returns such a specification.
  		* @returns Ext.dom.Element this
  		*/
  var applyStyles: js.UndefOr[js.Function1[/* styles */ js.UndefOr[js.Any], IElement]] = js.native
  /** [Method] Selects a single direct child based on the passed CSS selector the selector should not contain an id
  		* @param selector String The CSS selector
  		* @param returnDom Boolean True to return the DOM node instead of Ext.dom.Element.
  		* @returns HTMLElement/Ext.dom.Element The child Ext.dom.Element (or DOM node if returnDom = true)
  		*/
  var child: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.native
  /** [Method] Returns true if this element is an ancestor of the passed element
  		* @param el HTMLElement/String The element to check
  		* @returns Boolean True if this element is an ancestor of el, else false
  		*/
  var contains: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Creates the passed DomHelper config and appends it to this element or optionally inserts it before the passed child e
  		* @param config Object DomHelper element config object. If no tag is specified (e.g., {tag:'input'}) then a div will be automatically generated with the specified attributes.
  		* @param insertBefore HTMLElement a child element of this element
  		* @param returnDom Boolean true to return the dom node instead of creating an Element
  		* @returns Ext.dom.AbstractElement The new child element
  		*/
  var createChild: js.UndefOr[
    js.Function3[
      /* config */ js.UndefOr[js.Any], 
      /* insertBefore */ js.UndefOr[HTMLElement], 
      /* returnDom */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.native
  /** [Property] (String) */
  var defaultUnit: js.UndefOr[String] = js.native
  /** [Method] Alias to remove  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (HTMLElement) */
  var dom: js.UndefOr[HTMLElement] = js.native
  /** [Method] Selects a single child at any depth below this element based on the passed CSS selector the selector should not cont
  		* @param selector String The CSS selector
  		* @param returnDom Boolean True to return the DOM node instead of Ext.dom.Element
  		* @returns HTMLElement/Ext.dom.Element The child Ext.dom.Element (or DOM node if returnDom = true)
  		*/
  var down: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.native
  /** [Method] Looks at this node and then at parent nodes for a match of the passed simple selector e g
  		* @param selector String The simple selector to test
  		* @param limit Number/String/HTMLElement/Ext.Element The max depth to search as a number or an element which causes the upward traversal to stop and is not considered for inclusion as the result. (defaults to 50 || document.documentElement)
  		* @param returnEl Boolean True to return a Ext.Element object instead of DOM node
  		* @returns HTMLElement The matching DOM node (or null if no match was found)
  		*/
  var findParent: js.UndefOr[
    js.Function3[
      /* selector */ js.UndefOr[String], 
      /* limit */ js.UndefOr[js.Any], 
      /* returnEl */ js.UndefOr[Boolean], 
      HTMLElement
    ]
  ] = js.native
  /** [Method] Looks at parent nodes for a match of the passed simple selector e g
  		* @param selector String The simple selector to test
  		* @param limit Number/String/HTMLElement/Ext.Element The max depth to search as a number or an element which causes the upward traversal to stop and is not considered for inclusion as the result. (defaults to 50 || document.documentElement)
  		* @param returnEl Boolean True to return a Ext.Element object instead of DOM node
  		* @returns HTMLElement The matching DOM node (or null if no match was found)
  		*/
  var findParentNode: js.UndefOr[
    js.Function3[
      /* selector */ js.UndefOr[String], 
      /* limit */ js.UndefOr[js.Any], 
      /* returnEl */ js.UndefOr[Boolean], 
      HTMLElement
    ]
  ] = js.native
  /** [Method] Gets the first child skipping text nodes Defined in override Ext dom AbstractElement_traversal
  		* @param selector String Find the next sibling that matches the passed simple selector
  		* @param returnDom Boolean True to return a raw dom node instead of an Ext.dom.Element
  		* @returns Ext.dom.Element/HTMLElement The first child or null
  		*/
  var first: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.native
  /** [Method] Returns the active element in the DOM
  		* @returns HTMLElement The active (focused) element in the document.
  		*/
  var getActiveElement: js.UndefOr[js.Function0[HTMLElement]] = js.native
  /** [Method] Returns the value of an attribute from the element s underlying DOM node
  		* @param name String The attribute name
  		* @param namespace String The namespace in which to look for the attribute
  		* @returns String The attribute value
  		*/
  var getAttribute: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[String], /* namespace */ js.UndefOr[String], String]
  ] = js.native
  /** [Method] Gets the width of the border s for the specified side s  Defined in override Ext dom AbstractElement_style
  		* @param side String Can be t, l, r, b or any combination of those to add multiple values. For example, passing 'lr' would get the border left width + the border right width.
  		* @returns Number The width of the sides passed added together
  		*/
  var getBorderWidth: js.UndefOr[js.Function1[/* side */ js.UndefOr[String], Double]] = js.native
  /** [Method] Returns a child element of this element given its id
  		* @param id String The id of the desired child element.
  		* @param asDom Boolean True to return the DOM element, false to return a wrapped Element object.
  		*/
  var getById: js.UndefOr[js.Function2[/* id */ js.UndefOr[String], /* asDom */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Returns the innerHTML of an Element or an empty string if the element s dom no longer exists  */
  var getHTML: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the offset height of the element Defined in override Ext dom AbstractElement_style
  		* @param contentHeight Boolean true to get the height minus borders and padding
  		* @returns Number The element's height
  		*/
  var getHeight: js.UndefOr[js.Function1[/* contentHeight */ js.UndefOr[Boolean], Double]] = js.native
  /** [Method] Returns an object with properties top left right and bottom representing the margins of this element unless sides i
  		* @param sides String Any combination of l, r, t, b to get the sum of those sides
  		* @returns Object/Number
  		*/
  var getMargin: js.UndefOr[js.Function1[/* sides */ js.UndefOr[String], _]] = js.native
  /** [Method] Gets the width of the padding s for the specified side s  Defined in override Ext dom AbstractElement_style
  		* @param side String Can be t, l, r, b or any combination of those to add multiple values. For example, passing 'lr' would get the padding left + the padding right.
  		* @returns Number The padding of the sides passed added together
  		*/
  var getPadding: js.UndefOr[js.Function1[/* side */ js.UndefOr[String], Double]] = js.native
  /** [Method] Returns the size of the element
  		* @param contentSize Boolean true to get the width/size minus borders and padding
  		* @returns Object An object containing the element's size:
  		*/
  var getSize: js.UndefOr[js.Function1[/* contentSize */ js.UndefOr[Boolean], _]] = js.native
  /** [Method] Returns a named style property based on computed currentStyle primary and inline style if primary is not available
  		* @param property String/String[] The style property (or multiple property names in an array) whose value is returned.
  		* @param inline Boolean if true only inline styles will be returned.
  		* @returns String/Object The current value of the style property for this element (or a hash of named style values if multiple property arguments are requested).
  		*/
  var getStyle: js.UndefOr[
    js.Function2[/* property */ js.UndefOr[js.Any], /* inline */ js.UndefOr[Boolean], _]
  ] = js.native
  /** [Method] Returns the value of the value attribute
  		* @param asNumber Boolean true to parse the value as a number
  		* @returns String/Number
  		*/
  var getValue: js.UndefOr[js.Function1[/* asNumber */ js.UndefOr[Boolean], _]] = js.native
  /** [Method] Returns the dimensions of the element available to lay content out in
  		* @returns Object Object describing width and height.
  		*/
  var getViewSize: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the offset width of the element Defined in override Ext dom AbstractElement_style
  		* @param contentWidth Boolean true to get the width minus borders and padding
  		* @returns Number The element's width
  		*/
  var getWidth: js.UndefOr[js.Function1[/* contentWidth */ js.UndefOr[Boolean], Double]] = js.native
  /** [Method] Checks if the specified CSS class exists on this element s DOM node
  		* @param className String The CSS class to check for
  		* @returns Boolean True if the class exists, else false
  		*/
  var hasCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[String], Boolean]] = js.native
  /** [Method] Hide this element  Uses display mode to determine whether to use display or visibility
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		* @returns Ext.dom.Element this
  		*/
  var hide: js.UndefOr[js.Function1[/* animate */ js.UndefOr[js.Any], IElement]] = js.native
  /** [Property] (String) */
  var id: js.UndefOr[String] = js.native
  /** [Method] Inserts this element after the passed element in the DOM Defined in override Ext dom AbstractElement_insertion
  		* @param el String/HTMLElement/Ext.dom.AbstractElement The element to insert after. The id of the node, a DOM Node or an existing Element.
  		* @returns Ext.dom.AbstractElement This element
  		*/
  var insertAfter: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Inserts this element before the passed element in the DOM Defined in override Ext dom AbstractElement_insertion
  		* @param el String/HTMLElement/Ext.dom.AbstractElement The element before which this element will be inserted. The id of the node, a DOM Node or an existing Element.
  		* @returns Ext.dom.AbstractElement This element
  		*/
  var insertBefore: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Inserts or creates an element or DomHelper config as the first child of this element Defined in override Ext dom
  		* @param el String/HTMLElement/Ext.dom.AbstractElement/Object The id or element to insert or a DomHelper config to create and insert
  		* @returns Ext.dom.AbstractElement The new child
  		*/
  var insertFirst: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Inserts an html fragment into this element Defined in override Ext dom AbstractElement_insertion
  		* @param where String Where to insert the html in relation to this element - beforeBegin, afterBegin, beforeEnd, afterEnd. See Ext.dom.Helper.insertHtml for details.
  		* @param html String The HTML fragment
  		* @param returnEl Boolean True to return an Ext.dom.AbstractElement
  		* @returns HTMLElement/Ext.dom.AbstractElement The inserted node (or nearest related if more than 1 inserted)
  		*/
  var insertHtml: js.UndefOr[
    js.Function3[
      /* where */ js.UndefOr[String], 
      /* html */ js.UndefOr[String], 
      /* returnEl */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
  /** [Method] Inserts or creates the passed element or DomHelper config as a sibling of this element Defined in override Ext d
  		* @param el String/HTMLElement/Ext.dom.AbstractElement/Object/Array The id, element to insert or a DomHelper config to create and insert or an array of any of those.
  		* @param where String 'before' or 'after'
  		* @param returnDom Boolean True to return the raw DOM element instead of Ext.dom.AbstractElement
  		* @returns Ext.dom.AbstractElement The inserted Element. If an array is passed, the last inserted element is returned.
  		*/
  var insertSibling: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* where */ js.UndefOr[String], 
      /* returnDom */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.native
  /** [Method] Returns true if this element matches the passed simple selector e g
  		* @param selector String The simple selector to test
  		* @returns Boolean True if this element matches the selector, else false
  		*/
  var is: js.UndefOr[js.Function1[/* selector */ js.UndefOr[String], Boolean]] = js.native
  /** [Method] Checks if the current value of a style is equal to a given value
  		* @param style String property whose value is returned.
  		* @param value String to check against.
  		* @returns Boolean true for when the current value equals the given value.
  		*/
  var isStyle: js.UndefOr[
    js.Function2[/* style */ js.UndefOr[String], /* value */ js.UndefOr[String], Boolean]
  ] = js.native
  /** [Method] Returns true if the value of the given property is visually transparent
  		* @param prop String The style property whose value is to be tested.
  		* @returns Boolean True if the style property is visually transparent.
  		*/
  var isTransparent: js.UndefOr[js.Function1[/* prop */ js.UndefOr[String], Boolean]] = js.native
  /** [Method] Gets the last child skipping text nodes Defined in override Ext dom AbstractElement_traversal
  		* @param selector String Find the previous sibling that matches the passed simple selector
  		* @param returnDom Boolean True to return a raw dom node instead of an Ext.dom.Element
  		* @returns Ext.dom.Element/HTMLElement The last child or null
  		*/
  var last: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.native
  /** [Method] Puts a mask over this element to disable user interaction
  		* @param msg String A message to display in the mask
  		* @param msgCls String A css class to apply to the msg element
  		*/
  var mask: js.UndefOr[
    js.Function2[/* msg */ js.UndefOr[String], /* msgCls */ js.UndefOr[String], Unit]
  ] = js.native
  /** [Method] Gets the next sibling skipping text nodes Defined in override Ext dom AbstractElement_traversal
  		* @param selector String Find the next sibling that matches the passed simple selector
  		* @param returnDom Boolean True to return a raw dom node instead of an Ext.dom.Element
  		* @returns Ext.dom.Element/HTMLElement The next sibling or null
  		*/
  var next: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.native
  /** [Method] Gets the parent node for this element optionally chaining up trying to match a selector Defined in override Ext dom
  		* @param selector String Find a parent node that matches the passed simple selector
  		* @param returnDom Boolean True to return a raw dom node instead of an Ext.dom.Element
  		* @returns Ext.dom.Element/HTMLElement The parent node or null
  		*/
  var parent: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.native
  /** [Method] Gets the previous sibling skipping text nodes Defined in override Ext dom AbstractElement_traversal
  		* @param selector String Find the previous sibling that matches the passed simple selector
  		* @param returnDom Boolean True to return a raw dom node instead of an Ext.dom.Element
  		* @returns Ext.dom.Element/HTMLElement The previous sibling or null
  		*/
  var prev: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.native
  /** [Method] Selects child nodes based on the passed CSS selector the selector should not contain an id
  		* @param selector String The CSS selector
  		* @returns HTMLElement[] An array of the matched nodes
  		*/
  var query: js.UndefOr[js.Function1[/* selector */ js.UndefOr[String], Array]] = js.native
  /** [Method] Adds one or more CSS classes to this element and removes the same class es from all siblings
  		* @param className String/String[] The CSS class to add, or an array of classes
  		* @returns Ext.dom.Element this
  		*/
  var radioCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[js.Any], IElement]] = js.native
  /** [Method] Removes this element s dom reference  */
  var remove: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Removes one or more CSS classes from the element
  		* @param className String/String[] The CSS classes to remove separated by space, or an array of classes
  		* @returns Ext.dom.Element this
  		*/
  var removeCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[js.Any], IElement]] = js.native
  /** [Method] Forces the browser to repaint this element Defined in override Ext dom AbstractElement_style
  		* @returns Ext.dom.Element this
  		*/
  var repaint: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Method] Replaces the passed element with this element Defined in override Ext dom AbstractElement_insertion
  		* @param el String/HTMLElement/Ext.dom.AbstractElement The element to replace. The id of the node, a DOM Node or an existing Element.
  		* @returns Ext.dom.AbstractElement This element
  		*/
  var replace: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Replaces a CSS class on the element with another
  		* @param oldClassName String The CSS class to replace
  		* @param newClassName String The replacement CSS class
  		* @returns Ext.dom.Element this
  		*/
  var replaceCls: js.UndefOr[
    js.Function2[
      /* oldClassName */ js.UndefOr[String], 
      /* newClassName */ js.UndefOr[String], 
      IElement
    ]
  ] = js.native
  /** [Method] Replaces this element with the passed element Defined in override Ext dom AbstractElement_insertion
  		* @param el String/HTMLElement/Ext.dom.AbstractElement/Object The new element (id of the node, a DOM Node or an existing Element) or a DomHelper config of an element to create
  		* @returns Ext.dom.AbstractElement This element
  		*/
  var replaceWith: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Creates a Ext CompositeElement for child nodes based on the passed CSS selector the selector should not contain an id
  		* @param selector String The CSS selector
  		* @param unique Boolean True to create a unique Ext.Element for each element. Defaults to a shared flyweight object.
  		* @returns Ext.CompositeElement The composite element
  		*/
  var select: js.UndefOr[
    js.Function2[
      /* selector */ js.UndefOr[String], 
      /* unique */ js.UndefOr[Boolean], 
      typingsSlinky.extjs.Ext.ICompositeElement
    ]
  ] = js.native
  /** [Method] Serializes a DOM form into a url encoded string Defined in override Ext dom AbstractElement_static
  		* @param form Object The form
  		* @returns String The url encoded form
  		*/
  var serializeForm: js.UndefOr[js.Function1[/* form */ js.UndefOr[js.Any], String]] = js.native
  /** [Method] Sets the passed attributes as attributes of this element a style attribute can be a string object or function
  		* @param o Object The object with the attributes
  		* @param useSet Boolean false to override the default setAttribute to use expandos.
  		* @returns Ext.dom.Element this
  		*/
  var set: js.UndefOr[
    js.Function2[/* o */ js.UndefOr[js.Any], /* useSet */ js.UndefOr[Boolean], IElement]
  ] = js.native
  /** [Method] Set the innerHTML of this element
  		* @param html String The new HTML
  		* @returns Ext.Element this
  		*/
  var setHTML: js.UndefOr[js.Function1[/* html */ js.UndefOr[String], typingsSlinky.extjs.Ext.IElement]] = js.native
  /** [Method] Set the height of this Element
  		* @param height Number/String The new height. This may be one of:  A Number specifying the new height in this Element's defaultUnits (by default, pixels.) A String used to set the CSS height style. Animation may not be used.
  		* @returns Ext.dom.Element this
  		*/
  var setHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[js.Any], IElement]] = js.native
  /** [Method] Set the size of this Element
  		* @param width Number/String The new width. This may be one of:  A Number specifying the new width in this Element's defaultUnits (by default, pixels). A String used to set the CSS width style. Animation may not be used. A size object in the format {width: widthValue, height: heightValue}.
  		* @param height Number/String The new height. This may be one of:  A Number specifying the new height in this Element's defaultUnits (by default, pixels). A String used to set the CSS height style. Animation may not be used.
  		* @returns Ext.dom.Element this
  		*/
  var setSize: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], IElement]
  ] = js.native
  /** [Method] Wrapper for setting style properties also takes single object parameter of multiple styles
  		* @param property String/Object The style property to be set, or an object of multiple styles.
  		* @param value String The value to apply to the given property, or null if an object was passed.
  		* @returns Ext.dom.Element this
  		*/
  var setStyle: js.UndefOr[
    js.Function2[/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[String], IElement]
  ] = js.native
  /** [Method] Use this to change the visibility mode between VISIBILITY DISPLAY OFFSETS or ASCLASS
  		* @param mode Object
  		* @returns Ext.dom.AbstractElement this
  		*/
  var setVisibilityMode: js.UndefOr[js.Function1[/* mode */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Sets the visibility of the element see details
  		* @param visible Boolean Whether the element is visible
  		* @param animate Boolean/Object True for the default animation, or a standard Element animation config object
  		* @returns Ext.dom.Element this
  		*/
  var setVisible: js.UndefOr[
    js.Function2[/* visible */ js.UndefOr[Boolean], /* animate */ js.UndefOr[js.Any], IElement]
  ] = js.native
  /** [Method] Set the width of this Element
  		* @param width Number/String The new width. This may be one of:  A Number specifying the new width in this Element's defaultUnits (by default, pixels). A String used to set the CSS width style. Animation may not be used.
  		* @returns Ext.dom.Element this
  		*/
  var setWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], IElement]] = js.native
  /** [Method] Show this element  Uses display mode to determine whether to use display or visibility
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		* @returns Ext.dom.Element this
  		*/
  var show: js.UndefOr[js.Function1[/* animate */ js.UndefOr[js.Any], IElement]] = js.native
  /** [Method] Toggles the specified CSS class on this element removes it if it already exists otherwise adds it
  		* @param className String The CSS class to toggle
  		* @returns Ext.dom.Element this
  		*/
  var toggleCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[String], IElement]] = js.native
  /** [Method] Removes a previously applied mask  */
  var unmask: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Walks up the DOM looking for a parent node that matches the passed simple selector e g
  		* @param selector String The simple selector to test
  		* @param limit Number/String/HTMLElement/Ext.Element The max depth to search as a number or an element which causes the upward traversal to stop and is not considered for inclusion as the result. (defaults to 50 || document.documentElement)
  		* @param returnDom Boolean True to return the DOM node instead of Ext.dom.Element
  		* @returns Ext.Element The matching DOM node (or null if no match was found)
  		*/
  var up: js.UndefOr[
    js.Function3[
      /* selector */ js.UndefOr[String], 
      /* limit */ js.UndefOr[js.Any], 
      /* returnDom */ js.UndefOr[Boolean], 
      typingsSlinky.extjs.Ext.IElement
    ]
  ] = js.native
  /** [Method] Update the innerHTML of this element
  		* @param html String The new HTML
  		* @returns Ext.dom.Element this
  		*/
  var update: js.UndefOr[js.Function1[/* html */ js.UndefOr[String], IElement]] = js.native
  /** [Method] Creates and wraps this element with another element Defined in override Ext dom AbstractElement_insertion
  		* @param config Object DomHelper element config object for the wrapper element or null for an empty div
  		* @param returnDom Boolean True to return the raw DOM element instead of Ext.dom.AbstractElement
  		* @param selector String A DomQuery selector to select a descendant node within the created element to use as the wrapping element.
  		* @returns HTMLElement/Ext.dom.AbstractElement The newly created wrapper element
  		*/
  var wrap: js.UndefOr[
    js.Function3[
      /* config */ js.UndefOr[js.Any], 
      /* returnDom */ js.UndefOr[Boolean], 
      /* selector */ js.UndefOr[String], 
      _
    ]
  ] = js.native
}

object IAbstractElement {
  @scala.inline
  def apply(): IAbstractElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractElement]
  }
  @scala.inline
  implicit class IAbstractElementOps[Self <: IAbstractElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withASCLASS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ASCLASS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutASCLASS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ASCLASS")(js.undefined)
        ret
    }
    @scala.inline
    def withDISPLAY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DISPLAY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDISPLAY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DISPLAY")(js.undefined)
        ret
    }
    @scala.inline
    def withOFFSETS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OFFSETS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOFFSETS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OFFSETS")(js.undefined)
        ret
    }
    @scala.inline
    def withVISIBILITY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VISIBILITY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVISIBILITY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VISIBILITY")(js.undefined)
        ret
    }
    @scala.inline
    def withAddCls(value: /* className */ js.UndefOr[js.Any] => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCls")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendChild(value: (/* el */ js.UndefOr[js.Any], /* returnDom */ js.UndefOr[Boolean]) => IAbstractElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendChild")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAppendChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendChild")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendTo(value: /* el */ js.UndefOr[js.Any] => IAbstractElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAppendTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyStyles(value: /* styles */ js.UndefOr[js.Any] => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyStyles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutApplyStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withChild(value: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(js.undefined)
        ret
    }
    @scala.inline
    def withContains(value: /* el */ js.UndefOr[js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateChild(
      value: (/* config */ js.UndefOr[js.Any], /* insertBefore */ js.UndefOr[HTMLElement], /* returnDom */ js.UndefOr[Boolean]) => IAbstractElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createChild")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCreateChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createChild")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withDom(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom")(js.undefined)
        ret
    }
    @scala.inline
    def withDown(value: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(js.undefined)
        ret
    }
    @scala.inline
    def withFindParent(
      value: (/* selector */ js.UndefOr[String], /* limit */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => HTMLElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findParent")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFindParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findParent")(js.undefined)
        ret
    }
    @scala.inline
    def withFindParentNode(
      value: (/* selector */ js.UndefOr[String], /* limit */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => HTMLElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findParentNode")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFindParentNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findParentNode")(js.undefined)
        ret
    }
    @scala.inline
    def withFirst(value: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.undefined)
        ret
    }
    @scala.inline
    def withGetActiveElement(value: () => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetActiveElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveElement")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAttribute(value: (/* name */ js.UndefOr[String], /* namespace */ js.UndefOr[String]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttribute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBorderWidth(value: /* side */ js.UndefOr[String] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBorderWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBorderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGetById(value: (/* id */ js.UndefOr[String], /* asDom */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getById")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetById: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getById")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHTML(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHTML")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHeight(value: /* contentHeight */ js.UndefOr[Boolean] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMargin(value: /* sides */ js.UndefOr[String] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMargin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPadding(value: /* side */ js.UndefOr[String] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPadding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSize(value: /* contentSize */ js.UndefOr[Boolean] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStyle(value: (/* property */ js.UndefOr[js.Any], /* inline */ js.UndefOr[Boolean]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValue(value: /* asNumber */ js.UndefOr[Boolean] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGetViewSize(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetViewSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGetWidth(value: /* contentWidth */ js.UndefOr[Boolean] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHasCls(value: /* className */ js.UndefOr[String] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHasCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCls")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: /* animate */ js.UndefOr[js.Any] => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertAfter(value: /* el */ js.UndefOr[js.Any] => IAbstractElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAfter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInsertAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertBefore(value: /* el */ js.UndefOr[js.Any] => IAbstractElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInsertBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertFirst(value: /* el */ js.UndefOr[js.Any] => IAbstractElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertFirst")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInsertFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertHtml(
      value: (/* where */ js.UndefOr[String], /* html */ js.UndefOr[String], /* returnEl */ js.UndefOr[Boolean]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertHtml")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutInsertHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertSibling(
      value: (/* el */ js.UndefOr[js.Any], /* where */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => IAbstractElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSibling")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutInsertSibling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSibling")(js.undefined)
        ret
    }
    @scala.inline
    def withIs(value: /* selector */ js.UndefOr[String] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(js.undefined)
        ret
    }
    @scala.inline
    def withIsStyle(value: (/* style */ js.UndefOr[String], /* value */ js.UndefOr[String]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStyle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIsStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTransparent(value: /* prop */ js.UndefOr[String] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTransparent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsTransparent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTransparent")(js.undefined)
        ret
    }
    @scala.inline
    def withLast(value: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(js.undefined)
        ret
    }
    @scala.inline
    def withMask(value: (/* msg */ js.UndefOr[String], /* msgCls */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
    @scala.inline
    def withNext(value: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withPrev(value: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: /* selector */ js.UndefOr[String] => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withRadioCls(value: /* className */ js.UndefOr[js.Any] => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRadioCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioCls")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveCls(value: /* className */ js.UndefOr[js.Any] => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCls")(js.undefined)
        ret
    }
    @scala.inline
    def withRepaint(value: () => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repaint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRepaint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repaint")(js.undefined)
        ret
    }
    @scala.inline
    def withReplace(value: /* el */ js.UndefOr[js.Any] => IAbstractElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReplace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceCls(value: (/* oldClassName */ js.UndefOr[String], /* newClassName */ js.UndefOr[String]) => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceCls")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReplaceCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceCls")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceWith(value: /* el */ js.UndefOr[js.Any] => IAbstractElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceWith")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReplaceWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceWith")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(
      value: (/* selector */ js.UndefOr[String], /* unique */ js.UndefOr[Boolean]) => typingsSlinky.extjs.Ext.ICompositeElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializeForm(value: /* form */ js.UndefOr[js.Any] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeForm")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSerializeForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeForm")(js.undefined)
        ret
    }
    @scala.inline
    def withSet(value: (/* o */ js.UndefOr[js.Any], /* useSet */ js.UndefOr[Boolean]) => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHTML(value: /* html */ js.UndefOr[String] => typingsSlinky.extjs.Ext.IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHTML")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHeight(value: /* height */ js.UndefOr[js.Any] => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSize(value: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any]) => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStyle(value: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[String]) => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSetVisibilityMode(value: /* mode */ js.UndefOr[js.Any] => IAbstractElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVisibilityMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetVisibilityMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVisibilityMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSetVisible(value: (/* visible */ js.UndefOr[Boolean], /* animate */ js.UndefOr[js.Any]) => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVisible")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withSetWidth(value: /* width */ js.UndefOr[js.Any] => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: /* animate */ js.UndefOr[js.Any] => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleCls(value: /* className */ js.UndefOr[String] => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToggleCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleCls")(js.undefined)
        ret
    }
    @scala.inline
    def withUnmask(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmask")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUnmask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmask")(js.undefined)
        ret
    }
    @scala.inline
    def withUp(
      value: (/* selector */ js.UndefOr[String], /* limit */ js.UndefOr[js.Any], /* returnDom */ js.UndefOr[Boolean]) => typingsSlinky.extjs.Ext.IElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: /* html */ js.UndefOr[String] => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
    @scala.inline
    def withWrap(
      value: (/* config */ js.UndefOr[js.Any], /* returnDom */ js.UndefOr[Boolean], /* selector */ js.UndefOr[String]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.undefined)
        ret
    }
  }
  
}

