package typingsSlinky.extjs.Ext.panel

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IComponent
import typingsSlinky.extjs.Ext.container.IContainer
import typingsSlinky.extjs.Ext.dom.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.extjs.Ext.IClass because Already inherited
- typingsSlinky.extjs.Ext.IBase because Already inherited
- typingsSlinky.extjs.Ext.container.IDockingContainer because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined defaultDockWeights, addDocked, getDockedComponent, getDockedItems, insertDocked, onDockedAdd, onDockedRemove, removeDocked */ @js.native
trait IAbstractPanel extends IContainer {
  /** [Method] Adds a CSS class to the body element
  		* @param cls String The class to add
  		* @returns Ext.panel.Panel this
  		*/
  var addBodyCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], IPanel]] = js.native
  /** [Method] Adds docked item s to the container
  		* @param component Object/Object[] The Component or array of components to add. The components must include a 'dock' parameter on each component to indicate where it should be docked ('top', 'right', 'bottom', 'left').
  		* @param pos Number The index at which the Component will be added
  		* @returns Ext.Component[] The added components.
  		*/
  var addDocked: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[Double], Array]] = js.native
  /** [Method] inherit docs
  		* @param cls Object
  		*/
  @JSName("addUIClsToElement")
  var addUIClsToElement_IAbstractPanel: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Property] (Ext.dom.Element) */
  var body: js.UndefOr[IElement] = js.native
  /** [Config Option] (Boolean) */
  var bodyBorder: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String/String[]) */
  var bodyCls: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number/String) */
  var bodyPadding: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Object/Function) */
  var bodyStyle: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var defaultDockWeights: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object/Object[]) */
  var dockedItems: js.UndefOr[js.Any] = js.native
  /** [Method] Finds a docked component by id itemId or position
  		* @param comp String/Number The id, itemId or position of the docked component (see getComponent for details)
  		* @returns Ext.Component The docked component (if found)
  		*/
  var getDockedComponent: js.UndefOr[js.Function1[js.UndefOr[js.Any], IComponent]] = js.native
  /** [Method] Retrieves an array of all currently docked Components
  		* @param selector String A ComponentQuery selector string to filter the returned items.
  		* @param beforeBody Boolean An optional flag to limit the set of items to only those before the body (true) or after the body (false). All components are returned by default.
  		* @returns Ext.Component[] The array of docked components meeting the specified criteria.
  		*/
  var getDockedItems: js.UndefOr[js.Function2[js.UndefOr[String], js.UndefOr[Boolean], Array]] = js.native
  /** [Method] Inserts docked item s to the panel at the indicated position
  		* @param pos Number The index at which the Component will be inserted
  		* @param component Object/Object[] The Component or array of components to add. The components must include a 'dock' paramater on each component to indicate where it should be docked ('top', 'right', 'bottom', 'left').
  		*/
  var insertDocked: js.UndefOr[js.Function2[js.UndefOr[Double], js.UndefOr[js.Any], Unit]] = js.native
  /** [Property] (Boolean) */
  var isPanel: js.UndefOr[Boolean] = js.native
  /** [Method] Invoked after a docked item is added to the Panel
  		* @param component Ext.Component
  		*/
  var onDockedAdd: js.UndefOr[js.Function1[js.UndefOr[IComponent], Unit]] = js.native
  /** [Method] Invoked after a docked item is removed from the Panel
  		* @param component Ext.Component
  		*/
  var onDockedRemove: js.UndefOr[js.Function1[js.UndefOr[IComponent], Unit]] = js.native
  /** [Method] Removes a CSS class from the body element
  		* @param cls String The class to remove
  		* @returns Ext.panel.Panel this
  		*/
  var removeBodyCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], IPanel]] = js.native
  /** [Method] Removes the docked item from the panel
  		* @param item Ext.Component The Component to remove.
  		* @param autoDestroy Boolean Destroy the component after removal.
  		*/
  var removeDocked: js.UndefOr[js.Function2[js.UndefOr[IComponent], js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] inherit docs
  		* @param cls Object
  		*/
  @JSName("removeUIClsFromElement")
  var removeUIClsFromElement_IAbstractPanel: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the body style according to the passed parameters
  		* @param style Mixed A full style specification string, or object, or the name of a style property to set.
  		* @param value String If the first param was a style property name, the style property value.
  		* @returns Ext.panel.Panel this
  		*/
  var setBodyStyle: js.UndefOr[
    js.Function2[/* style */ js.UndefOr[js.Any], /* value */ js.UndefOr[String], IPanel]
  ] = js.native
  /** [Config Option] (Boolean/Number) */
  var shrinkWrapDock: js.UndefOr[js.Any] = js.native
}

object IAbstractPanel {
  @scala.inline
  def apply(): IAbstractPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractPanel]
  }
  @scala.inline
  implicit class IAbstractPanelOps[Self <: IAbstractPanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddBodyCls(value: /* cls */ js.UndefOr[String] => IPanel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBodyCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddBodyCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBodyCls")(js.undefined)
        ret
    }
    @scala.inline
    def withAddDocked(value: (js.UndefOr[js.Any], js.UndefOr[Double]) => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDocked")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAddDocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDocked")(js.undefined)
        ret
    }
    @scala.inline
    def withAddUIClsToElement(value: /* cls */ js.UndefOr[js.Any] => Unit): Self = {
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
    def withBody(value: IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyBorder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyCls(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyCls")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyPadding(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDockWeights(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDockWeights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDockWeights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDockWeights")(js.undefined)
        ret
    }
    @scala.inline
    def withDockedItems(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDockedItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockedItems")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDockedComponent(value: js.UndefOr[js.Any] => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDockedComponent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetDockedComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDockedComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDockedItems(value: (js.UndefOr[String], js.UndefOr[Boolean]) => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDockedItems")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetDockedItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDockedItems")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertDocked(value: (js.UndefOr[Double], js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertDocked")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInsertDocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertDocked")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPanel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDockedAdd(value: js.UndefOr[IComponent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDockedAdd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDockedAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDockedAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDockedRemove(value: js.UndefOr[IComponent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDockedRemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDockedRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDockedRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveBodyCls(value: /* cls */ js.UndefOr[String] => IPanel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeBodyCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveBodyCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeBodyCls")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveDocked(value: (js.UndefOr[IComponent], js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDocked")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemoveDocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDocked")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveUIClsFromElement(value: /* cls */ js.UndefOr[js.Any] => Unit): Self = {
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
    def withSetBodyStyle(value: (/* style */ js.UndefOr[js.Any], /* value */ js.UndefOr[String]) => IPanel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBodyStyle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetBodyStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBodyStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withShrinkWrapDock(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrinkWrapDock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShrinkWrapDock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrinkWrapDock")(js.undefined)
        ret
    }
  }
  
}

