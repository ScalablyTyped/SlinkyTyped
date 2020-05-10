package typingsSlinky.extjs.Ext.data

import typingsSlinky.extjs.Ext.util.ILruCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPageMap extends ILruCache {
  /** [Method] Returns the first record in this page map which elicits a true return value from the passed selection function
  		* @param fn Function The selection function to execute for each item.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this PageMap.
  		* @returns Object The first record in this page map which returned true from the selection function, or null if none was found.
  		*/
  var findBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns the index in the whole dataset of the first record in this page map which elicits a true return value from th
  		* @param fn Function The selection function to execute for each item.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this PageMap.
  		* @returns Number The index first record in this page map which returned true from the selection function, or -1 if none was found.
  		*/
  var findIndexBy: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Double]
  ] = js.native
  /** [Method] Remove an item from the hash
  		* @returns Boolean True if the item was successfully removed.
  		*/
  @JSName("remove")
  var remove_IPageMap: js.UndefOr[js.Function0[Boolean]] = js.native
}

object IPageMap {
  @scala.inline
  def apply(): IPageMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPageMap]
  }
  @scala.inline
  implicit class IPageMapOps[Self <: IPageMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFindBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findBy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFindBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findBy")(js.undefined)
        ret
    }
    @scala.inline
    def withFindIndexBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findIndexBy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFindIndexBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findIndexBy")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
  }
  
}

