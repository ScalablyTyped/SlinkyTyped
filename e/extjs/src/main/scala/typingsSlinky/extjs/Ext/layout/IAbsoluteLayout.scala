package typingsSlinky.extjs.Ext.layout

import typingsSlinky.extjs.Ext.layout.container.IAnchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbsoluteLayout extends IAnchor {
  /** [Config Option] (Boolean) */
  var ignoreOnContentChange: js.UndefOr[Boolean] = js.native
  /** [Method] This method is called when a child item changes in some way
  		* @returns Boolean True if this layout has handled the content change.
  		*/
  @JSName("onContentChange")
  var onContentChange_IAbsoluteLayout: js.UndefOr[js.Function0[Boolean]] = js.native
}

object IAbsoluteLayout {
  @scala.inline
  def apply(): IAbsoluteLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbsoluteLayout]
  }
  @scala.inline
  implicit class IAbsoluteLayoutOps[Self <: IAbsoluteLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreOnContentChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreOnContentChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreOnContentChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreOnContentChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContentChange(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnContentChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentChange")(js.undefined)
        ret
    }
  }
  
}

