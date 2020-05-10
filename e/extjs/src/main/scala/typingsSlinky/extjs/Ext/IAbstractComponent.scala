package typingsSlinky.extjs.Ext

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.extjs.Ext.enums.IWidget
import typingsSlinky.extjs.Ext.state.IStateful
import typingsSlinky.extjs.Ext.util.IPositionable
import typingsSlinky.extjs.Ext.util.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.extjs.Ext.IClass because Already inherited
- typingsSlinky.extjs.Ext.IBase because Already inherited
- typingsSlinky.extjs.Ext.util.IRenderable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined afterRender, doAutoRender, ensureAttachedToBody, getInsertPosition, initRenderData, onRender, render
- typingsSlinky.extjs.Ext.util.IElementContainer because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined addChildEls, removeChildEls
- typingsSlinky.extjs.Ext.util.IAnimate because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined animate, getActiveAnimation, hasActiveFx, sequenceFx, stopAnimation, stopFx, syncFx
- typingsSlinky.extjs.Ext.util.IPositionable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined alignTo, anchorTo, calculateConstrainedPosition, getAlignToXY, getAnchorXY, getBox, getConstrainVector, getLocalX, getLocalXY, getLocalY, getOffsetsTo, getRegion, getViewRegion, getX, getXY, getY, move, removeAnchor, setBox, setLocalX, setLocalXY, setLocalY, setRegion, setX, setXY, setY, translatePoints */ @js.native
trait IAbstractComponent extends IStateful {
  /** [Property] (Boolean) */
  var _isLayoutRoot: js.UndefOr[Boolean] = js.native
  /** [Method] Adds each argument passed to this method to the childEls array  */
  var addChildEls: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Adds a CSS class to the top level element representing this component
  		* @param cls String/String[] The CSS class name to add.
  		* @returns Ext.Component Returns the Component to allow method chaining.
  		*/
  var addClass: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], IComponent]] = js.native
  /** [Method] Adds a CSS class to the top level element representing this component
  		* @param cls String/String[] The CSS class name to add.
  		* @returns Ext.Component Returns the Component to allow method chaining.
  		*/
  var addCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], IComponent]] = js.native
  /** [Method] Adds a cls to the uiCls array which will also call addUIClsToElement and adds to all elements of this component
  		* @param classes String/String[] A string or an array of strings to add to the uiCls.
  		* @param skip Object (Boolean) skip true to skip adding it to the class and do it later (via the return).
  		*/
  var addClsWithUI: js.UndefOr[
    js.Function2[/* classes */ js.UndefOr[js.Any], /* skip */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Save a property to the given state object if it is not its default or configured value
  		* @param state Object The state object.
  		* @param propName String The name of the property on this object to save.
  		* @param value String The value of the state property (defaults to this[propName]).
  		* @returns Boolean The state object or a new object if state was null and the property was saved.
  		*/
  var addPropertyToState: js.UndefOr[
    js.Function3[
      /* state */ js.UndefOr[js.Any], 
      /* propName */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[java.lang.String], 
      Boolean
    ]
  ] = js.native
  /** [Method] Method which adds a specified UI  uiCls to the components element
  		* @param ui String The UI to remove from the element.
  		*/
  var addUIClsToElement: js.UndefOr[js.Function1[/* ui */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Called by the layout system after the Component has been laid out
  		* @param width Number The width that was set
  		* @param height Number The height that was set
  		* @param oldWidth Number/undefined The old width, or undefined if this was the initial layout.
  		* @param oldHeight Number/undefined The old height, or undefined if this was the initial layout.
  		*/
  var afterComponentLayout: js.UndefOr[
    js.Function4[
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      /* oldWidth */ js.UndefOr[js.Any], 
      /* oldHeight */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Allows addition of behavior after rendering is complete  */
  var afterRender: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Template method called after a Component has been positioned
  		* @param x Number
  		* @param y Number
  		*/
  var afterSetPosition: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Aligns the element with another element relative to the specified anchor points
  		* @param element Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or id of the element to align to.
  		* @param position String The position to align to
  		* @param offsets Number[] Offset the positioning by [x, y]
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		* @returns Ext.util.Positionable this
  		*/
  var alignTo: js.UndefOr[
    js.Function4[
      js.UndefOr[js.Any], 
      js.UndefOr[java.lang.String], 
      js.UndefOr[Array], 
      js.UndefOr[js.Any], 
      this.type | IPositionable
    ]
  ] = js.native
  /** [Method] Anchors an element to another element and realigns it when the window is resized
  		* @param element Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or id of the element to align to.
  		* @param position String The position to align to
  		* @param offsets Number[] Offset the positioning by [x, y]
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		* @param monitorScroll Boolean/Number True to monitor body scroll and reposition. If this parameter is a number, it is used as the buffer delay in milliseconds.
  		* @param callback Function The function to call after the animation finishes
  		* @returns Ext.util.Positionable this
  		*/
  var anchorTo: js.UndefOr[
    js.Function6[
      js.UndefOr[js.Any], 
      js.UndefOr[java.lang.String], 
      js.UndefOr[Array], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      this.type | IPositionable
    ]
  ] = js.native
  /** [Method] Performs custom animation on this object. ... */
  var animate: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Object) */
  var autoEl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Ext.ComponentLoader/Object/String/Boolean) */
  var autoLoad: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean/String/HTMLElement/Ext.Element) */
  var autoRender: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var autoShow: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var baseCls: js.UndefOr[java.lang.String] = js.native
  /** [Method] Template method to do any pre blur processing
  		* @param e Ext.EventObject The event object
  		*/
  var beforeBlur: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.native
  /** [Method] Occurs before componentLayout is run
  		* @param adjWidth Number The box-adjusted width that was set.
  		* @param adjHeight Number The box-adjusted height that was set.
  		*/
  var beforeComponentLayout: js.UndefOr[
    js.Function2[/* adjWidth */ js.UndefOr[Double], /* adjHeight */ js.UndefOr[Double], Unit]
  ] = js.native
  /** [Method] Invoked before the Component is destroyed  */
  var beforeDestroy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Template method to do any pre focus processing
  		* @param e Ext.EventObject The event object
  		*/
  var beforeFocus: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.native
  /** [Method] Occurs before componentLayout is run  */
  var beforeLayout: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Number/String/Boolean) */
  var border: js.UndefOr[js.Any] = js.native
  /** [Method] Calculates the new x y position to move this Positionable into a constrain region
  		* @param constrainTo String/HTMLElement/Ext.Element/Ext.util.Region The Element or Region into which this Component is to be constrained. Defaults to the element into which this Positionable was rendered, or this Component's {@link Ext.Component.constrainTo.
  		* @param proposedPosition Number[] A proposed [X, Y] position to test for validity and to coerce into constraints instead of using this Positionable's current position.
  		* @param local Boolean The proposedPosition is local (relative to floatParent if a floating Component)
  		* @param proposedSize Number[] A proposed [width, height] size to use when calculating constraints instead of using this Positionable's current size.
  		* @returns Number[] If the element needs to be translated, the new [X, Y] position within constraints if possible, giving priority to keeping the top and left edge in the constrain region. Otherwise, false.
  		*/
  var calculateConstrainedPosition: js.UndefOr[
    js.Function4[js.UndefOr[js.Any], js.UndefOr[Array], js.UndefOr[Boolean], js.UndefOr[Array], Array]
  ] = js.native
  /** [Config Option] (Object[]) */
  var childEls: js.UndefOr[Array] = js.native
  /** [Config Option] (String) */
  var cls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var componentCls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String/Object) */
  var componentLayout: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var contentEl: js.UndefOr[java.lang.String] = js.native
  /** [Property] (String) */
  var contentPaddingProperty: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Object) */
  var data: js.UndefOr[js.Any] = js.native
  /** [Method] Disable the component
  		* @param silent Boolean Passing true will suppress the disable event from being fired.
  		*/
  var disable: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var disabledCls: js.UndefOr[java.lang.String] = js.native
  /** [Method] Handles autoRender  */
  var doAutoRender: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] This method needs to be called whenever you change something on this component that requires the Component s layout t
  		* @returns Ext.container.Container this
  		*/
  var doComponentLayout: js.UndefOr[js.Function0[typingsSlinky.extjs.Ext.container.IContainer]] = js.native
  /** [Config Option] (Boolean) */
  var draggable: js.UndefOr[Boolean] = js.native
  /** [Method] Enable the component
  		* @param silent Boolean Passing true will suppress the enable event from being fired.
  		*/
  var enable: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Ensures that this component is attached to document body
  		* @param runLayout Boolean True to run the component's layout.
  		*/
  var ensureAttachedToBody: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Retrieves plugin from this component s collection by its ptype
  		* @param ptype String The Plugin's ptype as specified by the class's alias configuration.
  		* @returns Ext.AbstractPlugin plugin instance.
  		*/
  var findPlugin: js.UndefOr[js.Function1[/* ptype */ js.UndefOr[java.lang.String], IAbstractPlugin]] = js.native
  /** [Config Option] (Boolean) */
  var floating: js.UndefOr[Boolean] = js.native
  /** [Method] Forces this component to redo its componentLayout  */
  var forceComponentLayout: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var frame: js.UndefOr[Boolean] = js.native
  /** [Property] (Object) */
  var frameSize: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
  		* @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
  		*/
  var getActiveAnimation: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Gets the x y coordinates to align this element with another element
  		* @param element Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or id of the element to align to.
  		* @param position String The position to align to
  		* @param offsets Number[] Offset the positioning by [x, y]
  		* @returns Number[] [x, y]
  		*/
  var getAlignToXY: js.UndefOr[
    js.Function3[js.UndefOr[js.Any], js.UndefOr[java.lang.String], js.UndefOr[Array], Array]
  ] = js.native
  /** [Method] Gets the x y coordinates specified by the anchor position on the element
  		* @param anchor String The specified anchor position. See alignTo for details on supported anchor positions.
  		* @param local Boolean True to get the local (element top/left-relative) anchor position instead of page coordinates
  		* @param size Object An object containing the size to use for calculating anchor position {width: (target width), height: (target height)} (defaults to the element's current size)
  		* @returns Number[] [x, y] An array containing the element's x and y coordinates
  		*/
  var getAnchorXY: js.UndefOr[
    js.Function3[js.UndefOr[java.lang.String], js.UndefOr[Boolean], js.UndefOr[js.Any], Array]
  ] = js.native
  /** [Method] Return an object defining the area of this Element which can be passed to setBox to set another Element s size locati
  		* @param contentBox Boolean If true a box for the content of the element is returned.
  		* @param local Boolean If true the element's left and top relative to its offsetParent are returned instead of page x/y.
  		* @returns Object box An object in the format: {  x: &lt;Element's X position&gt;,  y: &lt;Element's Y position&gt;,  left: &lt;Element's X position (an alias for x)&gt;,  top: &lt;Element's Y position (an alias for y)&gt;,  width: &lt;Element's width&gt;,  height: &lt;Element's height&gt;,  bottom: &lt;Element's lower bound&gt;,  right: &lt;Element's rightmost bound&gt; }  The returned object may also be addressed as an Array where index 0 contains the X position and index 1 contains the Y position. The result may also be used for setXY
  		*/
  var getBox: js.UndefOr[js.Function2[js.UndefOr[Boolean], js.UndefOr[Boolean], _]] = js.native
  /** [Method] Provides the link for Observable s fireEvent method to bubble up the ownership hierarchy
  		* @returns Ext.container.Container the Container which owns this Component.
  		*/
  var getBubbleTarget: js.UndefOr[js.Function0[typingsSlinky.extjs.Ext.container.IContainer]] = js.native
  /** [Method] Returns the X Y vector by which this Positionable s element must be translated to make a best attempt to constrain
  		* @param constrainTo Ext.util.Positionable/HTMLElement/String/Ext.util.Region The Positionable, HTMLElement, element id, or Region into which the element is to be constrained.
  		* @param proposedPosition Number[] A proposed [X, Y] position to test for validity and to produce a vector for instead of using the element's current position
  		* @param proposedSize Number[] A proposed [width, height] size to constrain instead of using the element's current size
  		* @returns Number[]/Boolean If the element needs to be translated, an [X, Y] vector by which this element must be translated. Otherwise, false.
  		*/
  var getConstrainVector: js.UndefOr[js.Function3[js.UndefOr[js.Any], js.UndefOr[Array], js.UndefOr[Array], _]] = js.native
  /** [Method] Retrieves the top level element representing this component
  		* @returns Ext.dom.Element
  		*/
  var getEl: js.UndefOr[js.Function0[typingsSlinky.extjs.Ext.dom.IElement]] = js.native
  /** [Method] Gets the current height of the component s underlying element
  		* @returns Number
  		*/
  var getHeight: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Retrieves the id of this component
  		* @returns String
  		*/
  var getId: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] This function takes the position argument passed to onRender and returns a DOM element that you can use in the insert
  		* @param position String/Number/Ext.dom.Element/HTMLElement Index, element id or element you want to put this component before.
  		* @returns HTMLElement DOM element that you can use in the insertBefore
  		*/
  var getInsertPosition: js.UndefOr[js.Function1[js.UndefOr[js.Any], HTMLElement]] = js.native
  /** [Method] Returns the value of itemId assigned to this component or when that is not set returns the value of id
  		* @returns String
  		*/
  var getItemId: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Gets the Ext ComponentLoader for this Component
  		* @returns Ext.ComponentLoader The loader instance, null if it doesn't exist.
  		*/
  var getLoader: js.UndefOr[js.Function0[IComponentLoader]] = js.native
  /** [Method] Overridden in Ext rtl AbstractComponent
  		* @returns Number The local x coordinate
  		*/
  var getLocalX: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Overridden in Ext rtl AbstractComponent
  		* @returns Number[] The local XY position of the element
  		*/
  var getLocalXY: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the y coordinate of this element reletive to its offsetParent
  		* @returns Number The local y coordinate
  		*/
  var getLocalY: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the offsets of this element from the passed element
  		* @param offsetsTo Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or element id to get get the offsets from.
  		* @returns Number[] The XY page offsets (e.g. [100, -200])
  		*/
  var getOffsetsTo: js.UndefOr[js.Function1[js.UndefOr[js.Any], Array]] = js.native
  /** [Method] Retrieves a plugin from this component s collection by its pluginId
  		* @param pluginId String
  		* @returns Ext.AbstractPlugin plugin instance.
  		*/
  var getPlugin: js.UndefOr[js.Function1[/* pluginId */ js.UndefOr[java.lang.String], IAbstractPlugin]] = js.native
  /** [Method] Returns a region object that defines the area of this element
  		* @returns Ext.util.Region A Region containing "top, left, bottom, right" properties.
  		*/
  var getRegion: js.UndefOr[js.Function0[IRegion]] = js.native
  /** [Method] Gets the current size of the component s underlying element
  		* @returns Object An object containing the element's size {width: (element width), height: (element height)}
  		*/
  var getSize: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns an object that describes how this component s width and height are managed
  		* @param ownerCtSizeModel Object
  		* @returns Object The size model for this component.
  		*/
  var getSizeModel: js.UndefOr[js.Function1[/* ownerCtSizeModel */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns the content region of this element
  		* @returns Ext.util.Region A Region containing "top, left, bottom, right" member data.
  		*/
  var getViewRegion: js.UndefOr[js.Function0[IRegion]] = js.native
  /** [Method] Gets the current width of the component s underlying element
  		* @returns Number
  		*/
  var getWidth: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Gets the current X position of the DOM element based on page coordinates
  		* @returns Number The X position of the element
  		*/
  var getX: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns this Component s xtype hierarchy as a slash delimited string
  		* @returns String The xtype hierarchy string
  		*/
  var getXTypes: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Gets the current position of the DOM element based on page coordinates
  		* @returns Number[] The XY position of the element
  		*/
  var getXY: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Gets the current Y position of the DOM element based on page coordinates
  		* @returns Number The Y position of the element
  		*/
  var getY: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
  		* @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
  		*/
  var hasActiveFx: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Checks if the specified CSS class exists on this element s DOM node
  		* @param className String The CSS class to check for.
  		* @returns Boolean true if the class exists, else false.
  		*/
  var hasCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[java.lang.String], Boolean]] = js.native
  /** [Method] Checks if there is currently a specified uiCls
  		* @param cls String The cls to check.
  		*/
  var hasUICls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Config Option] (Number) */
  var height: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var hideMode: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String/Object) */
  var html: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var id: js.UndefOr[java.lang.String] = js.native
  /** [Method] Initialize any events on this component */
  var initEvents: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Initialized the renderData to be used when rendering the renderTpl
  		* @returns Object Object with keys and values that are going to be applied to the renderTpl
  		*/
  var initRenderData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Tests whether this Component matches the selector string
  		* @param selector String The selector string to test against.
  		* @returns Boolean true if this Component matches the selector.
  		*/
  var is: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], Boolean]] = js.native
  /** [Property] (Boolean) */
  var isComponent: js.UndefOr[Boolean] = js.native
  /** [Method] Determines whether this component is the descendant of a particular container
  		* @param container Ext.Container
  		* @returns Boolean true if the component is the descendant of a particular container, otherwise false.
  		*/
  var isDescendantOf: js.UndefOr[js.Function1[/* container */ js.UndefOr[IContainer], Boolean]] = js.native
  /** [Method] Method to determine whether this Component is currently disabled
  		* @returns Boolean the disabled state of this Component.
  		*/
  var isDisabled: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Method to determine whether this Component is draggable
  		* @returns Boolean the draggable state of this component.
  		*/
  var isDraggable: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Method to determine whether this Component is droppable
  		* @returns Boolean the droppable state of this component.
  		*/
  var isDroppable: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Method to determine whether this Component is floating
  		* @returns Boolean the floating state of this component.
  		*/
  var isFloating: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Method to determine whether this Component is currently set to hidden
  		* @returns Boolean the hidden state of this Component.
  		*/
  var isHidden: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Determines whether this Component is the root of a layout  */
  var isLayoutRoot: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns true if layout is suspended for this component
  		* @returns Boolean true layout of this component is suspended.
  		*/
  var isLayoutSuspended: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if this component is visible
  		* @param deep Boolean Pass true to interrogate the visibility status of all parent Containers to determine whether this Component is truly visible to the user. Generally, to determine whether a Component is hidden, the no argument form is needed. For example when creating dynamically laid out UIs in a hidden Container before showing them.
  		* @returns Boolean true if this component is visible, false otherwise.
  		*/
  var isVisible: js.UndefOr[js.Function1[/* deep */ js.UndefOr[Boolean], Boolean]] = js.native
  /** [Method] Tests whether or not this Component is of a specific xtype
  		* @param xtype String The xtype to check for this Component
  		* @param shallow Boolean true to check whether this Component is directly of the specified xtype, false to check whether this Component is descended from the xtype.
  		* @returns Boolean true if this component descends from the specified xtype, false otherwise.
  		*/
  var isXType: js.UndefOr[
    js.Function2[/* xtype */ js.UndefOr[java.lang.String], /* shallow */ js.UndefOr[Boolean], Boolean]
  ] = js.native
  /** [Config Option] (String) */
  var itemId: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Ext.ComponentLoader/Object) */
  var loader: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number/String) */
  var margin: js.UndefOr[js.Any] = js.native
  /** [Property] (Boolean) */
  var maskOnDisable: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var maxHeight: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var maxWidth: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minHeight: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minWidth: js.UndefOr[Double] = js.native
  /** [Method] Move the element relative to its current position
  		* @param direction String Possible values are:  "l" (or "left") "r" (or "right") "t" (or "top", or "up") "b" (or "bottom", or "down")
  		* @param distance Number How far to move the element in pixels
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		*/
  var move: js.UndefOr[
    js.Function3[js.UndefOr[java.lang.String], js.UndefOr[Double], js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Returns the next node in the Component tree in tree traversal order
  		* @param selector String A ComponentQuery selector to filter the following nodes.
  		* @returns Ext.Component The next node (or the next node which matches the selector). Returns null if there is no matching node.
  		*/
  var nextNode: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], IComponent]] = js.native
  /** [Method] Returns the next sibling of this Component
  		* @param selector String A ComponentQuery selector to filter the following items.
  		* @returns Ext.Component The next sibling (or the next sibling which matches the selector). Returns null if there is no matching sibling.
  		*/
  var nextSibling: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], IComponent]] = js.native
  /** [Method] Method to manage awareness of when components are added to their respective Container firing an added event
  		* @param container Ext.container.Container Container which holds the component.
  		* @param pos Number Position at which the component was added.
  		*/
  var onAdded: js.UndefOr[
    js.Function2[
      /* container */ js.UndefOr[typingsSlinky.extjs.Ext.container.IContainer], 
      /* pos */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Allows addition of behavior to the disable operation  */
  var onDisable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Allows addition of behavior to the enable operation  */
  var onEnable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Called after the component is moved this method is empty by default but can be implemented by any subclass that need
  		* @param x Number The new x position.
  		* @param y Number The new y position.
  		*/
  var onPosition: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Method to manage awareness of when components are removed from their respective Container firing a removed event
  		* @param destroying Boolean Will be passed as true if the Container performing the remove operation will delete this Component upon remove.
  		*/
  var onRemoved: js.UndefOr[js.Function1[/* destroying */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Template method called when this Component s DOM structure is created
  		* @param parentNode Ext.core.Element The parent Element in which this Component's encapsulating element is contained.
  		* @param containerIdx Number The index within the parent Container's child collection of this Component.
  		*/
  var onRender: js.UndefOr[
    js.Function2[js.UndefOr[typingsSlinky.extjs.Ext.core.IElement], js.UndefOr[Double], Unit]
  ] = js.native
  /** [Method] Allows addition of behavior to the resize operation
  		* @param width Object
  		* @param height Object
  		* @param oldWidth Object
  		* @param oldHeight Object
  		*/
  var onResize: js.UndefOr[
    js.Function4[
      /* width */ js.UndefOr[js.Any], 
      /* height */ js.UndefOr[js.Any], 
      /* oldWidth */ js.UndefOr[js.Any], 
      /* oldHeight */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (String) */
  var overCls: js.UndefOr[java.lang.String] = js.native
  /** [Property] (Ext.Container) */
  var ownerCt: js.UndefOr[IContainer] = js.native
  /** [Config Option] (Number/String) */
  var padding: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Ext.AbstractPlugin[]/Ext.AbstractPlugin/Object[]/Object/Ext.enums.Plugin[]/Ext.enums.Plugin) */
  var plugins: js.UndefOr[js.Any] = js.native
  /** [Method] Template method to do any post blur processing
  		* @param e Ext.EventObject The event object
  		*/
  var postBlur: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.native
  /** [Method] Returns the previous node in the Component tree in tree traversal order
  		* @param selector String A ComponentQuery selector to filter the preceding nodes.
  		* @returns Ext.Component The previous node (or the previous node which matches the selector). Returns null if there is no matching node.
  		*/
  var previousNode: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], IComponent]] = js.native
  /** [Method] Returns the previous sibling of this Component
  		* @param selector String A ComponentQuery selector to filter the preceding items.
  		* @returns Ext.Component The previous sibling (or the previous sibling which matches the selector). Returns null if there is no matching sibling.
  		*/
  var previousSibling: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], IComponent]] = js.native
  /** [Method] Called by Component doAutoRender Register a Container configured floating true with this Component s ZIndexManager
  		* @param cmp Object
  		*/
  var registerFloatingItem: js.UndefOr[js.Function1[/* cmp */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Remove any anchor to this element
  		* @returns Ext.util.Positionable this
  		*/
  var removeAnchor: js.UndefOr[js.Function0[this.type | IPositionable]] = js.native
  /** [Method] Removes items in the childEls array based on the return value of a supplied test function
  		* @param testFn Function The test function.
  		*/
  var removeChildEls: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Removes a CSS class from the top level element representing this component
  		* @param cls String/String[] The CSS class name to remove.
  		* @returns Ext.Component Returns the Component to allow method chaining.
  		*/
  var removeCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], IComponent]] = js.native
  /** [Method] Removes a cls to the uiCls array which will also call removeUIClsFromElement and removes it from all elements of thi
  		* @param cls String/String[] A string or an array of strings to remove to the uiCls.
  		*/
  var removeClsWithUI: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Method which removes a specified UI  uiCls from the components element
  		* @param ui String The UI to add to the element.
  		*/
  var removeUIClsFromElement: js.UndefOr[js.Function1[/* ui */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Renders the Component into the passed HTML element
  		* @param container Ext.Element/HTMLElement/String The element this Component should be rendered into. If it is being created from existing markup, this should be omitted.
  		* @param position String/Number The element ID or DOM node index within the container before which this component will be inserted (defaults to appending to the end of the container)
  		*/
  var render: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Object) */
  var renderData: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var renderSelectors: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var renderTo: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Ext.XTemplate/String/String[]) */
  var renderTpl: js.UndefOr[js.Any] = js.native
  /** [Property] (Boolean) */
  var rendered: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var rtl: js.UndefOr[Boolean] = js.native
  /** [Method] Ensures that all effects queued after sequenceFx is called on this object are run in sequence
  		* @returns Object this
  		*/
  var sequenceFx: js.UndefOr[js.Function0[_]] = js.native
  /** [Method]
  		* @param border String/Number The border, see border. If a falsey value is passed the border will be removed.
  		*/
  var setBorder: js.UndefOr[js.Function1[/* border */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the element s box
  		* @param box Object The box to fill {x, y, width, height}
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		* @returns Ext.util.Positionable this
  		*/
  var setBox: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], this.type | IPositionable]] = js.native
  /** [Method] Enable or disable the component
  		* @param disabled Boolean true to disable.
  		*/
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the dock position of this component in its parent panel
  		* @param dock Object The dock position.
  		* @param layoutParent Boolean true to re-layout parent.
  		* @returns Ext.Component this
  		*/
  var setDocked: js.UndefOr[
    js.Function2[/* dock */ js.UndefOr[js.Any], /* layoutParent */ js.UndefOr[Boolean], IComponent]
  ] = js.native
  /** [Method] Sets the height of the component
  		* @param height Number The new height to set. This may be one of:  A Number specifying the new height in the Element's Ext.Element.defaultUnits (by default, pixels). A String used to set the CSS height style. undefined to leave the height unchanged.
  		* @returns Ext.Component this
  		*/
  var setHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[Double], IComponent]] = js.native
  /** [Method] Overridden in Ext rtl AbstractComponent
  		* @param x Object
  		* @returns Ext.util.Positionable this
  		*/
  var setLocalX: js.UndefOr[js.Function1[js.UndefOr[js.Any | Double], this.type | IPositionable]] = js.native
  /** [Method] Overridden in Ext rtl AbstractComponent
  		* @param x Object
  		* @param y Object
  		* @returns Ext.util.Positionable this
  		*/
  var setLocalXY: js.UndefOr[
    js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any | Double], this.type | IPositionable]
  ] = js.native
  /** [Method] Sets the local y coordinate of this element using CSS style
  		* @param y Object
  		* @returns Ext.util.Positionable this
  		*/
  var setLocalY: js.UndefOr[js.Function1[js.UndefOr[js.Any | Double], this.type | IPositionable]] = js.native
  /** [Method] Sets the margin on the target element
  		* @param margin Number/String The margin to set. See the margin config.
  		*/
  var setMargin: js.UndefOr[js.Function1[/* margin */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the element s position and size to the specified region
  		* @param region Ext.util.Region The region to fill
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		* @returns Ext.util.Positionable this
  		*/
  var setRegion: js.UndefOr[js.Function2[js.UndefOr[IRegion], js.UndefOr[js.Any], this.type | IPositionable]] = js.native
  /** [Method] Sets the width and height of this Component
  		* @param width Number/String/Object The new width to set. This may be one of:  A Number specifying the new width in the Element's Ext.Element.defaultUnits (by default, pixels). A String used to set the CSS width style. A size object in the format {width: widthValue, height: heightValue}. undefined to leave the width unchanged.
  		* @param height Number/String The new height to set (not required if a size object is passed as the first arg). This may be one of:  A Number specifying the new height in the Element's Ext.Element.defaultUnits (by default, pixels). A String used to set the CSS height style. Animation may not be used. undefined to leave the height unchanged.
  		* @returns Ext.Component this
  		*/
  var setSize: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], IComponent]
  ] = js.native
  /** [Method] Sets the UI for the component
  		* @param ui String The new UI for the component.
  		*/
  var setUI: js.UndefOr[js.Function1[/* ui */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Convenience function to hide or show this component by Boolean
  		* @param visible Boolean true to show, false to hide.
  		* @returns Ext.Component this
  		*/
  var setVisible: js.UndefOr[js.Function1[/* visible */ js.UndefOr[Boolean], IComponent]] = js.native
  /** [Method] Sets the width of the component
  		* @param width Number The new width to setThis may be one of:  A Number specifying the new width in the Element's Ext.Element.defaultUnits (by default, pixels). A String used to set the CSS width style.
  		* @returns Ext.Component this
  		*/
  var setWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[Double], IComponent]] = js.native
  /** [Method] Sets the X position of the DOM element based on page coordinates
  		* @param x Object
  		* @param animate Object
  		* @returns Ext.util.Positionable this
  		*/
  var setX: js.UndefOr[
    js.Function2[js.UndefOr[js.Any | Double], js.UndefOr[js.Any], this.type | IPositionable]
  ] = js.native
  /** [Method] Sets the position of the DOM element in page coordinates
  		* @param xy Object
  		* @param animate Object
  		* @returns Ext.util.Positionable this
  		*/
  var setXY: js.UndefOr[
    js.Function2[js.UndefOr[js.Any | Array], js.UndefOr[js.Any], this.type | IPositionable]
  ] = js.native
  /** [Method] Sets the Y position of the DOM element based on page coordinates
  		* @param y Object
  		* @param animate Object
  		* @returns Ext.util.Positionable this
  		*/
  var setY: js.UndefOr[
    js.Function2[js.UndefOr[js.Any | Double], js.UndefOr[js.Any], this.type | IPositionable]
  ] = js.native
  /** [Config Option] (Boolean/Number) */
  var shrinkWrap: js.UndefOr[js.Any] = js.native
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
  		* @returns Ext.Element The Element
  		*/
  var stopAnimation: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
  		* @returns Ext.Element The Element
  		*/
  var stopFx: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Config Option] (String/Object) */
  var style: js.UndefOr[js.Any] = js.native
  /** [Method] Ensures that all effects queued after syncFx is called on this object are run concurrently
  		* @returns Object this
  		*/
  var syncFx: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Ext.XTemplate/Ext.Template/String/String[]) */
  var tpl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var tplWriteMode: js.UndefOr[java.lang.String] = js.native
  /** [Method] Translates the passed page coordinates into left top css values for the element
  		* @param x Number/Array The page x or an array containing [x, y]
  		* @param y Number The page y, required if x is not an array
  		* @returns Object An object with left and top properties. e.g. {left: (value), top: (value)}
  		*/
  var translatePoints: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[Double], _]] = js.native
  /** [Config Option] (String) */
  var ui: js.UndefOr[java.lang.String] = js.native
  /** [Method] Navigates up the ownership hierarchy searching for an ancestor Container which matches any passed simple selector or
  		* @param selector String/Ext.Component The simple selector component or actual component to test. If not passed the immediate owner/activater is returned.
  		* @param limit String/Number/Ext.Component This may be a selector upon which to stop the upward scan, or a limit of teh number of steps, or Component reference to stop on.
  		* @returns Ext.container.Container The matching ancestor Container (or undefined if no match was found).
  		*/
  var up: js.UndefOr[
    js.Function2[
      /* selector */ js.UndefOr[js.Any], 
      /* limit */ js.UndefOr[js.Any], 
      typingsSlinky.extjs.Ext.container.IContainer
    ]
  ] = js.native
  /** [Method] Update the content area of a component
  		* @param htmlOrData String/Object If this component has been configured with a template via the tpl config then it will use this argument as data to populate the template. If this component was not configured with a template, the components content area will be updated via Ext.Element update.
  		* @param loadScripts Boolean Only legitimate when using the html configuration.
  		* @param callback Function Only legitimate when using the html configuration. Callback to execute when scripts have finished loading.
  		*/
  var update: js.UndefOr[
    js.Function3[
      /* htmlOrData */ js.UndefOr[js.Any], 
      /* loadScripts */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Updates this component s layout
  		* @param options Object An object with layout options.
  		*/
  var updateLayout: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Number) */
  var width: js.UndefOr[Double] = js.native
  /** [Config Option] (Ext.enums.Widget) */
  var xtype: js.UndefOr[IWidget] = js.native
}

object IAbstractComponent {
  @scala.inline
  def apply(): IAbstractComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractComponent]
  }
  @scala.inline
  implicit class IAbstractComponentOps[Self <: IAbstractComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_isLayoutRoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_isLayoutRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_isLayoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_isLayoutRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withAddChildEls(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addChildEls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAddChildEls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addChildEls")(js.undefined)
        ret
    }
    @scala.inline
    def withAddClass(value: /* cls */ js.UndefOr[js.Any] => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClass")(js.undefined)
        ret
    }
    @scala.inline
    def withAddCls(value: /* cls */ js.UndefOr[js.Any] => IComponent): Self = {
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
    def withAddClsWithUI(value: (/* classes */ js.UndefOr[js.Any], /* skip */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClsWithUI")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAddClsWithUI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClsWithUI")(js.undefined)
        ret
    }
    @scala.inline
    def withAddPropertyToState(
      value: (/* state */ js.UndefOr[js.Any], /* propName */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[java.lang.String]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPropertyToState")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAddPropertyToState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPropertyToState")(js.undefined)
        ret
    }
    @scala.inline
    def withAddUIClsToElement(value: /* ui */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addUIClsToElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddUIClsToElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addUIClsToElement")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterComponentLayout(
      value: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], /* oldWidth */ js.UndefOr[js.Any], /* oldHeight */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterComponentLayout")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAfterComponentLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterComponentLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterRender(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRender")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRender")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterSetPosition(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSetPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterSetPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSetPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignTo(
      value: (js.UndefOr[js.Any], js.UndefOr[java.lang.String], js.UndefOr[Array], js.UndefOr[js.Any]) => IAbstractComponent | IPositionable
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignTo")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAlignTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignTo")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchorTo(
      value: (js.UndefOr[js.Any], js.UndefOr[java.lang.String], js.UndefOr[Array], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => IAbstractComponent | IPositionable
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorTo")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutAnchorTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorTo")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoEl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoEl")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoLoad(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoRender(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRender")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoShow")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseCls")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeBlur(value: /* e */ js.UndefOr[IEventObject] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeComponentLayout(value: (/* adjWidth */ js.UndefOr[Double], /* adjHeight */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeComponentLayout")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeComponentLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeComponentLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDestroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeFocus(value: /* e */ js.UndefOr[IEventObject] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeLayout(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLayout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withCalculateConstrainedPosition(value: (js.UndefOr[js.Any], js.UndefOr[Array], js.UndefOr[Boolean], js.UndefOr[Array]) => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateConstrainedPosition")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutCalculateConstrainedPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateConstrainedPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withChildEls(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childEls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildEls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childEls")(js.undefined)
        ret
    }
    @scala.inline
    def withCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentCls")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentLayout(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withContentEl(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEl")(js.undefined)
        ret
    }
    @scala.inline
    def withContentPaddingProperty(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentPaddingProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentPaddingProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentPaddingProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledCls")(js.undefined)
        ret
    }
    @scala.inline
    def withDoAutoRender(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doAutoRender")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDoAutoRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doAutoRender")(js.undefined)
        ret
    }
    @scala.inline
    def withDoComponentLayout(value: () => typingsSlinky.extjs.Ext.container.IContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doComponentLayout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDoComponentLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doComponentLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withEnsureAttachedToBody(value: js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ensureAttachedToBody")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEnsureAttachedToBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ensureAttachedToBody")(js.undefined)
        ret
    }
    @scala.inline
    def withFindPlugin(value: /* ptype */ js.UndefOr[java.lang.String] => IAbstractPlugin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findPlugin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFindPlugin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findPlugin")(js.undefined)
        ret
    }
    @scala.inline
    def withFloating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floating")(js.undefined)
        ret
    }
    @scala.inline
    def withForceComponentLayout(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceComponentLayout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutForceComponentLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceComponentLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withFrame(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameSize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGetActiveAnimation(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveAnimation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetActiveAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAlignToXY(value: (js.UndefOr[js.Any], js.UndefOr[java.lang.String], js.UndefOr[Array]) => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAlignToXY")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGetAlignToXY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAlignToXY")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAnchorXY(value: (js.UndefOr[java.lang.String], js.UndefOr[Boolean], js.UndefOr[js.Any]) => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnchorXY")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGetAnchorXY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnchorXY")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBox(value: (js.UndefOr[Boolean], js.UndefOr[Boolean]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBox")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBox")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBubbleTarget(value: () => typingsSlinky.extjs.Ext.container.IContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBubbleTarget")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBubbleTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBubbleTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withGetConstrainVector(value: (js.UndefOr[js.Any], js.UndefOr[Array], js.UndefOr[Array]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConstrainVector")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGetConstrainVector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConstrainVector")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEl(value: () => typingsSlinky.extjs.Ext.dom.IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEl")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGetId(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.undefined)
        ret
    }
    @scala.inline
    def withGetInsertPosition(value: js.UndefOr[js.Any] => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInsertPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetInsertPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInsertPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemId(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemId")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLoader(value: () => IComponentLoader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLoader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLoader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLoader")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLocalX(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocalX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLocalX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocalX")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLocalXY(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocalXY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLocalXY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocalXY")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLocalY(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocalY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLocalY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocalY")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOffsetsTo(value: js.UndefOr[js.Any] => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffsetsTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetOffsetsTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffsetsTo")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPlugin(value: /* pluginId */ js.UndefOr[java.lang.String] => IAbstractPlugin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPlugin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetPlugin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPlugin")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRegion(value: () => IRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRegion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSize(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSizeModel(value: /* ownerCtSizeModel */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSizeModel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetSizeModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSizeModel")(js.undefined)
        ret
    }
    @scala.inline
    def withGetViewRegion(value: () => IRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewRegion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetViewRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withGetWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGetX(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getX")(js.undefined)
        ret
    }
    @scala.inline
    def withGetXTypes(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXTypes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetXTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withGetXY(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetXY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXY")(js.undefined)
        ret
    }
    @scala.inline
    def withGetY(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getY")(js.undefined)
        ret
    }
    @scala.inline
    def withHasActiveFx(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasActiveFx")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHasActiveFx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasActiveFx")(js.undefined)
        ret
    }
    @scala.inline
    def withHasCls(value: /* className */ js.UndefOr[java.lang.String] => Boolean): Self = {
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
    def withHasUICls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasUICls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHasUICls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasUICls")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withHideMode(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideMode")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: java.lang.String): Self = {
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
    def withInitEvents(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initEvents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInitEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withInitRenderData(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initRenderData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInitRenderData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initRenderData")(js.undefined)
        ret
    }
    @scala.inline
    def withIs(value: /* selector */ js.UndefOr[java.lang.String] => Boolean): Self = {
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
    def withIsComponent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDescendantOf(value: /* container */ js.UndefOr[IContainer] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDescendantOf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsDescendantOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDescendantOf")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDisabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDraggable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDraggable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDraggable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDroppable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDroppable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsDroppable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDroppable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFloating(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFloating")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsFloating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFloating")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHidden(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHidden")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLayoutRoot(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLayoutRoot")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsLayoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLayoutRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLayoutSuspended(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLayoutSuspended")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsLayoutSuspended: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLayoutSuspended")(js.undefined)
        ret
    }
    @scala.inline
    def withIsVisible(value: /* deep */ js.UndefOr[Boolean] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withIsXType(value: (/* xtype */ js.UndefOr[java.lang.String], /* shallow */ js.UndefOr[Boolean]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isXType")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIsXType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isXType")(js.undefined)
        ret
    }
    @scala.inline
    def withItemId(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(js.undefined)
        ret
    }
    @scala.inline
    def withLoader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskOnDisable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskOnDisable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskOnDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskOnDisable")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMove(value: (js.UndefOr[java.lang.String], js.UndefOr[Double], js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.undefined)
        ret
    }
    @scala.inline
    def withNextNode(value: /* selector */ js.UndefOr[java.lang.String] => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNextNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextNode")(js.undefined)
        ret
    }
    @scala.inline
    def withNextSibling(value: /* selector */ js.UndefOr[java.lang.String] => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSibling")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNextSibling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSibling")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAdded(
      value: (/* container */ js.UndefOr[typingsSlinky.extjs.Ext.container.IContainer], /* pos */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDisable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisable")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPosition(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemoved(value: /* destroying */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemoved")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemoved")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRender(value: (js.UndefOr[typingsSlinky.extjs.Ext.core.IElement], js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRender")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResize(
      value: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], /* oldWidth */ js.UndefOr[js.Any], /* oldHeight */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.undefined)
        ret
    }
    @scala.inline
    def withOverCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overCls")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerCt(value: IContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerCt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerCt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerCt")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withPostBlur(value: /* e */ js.UndefOr[IEventObject] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPostBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousNode(value: /* selector */ js.UndefOr[java.lang.String] => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPreviousNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousNode")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousSibling(value: /* selector */ js.UndefOr[java.lang.String] => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSibling")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPreviousSibling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSibling")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisterFloatingItem(value: /* cmp */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerFloatingItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRegisterFloatingItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerFloatingItem")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAnchor(value: () => IAbstractComponent | IPositionable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAnchor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRemoveAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveChildEls(value: js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeChildEls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveChildEls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeChildEls")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveCls(value: /* cls */ js.UndefOr[js.Any] => IComponent): Self = {
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
    def withRemoveClsWithUI(value: /* cls */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClsWithUI")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveClsWithUI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClsWithUI")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveUIClsFromElement(value: /* ui */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeUIClsFromElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveUIClsFromElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeUIClsFromElement")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderData")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderSelectors(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSelectors")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderTo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTo")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withRendered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(js.undefined)
        ret
    }
    @scala.inline
    def withRtl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(js.undefined)
        ret
    }
    @scala.inline
    def withSequenceFx(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceFx")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSequenceFx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceFx")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBorder(value: /* border */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBorder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBox(value: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => IAbstractComponent | IPositionable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBox")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBox")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDisabled(value: /* disabled */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDocked(value: (/* dock */ js.UndefOr[js.Any], /* layoutParent */ js.UndefOr[Boolean]) => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDocked")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetDocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDocked")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHeight(value: /* height */ js.UndefOr[Double] => IComponent): Self = {
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
    def withSetLocalX(value: js.UndefOr[js.Any | Double] => IAbstractComponent | IPositionable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLocalX")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLocalX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLocalX")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLocalXY(value: (js.UndefOr[js.Any], js.UndefOr[js.Any | Double]) => IAbstractComponent | IPositionable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLocalXY")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetLocalXY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLocalXY")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLocalY(value: js.UndefOr[js.Any | Double] => IAbstractComponent | IPositionable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLocalY")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLocalY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLocalY")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMargin(value: /* margin */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMargin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRegion(value: (js.UndefOr[IRegion], js.UndefOr[js.Any]) => IAbstractComponent | IPositionable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRegion")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSize(value: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any]) => IComponent): Self = {
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
    def withSetUI(value: /* ui */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUI")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUI")(js.undefined)
        ret
    }
    @scala.inline
    def withSetVisible(value: /* visible */ js.UndefOr[Boolean] => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVisible")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withSetWidth(value: /* width */ js.UndefOr[Double] => IComponent): Self = {
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
    def withSetX(value: (js.UndefOr[js.Any | Double], js.UndefOr[js.Any]) => IAbstractComponent | IPositionable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setX")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setX")(js.undefined)
        ret
    }
    @scala.inline
    def withSetXY(value: (js.UndefOr[js.Any | Array], js.UndefOr[js.Any]) => IAbstractComponent | IPositionable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXY")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetXY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXY")(js.undefined)
        ret
    }
    @scala.inline
    def withSetY(value: (js.UndefOr[js.Any | Double], js.UndefOr[js.Any]) => IAbstractComponent | IPositionable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setY")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setY")(js.undefined)
        ret
    }
    @scala.inline
    def withShrinkWrap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrinkWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShrinkWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrinkWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withStopAnimation(value: () => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopAnimation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutStopAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withStopFx(value: () => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopFx")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutStopFx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopFx")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncFx(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncFx")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSyncFx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncFx")(js.undefined)
        ret
    }
    @scala.inline
    def withTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpl")(js.undefined)
        ret
    }
    @scala.inline
    def withTplWriteMode(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tplWriteMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTplWriteMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tplWriteMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslatePoints(value: (js.UndefOr[js.Any], js.UndefOr[Double]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translatePoints")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTranslatePoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translatePoints")(js.undefined)
        ret
    }
    @scala.inline
    def withUi(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui")(js.undefined)
        ret
    }
    @scala.inline
    def withUp(
      value: (/* selector */ js.UndefOr[js.Any], /* limit */ js.UndefOr[js.Any]) => typingsSlinky.extjs.Ext.container.IContainer
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(
      value: (/* htmlOrData */ js.UndefOr[js.Any], /* loadScripts */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateLayout(value: /* options */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateLayout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdateLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withXtype(value: IWidget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXtype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xtype")(js.undefined)
        ret
    }
  }
  
}

