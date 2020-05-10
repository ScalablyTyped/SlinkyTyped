package typingsSlinky.extjs.Ext.panel

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.container.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHeader extends IContainer {
  /** [Method] Add a tool to the header
  		* @param tool Object
  		*/
  var addTool: js.UndefOr[js.Function1[/* tool */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] inherit docs
  		* @param cls Object
  		*/
  @JSName("addUIClsToElement")
  var addUIClsToElement_IHeader: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Invoked after the Container has laid out and rendered if necessary its child Components  */
  @JSName("afterLayout")
  var afterLayout_IHeader: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Gets the tools for this header
  		* @returns Ext.panel.Tool[] The tools
  		*/
  var getTools: js.UndefOr[js.Function0[Array]] = js.native
  /** [Config Option] (Number/String) */
  var glyph: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var icon: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[String] = js.native
  /** [Property] (Boolean) */
  var isHeader: js.UndefOr[Boolean] = js.native
  /** [Method] Set up the tools lt tool type gt link in the owning Panel
  		* @param component Object
  		* @param index Object
  		*/
  @JSName("onAdd")
  var onAdd_IHeader: js.UndefOr[
    js.Function2[/* component */ js.UndefOr[js.Any], /* index */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] inherit docs
  		* @param cls Object
  		*/
  @JSName("removeUIClsFromElement")
  var removeUIClsFromElement_IHeader: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets glyph that provides the icon image for this header
  		* @param glyph Number/String the numeric charCode or string charCode/font-family. This parameter expects a format consistent with that of glyph
  		*/
  var setGlyph: js.UndefOr[js.Function1[/* glyph */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the image path that provides the icon image for this header
  		* @param icon String The new icon path
  		*/
  var setIcon: js.UndefOr[js.Function1[/* icon */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the CSS class that provides the icon image for this header
  		* @param cls String The new CSS class name
  		*/
  var setIconCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the title of the header
  		* @param title String The title to be set
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var titleAlign: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var titlePosition: js.UndefOr[Double] = js.native
}

object IHeader {
  @scala.inline
  def apply(): IHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHeader]
  }
  @scala.inline
  implicit class IHeaderOps[Self <: IHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddTool(value: /* tool */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTool")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddTool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTool")(js.undefined)
        ret
    }
    @scala.inline
    def withAddUIClsToElement(value: /* cls */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addUIClsToElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddUIClsToElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addUIClsToElement")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterLayout(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLayout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTools(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTools")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTools")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyph(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyph")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconCls")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAdd(value: (/* component */ js.UndefOr[js.Any], /* index */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveUIClsFromElement(value: /* cls */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeUIClsFromElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveUIClsFromElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeUIClsFromElement")(js.undefined)
        ret
    }
    @scala.inline
    def withSetGlyph(value: /* glyph */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGlyph")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetGlyph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGlyph")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIcon(value: /* icon */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIconCls(value: /* cls */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIconCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetIconCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIconCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTitle(value: /* title */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withTitlePosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titlePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitlePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titlePosition")(js.undefined)
        ret
    }
  }
  
}

