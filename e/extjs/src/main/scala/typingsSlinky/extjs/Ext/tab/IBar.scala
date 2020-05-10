package typingsSlinky.extjs.Ext.tab

import typingsSlinky.extjs.Ext.panel.IHeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBar extends IHeader {
  /** [Method] Called by the layout system after the Component has been laid out
  		* @param width Object
  		*/
  @JSName("afterComponentLayout")
  var afterComponentLayout_IBar: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Property] (Boolean) */
  var isTabBar: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var maxTabWidth: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minTabWidth: js.UndefOr[Double] = js.native
  /** [Method] This method is invoked after a new Component has been removed
  		* @param tab Object
  		*/
  @JSName("onRemove")
  var onRemove_IBar: js.UndefOr[js.Function1[/* tab */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IBar: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var plain: js.UndefOr[Boolean] = js.native
}

object IBar {
  @scala.inline
  def apply(): IBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBar]
  }
  @scala.inline
  implicit class IBarOps[Self <: IBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterComponentLayout(value: /* width */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterComponentLayout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterComponentLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterComponentLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTabBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTabBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTabBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTabBar")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTabWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTabWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTabWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTabWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinTabWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTabWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinTabWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTabWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemove(value: /* tab */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRender(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRender")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRender")(js.undefined)
        ret
    }
    @scala.inline
    def withPlain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plain")(js.undefined)
        ret
    }
  }
  
}

