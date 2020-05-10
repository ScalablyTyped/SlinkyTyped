package typingsSlinky.extjs.Ext.container

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IBase
import typingsSlinky.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDockingContainer extends IBase {
  /** [Method] Adds docked item s to the container
  		* @param component Object/Object[] The Component or array of components to add. The components must include a 'dock' parameter on each component to indicate where it should be docked ('top', 'right', 'bottom', 'left').
  		* @param pos Number The index at which the Component will be added
  		* @returns Ext.Component[] The added components.
  		*/
  var addDocked: js.UndefOr[
    js.Function2[/* component */ js.UndefOr[js.Any], /* pos */ js.UndefOr[Double], Array]
  ] = js.native
  /** [Config Option] (Object) */
  var defaultDockWeights: js.UndefOr[js.Any] = js.native
  /** [Method] Finds a docked component by id itemId or position
  		* @param comp String/Number The id, itemId or position of the docked component (see getComponent for details)
  		* @returns Ext.Component The docked component (if found)
  		*/
  var getDockedComponent: js.UndefOr[js.Function1[/* comp */ js.UndefOr[js.Any], IComponent]] = js.native
  /** [Method] Retrieves an array of all currently docked Components
  		* @param selector String A ComponentQuery selector string to filter the returned items.
  		* @param beforeBody Boolean An optional flag to limit the set of items to only those before the body (true) or after the body (false). All components are returned by default.
  		* @returns Ext.Component[] The array of docked components meeting the specified criteria.
  		*/
  var getDockedItems: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* beforeBody */ js.UndefOr[Boolean], Array]
  ] = js.native
  /** [Method] Inserts docked item s to the panel at the indicated position
  		* @param pos Number The index at which the Component will be inserted
  		* @param component Object/Object[] The Component or array of components to add. The components must include a 'dock' paramater on each component to indicate where it should be docked ('top', 'right', 'bottom', 'left').
  		*/
  var insertDocked: js.UndefOr[
    js.Function2[/* pos */ js.UndefOr[Double], /* component */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Invoked after a docked item is added to the Panel
  		* @param component Ext.Component
  		*/
  var onDockedAdd: js.UndefOr[js.Function1[/* component */ js.UndefOr[IComponent], Unit]] = js.native
  /** [Method] Invoked after a docked item is removed from the Panel
  		* @param component Ext.Component
  		*/
  var onDockedRemove: js.UndefOr[js.Function1[/* component */ js.UndefOr[IComponent], Unit]] = js.native
  /** [Method] Removes the docked item from the panel
  		* @param item Ext.Component The Component to remove.
  		* @param autoDestroy Boolean Destroy the component after removal.
  		*/
  var removeDocked: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[IComponent], /* autoDestroy */ js.UndefOr[Boolean], Unit]
  ] = js.native
}

object IDockingContainer {
  @scala.inline
  def apply(): IDockingContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDockingContainer]
  }
  @scala.inline
  implicit class IDockingContainerOps[Self <: IDockingContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddDocked(value: (/* component */ js.UndefOr[js.Any], /* pos */ js.UndefOr[Double]) => Array): Self = {
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
    def withGetDockedComponent(value: /* comp */ js.UndefOr[js.Any] => IComponent): Self = {
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
    def withGetDockedItems(value: (/* selector */ js.UndefOr[String], /* beforeBody */ js.UndefOr[Boolean]) => Array): Self = {
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
    def withInsertDocked(value: (/* pos */ js.UndefOr[Double], /* component */ js.UndefOr[js.Any]) => Unit): Self = {
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
    def withOnDockedAdd(value: /* component */ js.UndefOr[IComponent] => Unit): Self = {
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
    def withOnDockedRemove(value: /* component */ js.UndefOr[IComponent] => Unit): Self = {
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
    def withRemoveDocked(value: (/* item */ js.UndefOr[IComponent], /* autoDestroy */ js.UndefOr[Boolean]) => Unit): Self = {
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
  }
  
}

