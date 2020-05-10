package typingsSlinky.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IComponentOps[Self <: IComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterComponentLayout(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterComponentLayout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterComponentLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterComponentLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterHide(value: (/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterHide")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterHide")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterSetPosition(value: (/* ax */ js.UndefOr[js.Any], /* ay */ js.UndefOr[js.Any]) => Unit): Self = {
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
    def withAfterShow(
      value: (/* animateTarget */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterShow")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterShow")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShow")(js.undefined)
        ret
    }
    @scala.inline
    def withBubble(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => IComponent
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubble")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBubble: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubble")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCancelFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withCloneConfig(value: /* overrides */ js.UndefOr[js.Any] => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneConfig")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCloneConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnWidth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withConstrain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrain")(js.undefined)
        ret
    }
    @scala.inline
    def withConstrainTo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrainTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainTo")(js.undefined)
        ret
    }
    @scala.inline
    def withConstraintInsets(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraintInsets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraintInsets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraintInsets")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultAlign(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withDoConstrain(value: js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doConstrain")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDoConstrain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doConstrain")(js.undefined)
        ret
    }
    @scala.inline
    def withFindParentBy(value: /* fn */ js.UndefOr[js.Any] => typingsSlinky.extjs.Ext.container.IContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findParentBy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFindParentBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findParentBy")(js.undefined)
        ret
    }
    @scala.inline
    def withFindParentByType(value: /* xtype */ js.UndefOr[js.Any] => typingsSlinky.extjs.Ext.container.IContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findParentByType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFindParentByType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findParentByType")(js.undefined)
        ret
    }
    @scala.inline
    def withFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatParent(value: IContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatParent")(js.undefined)
        ret
    }
    @scala.inline
    def withFocus(
      value: (/* selectText */ js.UndefOr[Boolean], /* delay */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IComponent
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusOnToFront(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOnToFront")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusOnToFront: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOnToFront")(js.undefined)
        ret
    }
    @scala.inline
    def withFormBind(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formBind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormBind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formBind")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPosition(value: /* local */ js.UndefOr[Boolean] => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withGetXType(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetXType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXType")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(
      value: (/* animateTarget */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IComponent
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withInitComponent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initComponent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInitComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAdded(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdded")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDestroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHide(
      value: (/* animateTarget */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(
      value: (/* animateTarget */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShowComplete(value: (/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowComplete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnShowComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowX(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowX")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowY(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowY")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withResizable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeHandles(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeHandles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeHandles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeHandles")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollBy(
      value: (/* deltaX */ js.UndefOr[js.Any], /* deltaY */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBy")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutScrollBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBy")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollFlags(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollFlags")(js.undefined)
        ret
    }
    @scala.inline
    def withSetActive(value: (js.UndefOr[Boolean], js.UndefOr[IComponent]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActive")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActive")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAutoScroll(value: /* scroll */ js.UndefOr[Boolean] => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAutoScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBorderRegion(value: /* region */ js.UndefOr[java.lang.String] => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBorderRegion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBorderRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBorderRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLoading(value: (/* load */ js.UndefOr[js.Any], /* targetEl */ js.UndefOr[Boolean]) => ILoadMask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLoading")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withSetOverflowXY(
      value: (/* overflowX */ js.UndefOr[java.lang.String], /* overflowY */ js.UndefOr[java.lang.String]) => IComponent
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOverflowXY")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetOverflowXY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOverflowXY")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPagePosition(
      value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => IComponent
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPagePosition")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSetPagePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPagePosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPosition(
      value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => IComponent
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosition")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSetPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRegionWeight(value: /* weight */ js.UndefOr[Double] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRegionWeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRegionWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRegionWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withShadow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(
      value: (/* animateTarget */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IComponent
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAt(
      value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => IComponent
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAt")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutShowAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAt")(js.undefined)
        ret
    }
    @scala.inline
    def withShowBy(
      value: (/* component */ js.UndefOr[js.Any], /* position */ js.UndefOr[java.lang.String], /* offsets */ js.UndefOr[Array]) => IComponent
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBy")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutShowBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBy")(js.undefined)
        ret
    }
    @scala.inline
    def withToBack(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBack")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToBack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBack")(js.undefined)
        ret
    }
    @scala.inline
    def withToFront(value: js.UndefOr[Boolean] => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toFront")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToFront: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toFront")(js.undefined)
        ret
    }
    @scala.inline
    def withToFrontOnShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toFrontOnShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToFrontOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toFrontOnShow")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateBox(value: /* box */ js.UndefOr[js.Any] => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateBox")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdateBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateBox")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndexManager(value: IZIndexManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndexManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndexManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndexManager")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndexParent(value: IContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndexParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndexParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndexParent")(js.undefined)
        ret
    }
  }
  
}

