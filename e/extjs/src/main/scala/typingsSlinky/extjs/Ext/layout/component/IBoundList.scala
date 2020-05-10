package typingsSlinky.extjs.Ext.layout.component

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBoundList extends IAuto {
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
  		* @param ownerContext Object
  		*/
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IBoundList: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Called before any calculation cycles to prepare for layout
  		* @param ownerContext Object
  		*/
  @JSName("beginLayout")
  var beginLayout_IBoundList: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Validates item is in the proper place in the dom  */
  @JSName("isValidParent")
  var isValidParent_IBoundList: js.UndefOr[js.Function0[Unit]] = js.native
}

object IBoundList {
  @scala.inline
  def apply(): IBoundList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBoundList]
  }
  @scala.inline
  implicit class IBoundListOps[Self <: IBoundList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeginLayout(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginLayout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeginLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withBeginLayoutCycle(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginLayoutCycle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeginLayoutCycle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginLayoutCycle")(js.undefined)
        ret
    }
    @scala.inline
    def withIsValidParent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValidParent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsValidParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValidParent")(js.undefined)
        ret
    }
  }
  
}

