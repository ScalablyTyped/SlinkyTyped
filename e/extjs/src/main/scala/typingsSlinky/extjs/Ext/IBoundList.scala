package typingsSlinky.extjs.Ext

import typingsSlinky.extjs.Ext.toolbar.IPaging
import typingsSlinky.extjs.Ext.view.IView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.extjs.Ext.IClass because Already inherited
- typingsSlinky.extjs.Ext.IBase because Already inherited
- typingsSlinky.extjs.Ext.IQueryable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined child, down, query, queryBy, queryById */ @js.native
trait IBoundList extends IView {
  
  /** [Method] Changes the data store bound to this view and refreshes it
    * @param store Object
    * @param initial Object
    */
  @JSName("bindStore")
  var bindStore_IBoundList: js.UndefOr[
    js.Function2[/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Method] Retrieves the first direct child of this container which matches the passed selector or component
    * @param selector String/Ext.Component An Ext.ComponentQuery selector. If no selector is specified, the first child will be returned.
    * @returns Object Ext.Component The matching child Ext.Component (or null if no match was found).
    */
  var child: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
  
  /** [Config Option] (String) */
  var displayField: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Retrieves the first descendant of this container which matches the passed selector
    * @param selector String/Ext.Component An Ext.ComponentQuery selector or Ext.Component. If no selector is specified, the first child will be returned.
    * @returns Object Ext.Component The matching descendant Ext.Component (or null if no match was found).
    */
  var down: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] A method that returns the inner template for displaying items in the list
    * @param displayField String The displayField for the BoundList.
    * @returns String The inner template
    */
  var getInnerTpl: js.UndefOr[js.Function1[/* displayField */ js.UndefOr[java.lang.String], java.lang.String]] = js.native
  
  /** [Config Option] (Number) */
  var pageSize: js.UndefOr[Double] = js.native
  
  /** [Property] (Ext.toolbar.Paging) */
  var pagingToolbar: js.UndefOr[IPaging] = js.native
  
  /** [Method] Retrieves all descendant components which match the passed selector
    * @param selector String Selector complying to an Ext.ComponentQuery selector. If no selector is specified all items will be returned.
    * @returns Ext.Component[] Components which matched the selector
    */
  var query: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], Array]] = js.native
  
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
  var queryById: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], IComponent]] = js.native
}
object IBoundList {
  
  @scala.inline
  def apply(): IBoundList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBoundList]
  }
  
  @scala.inline
  implicit class IBoundListMutableBuilder[Self <: IBoundList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindStore(value: (/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "bindStore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBindStoreUndefined: Self = StObject.set(x, "bindStore", js.undefined)
    
    @scala.inline
    def setChild(value: js.UndefOr[js.Any] => _): Self = StObject.set(x, "child", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
    
    @scala.inline
    def setDisplayField(value: java.lang.String): Self = StObject.set(x, "displayField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayFieldUndefined: Self = StObject.set(x, "displayField", js.undefined)
    
    @scala.inline
    def setDown(value: js.UndefOr[js.Any] => _): Self = StObject.set(x, "down", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
    
    @scala.inline
    def setGetInnerTpl(value: /* displayField */ js.UndefOr[java.lang.String] => java.lang.String): Self = StObject.set(x, "getInnerTpl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetInnerTplUndefined: Self = StObject.set(x, "getInnerTpl", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPagingToolbar(value: IPaging): Self = StObject.set(x, "pagingToolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagingToolbarUndefined: Self = StObject.set(x, "pagingToolbar", js.undefined)
    
    @scala.inline
    def setQuery(value: js.UndefOr[java.lang.String] => Array): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueryBy(value: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => Array): Self = StObject.set(x, "queryBy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setQueryById(value: js.UndefOr[java.lang.String] => IComponent): Self = StObject.set(x, "queryById", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueryByIdUndefined: Self = StObject.set(x, "queryById", js.undefined)
    
    @scala.inline
    def setQueryByUndefined: Self = StObject.set(x, "queryBy", js.undefined)
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
