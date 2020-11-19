package typingsSlinky.extjs.global.Ext

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.extjs.Ext.IAbstractPlugin
import typingsSlinky.extjs.Ext.IBase
import typingsSlinky.extjs.Ext.IClass
import typingsSlinky.extjs.Ext.IComponent
import typingsSlinky.extjs.Ext.IComponentLoader
import typingsSlinky.extjs.Ext.IEventObject
import typingsSlinky.extjs.Ext.ILoadMask
import typingsSlinky.extjs.Ext.IZIndexManager
import typingsSlinky.extjs.Ext.container.IAbstractContainer
import typingsSlinky.extjs.Ext.dom.IElement
import typingsSlinky.extjs.Ext.layout.container.IContainer
import typingsSlinky.extjs.Ext.panel.IPanel
import typingsSlinky.extjs.Ext.util.IAbstractMixedCollection
import typingsSlinky.extjs.Ext.util.IComponentDragger
import typingsSlinky.extjs.Ext.util.IPositionable
import typingsSlinky.extjs.Ext.util.IRegion
import typingsSlinky.extjs.Ext.window.IMessageBox
import typingsSlinky.extjs.Ext.window.IWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.MessageBox")
@js.native
class MessageBox ()
  extends typingsSlinky.extjs.Ext.MessageBox
/* static members */
@JSGlobal("Ext.MessageBox")
@js.native
object MessageBox extends js.Object {
  
  /** [Property] (Number) */
  var CANCEL: Double = js.native
  
  /** [Property] (String) */
  var ERROR: java.lang.String = js.native
  
  /** [Property] (String) */
  var INFO: java.lang.String = js.native
  
  /** [Property] (Number) */
  var NO: Double = js.native
  
  /** [Property] (Number) */
  var OK: Double = js.native
  
  /** [Property] (Number) */
  var OKCANCEL: Double = js.native
  
  /** [Property] (String) */
  var QUESTION: java.lang.String = js.native
  
  /** [Property] (String) */
  var WARNING: java.lang.String = js.native
  
  /** [Property] (Number) */
  var YES: Double = js.native
  
  /** [Property] (Number) */
  var YESNO: Double = js.native
  
  /** [Property] (Number) */
  var YESNOCANCEL: Double = js.native
  
  /** [Property] (Boolean) */
  var _isLayoutRoot: Boolean = js.native
  
  /** [Method] Adds Component s to this Container
    * @param component Ext.Component[]|Object[]/Ext.Component.../Object... Either one or more Components to add or an Array of Components to add. See items for additional information.
    * @returns Ext.Component[]/Ext.Component The Components that were added.
    */
  def add(): js.Any = js.native
  def add(component: js.Any): js.Any = js.native
  
  /** [Method] Adds a CSS class to the body element
    * @param cls String The class to add
    * @returns Ext.panel.Panel this
    */
  def addBodyCls(): IPanel = js.native
  def addBodyCls(cls: java.lang.String): IPanel = js.native
  
  /** [Method] Adds each argument passed to this method to the childEls array  */
  def addChildEls(): Unit = js.native
  
  /** [Method] Adds a CSS class to the top level element representing this component
    * @param cls String/String[] The CSS class name to add.
    * @returns Ext.Component Returns the Component to allow method chaining.
    */
  def addClass(): IComponent = js.native
  def addClass(cls: js.Any): IComponent = js.native
  
  /** [Method] Adds a CSS class to the top level element representing this component
    * @param cls String/String[] The CSS class name to add.
    * @returns Ext.Component Returns the Component to allow method chaining.
    */
  def addCls(): IComponent = js.native
  def addCls(cls: js.Any): IComponent = js.native
  
  /** [Method] Adds a cls to the uiCls array which will also call addUIClsToElement and adds to all elements of this component
    * @param classes String/String[] A string or an array of strings to add to the uiCls.
    * @param skip Object (Boolean) skip true to skip adding it to the class and do it later (via the return).
    */
  def addClsWithUI(): Unit = js.native
  def addClsWithUI(classes: js.UndefOr[scala.Nothing], skip: js.Any): Unit = js.native
  def addClsWithUI(classes: js.Any): Unit = js.native
  def addClsWithUI(classes: js.Any, skip: js.Any): Unit = js.native
  
  /** [Method] Adds docked item s to the container
    * @param component Object/Object[] The Component or array of components to add. The components must include a 'dock' parameter on each component to indicate where it should be docked ('top', 'right', 'bottom', 'left').
    * @param pos Number The index at which the Component will be added
    * @returns Ext.Component[] The added components.
    */
  def addDocked(): typingsSlinky.extjs.Ext.Array = js.native
  def addDocked(component: js.UndefOr[scala.Nothing], pos: Double): typingsSlinky.extjs.Ext.Array = js.native
  def addDocked(component: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  def addDocked(component: js.Any, pos: Double): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Adds the specified events to the list of events which this Observable may fire
    * @param eventNames Object/String... Either an object with event names as properties with a value of true. For example: this.addEvents({  storeloaded: true,  storecleared: true });  Or any number of event names as separate parameters. For example: this.addEvents('storeloaded', 'storecleared');
    */
  def addEvents(): Unit = js.native
  def addEvents(eventNames: js.Any): Unit = js.native
  
  /** [Method] Appends an event handler to this object
    * @param element Object
    * @param listeners Object
    * @param scope Object
    * @param options Object
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  def addListener(): js.Any = js.native
  def addListener(
    element: js.UndefOr[scala.Nothing],
    listeners: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  def addListener(element: js.UndefOr[scala.Nothing], listeners: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  def addListener(
    element: js.UndefOr[scala.Nothing],
    listeners: js.UndefOr[scala.Nothing],
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  def addListener(element: js.UndefOr[scala.Nothing], listeners: js.Any): js.Any = js.native
  def addListener(
    element: js.UndefOr[scala.Nothing],
    listeners: js.Any,
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  def addListener(element: js.UndefOr[scala.Nothing], listeners: js.Any, scope: js.Any): js.Any = js.native
  def addListener(element: js.UndefOr[scala.Nothing], listeners: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  def addListener(element: js.Any): js.Any = js.native
  def addListener(
    element: js.Any,
    listeners: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  def addListener(element: js.Any, listeners: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  def addListener(element: js.Any, listeners: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): js.Any = js.native
  def addListener(element: js.Any, listeners: js.Any): js.Any = js.native
  def addListener(element: js.Any, listeners: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
  def addListener(element: js.Any, listeners: js.Any, scope: js.Any): js.Any = js.native
  def addListener(element: js.Any, listeners: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  
  /** [Method] Adds listeners to any Observable object or Ext Element which are automatically removed when this Component is destr
    * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    * @param options Object If the ename parameter was an event name, this is the addListener options.
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  def addManagedListener(): js.Any = js.native
  def addManagedListener(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  def addManagedListener(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): js.Any = js.native
  def addManagedListener(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
  def addManagedListener(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
  def addManagedListener(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any): js.Any = js.native
  def addManagedListener(
    item: js.UndefOr[scala.Nothing],
    ename: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  def addManagedListener(
    item: js.UndefOr[scala.Nothing],
    ename: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any): js.Any = js.native
  def addManagedListener(
    item: js.UndefOr[scala.Nothing],
    ename: js.Any,
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
  def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  def addManagedListener(item: js.Any): js.Any = js.native
  def addManagedListener(
    item: js.Any,
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  def addManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  def addManagedListener(
    item: js.Any,
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  def addManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
  def addManagedListener(
    item: js.Any,
    ename: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  def addManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
  def addManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  def addManagedListener(item: js.Any, ename: js.Any): js.Any = js.native
  def addManagedListener(
    item: js.Any,
    ename: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  def addManagedListener(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  def addManagedListener(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): js.Any = js.native
  def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any): js.Any = js.native
  def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
  def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
  def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  
  /** [Method] Save a property to the given state object if it is not its default or configured value
    * @param state Object The state object.
    * @param propName String The name of the property on this object to save.
    * @param value String The value of the state property (defaults to this[propName]).
    * @returns Boolean The state object or a new object if state was null and the property was saved.
    */
  def addPropertyToState(): Boolean = js.native
  def addPropertyToState(state: js.UndefOr[scala.Nothing], propName: js.UndefOr[scala.Nothing], value: java.lang.String): Boolean = js.native
  def addPropertyToState(state: js.UndefOr[scala.Nothing], propName: java.lang.String): Boolean = js.native
  def addPropertyToState(state: js.UndefOr[scala.Nothing], propName: java.lang.String, value: java.lang.String): Boolean = js.native
  def addPropertyToState(state: js.Any): Boolean = js.native
  def addPropertyToState(state: js.Any, propName: js.UndefOr[scala.Nothing], value: java.lang.String): Boolean = js.native
  def addPropertyToState(state: js.Any, propName: java.lang.String): Boolean = js.native
  def addPropertyToState(state: js.Any, propName: java.lang.String, value: java.lang.String): Boolean = js.native
  
  /** [Method] Add events that will trigger the state to be saved
    * @param events String/String[] The event name or an array of event names.
    */
  def addStateEvents(): Unit = js.native
  def addStateEvents(events: js.Any): Unit = js.native
  
  /** [Method] Add tools to this panel
    * @param tools Object[]/Ext.panel.Tool[] The tools to add
    */
  def addTool(): Unit = js.native
  def addTool(tools: js.Any): Unit = js.native
  
  /** [Method] inherit docs
    * @param cls Object
    */
  def addUIClsToElement(): Unit = js.native
  def addUIClsToElement(cls: js.Any): Unit = js.native
  
  /** [Method] Invoked after the Panel is Collapsed  */
  def afterCollapse(): Unit = js.native
  
  /** [Method] Called by the layout system after the Component has been laid out  */
  def afterComponentLayout(): Unit = js.native
  
  /** [Method] Invoked after the Panel is Expanded  */
  def afterExpand(): Unit = js.native
  
  /** [Method] Invoked after the Container has laid out and rendered if necessary its child Components
    * @param layout Ext.layout.container.Container
    */
  def afterLayout(): Unit = js.native
  def afterLayout(layout: IContainer): Unit = js.native
  
  /** [Method] Template method called after a Component has been positioned
    * @param ax Object
    * @param ay Object
    */
  def afterSetPosition(): Unit = js.native
  def afterSetPosition(ax: js.UndefOr[scala.Nothing], ay: js.Any): Unit = js.native
  def afterSetPosition(ax: js.Any): Unit = js.native
  def afterSetPosition(ax: js.Any, ay: js.Any): Unit = js.native
  
  /** [Method] Invoked after the Component is shown after onShow is called
    * @param animateTarget String/Ext.Element
    * @param callback Function
    * @param scope Object
    */
  def afterShow(): Unit = js.native
  def afterShow(animateTarget: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def afterShow(animateTarget: js.UndefOr[scala.Nothing], callback: js.Any): Unit = js.native
  def afterShow(animateTarget: js.UndefOr[scala.Nothing], callback: js.Any, scope: js.Any): Unit = js.native
  def afterShow(animateTarget: js.Any): Unit = js.native
  def afterShow(animateTarget: js.Any, callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def afterShow(animateTarget: js.Any, callback: js.Any): Unit = js.native
  def afterShow(animateTarget: js.Any, callback: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Displays a standard read only message box with an OK button comparable to the basic JavaScript alert prompt
    * @param title String The title bar text
    * @param msg String The message box body text
    * @param fn Function The callback function invoked after the message box is closed. See show method for details.
    * @param scope Object The scope (this reference) in which the callback is executed.
    * @returns Ext.window.MessageBox this
    */
  def alert(): IMessageBox = js.native
  def alert(
    title: js.UndefOr[scala.Nothing],
    msg: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): IMessageBox = js.native
  def alert(title: js.UndefOr[scala.Nothing], msg: js.UndefOr[scala.Nothing], fn: js.Any): IMessageBox = js.native
  def alert(title: js.UndefOr[scala.Nothing], msg: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): IMessageBox = js.native
  def alert(title: js.UndefOr[scala.Nothing], msg: java.lang.String): IMessageBox = js.native
  def alert(
    title: js.UndefOr[scala.Nothing],
    msg: java.lang.String,
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): IMessageBox = js.native
  def alert(title: js.UndefOr[scala.Nothing], msg: java.lang.String, fn: js.Any): IMessageBox = js.native
  def alert(title: js.UndefOr[scala.Nothing], msg: java.lang.String, fn: js.Any, scope: js.Any): IMessageBox = js.native
  def alert(title: java.lang.String): IMessageBox = js.native
  def alert(
    title: java.lang.String,
    msg: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): IMessageBox = js.native
  def alert(title: java.lang.String, msg: js.UndefOr[scala.Nothing], fn: js.Any): IMessageBox = js.native
  def alert(title: java.lang.String, msg: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): IMessageBox = js.native
  def alert(title: java.lang.String, msg: java.lang.String): IMessageBox = js.native
  def alert(title: java.lang.String, msg: java.lang.String, fn: js.UndefOr[scala.Nothing], scope: js.Any): IMessageBox = js.native
  def alert(title: java.lang.String, msg: java.lang.String, fn: js.Any): IMessageBox = js.native
  def alert(title: java.lang.String, msg: java.lang.String, fn: js.Any, scope: js.Any): IMessageBox = js.native
  
  /** [Method] Aligns the element with another element relative to the specified anchor points
    * @param element Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or id of the element to align to.
    * @param position String The position to align to
    * @param offsets Number[] Offset the positioning by [x, y]
    * @param animate Boolean/Object true for the default animation or a standard Element animation config object
    * @returns Ext.util.Positionable this
    */
  def alignTo(): IPositionable = js.native
  def alignTo(
    element: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    offsets: js.UndefOr[scala.Nothing],
    animate: js.Any
  ): IPositionable = js.native
  def alignTo(
    element: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    offsets: typingsSlinky.extjs.Ext.Array
  ): IPositionable = js.native
  def alignTo(
    element: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    offsets: typingsSlinky.extjs.Ext.Array,
    animate: js.Any
  ): IPositionable = js.native
  def alignTo(element: js.UndefOr[scala.Nothing], position: java.lang.String): IPositionable = js.native
  def alignTo(
    element: js.UndefOr[scala.Nothing],
    position: java.lang.String,
    offsets: js.UndefOr[scala.Nothing],
    animate: js.Any
  ): IPositionable = js.native
  def alignTo(
    element: js.UndefOr[scala.Nothing],
    position: java.lang.String,
    offsets: typingsSlinky.extjs.Ext.Array
  ): IPositionable = js.native
  def alignTo(
    element: js.UndefOr[scala.Nothing],
    position: java.lang.String,
    offsets: typingsSlinky.extjs.Ext.Array,
    animate: js.Any
  ): IPositionable = js.native
  def alignTo(element: js.Any): IPositionable = js.native
  def alignTo(
    element: js.Any,
    position: js.UndefOr[scala.Nothing],
    offsets: js.UndefOr[scala.Nothing],
    animate: js.Any
  ): IPositionable = js.native
  def alignTo(element: js.Any, position: js.UndefOr[scala.Nothing], offsets: typingsSlinky.extjs.Ext.Array): IPositionable = js.native
  def alignTo(
    element: js.Any,
    position: js.UndefOr[scala.Nothing],
    offsets: typingsSlinky.extjs.Ext.Array,
    animate: js.Any
  ): IPositionable = js.native
  def alignTo(element: js.Any, position: java.lang.String): IPositionable = js.native
  def alignTo(element: js.Any, position: java.lang.String, offsets: js.UndefOr[scala.Nothing], animate: js.Any): IPositionable = js.native
  def alignTo(element: js.Any, position: java.lang.String, offsets: typingsSlinky.extjs.Ext.Array): IPositionable = js.native
  def alignTo(
    element: js.Any,
    position: java.lang.String,
    offsets: typingsSlinky.extjs.Ext.Array,
    animate: js.Any
  ): IPositionable = js.native
  
  /** [Method] Anchors an element to another element and realigns it when the window is resized
    * @param element Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or id of the element to align to.
    * @param position String The position to align to
    * @param offsets Number[] Offset the positioning by [x, y]
    * @param animate Boolean/Object true for the default animation or a standard Element animation config object
    * @param monitorScroll Boolean/Number True to monitor body scroll and reposition. If this parameter is a number, it is used as the buffer delay in milliseconds.
    * @param callback Function The function to call after the animation finishes
    * @returns Ext.util.Positionable this
    */
  def anchorTo(
    element: js.UndefOr[js.Any],
    position: js.UndefOr[java.lang.String],
    offsets: js.UndefOr[typingsSlinky.extjs.Ext.Array],
    animate: js.UndefOr[js.Any],
    monitorScroll: js.UndefOr[js.Any],
    callback: js.UndefOr[js.Any]
  ): IPositionable = js.native
  
  /** [Method] Performs custom animation on this object
    * @param animObj Object
    * @returns Object this
    */
  def animate(): js.Any = js.native
  def animate(animObj: js.Any): js.Any = js.native
  
  /** [Method] Applies the state to the object
    * @param state Object
    */
  def applyState(): Unit = js.native
  def applyState(state: js.Any): Unit = js.native
  
  /** [Method] Template method to do any pre blur processing
    * @param e Ext.EventObject The event object
    */
  def beforeBlur(): Unit = js.native
  def beforeBlur(e: IEventObject): Unit = js.native
  
  /** [Method] Occurs before componentLayout is run
    * @param adjWidth Number The box-adjusted width that was set.
    * @param adjHeight Number The box-adjusted height that was set.
    */
  def beforeComponentLayout(): Unit = js.native
  def beforeComponentLayout(adjWidth: js.UndefOr[scala.Nothing], adjHeight: Double): Unit = js.native
  def beforeComponentLayout(adjWidth: Double): Unit = js.native
  def beforeComponentLayout(adjWidth: Double, adjHeight: Double): Unit = js.native
  
  /** [Method] Template method to do any pre focus processing
    * @param e Ext.EventObject The event object
    */
  def beforeFocus(): Unit = js.native
  def beforeFocus(e: IEventObject): Unit = js.native
  
  /** [Method] Occurs before componentLayout is run  */
  def beforeLayout(): Unit = js.native
  
  /** [Method] Invoked before the Component is shown  */
  def beforeShow(): Unit = js.native
  
  /** [Property] (Ext.dom.Element) */
  var body: IElement = js.native
  
  /** [Method] Bubbles up the component container heirarchy calling the specified function with each component
    * @param fn Function The function to call
    * @param scope Object The scope of the function. Defaults to current node.
    * @param args Array The args to call the function with. Defaults to passing the current component.
    * @returns Ext.Component this
    */
  def bubble(): IComponent = js.native
  def bubble(
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    args: typingsSlinky.extjs.Ext.Array
  ): IComponent = js.native
  def bubble(fn: js.UndefOr[scala.Nothing], scope: js.Any): IComponent = js.native
  def bubble(fn: js.UndefOr[scala.Nothing], scope: js.Any, args: typingsSlinky.extjs.Ext.Array): IComponent = js.native
  def bubble(fn: js.Any): IComponent = js.native
  def bubble(fn: js.Any, scope: js.UndefOr[scala.Nothing], args: typingsSlinky.extjs.Ext.Array): IComponent = js.native
  def bubble(fn: js.Any, scope: js.Any): IComponent = js.native
  def bubble(fn: js.Any, scope: js.Any, args: typingsSlinky.extjs.Ext.Array): IComponent = js.native
  
  /** [Property] (Object) */
  var buttonText: js.Any = js.native
  
  /** [Method] Calculates the new x y position to move this Positionable into a constrain region
    * @param constrainTo String/HTMLElement/Ext.Element/Ext.util.Region The Element or Region into which this Component is to be constrained. Defaults to the element into which this Positionable was rendered, or this Component's {@link Ext.Component.constrainTo.
    * @param proposedPosition Number[] A proposed [X, Y] position to test for validity and to coerce into constraints instead of using this Positionable's current position.
    * @param local Boolean The proposedPosition is local (relative to floatParent if a floating Component)
    * @param proposedSize Number[] A proposed [width, height] size to use when calculating constraints instead of using this Positionable's current size.
    * @returns Number[] If the element needs to be translated, the new [X, Y] position within constraints if possible, giving priority to keeping the top and left edge in the constrain region. Otherwise, false.
    */
  def calculateConstrainedPosition(): typingsSlinky.extjs.Ext.Array = js.native
  def calculateConstrainedPosition(
    constrainTo: js.UndefOr[scala.Nothing],
    proposedPosition: js.UndefOr[scala.Nothing],
    local: js.UndefOr[scala.Nothing],
    proposedSize: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  def calculateConstrainedPosition(
    constrainTo: js.UndefOr[scala.Nothing],
    proposedPosition: js.UndefOr[scala.Nothing],
    local: Boolean
  ): typingsSlinky.extjs.Ext.Array = js.native
  def calculateConstrainedPosition(
    constrainTo: js.UndefOr[scala.Nothing],
    proposedPosition: js.UndefOr[scala.Nothing],
    local: Boolean,
    proposedSize: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  def calculateConstrainedPosition(constrainTo: js.UndefOr[scala.Nothing], proposedPosition: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  def calculateConstrainedPosition(
    constrainTo: js.UndefOr[scala.Nothing],
    proposedPosition: typingsSlinky.extjs.Ext.Array,
    local: js.UndefOr[scala.Nothing],
    proposedSize: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  def calculateConstrainedPosition(
    constrainTo: js.UndefOr[scala.Nothing],
    proposedPosition: typingsSlinky.extjs.Ext.Array,
    local: Boolean
  ): typingsSlinky.extjs.Ext.Array = js.native
  def calculateConstrainedPosition(
    constrainTo: js.UndefOr[scala.Nothing],
    proposedPosition: typingsSlinky.extjs.Ext.Array,
    local: Boolean,
    proposedSize: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  def calculateConstrainedPosition(constrainTo: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  def calculateConstrainedPosition(
    constrainTo: js.Any,
    proposedPosition: js.UndefOr[scala.Nothing],
    local: js.UndefOr[scala.Nothing],
    proposedSize: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  def calculateConstrainedPosition(constrainTo: js.Any, proposedPosition: js.UndefOr[scala.Nothing], local: Boolean): typingsSlinky.extjs.Ext.Array = js.native
  def calculateConstrainedPosition(
    constrainTo: js.Any,
    proposedPosition: js.UndefOr[scala.Nothing],
    local: Boolean,
    proposedSize: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  def calculateConstrainedPosition(constrainTo: js.Any, proposedPosition: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  def calculateConstrainedPosition(
    constrainTo: js.Any,
    proposedPosition: typingsSlinky.extjs.Ext.Array,
    local: js.UndefOr[scala.Nothing],
    proposedSize: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  def calculateConstrainedPosition(constrainTo: js.Any, proposedPosition: typingsSlinky.extjs.Ext.Array, local: Boolean): typingsSlinky.extjs.Ext.Array = js.native
  def calculateConstrainedPosition(
    constrainTo: js.Any,
    proposedPosition: typingsSlinky.extjs.Ext.Array,
    local: Boolean,
    proposedSize: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  def callOverridden(): js.Any = js.native
  def callOverridden(args: js.Any): js.Any = js.native
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  def callParent(): js.Any = js.native
  def callParent(args: js.Any): js.Any = js.native
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  def callSuper(): js.Any = js.native
  def callSuper(args: js.Any): js.Any = js.native
  
  /** [Method] Cancel any deferred focus on this component */
  def cancelFocus(): Unit = js.native
  
  /** [Method] Cascades down the component container heirarchy from this component passed in the first call  calling the specified
    * @param fn Function The function to call
    * @param scope Object The scope of the function (defaults to current component)
    * @param args Array The args to call the function with. The current component always passed as the last argument.
    * @returns Ext.Container this
    */
  def cascade(): typingsSlinky.extjs.Ext.IContainer = js.native
  def cascade(
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    args: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.IContainer = js.native
  def cascade(fn: js.UndefOr[scala.Nothing], scope: js.Any): typingsSlinky.extjs.Ext.IContainer = js.native
  def cascade(fn: js.UndefOr[scala.Nothing], scope: js.Any, args: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.IContainer = js.native
  def cascade(fn: js.Any): typingsSlinky.extjs.Ext.IContainer = js.native
  def cascade(fn: js.Any, scope: js.UndefOr[scala.Nothing], args: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.IContainer = js.native
  def cascade(fn: js.Any, scope: js.Any): typingsSlinky.extjs.Ext.IContainer = js.native
  def cascade(fn: js.Any, scope: js.Any, args: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.IContainer = js.native
  
  /** [Method] Center this Component in its container
    * @returns Ext.Component this
    */
  def center(): IComponent = js.native
  
  /** [Method] Retrieves the first direct child of this container which matches the passed selector or component
    * @param selector String/Ext.Component An Ext.ComponentQuery selector. If no selector is specified, the first child will be returned.
    * @returns Object Ext.Component The matching child Ext.Component (or null if no match was found).
    */
  def child(): js.Any = js.native
  def child(selector: js.Any): js.Any = js.native
  
  /** [Method] Removes all listeners for this object including the managed listeners */
  def clearListeners(): Unit = js.native
  
  /** [Method] Removes all managed listeners for this object  */
  def clearManagedListeners(): Unit = js.native
  
  /** [Method] Clone the current component using the original config values passed into this instance by default
    * @param overrides Object A new config containing any properties to override in the cloned version. An id property can be passed on this object, otherwise one will be generated to avoid duplicates.
    * @returns Ext.Component clone The cloned copy of this component
    */
  def cloneConfig(): IComponent = js.native
  def cloneConfig(overrides: js.Any): IComponent = js.native
  
  /** [Method] Closes the Panel  */
  def close(): Unit = js.native
  
  /** [Method] Collapses the panel body so that the body becomes hidden
    * @param direction String The direction to collapse towards. Must be one of  Ext.Component.DIRECTION_TOP Ext.Component.DIRECTION_RIGHT Ext.Component.DIRECTION_BOTTOM Ext.Component.DIRECTION_LEFT Defaults to collapseDirection.
    * @param animate Boolean True to animate the transition, else false (defaults to the value of the animCollapse panel config). May also be specified as the animation duration in milliseconds.
    * @returns Ext.panel.Panel this
    */
  def collapse(): IPanel = js.native
  def collapse(direction: js.UndefOr[scala.Nothing], animate: Boolean): IPanel = js.native
  def collapse(direction: java.lang.String): IPanel = js.native
  def collapse(direction: java.lang.String, animate: Boolean): IPanel = js.native
  
  /** [Method] Displays a confirmation message box with Yes and No buttons comparable to JavaScript s confirm
    * @param title String The title bar text
    * @param msg String The message box body text
    * @param fn Function The callback function invoked after the message box is closed. See show method for details.
    * @param scope Object The scope (this reference) in which the callback is executed.
    * @returns Ext.window.MessageBox this
    */
  def confirm(): IMessageBox = js.native
  def confirm(
    title: js.UndefOr[scala.Nothing],
    msg: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): IMessageBox = js.native
  def confirm(title: js.UndefOr[scala.Nothing], msg: js.UndefOr[scala.Nothing], fn: js.Any): IMessageBox = js.native
  def confirm(title: js.UndefOr[scala.Nothing], msg: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): IMessageBox = js.native
  def confirm(title: js.UndefOr[scala.Nothing], msg: java.lang.String): IMessageBox = js.native
  def confirm(
    title: js.UndefOr[scala.Nothing],
    msg: java.lang.String,
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): IMessageBox = js.native
  def confirm(title: js.UndefOr[scala.Nothing], msg: java.lang.String, fn: js.Any): IMessageBox = js.native
  def confirm(title: js.UndefOr[scala.Nothing], msg: java.lang.String, fn: js.Any, scope: js.Any): IMessageBox = js.native
  def confirm(title: java.lang.String): IMessageBox = js.native
  def confirm(
    title: java.lang.String,
    msg: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): IMessageBox = js.native
  def confirm(title: java.lang.String, msg: js.UndefOr[scala.Nothing], fn: js.Any): IMessageBox = js.native
  def confirm(title: java.lang.String, msg: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): IMessageBox = js.native
  def confirm(title: java.lang.String, msg: java.lang.String): IMessageBox = js.native
  def confirm(title: java.lang.String, msg: java.lang.String, fn: js.UndefOr[scala.Nothing], scope: js.Any): IMessageBox = js.native
  def confirm(title: java.lang.String, msg: java.lang.String, fn: js.Any): IMessageBox = js.native
  def confirm(title: java.lang.String, msg: java.lang.String, fn: js.Any, scope: js.Any): IMessageBox = js.native
  
  /** [Method] Determines whether the passed Component is either an immediate child of this Container or whether it is a descendant
    * @param comp Ext.Component The Component to test.
    * @param deep Boolean Pass true to test for the Component being a descendant at any level.
    * @returns Boolean true if the passed Component is contained at the specified level.
    */
  def contains(): Boolean = js.native
  def contains(comp: js.UndefOr[scala.Nothing], deep: Boolean): Boolean = js.native
  def contains(comp: IComponent): Boolean = js.native
  def contains(comp: IComponent, deep: Boolean): Boolean = js.native
  
  /** [Property] (String) */
  var contentPaddingProperty: java.lang.String = js.native
  
  /** [Method] converts a collapsdDir into an anchor argument for Element slideIn overridden in rtl mode to switch l and r
    * @param collapseDir Object
    */
  def convertCollapseDir(): Unit = js.native
  def convertCollapseDir(collapseDir: js.Any): Unit = js.native
  
  /** [Property] (Ext.util.ComponentDragger) */
  var dd: IComponentDragger = js.native
  
  /** [Property] (Number) */
  var defaultTextHeight: Double = js.native
  
  /** [Method] Inherit docs Disable all immediate children that was previously disabled Override disable because onDisable only gets
    * @returns Ext.container.AbstractContainer this
    */
  def disable(): IAbstractContainer = js.native
  
  /** [Method] Handles autoRender  */
  def doAutoRender(): Unit = js.native
  
  /** [Method] This method needs to be called whenever you change something on this component that requires the Component s layout t
    * @returns Ext.container.Container this
    */
  def doComponentLayout(): typingsSlinky.extjs.Ext.container.IContainer = js.native
  
  /** [Method] Moves this floating Component into a constrain region
    * @param constrainTo String/HTMLElement/Ext.Element/Ext.util.Region The Element or Region into which this Component is to be constrained. Defaults to the element into which this floating Component was rendered.
    */
  def doConstrain(): Unit = js.native
  def doConstrain(constrainTo: js.Any): Unit = js.native
  
  /** [Method] Manually force this container s layout to be recalculated
    * @returns Ext.container.Container this
    */
  def doLayout(): typingsSlinky.extjs.Ext.container.IContainer = js.native
  
  /** [Method] Retrieves the first descendant of this container which matches the passed selector
    * @param selector String/Ext.Component An Ext.ComponentQuery selector or Ext.Component. If no selector is specified, the first child will be returned.
    * @returns Object Ext.Component The matching descendant Ext.Component (or null if no match was found).
    */
  def down(): js.Any = js.native
  def down(selector: js.Any): js.Any = js.native
  
  /** [Property] (Boolean) */
  var draggable: Boolean = js.native
  
  /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
    * @param eventNames String/String[] The event name to bubble, or an Array of event names.
    */
  def enableBubble(): Unit = js.native
  def enableBubble(eventNames: js.Any): Unit = js.native
  
  /** [Method] Ensures that this component is attached to document body
    * @param runLayout Boolean True to run the component's layout.
    */
  def ensureAttachedToBody(): Unit = js.native
  def ensureAttachedToBody(runLayout: Boolean): Unit = js.native
  
  /** [Method] Expands the panel body so that it becomes visible
    * @param animate Boolean True to animate the transition, else false (defaults to the value of the animCollapse panel config). May also be specified as the animation duration in milliseconds.
    * @returns Ext.panel.Panel this
    */
  def expand(): IPanel = js.native
  def expand(animate: Boolean): IPanel = js.native
  
  /** [Method] Find a container above this component at any level by a custom function
    * @param fn Function The custom function to call with the arguments (container, this component).
    * @returns Ext.container.Container The first Container for which the custom function returns true
    */
  def findParentBy(): typingsSlinky.extjs.Ext.container.IContainer = js.native
  def findParentBy(fn: js.Any): typingsSlinky.extjs.Ext.container.IContainer = js.native
  
  /** [Method] Find a container above this component at any level by xtype or class See also the up method
    * @param xtype String/Ext.Class The xtype string for a component, or the class of the component directly
    * @returns Ext.container.Container The first Container which matches the given xtype or class
    */
  def findParentByType(): typingsSlinky.extjs.Ext.container.IContainer = js.native
  def findParentByType(xtype: js.Any): typingsSlinky.extjs.Ext.container.IContainer = js.native
  
  /** [Method] Retrieves plugin from this component s collection by its ptype
    * @param ptype String The Plugin's ptype as specified by the class's alias configuration.
    * @returns Ext.AbstractPlugin plugin instance.
    */
  def findPlugin(): IAbstractPlugin = js.native
  def findPlugin(ptype: java.lang.String): IAbstractPlugin = js.native
  
  /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
    * @param eventName String The name of the event to fire.
    * @param args Object... Variable number of parameters are passed to handlers.
    * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
    */
  def fireEvent(eventName: java.lang.String, args: js.Any*): Boolean = js.native
  
  /** [Method] Fires the specified event with the passed parameter list
    * @param eventName String The name of the event to fire.
    * @param args Object[] An array of parameters which are passed to handlers.
    * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
    */
  def fireEventArgs(): Boolean = js.native
  def fireEventArgs(eventName: js.UndefOr[scala.Nothing], args: typingsSlinky.extjs.Ext.Array): Boolean = js.native
  def fireEventArgs(eventName: java.lang.String): Boolean = js.native
  def fireEventArgs(eventName: java.lang.String, args: typingsSlinky.extjs.Ext.Array): Boolean = js.native
  
  /** [Property] (Ext.Container) */
  var floatParent: typingsSlinky.extjs.Ext.IContainer = js.native
  
  /** [Method] Try to focus this component
    * @param selectText Boolean If applicable, true to also select the text in this component
    * @param delay Boolean/Number Delay the focus this number of milliseconds (true for 10 milliseconds).
    * @param callback Function Only needed if the delay parameter is used. A function to call upon focus.
    * @param scope Function Only needed if the delay parameter is used. The scope (this reference) in which to execute the callback.
    * @returns Ext.Component The focused Component. Usually this Component. Some Containers may delegate focus to a descendant Component (Windows can do this through their defaultFocus config option.
    */
  def focus(): IComponent = js.native
  def focus(
    selectText: js.UndefOr[scala.Nothing],
    delay: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): IComponent = js.native
  def focus(selectText: js.UndefOr[scala.Nothing], delay: js.UndefOr[scala.Nothing], callback: js.Any): IComponent = js.native
  def focus(
    selectText: js.UndefOr[scala.Nothing],
    delay: js.UndefOr[scala.Nothing],
    callback: js.Any,
    scope: js.Any
  ): IComponent = js.native
  def focus(selectText: js.UndefOr[scala.Nothing], delay: js.Any): IComponent = js.native
  def focus(
    selectText: js.UndefOr[scala.Nothing],
    delay: js.Any,
    callback: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): IComponent = js.native
  def focus(selectText: js.UndefOr[scala.Nothing], delay: js.Any, callback: js.Any): IComponent = js.native
  def focus(selectText: js.UndefOr[scala.Nothing], delay: js.Any, callback: js.Any, scope: js.Any): IComponent = js.native
  def focus(selectText: Boolean): IComponent = js.native
  def focus(
    selectText: Boolean,
    delay: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): IComponent = js.native
  def focus(selectText: Boolean, delay: js.UndefOr[scala.Nothing], callback: js.Any): IComponent = js.native
  def focus(selectText: Boolean, delay: js.UndefOr[scala.Nothing], callback: js.Any, scope: js.Any): IComponent = js.native
  def focus(selectText: Boolean, delay: js.Any): IComponent = js.native
  def focus(selectText: Boolean, delay: js.Any, callback: js.UndefOr[scala.Nothing], scope: js.Any): IComponent = js.native
  def focus(selectText: Boolean, delay: js.Any, callback: js.Any): IComponent = js.native
  def focus(selectText: Boolean, delay: js.Any, callback: js.Any, scope: js.Any): IComponent = js.native
  
  /** [Method] Forces this component to redo its componentLayout  */
  def forceComponentLayout(): Unit = js.native
  
  /** [Property] (Object) */
  var frameSize: js.Any = js.native
  
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
    * @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
    */
  def getActiveAnimation(): js.Any = js.native
  
  /** [Method] Gets the x y coordinates to align this element with another element
    * @param element Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or id of the element to align to.
    * @param position String The position to align to
    * @param offsets Number[] Offset the positioning by [x, y]
    * @returns Number[] [x, y]
    */
  def getAlignToXY(): typingsSlinky.extjs.Ext.Array = js.native
  def getAlignToXY(
    element: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    offsets: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  def getAlignToXY(element: js.UndefOr[scala.Nothing], position: java.lang.String): typingsSlinky.extjs.Ext.Array = js.native
  def getAlignToXY(
    element: js.UndefOr[scala.Nothing],
    position: java.lang.String,
    offsets: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  def getAlignToXY(element: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  def getAlignToXY(element: js.Any, position: js.UndefOr[scala.Nothing], offsets: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  def getAlignToXY(element: js.Any, position: java.lang.String): typingsSlinky.extjs.Ext.Array = js.native
  def getAlignToXY(element: js.Any, position: java.lang.String, offsets: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Gets the x y coordinates specified by the anchor position on the element
    * @param anchor String The specified anchor position. See alignTo for details on supported anchor positions.
    * @param local Boolean True to get the local (element top/left-relative) anchor position instead of page coordinates
    * @param size Object An object containing the size to use for calculating anchor position {width: (target width), height: (target height)} (defaults to the element's current size)
    * @returns Number[] [x, y] An array containing the element's x and y coordinates
    */
  def getAnchorXY(): typingsSlinky.extjs.Ext.Array = js.native
  def getAnchorXY(anchor: js.UndefOr[scala.Nothing], local: js.UndefOr[scala.Nothing], size: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  def getAnchorXY(anchor: js.UndefOr[scala.Nothing], local: Boolean): typingsSlinky.extjs.Ext.Array = js.native
  def getAnchorXY(anchor: js.UndefOr[scala.Nothing], local: Boolean, size: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  def getAnchorXY(anchor: java.lang.String): typingsSlinky.extjs.Ext.Array = js.native
  def getAnchorXY(anchor: java.lang.String, local: js.UndefOr[scala.Nothing], size: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  def getAnchorXY(anchor: java.lang.String, local: Boolean): typingsSlinky.extjs.Ext.Array = js.native
  def getAnchorXY(anchor: java.lang.String, local: Boolean, size: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Return an object defining the area of this Element which can be passed to setBox to set another Element s size locati
    * @param contentBox Boolean If true a box for the content of the element is returned.
    * @param local Boolean If true the element's left and top relative to its offsetParent are returned instead of page x/y.
    * @returns Object box An object in the format: {  x: &lt;Element's X position&gt;,  y: &lt;Element's Y position&gt;,  left: &lt;Element's X position (an alias for x)&gt;,  top: &lt;Element's Y position (an alias for y)&gt;,  width: &lt;Element's width&gt;,  height: &lt;Element's height&gt;,  bottom: &lt;Element's lower bound&gt;,  right: &lt;Element's rightmost bound&gt; }  The returned object may also be addressed as an Array where index 0 contains the X position and index 1 contains the Y position. The result may also be used for setXY
    */
  def getBox(): js.Any = js.native
  def getBox(contentBox: js.UndefOr[scala.Nothing], local: Boolean): js.Any = js.native
  def getBox(contentBox: Boolean): js.Any = js.native
  def getBox(contentBox: Boolean, local: Boolean): js.Any = js.native
  
  /** [Method] Implements an upward event bubbling policy  */
  def getBubbleTarget(): Unit = js.native
  
  /** [Method] Return the immediate child Component in which the passed element is located
    * @param el Ext.Element/HTMLElement/String The element to test (or ID of element).
    * @param deep Boolean If true, returns the deepest descendant Component which contains the passed element.
    * @returns Ext.Component The child item which contains the passed element.
    */
  def getChildByElement(): IComponent = js.native
  def getChildByElement(el: js.UndefOr[scala.Nothing], deep: Boolean): IComponent = js.native
  def getChildByElement(el: js.Any): IComponent = js.native
  def getChildByElement(el: js.Any, deep: Boolean): IComponent = js.native
  
  /** [Method] Returns the current collapsed state of the panel
    * @returns Boolean/String False when not collapsed, otherwise the value of collapseDirection.
    */
  def getCollapsed(): js.Any = js.native
  
  /** [Method] Attempts a default component lookup see Ext container Container getComponent
    * @param comp String/Number The component id, itemId or position to find
    * @returns Ext.Component The component (if found)
    */
  def getComponent(): IComponent = js.native
  def getComponent(comp: js.Any): IComponent = js.native
  
  /** [Method] Returns the X Y vector by which this Positionable s element must be translated to make a best attempt to constrain
    * @param constrainTo Ext.util.Positionable/HTMLElement/String/Ext.util.Region The Positionable, HTMLElement, element id, or Region into which the element is to be constrained.
    * @param proposedPosition Number[] A proposed [X, Y] position to test for validity and to produce a vector for instead of using the element's current position
    * @param proposedSize Number[] A proposed [width, height] size to constrain instead of using the element's current size
    * @returns Number[]/Boolean If the element needs to be translated, an [X, Y] vector by which this element must be translated. Otherwise, false.
    */
  def getConstrainVector(): js.Any = js.native
  def getConstrainVector(
    constrainTo: js.UndefOr[scala.Nothing],
    proposedPosition: js.UndefOr[scala.Nothing],
    proposedSize: typingsSlinky.extjs.Ext.Array
  ): js.Any = js.native
  def getConstrainVector(constrainTo: js.UndefOr[scala.Nothing], proposedPosition: typingsSlinky.extjs.Ext.Array): js.Any = js.native
  def getConstrainVector(
    constrainTo: js.UndefOr[scala.Nothing],
    proposedPosition: typingsSlinky.extjs.Ext.Array,
    proposedSize: typingsSlinky.extjs.Ext.Array
  ): js.Any = js.native
  def getConstrainVector(constrainTo: js.Any): js.Any = js.native
  def getConstrainVector(
    constrainTo: js.Any,
    proposedPosition: js.UndefOr[scala.Nothing],
    proposedSize: typingsSlinky.extjs.Ext.Array
  ): js.Any = js.native
  def getConstrainVector(constrainTo: js.Any, proposedPosition: typingsSlinky.extjs.Ext.Array): js.Any = js.native
  def getConstrainVector(
    constrainTo: js.Any,
    proposedPosition: typingsSlinky.extjs.Ext.Array,
    proposedSize: typingsSlinky.extjs.Ext.Array
  ): js.Any = js.native
  
  /** [Method] Gets the configured default focus item  */
  def getDefaultFocus(): Unit = js.native
  
  /** [Method] Finds a docked component by id itemId or position
    * @param comp String/Number The id, itemId or position of the docked component (see getComponent for details)
    * @returns Ext.Component The docked component (if found)
    */
  def getDockedComponent(): IComponent = js.native
  def getDockedComponent(comp: js.Any): IComponent = js.native
  
  /** [Method] Retrieves an array of all currently docked Components
    * @param selector String A ComponentQuery selector string to filter the returned items.
    * @param beforeBody Boolean An optional flag to limit the set of items to only those before the body (true) or after the body (false). All components are returned by default.
    * @returns Ext.Component[] The array of docked components meeting the specified criteria.
    */
  def getDockedItems(): typingsSlinky.extjs.Ext.Array = js.native
  def getDockedItems(selector: js.UndefOr[scala.Nothing], beforeBody: Boolean): typingsSlinky.extjs.Ext.Array = js.native
  def getDockedItems(selector: java.lang.String): typingsSlinky.extjs.Ext.Array = js.native
  def getDockedItems(selector: java.lang.String, beforeBody: Boolean): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Retrieves the top level element representing this component
    * @returns Ext.dom.Element
    */
  def getEl(): IElement = js.native
  
  /** [Method] Gets the Header for this panel  */
  def getHeader(): Unit = js.native
  
  /** [Method] Gets the current height of the component s underlying element
    * @returns Number
    */
  def getHeight(): Double = js.native
  
  /** [Method] Retrieves the id of this component
    * @returns String
    */
  def getId(): java.lang.String = js.native
  
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
    * @param name String Name of the config option to return.
    * @returns Object/Mixed The full config object or a single config value when name parameter specified.
    */
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  
  /** [Method] This function takes the position argument passed to onRender and returns a DOM element that you can use in the insert
    * @param position String/Number/Ext.dom.Element/HTMLElement Index, element id or element you want to put this component before.
    * @returns HTMLElement DOM element that you can use in the insertBefore
    */
  def getInsertPosition(): HTMLElement = js.native
  def getInsertPosition(position: js.Any): HTMLElement = js.native
  
  /** [Method] Returns the value of itemId assigned to this component or when that is not set returns the value of id
    * @returns String
    */
  def getItemId(): java.lang.String = js.native
  
  /** [Method] Returns the layout instance currently associated with this Container
    * @returns Ext.layout.container.Container The layout
    */
  def getLayout(): IContainer = js.native
  
  /** [Method] Gets the Ext ComponentLoader for this Component
    * @returns Ext.ComponentLoader The loader instance, null if it doesn't exist.
    */
  def getLoader(): IComponentLoader = js.native
  
  /** [Method] Overridden in Ext rtl AbstractComponent
    * @returns Number The local x coordinate
    */
  def getLocalX(): Double = js.native
  
  /** [Method] Overridden in Ext rtl AbstractComponent
    * @returns Number[] The local XY position of the element
    */
  def getLocalXY(): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Returns the y coordinate of this element reletive to its offsetParent
    * @returns Number The local y coordinate
    */
  def getLocalY(): Double = js.native
  
  /** [Method] Returns the offsets of this element from the passed element
    * @param offsetsTo Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or element id to get get the offsets from.
    * @returns Number[] The XY page offsets (e.g. [100, -200])
    */
  def getOffsetsTo(): typingsSlinky.extjs.Ext.Array = js.native
  def getOffsetsTo(offsetsTo: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Retrieves a plugin from this component s collection by its pluginId
    * @param pluginId String
    * @returns Ext.AbstractPlugin plugin instance.
    */
  def getPlugin(): IAbstractPlugin = js.native
  def getPlugin(pluginId: java.lang.String): IAbstractPlugin = js.native
  
  /** [Method] Gets the current XY position of the component s underlying element
    * @param local Boolean If true the element's left and top are returned instead of page XY.
    * @returns Number[] The XY position of the element (e.g., [100, 200])
    */
  def getPosition(): typingsSlinky.extjs.Ext.Array = js.native
  def getPosition(local: Boolean): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Used by ComponentQuery child and down to retrieve all of the items which can potentially be considered a child of th
    * @param deep Object
    */
  def getRefItems(): Unit = js.native
  def getRefItems(deep: js.Any): Unit = js.native
  
  /** [Method] Returns a region object that defines the area of this element
    * @returns Ext.util.Region A Region containing "top, left, bottom, right" properties.
    */
  def getRegion(): IRegion = js.native
  
  /** [Method] Gets the current size of the component s underlying element
    * @returns Object An object containing the element's size {width: (element width), height: (element height)}
    */
  def getSize(): js.Any = js.native
  
  /** [Method] Returns an object that describes how this component s width and height are managed
    * @param ownerCtSizeModel Object
    * @returns Object The size model for this component.
    */
  def getSizeModel(): js.Any = js.native
  def getSizeModel(ownerCtSizeModel: js.Any): js.Any = js.native
  
  /** [Method] Returns the content region of this element
    * @returns Ext.util.Region A Region containing "top, left, bottom, right" member data.
    */
  def getViewRegion(): IRegion = js.native
  
  /** [Method] Gets the current width of the component s underlying element
    * @returns Number
    */
  def getWidth(): Double = js.native
  
  /** [Method] Gets the current X position of the DOM element based on page coordinates
    * @returns Number The X position of the element
    */
  def getX(): Double = js.native
  
  /** [Method] Gets the xtype for this component as registered with Ext ComponentManager
    * @returns String The xtype
    */
  def getXType(): java.lang.String = js.native
  
  /** [Method] Returns this Component s xtype hierarchy as a slash delimited string
    * @returns String The xtype hierarchy string
    */
  def getXTypes(): java.lang.String = js.native
  
  /** [Method] Gets the current position of the DOM element based on page coordinates
    * @returns Number[] The XY position of the element
    */
  def getXY(): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Gets the current Y position of the DOM element based on page coordinates
    * @returns Number The Y position of the element
    */
  def getY(): Double = js.native
  
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
    * @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
    */
  def hasActiveFx(): js.Any = js.native
  
  /** [Method] Checks if the specified CSS class exists on this element s DOM node
    * @param className String The CSS class to check for.
    * @returns Boolean true if the class exists, else false.
    */
  def hasCls(): Boolean = js.native
  def hasCls(className: java.lang.String): Boolean = js.native
  
  /** [Method] Checks to see if this object has any listeners for a specified event or whether the event bubbles
    * @param eventName String The name of the event to check for
    * @returns Boolean true if the event is being listened for or bubbles, else false
    */
  def hasListener(): Boolean = js.native
  def hasListener(eventName: java.lang.String): Boolean = js.native
  
  /** [Property] (Object) */
  var hasListeners: js.Any = js.native
  
  /** [Method] Checks if there is currently a specified uiCls
    * @param cls String The cls to check.
    */
  def hasUICls(): Unit = js.native
  def hasUICls(cls: java.lang.String): Unit = js.native
  
  /** [Method] Hides this Component setting it to invisible using the configured hideMode
    * @returns Ext.Component this
    */
  def hide(): IComponent = js.native
  
  /** [Method] Initialize configuration for this class
    * @param config Object
    * @returns Ext.Base this
    */
  def initConfig(): IBase = js.native
  def initConfig(config: js.Any): IBase = js.native
  
  /** [Method] Initialize any events on this component */
  def initEvents(): Unit = js.native
  
  /** [Method] Inserts a Component into this Container at a specified index
    * @param index Number The index at which the Component will be inserted into the Container's items collection
    * @param component Ext.Component/Object The child Component to insert. Ext uses lazy rendering, and will only render the inserted Component should it become necessary. A Component config object may be passed in order to avoid the overhead of constructing a real Component object if lazy rendering might mean that the inserted Component will not be rendered immediately. To take advantage of this 'lazy instantiation', set the Ext.Component.xtype config property to the registered type of the Component wanted. For a list of all available xtypes, see Ext.enums.Widget.
    * @returns Ext.Component component The Component (or config object) that was inserted with the Container's default config values applied.
    */
  def insert(): IComponent = js.native
  def insert(index: js.UndefOr[scala.Nothing], component: js.Any): IComponent = js.native
  def insert(index: Double): IComponent = js.native
  def insert(index: Double, component: js.Any): IComponent = js.native
  
  /** [Method] Inserts docked item s to the panel at the indicated position
    * @param pos Number The index at which the Component will be inserted
    * @param component Object/Object[] The Component or array of components to add. The components must include a 'dock' paramater on each component to indicate where it should be docked ('top', 'right', 'bottom', 'left').
    */
  def insertDocked(): Unit = js.native
  def insertDocked(pos: js.UndefOr[scala.Nothing], component: js.Any): Unit = js.native
  def insertDocked(pos: Double): Unit = js.native
  def insertDocked(pos: Double, component: js.Any): Unit = js.native
  
  /** [Method] Tests whether this Component matches the selector string
    * @param selector String The selector string to test against.
    * @returns Boolean true if this Component matches the selector.
    */
  def is(): Boolean = js.native
  def is(selector: java.lang.String): Boolean = js.native
  
  /** [Method] Determines whether this Container is an ancestor of the passed Component
    * @param possibleDescendant Ext.Component The Component to test for presence within this Container's subtree.
    */
  def isAncestor(): Unit = js.native
  def isAncestor(possibleDescendant: IComponent): Unit = js.native
  
  /** [Property] (Boolean) */
  var isComponent: Boolean = js.native
  
  /** [Method] Determines whether this component is the descendant of a particular container
    * @param container Ext.Container
    * @returns Boolean true if the component is the descendant of a particular container, otherwise false.
    */
  def isDescendantOf(): Boolean = js.native
  def isDescendantOf(container: typingsSlinky.extjs.Ext.IContainer): Boolean = js.native
  
  /** [Method] Method to determine whether this Component is currently disabled
    * @returns Boolean the disabled state of this Component.
    */
  def isDisabled(): Boolean = js.native
  
  /** [Method] Method to determine whether this Component is draggable
    * @returns Boolean the draggable state of this component.
    */
  def isDraggable(): Boolean = js.native
  
  /** [Method] Method to determine whether this Component is droppable
    * @returns Boolean the droppable state of this component.
    */
  def isDroppable(): Boolean = js.native
  
  /** [Method] Method to determine whether this Component is floating
    * @returns Boolean the floating state of this component.
    */
  def isFloating(): Boolean = js.native
  
  /** [Method] Method to determine whether this Component is currently set to hidden
    * @returns Boolean the hidden state of this Component.
    */
  def isHidden(): Boolean = js.native
  
  /** [Method] Determines whether this Component is the root of a layout  */
  def isLayoutRoot(): Unit = js.native
  
  /** [Method] Returns true if layout is suspended for this component
    * @returns Boolean true layout of this component is suspended.
    */
  def isLayoutSuspended(): Boolean = js.native
  
  /** [Property] (Boolean) */
  var isObservable: Boolean = js.native
  
  /** [Property] (Boolean) */
  var isPanel: Boolean = js.native
  
  /** [Method] Returns true if this component is visible
    * @param deep Object
    * @returns Boolean true if this component is visible, false otherwise.
    */
  def isVisible(): Boolean = js.native
  def isVisible(deep: js.Any): Boolean = js.native
  
  /** [Property] (Boolean) */
  var isWindow: Boolean = js.native
  
  /** [Method] Tests whether or not this Component is of a specific xtype
    * @param xtype String The xtype to check for this Component
    * @param shallow Boolean true to check whether this Component is directly of the specified xtype, false to check whether this Component is descended from the xtype.
    * @returns Boolean true if this component descends from the specified xtype, false otherwise.
    */
  def isXType(): Boolean = js.native
  def isXType(xtype: js.UndefOr[scala.Nothing], shallow: Boolean): Boolean = js.native
  def isXType(xtype: java.lang.String): Boolean = js.native
  def isXType(xtype: java.lang.String, shallow: Boolean): Boolean = js.native
  
  /** [Property] (Ext.util.AbstractMixedCollection) */
  var items: IAbstractMixedCollection = js.native
  
  /** [Property] (Boolean) */
  var maskOnDisable: Boolean = js.native
  
  /** [Method] Fits the window within its current container and automatically replaces the maximize tool button with the restore
    * @param animate Boolean true to animate this Window to full size.
    * @returns Ext.window.Window this
    */
  def maximize(): IWindow = js.native
  def maximize(animate: Boolean): IWindow = js.native
  
  /** [Property] (Number) */
  var minProgressWidth: Double = js.native
  
  /** [Property] (Number) */
  var minPromptWidth: Double = js.native
  
  /** [Method] Placeholder method for minimizing the window
    * @returns Ext.window.Window this
    */
  def minimize(): IWindow = js.native
  
  /** [Method] Shorthand for addManagedListener
    * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    * @param options Object If the ename parameter was an event name, this is the addListener options.
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  def mon(): js.Any = js.native
  def mon(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  def mon(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): js.Any = js.native
  def mon(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  def mon(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
  def mon(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  def mon(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
  def mon(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  def mon(item: js.UndefOr[scala.Nothing], ename: js.Any): js.Any = js.native
  def mon(
    item: js.UndefOr[scala.Nothing],
    ename: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  def mon(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  def mon(
    item: js.UndefOr[scala.Nothing],
    ename: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  def mon(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any): js.Any = js.native
  def mon(
    item: js.UndefOr[scala.Nothing],
    ename: js.Any,
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  def mon(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
  def mon(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  def mon(item: js.Any): js.Any = js.native
  def mon(
    item: js.Any,
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  def mon(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  def mon(
    item: js.Any,
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  def mon(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
  def mon(
    item: js.Any,
    ename: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  def mon(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
  def mon(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  def mon(item: js.Any, ename: js.Any): js.Any = js.native
  def mon(
    item: js.Any,
    ename: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  def mon(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  def mon(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): js.Any = js.native
  def mon(item: js.Any, ename: js.Any, fn: js.Any): js.Any = js.native
  def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
  def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
  def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  
  /** [Method] Moves a Component within the Container
    * @param fromIdx Number/Ext.Component The index/component to move.
    * @param toIdx Number The new index for the Component.
    * @returns Ext.Component component The Component that was moved.
    */
  def move(): IComponent = js.native
  def move(fromIdx: js.UndefOr[scala.Nothing], toIdx: Double): IComponent = js.native
  def move(fromIdx: js.Any): IComponent = js.native
  def move(fromIdx: js.Any, toIdx: Double): IComponent = js.native
  
  /** [Method] Shorthand for removeManagedListener
    * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    */
  def mun(): Unit = js.native
  def mun(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): Unit = js.native
  def mun(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  def mun(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  def mun(item: js.UndefOr[scala.Nothing], ename: js.Any): Unit = js.native
  def mun(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def mun(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any): Unit = js.native
  def mun(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def mun(item: js.Any): Unit = js.native
  def mun(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def mun(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  def mun(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  def mun(item: js.Any, ename: js.Any): Unit = js.native
  def mun(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def mun(item: js.Any, ename: js.Any, fn: js.Any): Unit = js.native
  def mun(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Returns the next node in the Component tree in tree traversal order
    * @param selector String A ComponentQuery selector to filter the following nodes.
    * @returns Ext.Component The next node (or the next node which matches the selector). Returns null if there is no matching node.
    */
  def nextNode(): IComponent = js.native
  def nextNode(selector: java.lang.String): IComponent = js.native
  
  /** [Method] Returns the next sibling of this Component
    * @param selector String A ComponentQuery selector to filter the following items.
    * @returns Ext.Component The next sibling (or the next sibling which matches the selector). Returns null if there is no matching sibling.
    */
  def nextSibling(): IComponent = js.native
  def nextSibling(selector: java.lang.String): IComponent = js.native
  
  /** [Method] Shorthand for addListener
    * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
    * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  def on(): js.Any = js.native
  def on(
    eventName: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  def on(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  def on(
    eventName: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    options: js.Any
  ): js.Any = js.native
  def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
  def on(
    eventName: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
  def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  def on(eventName: js.Any): js.Any = js.native
  def on(
    eventName: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Any = js.native
  def on(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  def on(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): js.Any = js.native
  def on(eventName: js.Any, fn: js.Any): js.Any = js.native
  def on(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
  def on(eventName: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
  def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
  
  /** [Method] This method is invoked after a new Component has been added
    * @param component Ext.Component
    * @param position Number
    */
  def onAdd(): Unit = js.native
  def onAdd(component: js.UndefOr[scala.Nothing], position: Double): Unit = js.native
  def onAdd(component: IComponent): Unit = js.native
  def onAdd(component: IComponent, position: Double): Unit = js.native
  
  /** [Method] Method to manage awareness of when components are added to their respective Container firing an added event  */
  def onAdded(): Unit = js.native
  
  /** [Method] This method is invoked before adding a new child Component
    * @param item Ext.Component
    */
  def onBeforeAdd(): Unit = js.native
  def onBeforeAdd(item: IComponent): Unit = js.native
  
  /** [Method] Allows addition of behavior to the destroy operation  */
  def onDestroy(): Unit = js.native
  
  /** [Method] Allows addition of behavior to the disable operation  */
  def onDisable(): Unit = js.native
  
  /** [Method] Invoked after a docked item is added to the Panel
    * @param component Ext.Component
    */
  def onDockedAdd(): Unit = js.native
  def onDockedAdd(component: IComponent): Unit = js.native
  
  /** [Method] Invoked after a docked item is removed from the Panel
    * @param component Ext.Component
    */
  def onDockedRemove(): Unit = js.native
  def onDockedRemove(component: IComponent): Unit = js.native
  
  /** [Method] Allows addition of behavior to the enable operation  */
  def onEnable(): Unit = js.native
  
  /** [Method] Possibly animates down to a target element  */
  def onHide(): Unit = js.native
  
  /** [Method] Called after the component is moved this method is empty by default but can be implemented by any subclass that need  */
  def onPosition(): Unit = js.native
  
  /** [Method] This method is invoked after a new Component has been removed
    * @param component Ext.Component
    * @param autoDestroy Boolean
    */
  def onRemove(): Unit = js.native
  def onRemove(component: js.UndefOr[scala.Nothing], autoDestroy: Boolean): Unit = js.native
  def onRemove(component: IComponent): Unit = js.native
  def onRemove(component: IComponent, autoDestroy: Boolean): Unit = js.native
  
  /** [Method] Method to manage awareness of when components are removed from their respective Container firing a removed event
    * @param destroying Object
    */
  def onRemoved(): Unit = js.native
  def onRemoved(destroying: js.Any): Unit = js.native
  
  /** [Method] Allows addition of behavior to the resize operation  */
  def onResize(): Unit = js.native
  
  /** [Method] Allows addition of behavior to the show operation  */
  def onShow(): Unit = js.native
  
  /** [Method] Invoked after the afterShow method is complete
    * @param callback Function
    * @param scope Object
    */
  def onShowComplete(): Unit = js.native
  def onShowComplete(callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def onShowComplete(callback: js.Any): Unit = js.native
  def onShowComplete(callback: js.Any, scope: js.Any): Unit = js.native
  
  /** [Property] (Ext.Container) */
  var ownerCt: typingsSlinky.extjs.Ext.IContainer = js.native
  
  /** [Method] Template method to do any post blur processing
    * @param e Ext.EventObject The event object
    */
  def postBlur(): Unit = js.native
  def postBlur(e: IEventObject): Unit = js.native
  
  /** [Method] Returns the previous node in the Component tree in tree traversal order
    * @param selector String A ComponentQuery selector to filter the preceding nodes.
    * @returns Ext.Component The previous node (or the previous node which matches the selector). Returns null if there is no matching node.
    */
  def previousNode(): IComponent = js.native
  def previousNode(selector: java.lang.String): IComponent = js.native
  
  /** [Method] Returns the previous sibling of this Component
    * @param selector String A ComponentQuery selector to filter the preceding items.
    * @returns Ext.Component The previous sibling (or the previous sibling which matches the selector). Returns null if there is no matching sibling.
    */
  def previousSibling(): IComponent = js.native
  def previousSibling(selector: java.lang.String): IComponent = js.native
  
  /** [Method] Displays a message box with a progress bar
    * @param title String The title bar text
    * @param msg String The message box body text
    * @param progressText String The text to display inside the progress bar
    * @returns Ext.window.MessageBox this
    */
  def progress(): IMessageBox = js.native
  def progress(title: js.UndefOr[scala.Nothing], msg: js.UndefOr[scala.Nothing], progressText: java.lang.String): IMessageBox = js.native
  def progress(title: js.UndefOr[scala.Nothing], msg: java.lang.String): IMessageBox = js.native
  def progress(title: js.UndefOr[scala.Nothing], msg: java.lang.String, progressText: java.lang.String): IMessageBox = js.native
  def progress(title: java.lang.String): IMessageBox = js.native
  def progress(title: java.lang.String, msg: js.UndefOr[scala.Nothing], progressText: java.lang.String): IMessageBox = js.native
  def progress(title: java.lang.String, msg: java.lang.String): IMessageBox = js.native
  def progress(title: java.lang.String, msg: java.lang.String, progressText: java.lang.String): IMessageBox = js.native
  
  /** [Method] Displays a message box with OK and Cancel buttons prompting the user to enter some text comparable to JavaScript s p
    * @param title String The title bar text
    * @param msg String The message box body text
    * @param fn Function The callback function invoked after the message box is closed. See show method for details.
    * @param scope Object The scope (this reference) in which the callback is executed.
    * @param multiline Boolean/Number True to create a multiline textbox using the defaultTextHeight property, or the height in pixels to create the textbox/
    * @param value String Default value of the text input element
    * @returns Ext.window.MessageBox this
    */
  def prompt(
    title: js.UndefOr[java.lang.String],
    msg: js.UndefOr[java.lang.String],
    fn: js.UndefOr[js.Any],
    scope: js.UndefOr[js.Any],
    multiline: js.UndefOr[js.Any],
    value: js.UndefOr[java.lang.String]
  ): IMessageBox = js.native
  
  /** [Method] Retrieves all descendant components which match the passed selector
    * @param selector String Selector complying to an Ext.ComponentQuery selector. If no selector is specified all items will be returned.
    * @returns Ext.Component[] Components which matched the selector
    */
  def query(): typingsSlinky.extjs.Ext.Array = js.native
  def query(selector: java.lang.String): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Retrieves all descendant components which match the passed function
    * @param fn Function The matcher function. It will be called with a single argument, the component being tested.
    * @param scope Object The scope in which to run the function. If not specified, it will default to the active component.
    * @returns Ext.Component[] Components matched by the passed function
    */
  def queryBy(): typingsSlinky.extjs.Ext.Array = js.native
  def queryBy(fn: js.UndefOr[scala.Nothing], scope: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  def queryBy(fn: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  def queryBy(fn: js.Any, scope: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Finds a component at any level under this container matching the id itemId
    * @param id String The id to find
    * @returns Ext.Component The matching id, null if not found
    */
  def queryById(): IComponent = js.native
  def queryById(id: java.lang.String): IComponent = js.native
  
  /** [Method] Called by Component doAutoRender Register a Container configured floating true with this Component s ZIndexManager
    * @param cmp Object
    */
  def registerFloatingItem(): Unit = js.native
  def registerFloatingItem(cmp: js.Any): Unit = js.native
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param origin Object The Observable whose events this object is to relay.
    * @param events String[] Array of event names to relay.
    * @param prefix String A common prefix to prepend to the event names. For example: this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Now the grid will forward 'load' and 'clear' events of store as 'storeload' and 'storeclear'.
    * @returns Object A Destroyable object. An object which implements the destroy method which, when destroyed, removes all relayers. For example: this.storeRelayers = this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Can be undone by calling Ext.destroy(this.storeRelayers);  or this.store.relayers.destroy();
    */
  def relayEvents(): js.Any = js.native
  def relayEvents(origin: js.UndefOr[scala.Nothing], events: js.UndefOr[scala.Nothing], prefix: java.lang.String): js.Any = js.native
  def relayEvents(origin: js.UndefOr[scala.Nothing], events: typingsSlinky.extjs.Ext.Array): js.Any = js.native
  def relayEvents(origin: js.UndefOr[scala.Nothing], events: typingsSlinky.extjs.Ext.Array, prefix: java.lang.String): js.Any = js.native
  def relayEvents(origin: js.Any): js.Any = js.native
  def relayEvents(origin: js.Any, events: js.UndefOr[scala.Nothing], prefix: java.lang.String): js.Any = js.native
  def relayEvents(origin: js.Any, events: typingsSlinky.extjs.Ext.Array): js.Any = js.native
  def relayEvents(origin: js.Any, events: typingsSlinky.extjs.Ext.Array, prefix: java.lang.String): js.Any = js.native
  
  /** [Method] Removes a component from this container
    * @param component Ext.Component/String The component reference or id to remove.
    * @param autoDestroy Boolean True to automatically invoke the removed Component's Ext.Component.destroy function. Defaults to the value of this Container's autoDestroy config.
    * @returns Ext.Component component The Component that was removed.
    */
  def remove(): IComponent = js.native
  def remove(component: js.UndefOr[scala.Nothing], autoDestroy: Boolean): IComponent = js.native
  def remove(component: js.Any): IComponent = js.native
  def remove(component: js.Any, autoDestroy: Boolean): IComponent = js.native
  
  /** [Method] Removes all components from this container
    * @param autoDestroy Boolean True to automatically invoke the removed Component's Ext.Component.destroy function. Defaults to the value of this Container's autoDestroy config.
    * @returns Ext.Component[] Array of the removed components
    */
  def removeAll(): typingsSlinky.extjs.Ext.Array = js.native
  def removeAll(autoDestroy: Boolean): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Remove any anchor to this element
    * @returns Ext.util.Positionable this
    */
  def removeAnchor(): IPositionable = js.native
  
  /** [Method] Removes a CSS class from the body element
    * @param cls String The class to remove
    * @returns Ext.panel.Panel this
    */
  def removeBodyCls(): IPanel = js.native
  def removeBodyCls(cls: java.lang.String): IPanel = js.native
  
  /** [Method] Removes items in the childEls array based on the return value of a supplied test function
    * @param testFn Function The test function.
    */
  def removeChildEls(): Unit = js.native
  def removeChildEls(testFn: js.Any): Unit = js.native
  
  /** [Method] Removes a CSS class from the top level element representing this component
    * @param cls String/String[] The CSS class name to remove.
    * @returns Ext.Component Returns the Component to allow method chaining.
    */
  def removeCls(): IComponent = js.native
  def removeCls(cls: js.Any): IComponent = js.native
  
  /** [Method] Removes a cls to the uiCls array which will also call removeUIClsFromElement and removes it from all elements of thi
    * @param cls String/String[] A string or an array of strings to remove to the uiCls.
    */
  def removeClsWithUI(): Unit = js.native
  def removeClsWithUI(cls: js.Any): Unit = js.native
  
  /** [Method] Removes the docked item from the panel
    * @param item Ext.Component The Component to remove.
    * @param autoDestroy Boolean Destroy the component after removal.
    */
  def removeDocked(): Unit = js.native
  def removeDocked(item: js.UndefOr[scala.Nothing], autoDestroy: Boolean): Unit = js.native
  def removeDocked(item: IComponent): Unit = js.native
  def removeDocked(item: IComponent, autoDestroy: Boolean): Unit = js.native
  
  /** [Method] Removes an event handler
    * @param eventName String The type of event the handler was associated with.
    * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
    */
  def removeListener(): Unit = js.native
  def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  def removeListener(eventName: java.lang.String): Unit = js.native
  def removeListener(eventName: java.lang.String, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def removeListener(eventName: java.lang.String, fn: js.Any): Unit = js.native
  def removeListener(eventName: java.lang.String, fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Removes listeners that were added by the mon method
    * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    */
  def removeManagedListener(): Unit = js.native
  def removeManagedListener(
    item: js.UndefOr[scala.Nothing],
    ename: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): Unit = js.native
  def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any): Unit = js.native
  def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any): Unit = js.native
  def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def removeManagedListener(item: js.Any): Unit = js.native
  def removeManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def removeManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  def removeManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  def removeManagedListener(item: js.Any, ename: js.Any): Unit = js.native
  def removeManagedListener(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def removeManagedListener(item: js.Any, ename: js.Any, fn: js.Any): Unit = js.native
  def removeManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] inherit docs
    * @param cls Object
    */
  def removeUIClsFromElement(): Unit = js.native
  def removeUIClsFromElement(cls: js.Any): Unit = js.native
  
  /** [Method] Renders the Component into the passed HTML element
    * @param container Ext.Element/HTMLElement/String The element this Component should be rendered into. If it is being created from existing markup, this should be omitted.
    * @param position String/Number The element ID or DOM node index within the container before which this component will be inserted (defaults to appending to the end of the container)
    */
  def render(): Unit = js.native
  def render(container: js.UndefOr[scala.Nothing], position: js.Any): Unit = js.native
  def render(container: js.Any): Unit = js.native
  def render(container: js.Any, position: js.Any): Unit = js.native
  
  /** [Property] (Boolean) */
  var rendered: Boolean = js.native
  
  /** [Method] Restores a maximized window back to its original size and position prior to being maximized and also replaces the re
    * @param animate Object
    * @returns Ext.window.Window this
    */
  def restore(): IWindow = js.native
  def restore(animate: js.Any): IWindow = js.native
  
  /** [Method] Resumes firing of the named event s
    * @param eventName String... Multiple event names to resume.
    */
  def resumeEvent(eventName: js.Any*): Unit = js.native
  
  /** [Method] Resumes firing events see suspendEvents */
  def resumeEvents(): Unit = js.native
  
  /** [Method] Conditionally saves a single property from this object to the given state object
    * @param propName String The name of the property to save.
    * @param state Object The state object in to which to save the property.
    * @param stateName String The name to use for the property in state.
    * @returns Boolean True if the property was saved, false if not.
    */
  def savePropToState(): Boolean = js.native
  def savePropToState(propName: js.UndefOr[scala.Nothing], state: js.UndefOr[scala.Nothing], stateName: java.lang.String): Boolean = js.native
  def savePropToState(propName: js.UndefOr[scala.Nothing], state: js.Any): Boolean = js.native
  def savePropToState(propName: js.UndefOr[scala.Nothing], state: js.Any, stateName: java.lang.String): Boolean = js.native
  def savePropToState(propName: java.lang.String): Boolean = js.native
  def savePropToState(propName: java.lang.String, state: js.UndefOr[scala.Nothing], stateName: java.lang.String): Boolean = js.native
  def savePropToState(propName: java.lang.String, state: js.Any): Boolean = js.native
  def savePropToState(propName: java.lang.String, state: js.Any, stateName: java.lang.String): Boolean = js.native
  
  /** [Method] Gathers additional named properties of the instance and adds their current values to the passed state object
    * @param propNames String/String[] The name (or array of names) of the property to save.
    * @param state Object The state object in to which to save the property values.
    * @returns Object state
    */
  def savePropsToState(): js.Any = js.native
  def savePropsToState(propNames: js.UndefOr[scala.Nothing], state: js.Any): js.Any = js.native
  def savePropsToState(propNames: js.Any): js.Any = js.native
  def savePropsToState(propNames: js.Any, state: js.Any): js.Any = js.native
  
  /** [Method] Saves the state of the object to the persistence store  */
  def saveState(): Unit = js.native
  
  /** [Method] Scrolls this Component s target element by the passed delta values optionally animating
    * @param deltaX Number/Number[]/Object Either the x delta, an Array specifying x and y deltas or an object with "x" and "y" properties.
    * @param deltaY Number/Boolean/Object Either the y delta, or an animate flag or config object.
    * @param animate Boolean/Object Animate flag/config object if the delta values were passed separately.
    */
  def scrollBy(): Unit = js.native
  def scrollBy(deltaX: js.UndefOr[scala.Nothing], deltaY: js.UndefOr[scala.Nothing], animate: js.Any): Unit = js.native
  def scrollBy(deltaX: js.UndefOr[scala.Nothing], deltaY: js.Any): Unit = js.native
  def scrollBy(deltaX: js.UndefOr[scala.Nothing], deltaY: js.Any, animate: js.Any): Unit = js.native
  def scrollBy(deltaX: js.Any): Unit = js.native
  def scrollBy(deltaX: js.Any, deltaY: js.UndefOr[scala.Nothing], animate: js.Any): Unit = js.native
  def scrollBy(deltaX: js.Any, deltaY: js.Any): Unit = js.native
  def scrollBy(deltaX: js.Any, deltaY: js.Any, animate: js.Any): Unit = js.native
  
  /** [Property] (Object) */
  var scrollFlags: js.Any = js.native
  
  /** [Property] (Ext.Class) */
  var self: IClass = js.native
  
  /** [Method] Ensures that all effects queued after sequenceFx is called on this object are run in sequence
    * @returns Object this
    */
  def sequenceFx(): js.Any = js.native
  
  /** [Method] This method is called internally by Ext ZIndexManager to signal that a floating Component has either been moved to th
    * @param active Boolean True to activate the Component, false to deactivate it.
    * @param newActive Ext.Component The newly active Component which is taking over topmost zIndex position.
    */
  def setActive(): Unit = js.native
  def setActive(active: js.UndefOr[scala.Nothing], newActive: IComponent): Unit = js.native
  def setActive(active: Boolean): Unit = js.native
  def setActive(active: Boolean, newActive: IComponent): Unit = js.native
  
  /** [Method] Sets the overflow on the content element of the component
    * @param scroll Boolean True to allow the Component to auto scroll.
    * @returns Ext.Component this
    */
  def setAutoScroll(): IComponent = js.native
  def setAutoScroll(scroll: Boolean): IComponent = js.native
  
  /** [Method] Sets the body style according to the passed parameters
    * @param style Mixed A full style specification string, or object, or the name of a style property to set.
    * @param value String If the first param was a style property name, the style property value.
    * @returns Ext.panel.Panel this
    */
  def setBodyStyle(): IPanel = js.native
  def setBodyStyle(style: js.UndefOr[scala.Nothing], value: java.lang.String): IPanel = js.native
  def setBodyStyle(style: js.Any): IPanel = js.native
  def setBodyStyle(style: js.Any, value: java.lang.String): IPanel = js.native
  
  /** [Method]
    * @param border Object
    * @param targetEl Object
    */
  def setBorder(): Unit = js.native
  def setBorder(border: js.UndefOr[scala.Nothing], targetEl: js.Any): Unit = js.native
  def setBorder(border: js.Any): Unit = js.native
  def setBorder(border: js.Any, targetEl: js.Any): Unit = js.native
  
  /** [Method] This method changes the region config property for this border region
    * @param region String The new region value ("north", "south", "east" or "west").
    * @returns String The previous value of the region property.
    */
  def setBorderRegion(): java.lang.String = js.native
  def setBorderRegion(region: java.lang.String): java.lang.String = js.native
  
  /** [Method] Sets the element s box
    * @param box Object The box to fill {x, y, width, height}
    * @param animate Boolean/Object true for the default animation or a standard Element animation config object
    * @returns Ext.util.Positionable this
    */
  def setBox(): IPositionable = js.native
  def setBox(box: js.UndefOr[scala.Nothing], animate: js.Any): IPositionable = js.native
  def setBox(box: js.Any): IPositionable = js.native
  def setBox(box: js.Any, animate: js.Any): IPositionable = js.native
  
  /** [Method] Enable or disable the component
    * @param disabled Boolean true to disable.
    */
  def setDisabled(): Unit = js.native
  def setDisabled(disabled: Boolean): Unit = js.native
  
  /** [Method] Sets the dock position of this component in its parent panel
    * @param dock Object The dock position.
    * @param layoutParent Boolean true to re-layout parent.
    * @returns Ext.Component this
    */
  def setDocked(): IComponent = js.native
  def setDocked(dock: js.UndefOr[scala.Nothing], layoutParent: Boolean): IComponent = js.native
  def setDocked(dock: js.Any): IComponent = js.native
  def setDocked(dock: js.Any, layoutParent: Boolean): IComponent = js.native
  
  /** [Method] Set the glyph for the panel s header
    * @param newGlyph Number/String The new glyph This parameter expects a format consistent with that of glyph
    */
  def setGlyph(): Unit = js.native
  def setGlyph(newGlyph: js.Any): Unit = js.native
  
  /** [Method] Sets the height of the component
    * @param height Number The new height to set. This may be one of:  A Number specifying the new height in the Element's Ext.Element.defaultUnits (by default, pixels). A String used to set the CSS height style. undefined to leave the height unchanged.
    * @returns Ext.Component this
    */
  def setHeight(): IComponent = js.native
  def setHeight(height: Double): IComponent = js.native
  
  /** [Method] Adds the specified icon to the dialog
    * @param icon String A CSS classname specifying the icon's background image url, or empty string to clear the icon
    * @param width Number The width of the icon. If not specified, the default is used
    * @param height Number The height of the icon. If not specified, the default is used
    * @returns Ext.window.MessageBox this
    */
  def setIcon(): IMessageBox = js.native
  def setIcon(icon: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], height: Double): IMessageBox = js.native
  def setIcon(icon: js.UndefOr[scala.Nothing], width: Double): IMessageBox = js.native
  def setIcon(icon: js.UndefOr[scala.Nothing], width: Double, height: Double): IMessageBox = js.native
  def setIcon(icon: java.lang.String): IMessageBox = js.native
  def setIcon(icon: java.lang.String, width: js.UndefOr[scala.Nothing], height: Double): IMessageBox = js.native
  def setIcon(icon: java.lang.String, width: Double): IMessageBox = js.native
  def setIcon(icon: java.lang.String, width: Double, height: Double): IMessageBox = js.native
  
  /** [Method] Set the iconCls for the panel s header
    * @param newIconCls String The new CSS class name
    */
  def setIconCls(): Unit = js.native
  def setIconCls(newIconCls: java.lang.String): Unit = js.native
  
  /** [Method] This method allows you to show or hide a LoadMask on top of this component
    * @param load Boolean/Object/String True to show the default LoadMask, a config object that will be passed to the LoadMask constructor, or a message String to show. False to hide the current LoadMask.
    * @param targetEl Boolean True to mask the targetEl of this Component instead of the this.el. For example, setting this to true on a Panel will cause only the body to be masked.
    * @returns Ext.LoadMask The LoadMask instance that has just been shown.
    */
  def setLoading(): ILoadMask = js.native
  def setLoading(load: js.UndefOr[scala.Nothing], targetEl: Boolean): ILoadMask = js.native
  def setLoading(load: js.Any): ILoadMask = js.native
  def setLoading(load: js.Any, targetEl: Boolean): ILoadMask = js.native
  
  /** [Method] Overridden in Ext rtl AbstractComponent
    * @param x Object
    * @returns Ext.util.Positionable this
    */
  def setLocalX(): IPositionable = js.native
  def setLocalX(x: js.Any): IPositionable = js.native
  
  /** [Method] Overridden in Ext rtl AbstractComponent
    * @param x Object
    * @param y Object
    * @returns Ext.util.Positionable this
    */
  def setLocalXY(): IPositionable = js.native
  def setLocalXY(x: js.UndefOr[scala.Nothing], y: js.Any): IPositionable = js.native
  def setLocalXY(x: js.Any): IPositionable = js.native
  def setLocalXY(x: js.Any, y: js.Any): IPositionable = js.native
  
  /** [Method] Sets the local y coordinate of this element using CSS style
    * @param y Object
    * @returns Ext.util.Positionable this
    */
  def setLocalY(): IPositionable = js.native
  def setLocalY(y: js.Any): IPositionable = js.native
  
  /** [Method] Sets the margin on the target element
    * @param margin Number/String The margin to set. See the margin config.
    */
  def setMargin(): Unit = js.native
  def setMargin(margin: js.Any): Unit = js.native
  
  /** [Method] Sets the overflow x y on the content element of the component
    * @param overflowX String The overflow-x value.
    * @param overflowY String The overflow-y value.
    * @returns Ext.Component this
    */
  def setOverflowXY(): IComponent = js.native
  def setOverflowXY(overflowX: js.UndefOr[scala.Nothing], overflowY: java.lang.String): IComponent = js.native
  def setOverflowXY(overflowX: java.lang.String): IComponent = js.native
  def setOverflowXY(overflowX: java.lang.String, overflowY: java.lang.String): IComponent = js.native
  
  /** [Method] Sets the page XY position of the component
    * @param x Number/Number[] The new x position or an array of [x,y].
    * @param y Number The new y position.
    * @param animate Boolean/Object True to animate the Component into its new position. You may also pass an animation configuration.
    * @returns Ext.Component this
    */
  def setPagePosition(): IComponent = js.native
  def setPagePosition(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], animate: js.Any): IComponent = js.native
  def setPagePosition(x: js.UndefOr[scala.Nothing], y: Double): IComponent = js.native
  def setPagePosition(x: js.UndefOr[scala.Nothing], y: Double, animate: js.Any): IComponent = js.native
  def setPagePosition(x: js.Any): IComponent = js.native
  def setPagePosition(x: js.Any, y: js.UndefOr[scala.Nothing], animate: js.Any): IComponent = js.native
  def setPagePosition(x: js.Any, y: Double): IComponent = js.native
  def setPagePosition(x: js.Any, y: Double, animate: js.Any): IComponent = js.native
  
  /** [Method] Sets the left and top of the component
    * @param x Number/Number[]/Object The new left, an array of [x,y], or animation config object containing x and y properties.
    * @param y Number The new top.
    * @param animate Boolean/Object If true, the Component is animated into its new position. You may also pass an animation configuration.
    * @returns Ext.Component this
    */
  def setPosition(): IComponent = js.native
  def setPosition(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], animate: js.Any): IComponent = js.native
  def setPosition(x: js.UndefOr[scala.Nothing], y: Double): IComponent = js.native
  def setPosition(x: js.UndefOr[scala.Nothing], y: Double, animate: js.Any): IComponent = js.native
  def setPosition(x: js.Any): IComponent = js.native
  def setPosition(x: js.Any, y: js.UndefOr[scala.Nothing], animate: js.Any): IComponent = js.native
  def setPosition(x: js.Any, y: Double): IComponent = js.native
  def setPosition(x: js.Any, y: Double, animate: js.Any): IComponent = js.native
  
  /** [Method] Sets the element s position and size to the specified region
    * @param region Ext.util.Region The region to fill
    * @param animate Boolean/Object true for the default animation or a standard Element animation config object
    * @returns Ext.util.Positionable this
    */
  def setRegion(): IPositionable = js.native
  def setRegion(region: js.UndefOr[scala.Nothing], animate: js.Any): IPositionable = js.native
  def setRegion(region: IRegion): IPositionable = js.native
  def setRegion(region: IRegion, animate: js.Any): IPositionable = js.native
  
  /** [Method] Sets the weight config property for this component
    * @param weight Number The new weight value.
    * @returns Number The previous value of the weight property.
    */
  def setRegionWeight(): Double = js.native
  def setRegionWeight(weight: Double): Double = js.native
  
  /** [Method] Sets the width and height of this Component
    * @param width Number/String/Object The new width to set. This may be one of:  A Number specifying the new width in the Element's Ext.Element.defaultUnits (by default, pixels). A String used to set the CSS width style. A size object in the format {width: widthValue, height: heightValue}. undefined to leave the width unchanged.
    * @param height Number/String The new height to set (not required if a size object is passed as the first arg). This may be one of:  A Number specifying the new height in the Element's Ext.Element.defaultUnits (by default, pixels). A String used to set the CSS height style. Animation may not be used. undefined to leave the height unchanged.
    * @returns Ext.Component this
    */
  def setSize(): IComponent = js.native
  def setSize(width: js.UndefOr[scala.Nothing], height: js.Any): IComponent = js.native
  def setSize(width: js.Any): IComponent = js.native
  def setSize(width: js.Any, height: js.Any): IComponent = js.native
  
  /** [Method] Set a title for the panel s header
    * @param newTitle String
    */
  def setTitle(): Unit = js.native
  def setTitle(newTitle: java.lang.String): Unit = js.native
  
  /** [Method] Sets the UI for the component
    * @param ui Object
    */
  def setUI(): Unit = js.native
  def setUI(ui: js.Any): Unit = js.native
  
  /** [Method] Convenience function to hide or show this component by Boolean
    * @param visible Boolean true to show, false to hide.
    * @returns Ext.Component this
    */
  def setVisible(): IComponent = js.native
  def setVisible(visible: Boolean): IComponent = js.native
  
  /** [Method] Sets the width of the component
    * @param width Number The new width to setThis may be one of:  A Number specifying the new width in the Element's Ext.Element.defaultUnits (by default, pixels). A String used to set the CSS width style.
    * @returns Ext.Component this
    */
  def setWidth(): IComponent = js.native
  def setWidth(width: Double): IComponent = js.native
  
  /** [Method] Sets the X position of the DOM element based on page coordinates
    * @param x Object
    * @param animate Object
    * @returns Ext.util.Positionable this
    */
  def setX(): IPositionable = js.native
  def setX(x: js.UndefOr[scala.Nothing], animate: js.Any): IPositionable = js.native
  def setX(x: js.Any): IPositionable = js.native
  def setX(x: js.Any, animate: js.Any): IPositionable = js.native
  
  /** [Method] Sets the position of the DOM element in page coordinates
    * @param xy Object
    * @param animate Object
    * @returns Ext.util.Positionable this
    */
  def setXY(): IPositionable = js.native
  def setXY(xy: js.UndefOr[scala.Nothing], animate: js.Any): IPositionable = js.native
  def setXY(xy: js.Any): IPositionable = js.native
  def setXY(xy: js.Any, animate: js.Any): IPositionable = js.native
  
  /** [Method] Sets the Y position of the DOM element based on page coordinates
    * @param y Object
    * @param animate Object
    * @returns Ext.util.Positionable this
    */
  def setY(): IPositionable = js.native
  def setY(y: js.UndefOr[scala.Nothing], animate: js.Any): IPositionable = js.native
  def setY(y: js.Any): IPositionable = js.native
  def setY(y: js.Any, animate: js.Any): IPositionable = js.native
  
  /** [Method] Displays a new message box or reinitializes an existing message box based on the config options passed in
    * @param config Object The following config options are supported:
    * @returns Ext.window.MessageBox this
    */
  def show(): IMessageBox = js.native
  def show(config: js.Any): IMessageBox = js.native
  
  /** [Method] Displays component at specific xy position
    * @param x Number/Number[] The new x position or array of [x,y].
    * @param y Number The new y position
    * @param animate Boolean/Object True to animate the Component into its new position. You may also pass an animation configuration.
    * @returns Ext.Component this
    */
  def showAt(): IComponent = js.native
  def showAt(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], animate: js.Any): IComponent = js.native
  def showAt(x: js.UndefOr[scala.Nothing], y: Double): IComponent = js.native
  def showAt(x: js.UndefOr[scala.Nothing], y: Double, animate: js.Any): IComponent = js.native
  def showAt(x: js.Any): IComponent = js.native
  def showAt(x: js.Any, y: js.UndefOr[scala.Nothing], animate: js.Any): IComponent = js.native
  def showAt(x: js.Any, y: Double): IComponent = js.native
  def showAt(x: js.Any, y: Double, animate: js.Any): IComponent = js.native
  
  /** [Method] Shows this component by the specified Component or Element
    * @param component Ext.Component/Ext.dom.Element The Ext.Component or Ext.Element to show the component by.
    * @param position String Alignment position as used by Ext.util.Positionable.getAlignToXY. Defaults to defaultAlign.
    * @param offsets Number[] Alignment offsets as used by Ext.util.Positionable.getAlignToXY.
    * @returns Ext.Component this
    */
  def showBy(): IComponent = js.native
  def showBy(
    component: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    offsets: typingsSlinky.extjs.Ext.Array
  ): IComponent = js.native
  def showBy(component: js.UndefOr[scala.Nothing], position: java.lang.String): IComponent = js.native
  def showBy(
    component: js.UndefOr[scala.Nothing],
    position: java.lang.String,
    offsets: typingsSlinky.extjs.Ext.Array
  ): IComponent = js.native
  def showBy(component: js.Any): IComponent = js.native
  def showBy(component: js.Any, position: js.UndefOr[scala.Nothing], offsets: typingsSlinky.extjs.Ext.Array): IComponent = js.native
  def showBy(component: js.Any, position: java.lang.String): IComponent = js.native
  def showBy(component: js.Any, position: java.lang.String, offsets: typingsSlinky.extjs.Ext.Array): IComponent = js.native
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  def statics(): IClass = js.native
  
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
    * @returns Ext.Element The Element
    */
  def stopAnimation(): typingsSlinky.extjs.Ext.IElement = js.native
  
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
    * @returns Ext.Element The Element
    */
  def stopFx(): typingsSlinky.extjs.Ext.IElement = js.native
  
  /** [Method] Suspends firing of the named event s
    * @param eventName String... Multiple event names to suspend.
    */
  def suspendEvent(eventName: js.Any*): Unit = js.native
  
  /** [Method] Suspends the firing of all events
    * @param queueSuspended Boolean Pass as true to queue up suspended events to be fired after the resumeEvents call instead of discarding all suspended events.
    */
  def suspendEvents(): Unit = js.native
  def suspendEvents(queueSuspended: Boolean): Unit = js.native
  
  /** [Method] Ensures that all effects queued after syncFx is called on this object are run concurrently
    * @returns Object this
    */
  def syncFx(): js.Any = js.native
  
  /** [Method] Sends this Component to the back of lower z index than any other visible windows
    * @returns Ext.Component this
    */
  def toBack(): IComponent = js.native
  
  /** [Method] Brings this floating Component to the front of any other visible floating Components managed by the same ZIndexManag
    * @param preventFocus Boolean Specify true to prevent the Component from being focused.
    * @returns Ext.Component this
    */
  def toFront(): IComponent = js.native
  def toFront(preventFocus: Boolean): IComponent = js.native
  
  /** [Method] Shortcut for performing an expand or collapse based on the current state of the panel
    * @returns Ext.panel.Panel this
    */
  def toggleCollapse(): IPanel = js.native
  
  /** [Method] A shortcut method for toggling between maximize and restore based on the current maximized state of the window
    * @returns Ext.window.Window this
    */
  def toggleMaximize(): IWindow = js.native
  
  /** [Method] Translates the passed page coordinates into left top css values for the element
    * @param x Number/Array The page x or an array containing [x, y]
    * @param y Number The page y, required if x is not an array
    * @returns Object An object with left and top properties. e.g. {left: (value), top: (value)}
    */
  def translatePoints(): js.Any = js.native
  def translatePoints(x: js.UndefOr[scala.Nothing], y: Double): js.Any = js.native
  def translatePoints(x: js.Any): js.Any = js.native
  def translatePoints(x: js.Any, y: Double): js.Any = js.native
  
  /** [Method] Shorthand for removeListener
    * @param eventName String The type of event the handler was associated with.
    * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
    */
  def un(): Unit = js.native
  def un(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  def un(eventName: java.lang.String): Unit = js.native
  def un(eventName: java.lang.String, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def un(eventName: java.lang.String, fn: js.Any): Unit = js.native
  def un(eventName: java.lang.String, fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Navigates up the ownership hierarchy searching for an ancestor Container which matches any passed simple selector or
    * @param selector String/Ext.Component The simple selector component or actual component to test. If not passed the immediate owner/activater is returned.
    * @param limit String/Number/Ext.Component This may be a selector upon which to stop the upward scan, or a limit of teh number of steps, or Component reference to stop on.
    * @returns Ext.container.Container The matching ancestor Container (or undefined if no match was found).
    */
  def up(): typingsSlinky.extjs.Ext.container.IContainer = js.native
  def up(selector: js.UndefOr[scala.Nothing], limit: js.Any): typingsSlinky.extjs.Ext.container.IContainer = js.native
  def up(selector: js.Any): typingsSlinky.extjs.Ext.container.IContainer = js.native
  def up(selector: js.Any, limit: js.Any): typingsSlinky.extjs.Ext.container.IContainer = js.native
  
  /** [Method] Update the content area of a component
    * @param htmlOrData String/Object If this component has been configured with a template via the tpl config then it will use this argument as data to populate the template. If this component was not configured with a template, the components content area will be updated via Ext.Element update.
    * @param loadScripts Boolean Only legitimate when using the html configuration.
    * @param callback Function Only legitimate when using the html configuration. Callback to execute when scripts have finished loading.
    */
  def update(): Unit = js.native
  def update(htmlOrData: js.UndefOr[scala.Nothing], loadScripts: js.UndefOr[scala.Nothing], callback: js.Any): Unit = js.native
  def update(htmlOrData: js.UndefOr[scala.Nothing], loadScripts: Boolean): Unit = js.native
  def update(htmlOrData: js.UndefOr[scala.Nothing], loadScripts: Boolean, callback: js.Any): Unit = js.native
  def update(htmlOrData: js.Any): Unit = js.native
  def update(htmlOrData: js.Any, loadScripts: js.UndefOr[scala.Nothing], callback: js.Any): Unit = js.native
  def update(htmlOrData: js.Any, loadScripts: Boolean): Unit = js.native
  def update(htmlOrData: js.Any, loadScripts: Boolean, callback: js.Any): Unit = js.native
  
  /** [Method] Sets the current box measurements of the component s underlying element
    * @param box Object An object in the format {x, y, width, height}
    * @returns Ext.Component this
    */
  def updateBox(): IComponent = js.native
  def updateBox(box: js.Any): IComponent = js.native
  
  /** [Method] Updates this component s layout
    * @param options Object An object with layout options.
    */
  def updateLayout(): Unit = js.native
  def updateLayout(options: js.Any): Unit = js.native
  
  /** [Method] Updates a progress style message box s text and progress bar
    * @param value Number Any number between 0 and 1 (e.g., .5)
    * @param progressText String The progress text to display inside the progress bar.
    * @param msg String The message box's body text is replaced with the specified string (defaults to undefined so that any existing body text will not get overwritten by default unless a new value is passed in)
    * @returns Ext.window.MessageBox this
    */
  def updateProgress(): IMessageBox = js.native
  def updateProgress(value: js.UndefOr[scala.Nothing], progressText: js.UndefOr[scala.Nothing], msg: java.lang.String): IMessageBox = js.native
  def updateProgress(value: js.UndefOr[scala.Nothing], progressText: java.lang.String): IMessageBox = js.native
  def updateProgress(value: js.UndefOr[scala.Nothing], progressText: java.lang.String, msg: java.lang.String): IMessageBox = js.native
  def updateProgress(value: Double): IMessageBox = js.native
  def updateProgress(value: Double, progressText: js.UndefOr[scala.Nothing], msg: java.lang.String): IMessageBox = js.native
  def updateProgress(value: Double, progressText: java.lang.String): IMessageBox = js.native
  def updateProgress(value: Double, progressText: java.lang.String, msg: java.lang.String): IMessageBox = js.native
  
  def wait(msg: js.UndefOr[scala.Nothing], title: js.UndefOr[scala.Nothing], config: js.Any): IMessageBox = js.native
  def wait(msg: js.UndefOr[scala.Nothing], title: java.lang.String): IMessageBox = js.native
  def wait(msg: js.UndefOr[scala.Nothing], title: java.lang.String, config: js.Any): IMessageBox = js.native
  def wait(msg: java.lang.String): IMessageBox = js.native
  def wait(msg: java.lang.String, title: js.UndefOr[scala.Nothing], config: js.Any): IMessageBox = js.native
  def wait(msg: java.lang.String, title: java.lang.String): IMessageBox = js.native
  def wait(msg: java.lang.String, title: java.lang.String, config: js.Any): IMessageBox = js.native
  
  /** [Property] (Ext.ZIndexManager) */
  var zIndexManager: IZIndexManager = js.native
  
  /** [Property] (Ext.Container) */
  var zIndexParent: typingsSlinky.extjs.Ext.IContainer = js.native
}
