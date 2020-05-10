package typingsSlinky.extjs.Ext.container

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.extjs.Ext.IClass because Already inherited
- typingsSlinky.extjs.Ext.IBase because Already inherited
- typingsSlinky.extjs.Ext.IQueryable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined child, down, query, queryBy, queryById */ @js.native
trait IAbstractContainer extends IComponent {
  /** [Config Option] (String/Number) */
  var activeItem: js.UndefOr[js.Any] = js.native
  /** [Method] Adds Component s to this Container
  		* @param component Ext.Component[]|Object[]/Ext.Component.../Object... Either one or more Components to add or an Array of Components to add. See items for additional information.
  		* @returns Ext.Component[]/Ext.Component The Components that were added.
  		*/
  var add: js.UndefOr[js.Function1[/* component */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Invoked after the Container has laid out and rendered if necessary its child Components
  		* @param layout Ext.layout.container.Container
  		*/
  var afterLayout: js.UndefOr[
    js.Function1[/* layout */ js.UndefOr[typingsSlinky.extjs.Ext.layout.container.IContainer], Unit]
  ] = js.native
  /** [Config Option] (Boolean) */
  var autoDestroy: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String[]) */
  var bubbleEvents: js.UndefOr[Array] = js.native
  /** [Method] Cascades down the component container heirarchy from this component passed in the first call  calling the specified
  		* @param fn Function The function to call
  		* @param scope Object The scope of the function (defaults to current component)
  		* @param args Array The args to call the function with. The current component always passed as the last argument.
  		* @returns Ext.Container this
  		*/
  var cascade: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* args */ js.UndefOr[Array], 
      typingsSlinky.extjs.Ext.IContainer
    ]
  ] = js.native
  /** [Method] Retrieves the first direct child of this container which matches the passed selector or component
  		* @param selector String/Ext.Component An Ext.ComponentQuery selector. If no selector is specified, the first child will be returned.
  		* @returns Object Ext.Component The matching child Ext.Component (or null if no match was found).
  		*/
  var child: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
  /** [Method] Determines whether the passed Component is either an immediate child of this Container or whether it is a descendant
  		* @param comp Ext.Component The Component to test.
  		* @param deep Boolean Pass true to test for the Component being a descendant at any level.
  		* @returns Boolean true if the passed Component is contained at the specified level.
  		*/
  var contains: js.UndefOr[
    js.Function2[/* comp */ js.UndefOr[IComponent], /* deep */ js.UndefOr[Boolean], Boolean]
  ] = js.native
  /** [Config Option] (String) */
  var defaultType: js.UndefOr[String] = js.native
  /** [Config Option] (Object/Function) */
  var defaults: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var detachOnRemove: js.UndefOr[Boolean] = js.native
  /** [Method] Inherit docs Disable all immediate children that was previously disabled Override disable because onDisable only gets
  		* @returns Ext.container.AbstractContainer this
  		*/
  @JSName("disable")
  var disable_IAbstractContainer: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Manually force this container s layout to be recalculated
  		* @returns Ext.container.Container this
  		*/
  var doLayout: js.UndefOr[js.Function0[IContainer]] = js.native
  /** [Method] Retrieves the first descendant of this container which matches the passed selector
  		* @param selector String/Ext.Component An Ext.ComponentQuery selector or Ext.Component. If no selector is specified, the first child will be returned.
  		* @returns Object Ext.Component The matching descendant Ext.Component (or null if no match was found).
  		*/
  var down: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
  /** [Method] Examines this container s items property and gets a direct child component of this container
  		* @param comp String/Number This parameter may be any of the following:  a String : representing the itemId or id of the child component. a Number : representing the position of the child component within the items property For additional information see Ext.util.MixedCollection.get.
  		* @returns Ext.Component The component (if found).
  		*/
  var getComponent: js.UndefOr[js.Function1[/* comp */ js.UndefOr[js.Any], IComponent]] = js.native
  /** [Method] Returns the layout instance currently associated with this Container
  		* @returns Ext.layout.container.Container The layout
  		*/
  var getLayout: js.UndefOr[js.Function0[typingsSlinky.extjs.Ext.layout.container.IContainer]] = js.native
  /** [Method] Used by ComponentQuery child and down to retrieve all of the items which can potentially be considered a child of th
  		* @param deep Object
  		*/
  var getRefItems: js.UndefOr[js.Function1[/* deep */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Inserts a Component into this Container at a specified index
  		* @param index Number The index at which the Component will be inserted into the Container's items collection
  		* @param component Ext.Component/Object The child Component to insert. Ext uses lazy rendering, and will only render the inserted Component should it become necessary. A Component config object may be passed in order to avoid the overhead of constructing a real Component object if lazy rendering might mean that the inserted Component will not be rendered immediately. To take advantage of this 'lazy instantiation', set the Ext.Component.xtype config property to the registered type of the Component wanted. For a list of all available xtypes, see Ext.enums.Widget.
  		* @returns Ext.Component component The Component (or config object) that was inserted with the Container's default config values applied.
  		*/
  var insert: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* component */ js.UndefOr[js.Any], IComponent]
  ] = js.native
  /** [Method] Determines whether this Container is an ancestor of the passed Component
  		* @param possibleDescendant Ext.Component The Component to test for presence within this Container's subtree.
  		*/
  var isAncestor: js.UndefOr[js.Function1[/* possibleDescendant */ js.UndefOr[IComponent], Unit]] = js.native
  /** [Config Option] (Object/Object[]) */
  var items: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Ext.enums.Layout/Object) */
  var layout: js.UndefOr[js.Any] = js.native
  /** [Method] Moves a Component within the Container
  		* @param fromIdx Number/Ext.Component The index/component to move.
  		* @param toIdx Number The new index for the Component.
  		* @returns Ext.Component component The Component that was moved.
  		*/
  @JSName("move")
  var move_IAbstractContainer: js.UndefOr[
    js.Function2[/* fromIdx */ js.UndefOr[js.Any], /* toIdx */ js.UndefOr[Double], IComponent]
  ] = js.native
  /** [Method] This method is invoked after a new Component has been added
  		* @param component Ext.Component
  		* @param position Number
  		*/
  var onAdd: js.UndefOr[
    js.Function2[/* component */ js.UndefOr[IComponent], /* position */ js.UndefOr[Double], Unit]
  ] = js.native
  /** [Method] This method is invoked before adding a new child Component
  		* @param item Ext.Component
  		*/
  var onBeforeAdd: js.UndefOr[js.Function1[/* item */ js.UndefOr[IComponent], Unit]] = js.native
  /** [Method] Called after the component is moved this method is empty by default but can be implemented by any subclass that need  */
  @JSName("onPosition")
  var onPosition_IAbstractContainer: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] This method is invoked after a new Component has been removed
  		* @param component Ext.Component
  		* @param autoDestroy Boolean
  		*/
  var onRemove: js.UndefOr[
    js.Function2[/* component */ js.UndefOr[IComponent], /* autoDestroy */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Allows addition of behavior to the resize operation  */
  @JSName("onResize")
  var onResize_IAbstractContainer: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Retrieves all descendant components which match the passed selector
  		* @param selector String Selector complying to an Ext.ComponentQuery selector. If no selector is specified all items will be returned.
  		* @returns Ext.Component[] Components which matched the selector
  		*/
  var query: js.UndefOr[js.Function1[js.UndefOr[String], Array]] = js.native
  /** [Method] Retrieves all descendant components which match the passed function
  		* @param fn Function The matcher function. It will be called with a single argument, the component being tested.
  		* @param scope Object The scope in which to run the function. If not specified, it will default to the active component.
  		* @returns Ext.Component[] Components matched by the passed function
  		*/
  var queryBy: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], Array]] = js.native
  /** [Method] Finds a component at any level under this container matching the id itemId
  		* @param id String The id to find
  		* @returns Ext.Component The matching id, null if not found
  		*/
  var queryById: js.UndefOr[js.Function1[js.UndefOr[String], IComponent]] = js.native
  /** [Method] Removes a component from this container
  		* @param component Ext.Component/String The component reference or id to remove.
  		* @param autoDestroy Boolean True to automatically invoke the removed Component's Ext.Component.destroy function. Defaults to the value of this Container's autoDestroy config.
  		* @returns Ext.Component component The Component that was removed.
  		*/
  var remove: js.UndefOr[
    js.Function2[
      /* component */ js.UndefOr[js.Any], 
      /* autoDestroy */ js.UndefOr[Boolean], 
      IComponent
    ]
  ] = js.native
  /** [Method] Removes all components from this container
  		* @param autoDestroy Boolean True to automatically invoke the removed Component's Ext.Component.destroy function. Defaults to the value of this Container's autoDestroy config.
  		* @returns Ext.Component[] Array of the removed components
  		*/
  var removeAll: js.UndefOr[js.Function1[/* autoDestroy */ js.UndefOr[Boolean], Array]] = js.native
  /** [Config Option] (Boolean) */
  var suspendLayout: js.UndefOr[Boolean] = js.native
}

object IAbstractContainer {
  @scala.inline
  def apply(): IAbstractContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractContainer]
  }
  @scala.inline
  implicit class IAbstractContainerOps[Self <: IAbstractContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeItem")(js.undefined)
        ret
    }
    @scala.inline
    def withAdd(value: /* component */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterLayout(value: /* layout */ js.UndefOr[typingsSlinky.extjs.Ext.layout.container.IContainer] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLayout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoDestroy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDestroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withBubbleEvents(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubbleEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withCascade(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => typingsSlinky.extjs.Ext.IContainer
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascade")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCascade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascade")(js.undefined)
        ret
    }
    @scala.inline
    def withChild(value: js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(js.undefined)
        ret
    }
    @scala.inline
    def withContains(value: (/* comp */ js.UndefOr[IComponent], /* deep */ js.UndefOr[Boolean]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultType")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaults(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(js.undefined)
        ret
    }
    @scala.inline
    def withDetachOnRemove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detachOnRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetachOnRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detachOnRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable(value: () => IAbstractContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.undefined)
        ret
    }
    @scala.inline
    def withDoLayout(value: () => IContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doLayout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDoLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withDown(value: js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(js.undefined)
        ret
    }
    @scala.inline
    def withGetComponent(value: /* comp */ js.UndefOr[js.Any] => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComponent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLayout(value: () => typingsSlinky.extjs.Ext.layout.container.IContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLayout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRefItems(value: /* deep */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRefItems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetRefItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRefItems")(js.undefined)
        ret
    }
    @scala.inline
    def withInsert(value: (/* index */ js.UndefOr[Double], /* component */ js.UndefOr[js.Any]) => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAncestor(value: /* possibleDescendant */ js.UndefOr[IComponent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAncestor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsAncestor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAncestor")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withMove(value: (/* fromIdx */ js.UndefOr[js.Any], /* toIdx */ js.UndefOr[Double]) => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAdd(value: (/* component */ js.UndefOr[IComponent], /* position */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeAdd(value: /* item */ js.UndefOr[IComponent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeAdd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPosition(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemove(value: (/* component */ js.UndefOr[IComponent], /* autoDestroy */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: js.UndefOr[String] => Array): Self = {
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
    def withQueryBy(value: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryBy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutQueryBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryBy")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryById(value: js.UndefOr[String] => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryById")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutQueryById: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryById")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: (/* component */ js.UndefOr[js.Any], /* autoDestroy */ js.UndefOr[Boolean]) => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAll(value: /* autoDestroy */ js.UndefOr[Boolean] => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAll")(js.undefined)
        ret
    }
    @scala.inline
    def withSuspendLayout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspendLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuspendLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspendLayout")(js.undefined)
        ret
    }
  }
  
}

