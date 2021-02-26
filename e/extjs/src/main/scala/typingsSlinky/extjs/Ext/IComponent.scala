package typingsSlinky.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.extjs.Ext.IClass because Already inherited
- typingsSlinky.extjs.Ext.IBase because Already inherited
- typingsSlinky.extjs.Ext.util.IFloating because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined constrain, fixed, focusOnToFront, shadow, shadowOffset, center, doConstrain, setActive, toBack, toFront */ @js.native
trait IComponent extends IAbstractComponent {
  
  /** [Method] Called by the layout system after the Component has been laid out  */
  @JSName("afterComponentLayout")
  var afterComponentLayout_IComponent: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Invoked after the Component has been hidden
    * @param callback Function
    * @param scope Object
    */
  var afterHide: js.UndefOr[
    js.Function2[/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Method] Allows addition of behavior after rendering is complete  */
  @JSName("afterRender")
  var afterRender_IComponent: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Template method called after a Component has been positioned
    * @param ax Object
    * @param ay Object
    */
  @JSName("afterSetPosition")
  var afterSetPosition_IComponent: js.UndefOr[js.Function2[/* ax */ js.UndefOr[js.Any], /* ay */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Invoked after the Component is shown after onShow is called
    * @param animateTarget String/Ext.Element
    * @param callback Function
    * @param scope Object
    */
  var afterShow: js.UndefOr[
    js.Function3[
      /* animateTarget */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** [Config Option] (Boolean) */
  var autoScroll: js.UndefOr[Boolean] = js.native
  
  /** [Method] Invoked before the Component is shown  */
  var beforeShow: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Bubbles up the component container heirarchy calling the specified function with each component
    * @param fn Function The function to call
    * @param scope Object The scope of the function. Defaults to current node.
    * @param args Array The args to call the function with. Defaults to passing the current component.
    * @returns Ext.Component this
    */
  var bubble: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* args */ js.UndefOr[Array], 
      this.type
    ]
  ] = js.native
  
  /** [Method] Cancel any deferred focus on this component */
  var cancelFocus: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Center this Component in its container
    * @returns Ext.Component this
    */
  var center: js.UndefOr[js.Function0[this.type | IComponent]] = js.native
  
  /** [Method] Clone the current component using the original config values passed into this instance by default
    * @param overrides Object A new config containing any properties to override in the cloned version. An id property can be passed on this object, otherwise one will be generated to avoid duplicates.
    * @returns Ext.Component clone The cloned copy of this component
    */
  var cloneConfig: js.UndefOr[js.Function1[/* overrides */ js.UndefOr[js.Any], this.type]] = js.native
  
  /** [Config Option] (Number/String) */
  var columnWidth: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var constrain: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Ext.util.Region/Ext.Element) */
  var constrainTo: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object/String) */
  var constraintInsets: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var defaultAlign: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Moves this floating Component into a constrain region
    * @param constrainTo String/HTMLElement/Ext.Element/Ext.util.Region The Element or Region into which this Component is to be constrained. Defaults to the element into which this floating Component was rendered.
    */
  var doConstrain: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Find a container above this component at any level by a custom function
    * @param fn Function The custom function to call with the arguments (container, this component).
    * @returns Ext.container.Container The first Container for which the custom function returns true
    */
  var findParentBy: js.UndefOr[
    js.Function1[/* fn */ js.UndefOr[js.Any], typingsSlinky.extjs.Ext.container.IContainer]
  ] = js.native
  
  /** [Method] Find a container above this component at any level by xtype or class See also the up method
    * @param xtype String/Ext.Class The xtype string for a component, or the class of the component directly
    * @returns Ext.container.Container The first Container which matches the given xtype or class
    */
  var findParentByType: js.UndefOr[
    js.Function1[/* xtype */ js.UndefOr[js.Any], typingsSlinky.extjs.Ext.container.IContainer]
  ] = js.native
  
  /** [Config Option] (Boolean) */
  var fixed: js.UndefOr[Boolean] = js.native
  
  /** [Property] (Ext.Container) */
  var floatParent: js.UndefOr[IContainer] = js.native
  
  /** [Method] Try to focus this component
    * @param selectText Boolean If applicable, true to also select the text in this component
    * @param delay Boolean/Number Delay the focus this number of milliseconds (true for 10 milliseconds).
    * @param callback Function Only needed if the delay parameter is used. A function to call upon focus.
    * @param scope Function Only needed if the delay parameter is used. The scope (this reference) in which to execute the callback.
    * @returns Ext.Component The focused Component. Usually this Component. Some Containers may delegate focus to a descendant Component (Windows can do this through their defaultFocus config option.
    */
  var focus: js.UndefOr[
    js.Function4[
      /* selectText */ js.UndefOr[Boolean], 
      /* delay */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.native
  
  /** [Config Option] (Boolean) */
  var focusOnToFront: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var formBind: js.UndefOr[Boolean] = js.native
  
  /** [Method] Gets the current XY position of the component s underlying element
    * @param local Boolean If true the element's left and top are returned instead of page XY.
    * @returns Number[] The XY position of the element (e.g., [100, 200])
    */
  var getPosition: js.UndefOr[js.Function1[/* local */ js.UndefOr[Boolean], Array]] = js.native
  
  /** [Method] Gets the xtype for this component as registered with Ext ComponentManager
    * @returns String The xtype
    */
  var getXType: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Hides this Component setting it to invisible using the configured hideMode
    * @param animateTarget String/Ext.Element/Ext.Component only valid for floating Components such as Windows or ToolTips, or regular Components which have been configured with floating: true.. The target to which the Component should animate while hiding.
    * @param callback Function A callback function to call after the Component is hidden.
    * @param scope Object The scope (this reference) in which the callback is executed. Defaults to this Component.
    * @returns Ext.Component this
    */
  var hide: js.UndefOr[
    js.Function3[
      /* animateTarget */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.native
  
  /** [Method] The initComponent template method is an important initialization step for a Component  */
  var initComponent: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Method to manage awareness of when components are added to their respective Container firing an added event  */
  @JSName("onAdded")
  var onAdded_IComponent: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Allows addition of behavior to the destroy operation  */
  var onDestroy: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Possibly animates down to a target element
    * @param animateTarget String/Ext.Element/Ext.Component
    * @param callback Function
    * @param scope Object
    */
  var onHide: js.UndefOr[
    js.Function3[
      /* animateTarget */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Allows addition of behavior to the show operation
    * @param animateTarget String/Ext.Element
    * @param callback Function
    * @param scope Object
    */
  var onShow: js.UndefOr[
    js.Function3[
      /* animateTarget */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Invoked after the afterShow method is complete
    * @param callback Function
    * @param scope Object
    */
  var onShowComplete: js.UndefOr[
    js.Function2[/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Config Option] (String) */
  var overflowX: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (String) */
  var overflowY: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] ("north"/"south"/"east"/"west"/"center") */
  var region: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean/Object) */
  var resizable: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var resizeHandles: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Scrolls this Component s target element by the passed delta values optionally animating
    * @param deltaX Number/Number[]/Object Either the x delta, an Array specifying x and y deltas or an object with "x" and "y" properties.
    * @param deltaY Number/Boolean/Object Either the y delta, or an animate flag or config object.
    * @param animate Boolean/Object Animate flag/config object if the delta values were passed separately.
    */
  var scrollBy: js.UndefOr[
    js.Function3[
      /* deltaX */ js.UndefOr[js.Any], 
      /* deltaY */ js.UndefOr[js.Any], 
      /* animate */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** [Property] (Object) */
  var scrollFlags: js.UndefOr[js.Any] = js.native
  
  /** [Method] This method is called internally by Ext ZIndexManager to signal that a floating Component has either been moved to th
    * @param active Boolean True to activate the Component, false to deactivate it.
    * @param newActive Ext.Component The newly active Component which is taking over topmost zIndex position.
    */
  var setActive: js.UndefOr[js.Function2[js.UndefOr[Boolean], js.UndefOr[this.type | IComponent], Unit]] = js.native
  
  /** [Method] Sets the overflow on the content element of the component
    * @param scroll Boolean True to allow the Component to auto scroll.
    * @returns Ext.Component this
    */
  var setAutoScroll: js.UndefOr[js.Function1[/* scroll */ js.UndefOr[Boolean], this.type]] = js.native
  
  /** [Method] This method changes the region config property for this border region
    * @param region String The new region value ("north", "south", "east" or "west").
    * @returns String The previous value of the region property.
    */
  var setBorderRegion: js.UndefOr[js.Function1[/* region */ js.UndefOr[java.lang.String], java.lang.String]] = js.native
  
  /** [Method] This method allows you to show or hide a LoadMask on top of this component
    * @param load Boolean/Object/String True to show the default LoadMask, a config object that will be passed to the LoadMask constructor, or a message String to show. False to hide the current LoadMask.
    * @param targetEl Boolean True to mask the targetEl of this Component instead of the this.el. For example, setting this to true on a Panel will cause only the body to be masked.
    * @returns Ext.LoadMask The LoadMask instance that has just been shown.
    */
  var setLoading: js.UndefOr[
    js.Function2[/* load */ js.UndefOr[js.Any], /* targetEl */ js.UndefOr[Boolean], ILoadMask]
  ] = js.native
  
  /** [Method] Sets the overflow x y on the content element of the component
    * @param overflowX String The overflow-x value.
    * @param overflowY String The overflow-y value.
    * @returns Ext.Component this
    */
  var setOverflowXY: js.UndefOr[
    js.Function2[
      /* overflowX */ js.UndefOr[java.lang.String], 
      /* overflowY */ js.UndefOr[java.lang.String], 
      this.type
    ]
  ] = js.native
  
  /** [Method] Sets the page XY position of the component
    * @param x Number/Number[] The new x position or an array of [x,y].
    * @param y Number The new y position.
    * @param animate Boolean/Object True to animate the Component into its new position. You may also pass an animation configuration.
    * @returns Ext.Component this
    */
  var setPagePosition: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[js.Any], 
      /* y */ js.UndefOr[Double], 
      /* animate */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.native
  
  /** [Method] Sets the left and top of the component
    * @param x Number/Number[]/Object The new left, an array of [x,y], or animation config object containing x and y properties.
    * @param y Number The new top.
    * @param animate Boolean/Object If true, the Component is animated into its new position. You may also pass an animation configuration.
    * @returns Ext.Component this
    */
  var setPosition: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[js.Any], 
      /* y */ js.UndefOr[Double], 
      /* animate */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.native
  
  /** [Method] Sets the weight config property for this component
    * @param weight Number The new weight value.
    * @returns Number The previous value of the weight property.
    */
  var setRegionWeight: js.UndefOr[js.Function1[/* weight */ js.UndefOr[Double], Double]] = js.native
  
  /** [Config Option] (String/Boolean) */
  var shadow: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number) */
  var shadowOffset: js.UndefOr[Double] = js.native
  
  /** [Method] Shows this Component rendering it first if autoRender or floating are true
    * @param animateTarget String/Ext.Element only valid for floating Components such as Windows or ToolTips, or regular Components which have been configured with floating: true. The target from which the Component should animate from while opening.
    * @param callback Function A callback function to call after the Component is displayed. Only necessary if animation was specified.
    * @param scope Object The scope (this reference) in which the callback is executed. Defaults to this Component.
    * @returns Ext.Component this
    */
  var show: js.UndefOr[
    js.Function3[
      /* animateTarget */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.native
  
  /** [Method] Displays component at specific xy position
    * @param x Number/Number[] The new x position or array of [x,y].
    * @param y Number The new y position
    * @param animate Boolean/Object True to animate the Component into its new position. You may also pass an animation configuration.
    * @returns Ext.Component this
    */
  var showAt: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[js.Any], 
      /* y */ js.UndefOr[Double], 
      /* animate */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.native
  
  /** [Method] Shows this component by the specified Component or Element
    * @param component Ext.Component/Ext.dom.Element The Ext.Component or Ext.Element to show the component by.
    * @param position String Alignment position as used by Ext.util.Positionable.getAlignToXY. Defaults to defaultAlign.
    * @param offsets Number[] Alignment offsets as used by Ext.util.Positionable.getAlignToXY.
    * @returns Ext.Component this
    */
  var showBy: js.UndefOr[
    js.Function3[
      /* component */ js.UndefOr[js.Any], 
      /* position */ js.UndefOr[java.lang.String], 
      /* offsets */ js.UndefOr[Array], 
      this.type
    ]
  ] = js.native
  
  /** [Method] Sends this Component to the back of lower z index than any other visible windows
    * @returns Ext.Component this
    */
  var toBack: js.UndefOr[js.Function0[this.type | IComponent]] = js.native
  
  /** [Method] Brings this floating Component to the front of any other visible floating Components managed by the same ZIndexManag
    * @param preventFocus Boolean Specify true to prevent the Component from being focused.
    * @returns Ext.Component this
    */
  var toFront: js.UndefOr[js.Function1[js.UndefOr[Boolean], this.type | IComponent]] = js.native
  
  /** [Config Option] (Boolean) */
  var toFrontOnShow: js.UndefOr[Boolean] = js.native
  
  /** [Method] Sets the current box measurements of the component s underlying element
    * @param box Object An object in the format {x, y, width, height}
    * @returns Ext.Component this
    */
  var updateBox: js.UndefOr[js.Function1[/* box */ js.UndefOr[js.Any], this.type]] = js.native
  
  /** [Property] (Ext.ZIndexManager) */
  var zIndexManager: js.UndefOr[IZIndexManager] = js.native
  
  /** [Property] (Ext.Container) */
  var zIndexParent: js.UndefOr[IContainer] = js.native
}
object IComponent {
  
  @scala.inline
  def apply(): IComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComponent]
  }
  
  @scala.inline
  implicit class IComponentMutableBuilder[Self <: IComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterComponentLayout(value: () => Unit): Self = StObject.set(x, "afterComponentLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAfterComponentLayoutUndefined: Self = StObject.set(x, "afterComponentLayout", js.undefined)
    
    @scala.inline
    def setAfterHide(value: (/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "afterHide", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterHideUndefined: Self = StObject.set(x, "afterHide", js.undefined)
    
    @scala.inline
    def setAfterRender(value: () => Unit): Self = StObject.set(x, "afterRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAfterRenderUndefined: Self = StObject.set(x, "afterRender", js.undefined)
    
    @scala.inline
    def setAfterSetPosition(value: (/* ax */ js.UndefOr[js.Any], /* ay */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "afterSetPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterSetPositionUndefined: Self = StObject.set(x, "afterSetPosition", js.undefined)
    
    @scala.inline
    def setAfterShow(
      value: (/* animateTarget */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "afterShow", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAfterShowUndefined: Self = StObject.set(x, "afterShow", js.undefined)
    
    @scala.inline
    def setAutoScroll(value: Boolean): Self = StObject.set(x, "autoScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScrollUndefined: Self = StObject.set(x, "autoScroll", js.undefined)
    
    @scala.inline
    def setBeforeShow(value: () => Unit): Self = StObject.set(x, "beforeShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeforeShowUndefined: Self = StObject.set(x, "beforeShow", js.undefined)
    
    @scala.inline
    def setBubble(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => IComponent
    ): Self = StObject.set(x, "bubble", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBubbleUndefined: Self = StObject.set(x, "bubble", js.undefined)
    
    @scala.inline
    def setCancelFocus(value: () => Unit): Self = StObject.set(x, "cancelFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCancelFocusUndefined: Self = StObject.set(x, "cancelFocus", js.undefined)
    
    @scala.inline
    def setCenter(value: () => IComponent): Self = StObject.set(x, "center", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setCloneConfig(value: /* overrides */ js.UndefOr[js.Any] => IComponent): Self = StObject.set(x, "cloneConfig", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloneConfigUndefined: Self = StObject.set(x, "cloneConfig", js.undefined)
    
    @scala.inline
    def setColumnWidth(value: js.Any): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    @scala.inline
    def setConstrain(value: Boolean): Self = StObject.set(x, "constrain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstrainTo(value: js.Any): Self = StObject.set(x, "constrainTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstrainToUndefined: Self = StObject.set(x, "constrainTo", js.undefined)
    
    @scala.inline
    def setConstrainUndefined: Self = StObject.set(x, "constrain", js.undefined)
    
    @scala.inline
    def setConstraintInsets(value: js.Any): Self = StObject.set(x, "constraintInsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintInsetsUndefined: Self = StObject.set(x, "constraintInsets", js.undefined)
    
    @scala.inline
    def setDefaultAlign(value: java.lang.String): Self = StObject.set(x, "defaultAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAlignUndefined: Self = StObject.set(x, "defaultAlign", js.undefined)
    
    @scala.inline
    def setDoConstrain(value: js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "doConstrain", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoConstrainUndefined: Self = StObject.set(x, "doConstrain", js.undefined)
    
    @scala.inline
    def setFindParentBy(value: /* fn */ js.UndefOr[js.Any] => typingsSlinky.extjs.Ext.container.IContainer): Self = StObject.set(x, "findParentBy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindParentByType(value: /* xtype */ js.UndefOr[js.Any] => typingsSlinky.extjs.Ext.container.IContainer): Self = StObject.set(x, "findParentByType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindParentByTypeUndefined: Self = StObject.set(x, "findParentByType", js.undefined)
    
    @scala.inline
    def setFindParentByUndefined: Self = StObject.set(x, "findParentBy", js.undefined)
    
    @scala.inline
    def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    @scala.inline
    def setFloatParent(value: IContainer): Self = StObject.set(x, "floatParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatParentUndefined: Self = StObject.set(x, "floatParent", js.undefined)
    
    @scala.inline
    def setFocus(
      value: (/* selectText */ js.UndefOr[Boolean], /* delay */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IComponent
    ): Self = StObject.set(x, "focus", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFocusOnToFront(value: Boolean): Self = StObject.set(x, "focusOnToFront", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusOnToFrontUndefined: Self = StObject.set(x, "focusOnToFront", js.undefined)
    
    @scala.inline
    def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    @scala.inline
    def setFormBind(value: Boolean): Self = StObject.set(x, "formBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormBindUndefined: Self = StObject.set(x, "formBind", js.undefined)
    
    @scala.inline
    def setGetPosition(value: /* local */ js.UndefOr[Boolean] => Array): Self = StObject.set(x, "getPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPositionUndefined: Self = StObject.set(x, "getPosition", js.undefined)
    
    @scala.inline
    def setGetXType(value: () => java.lang.String): Self = StObject.set(x, "getXType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetXTypeUndefined: Self = StObject.set(x, "getXType", js.undefined)
    
    @scala.inline
    def setHide(
      value: (/* animateTarget */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IComponent
    ): Self = StObject.set(x, "hide", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    @scala.inline
    def setInitComponent(value: () => Unit): Self = StObject.set(x, "initComponent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitComponentUndefined: Self = StObject.set(x, "initComponent", js.undefined)
    
    @scala.inline
    def setOnAdded(value: () => Unit): Self = StObject.set(x, "onAdded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnAddedUndefined: Self = StObject.set(x, "onAdded", js.undefined)
    
    @scala.inline
    def setOnDestroy(value: () => Unit): Self = StObject.set(x, "onDestroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDestroyUndefined: Self = StObject.set(x, "onDestroy", js.undefined)
    
    @scala.inline
    def setOnHide(
      value: (/* animateTarget */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "onHide", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    @scala.inline
    def setOnShow(
      value: (/* animateTarget */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "onShow", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnShowComplete(value: (/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "onShowComplete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnShowCompleteUndefined: Self = StObject.set(x, "onShowComplete", js.undefined)
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setOverflowX(value: java.lang.String): Self = StObject.set(x, "overflowX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowXUndefined: Self = StObject.set(x, "overflowX", js.undefined)
    
    @scala.inline
    def setOverflowY(value: java.lang.String): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
    
    @scala.inline
    def setRegion(value: js.Any): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setResizable(value: js.Any): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    @scala.inline
    def setResizeHandles(value: java.lang.String): Self = StObject.set(x, "resizeHandles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeHandlesUndefined: Self = StObject.set(x, "resizeHandles", js.undefined)
    
    @scala.inline
    def setScrollBy(
      value: (/* deltaX */ js.UndefOr[js.Any], /* deltaY */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "scrollBy", js.Any.fromFunction3(value))
    
    @scala.inline
    def setScrollByUndefined: Self = StObject.set(x, "scrollBy", js.undefined)
    
    @scala.inline
    def setScrollFlags(value: js.Any): Self = StObject.set(x, "scrollFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollFlagsUndefined: Self = StObject.set(x, "scrollFlags", js.undefined)
    
    @scala.inline
    def setSetActive(value: (js.UndefOr[Boolean], js.UndefOr[IComponent]) => Unit): Self = StObject.set(x, "setActive", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetActiveUndefined: Self = StObject.set(x, "setActive", js.undefined)
    
    @scala.inline
    def setSetAutoScroll(value: /* scroll */ js.UndefOr[Boolean] => IComponent): Self = StObject.set(x, "setAutoScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAutoScrollUndefined: Self = StObject.set(x, "setAutoScroll", js.undefined)
    
    @scala.inline
    def setSetBorderRegion(value: /* region */ js.UndefOr[java.lang.String] => java.lang.String): Self = StObject.set(x, "setBorderRegion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBorderRegionUndefined: Self = StObject.set(x, "setBorderRegion", js.undefined)
    
    @scala.inline
    def setSetLoading(value: (/* load */ js.UndefOr[js.Any], /* targetEl */ js.UndefOr[Boolean]) => ILoadMask): Self = StObject.set(x, "setLoading", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetLoadingUndefined: Self = StObject.set(x, "setLoading", js.undefined)
    
    @scala.inline
    def setSetOverflowXY(
      value: (/* overflowX */ js.UndefOr[java.lang.String], /* overflowY */ js.UndefOr[java.lang.String]) => IComponent
    ): Self = StObject.set(x, "setOverflowXY", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetOverflowXYUndefined: Self = StObject.set(x, "setOverflowXY", js.undefined)
    
    @scala.inline
    def setSetPagePosition(
      value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => IComponent
    ): Self = StObject.set(x, "setPagePosition", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetPagePositionUndefined: Self = StObject.set(x, "setPagePosition", js.undefined)
    
    @scala.inline
    def setSetPosition(
      value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => IComponent
    ): Self = StObject.set(x, "setPosition", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetPositionUndefined: Self = StObject.set(x, "setPosition", js.undefined)
    
    @scala.inline
    def setSetRegionWeight(value: /* weight */ js.UndefOr[Double] => Double): Self = StObject.set(x, "setRegionWeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRegionWeightUndefined: Self = StObject.set(x, "setRegionWeight", js.undefined)
    
    @scala.inline
    def setShadow(value: js.Any): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffset(value: Double): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffsetUndefined: Self = StObject.set(x, "shadowOffset", js.undefined)
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    @scala.inline
    def setShow(
      value: (/* animateTarget */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IComponent
    ): Self = StObject.set(x, "show", js.Any.fromFunction3(value))
    
    @scala.inline
    def setShowAt(
      value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => IComponent
    ): Self = StObject.set(x, "showAt", js.Any.fromFunction3(value))
    
    @scala.inline
    def setShowAtUndefined: Self = StObject.set(x, "showAt", js.undefined)
    
    @scala.inline
    def setShowBy(
      value: (/* component */ js.UndefOr[js.Any], /* position */ js.UndefOr[java.lang.String], /* offsets */ js.UndefOr[Array]) => IComponent
    ): Self = StObject.set(x, "showBy", js.Any.fromFunction3(value))
    
    @scala.inline
    def setShowByUndefined: Self = StObject.set(x, "showBy", js.undefined)
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setToBack(value: () => IComponent): Self = StObject.set(x, "toBack", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToBackUndefined: Self = StObject.set(x, "toBack", js.undefined)
    
    @scala.inline
    def setToFront(value: js.UndefOr[Boolean] => IComponent): Self = StObject.set(x, "toFront", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToFrontOnShow(value: Boolean): Self = StObject.set(x, "toFrontOnShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToFrontOnShowUndefined: Self = StObject.set(x, "toFrontOnShow", js.undefined)
    
    @scala.inline
    def setToFrontUndefined: Self = StObject.set(x, "toFront", js.undefined)
    
    @scala.inline
    def setUpdateBox(value: /* box */ js.UndefOr[js.Any] => IComponent): Self = StObject.set(x, "updateBox", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateBoxUndefined: Self = StObject.set(x, "updateBox", js.undefined)
    
    @scala.inline
    def setZIndexManager(value: IZIndexManager): Self = StObject.set(x, "zIndexManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexManagerUndefined: Self = StObject.set(x, "zIndexManager", js.undefined)
    
    @scala.inline
    def setZIndexParent(value: IContainer): Self = StObject.set(x, "zIndexParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexParentUndefined: Self = StObject.set(x, "zIndexParent", js.undefined)
  }
}
