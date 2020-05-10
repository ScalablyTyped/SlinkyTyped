package typingsSlinky.extjs.Ext.tip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQuickTip extends IToolTip {
  /** [Method] Hides a visible tip or cancels an impending show for a particular element
  		* @param el String/HTMLElement/Ext.Element The element that is the target of the tip or ID of the element.
  		*/
  var cancelShow: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var interceptTitles: js.UndefOr[Boolean] = js.native
  /** [Method] Configures a new quick tip instance and assigns it to a target element
  		* @param config Object The config object with the following properties:
  		*/
  var register: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Removes this quick tip from its element and destroys it
  		* @param el String/HTMLElement/Ext.Element The element from which the quick tip is to be removed or ID of the element.
  		*/
  var unregister: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Unit]] = js.native
}

object IQuickTip {
  @scala.inline
  def apply(): IQuickTip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQuickTip]
  }
  @scala.inline
  implicit class IQuickTipOps[Self <: IQuickTip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelShow(value: /* el */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCancelShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelShow")(js.undefined)
        ret
    }
    @scala.inline
    def withInterceptTitles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interceptTitles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterceptTitles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interceptTitles")(js.undefined)
        ret
    }
    @scala.inline
    def withRegister(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRegister: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.undefined)
        ret
    }
    @scala.inline
    def withUnregister(value: /* el */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregister")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnregister: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregister")(js.undefined)
        ret
    }
  }
  
}

