package typingsSlinky.extjs.Ext.grid.feature

import typingsSlinky.extjs.Ext.data.IModel
import typingsSlinky.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroupStore extends IObservable {
  /** [Method] Get the index within the entire dataset
  		* @param record Ext.data.Model The Ext.data.Model object to find.
  		* @returns Number The index of the passed Record. Returns -1 if not found.
  		*/
  var indexOfTotal: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], Double]] = js.native
}

object IGroupStore {
  @scala.inline
  def apply(): IGroupStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroupStore]
  }
  @scala.inline
  implicit class IGroupStoreOps[Self <: IGroupStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexOfTotal(value: /* record */ js.UndefOr[IModel] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOfTotal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIndexOfTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOfTotal")(js.undefined)
        ret
    }
  }
  
}

