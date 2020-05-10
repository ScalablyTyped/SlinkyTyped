package typingsSlinky.extjs.Ext.layout

import typingsSlinky.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClassList extends IBase {
  /** [Method] Adds a single class to the class list
  		* @param cls Object
  		*/
  var add: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Adds one or more classes in an array or space delimited string to the class list
  		* @param classes Object
  		*/
  var addMany: js.UndefOr[js.Function1[/* classes */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Removes a single class from the class list
  		* @param cls Object
  		*/
  var remove: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Removes one or more classes in an array or space delimited string from the class list
  		* @param classes Object
  		*/
  var removeMany: js.UndefOr[js.Function1[/* classes */ js.UndefOr[js.Any], Unit]] = js.native
}

object IClassList {
  @scala.inline
  def apply(): IClassList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClassList]
  }
  @scala.inline
  implicit class IClassListOps[Self <: IClassList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: /* cls */ js.UndefOr[js.Any] => Unit): Self = {
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
    def withAddMany(value: /* classes */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMany")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddMany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMany")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: /* cls */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveMany(value: /* classes */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMany")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveMany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMany")(js.undefined)
        ret
    }
  }
  
}

