package typingsSlinky.extjs.Ext.tab

import typingsSlinky.extjs.Ext.IComponent
import typingsSlinky.extjs.Ext.button.IButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITab extends IButton {
  /** [Property] (Boolean) */
  var active: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var activeCls: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var closable: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var closableCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var closeText: js.UndefOr[String] = js.native
  /** [Property] (Boolean) */
  var isTab: js.UndefOr[Boolean] = js.native
  /** [Method] Sets this tab s attached card
  		* @param card Ext.Component The card to set
  		*/
  var setCard: js.UndefOr[js.Function1[/* card */ js.UndefOr[IComponent], Unit]] = js.native
  /** [Method] Sets the tab as either closable or not
  		* @param closable Boolean Pass false to make the tab not closable. Otherwise the tab will be made closable (eg a close button will appear on the tab)
  		*/
  var setClosable: js.UndefOr[js.Function1[/* closable */ js.UndefOr[Boolean], Unit]] = js.native
}

object ITab {
  @scala.inline
  def apply(): ITab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITab]
  }
  @scala.inline
  implicit class ITabOps[Self <: ITab] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeCls")(js.undefined)
        ret
    }
    @scala.inline
    def withClosable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closable")(js.undefined)
        ret
    }
    @scala.inline
    def withClosableCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closableCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosableCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closableCls")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeText")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTab")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCard(value: /* card */ js.UndefOr[IComponent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCard")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCard")(js.undefined)
        ret
    }
    @scala.inline
    def withSetClosable(value: /* closable */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setClosable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetClosable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setClosable")(js.undefined)
        ret
    }
  }
  
}

