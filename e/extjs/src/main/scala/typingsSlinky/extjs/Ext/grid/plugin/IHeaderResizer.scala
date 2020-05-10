package typingsSlinky.extjs.Ext.grid.plugin

import typingsSlinky.extjs.Ext.IAbstractPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHeaderResizer extends IAbstractPlugin {
  /** [Config Option] (Boolean) */
  var dynamic: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the value of dynamic
  		* @returns Boolean
  		*/
  var getDynamic: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] not using w and e resize bc we are only ever resizing one column wResizeCursor Ext isWebKit w resize  col resi
  		* @param headerCt Object
  		*/
  @JSName("init")
  var init_IHeaderResizer: js.UndefOr[js.Function1[/* headerCt */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of dynamic
  		* @param dynamic Boolean
  		*/
  var setDynamic: js.UndefOr[js.Function1[/* dynamic */ js.UndefOr[Boolean], Unit]] = js.native
}

object IHeaderResizer {
  @scala.inline
  def apply(): IHeaderResizer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHeaderResizer]
  }
  @scala.inline
  implicit class IHeaderResizerOps[Self <: IHeaderResizer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynamic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamic")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDynamic(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDynamic")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDynamic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDynamic")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: /* headerCt */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDynamic(value: /* dynamic */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDynamic")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDynamic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDynamic")(js.undefined)
        ret
    }
  }
  
}

