package typingsSlinky.extjs.Ext.grid.locking

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.grid.header.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHeaderContainer extends IContainer {
  /** [Method] This is the function which all other column access methods are based upon Return the full column set for the whole Lo
  		* @returns Array
  		*/
  @JSName("getGridColumns")
  var getGridColumns_IHeaderContainer: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Used by ComponentQuery child and down to retrieve all of the items which can potentially be considered a child of th  */
  @JSName("getRefItems")
  var getRefItems_IHeaderContainer: js.UndefOr[js.Function0[Unit]] = js.native
}

object IHeaderContainer {
  @scala.inline
  def apply(): IHeaderContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHeaderContainer]
  }
  @scala.inline
  implicit class IHeaderContainerOps[Self <: IHeaderContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetGridColumns(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGridColumns")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetGridColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGridColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRefItems(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRefItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRefItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRefItems")(js.undefined)
        ret
    }
  }
  
}

