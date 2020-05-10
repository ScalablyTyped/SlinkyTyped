package typingsSlinky.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQueryable extends IBase {
  /** [Method] Retrieves the first direct child of this container which matches the passed selector or component
  		* @param selector String/Ext.Component An Ext.ComponentQuery selector. If no selector is specified, the first child will be returned.
  		* @returns Object Ext.Component The matching child Ext.Component (or null if no match was found).
  		*/
  var child: js.UndefOr[js.Function1[/* selector */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Retrieves the first descendant of this container which matches the passed selector
  		* @param selector String/Ext.Component An Ext.ComponentQuery selector or Ext.Component. If no selector is specified, the first child will be returned.
  		* @returns Object Ext.Component The matching descendant Ext.Component (or null if no match was found).
  		*/
  var down: js.UndefOr[js.Function1[/* selector */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Retrieves all descendant components which match the passed selector
  		* @param selector String Selector complying to an Ext.ComponentQuery selector. If no selector is specified all items will be returned.
  		* @returns Ext.Component[] Components which matched the selector
  		*/
  var query: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], Array]] = js.native
  /** [Method] Retrieves all descendant components which match the passed function
  		* @param fn Function The matcher function. It will be called with a single argument, the component being tested.
  		* @param scope Object The scope in which to run the function. If not specified, it will default to the active component.
  		* @returns Ext.Component[] Components matched by the passed function
  		*/
  var queryBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Array]] = js.native
  /** [Method] Finds a component at any level under this container matching the id itemId
  		* @param id String The id to find
  		* @returns Ext.Component The matching id, null if not found
  		*/
  var queryById: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], IComponent]] = js.native
}

object IQueryable {
  @scala.inline
  def apply(): IQueryable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQueryable]
  }
  @scala.inline
  implicit class IQueryableOps[Self <: IQueryable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChild(value: /* selector */ js.UndefOr[js.Any] => _): Self = {
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
    def withDown(value: /* selector */ js.UndefOr[js.Any] => _): Self = {
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
    def withQuery(value: /* selector */ js.UndefOr[java.lang.String] => Array): Self = {
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
    def withQueryBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Array): Self = {
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
    def withQueryById(value: /* id */ js.UndefOr[java.lang.String] => IComponent): Self = {
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
  }
  
}

