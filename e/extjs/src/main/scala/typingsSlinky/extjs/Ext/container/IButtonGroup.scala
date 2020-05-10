package typingsSlinky.extjs.Ext.container

import typingsSlinky.extjs.Ext.panel.IPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IButtonGroup extends IPanel {
  /** [Config Option] (Number) */
  var columns: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var defaultButtonUI: js.UndefOr[String] = js.native
  /** [Method] private
  		* @param component Object
  		*/
  @JSName("onBeforeAdd")
  var onBeforeAdd_IButtonGroup: js.UndefOr[js.Function1[/* component */ js.UndefOr[js.Any], Unit]] = js.native
}

object IButtonGroup {
  @scala.inline
  def apply(): IButtonGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IButtonGroup]
  }
  @scala.inline
  implicit class IButtonGroupOps[Self <: IButtonGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultButtonUI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultButtonUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultButtonUI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultButtonUI")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeAdd(value: /* component */ js.UndefOr[js.Any] => Unit): Self = {
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
  }
  
}

