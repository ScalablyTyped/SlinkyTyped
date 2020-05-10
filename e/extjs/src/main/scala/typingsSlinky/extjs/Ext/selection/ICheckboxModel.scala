package typingsSlinky.extjs.Ext.selection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckboxModel extends IRowModel {
  /** [Config Option] (Boolean) */
  var checkOnly: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var checkSelector: js.UndefOr[String] = js.native
  /** [Method] Retrieve a configuration to be used in a HeaderContainer  */
  var getHeaderConfig: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Number/String) */
  var injectCheckbox: js.UndefOr[js.Any] = js.native
  /** [Method] Toggle between selecting all and deselecting all when clicking on a checkbox header
  		* @param headerCt Object
  		* @param header Object
  		* @param e Object
  		*/
  var onHeaderClick: js.UndefOr[
    js.Function3[
      /* headerCt */ js.UndefOr[js.Any], 
      /* header */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Generates the HTML to be rendered in the injected checkbox column for each row
  		* @param value Object
  		* @param metaData Object
  		* @param record Object
  		* @param rowIndex Object
  		* @param colIndex Object
  		* @param store Object
  		* @param view Object
  		*/
  var renderer: js.UndefOr[
    js.Function7[
      /* value */ js.UndefOr[js.Any], 
      /* metaData */ js.UndefOr[js.Any], 
      /* record */ js.UndefOr[js.Any], 
      /* rowIndex */ js.UndefOr[js.Any], 
      /* colIndex */ js.UndefOr[js.Any], 
      /* store */ js.UndefOr[js.Any], 
      /* view */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (Boolean) */
  var showHeaderCheckbox: js.UndefOr[Boolean] = js.native
}

object ICheckboxModel {
  @scala.inline
  def apply(): ICheckboxModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckboxModel]
  }
  @scala.inline
  implicit class ICheckboxModelOps[Self <: ICheckboxModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHeaderConfig(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeaderConfig")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHeaderConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeaderConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withInjectCheckbox(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectCheckbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInjectCheckbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectCheckbox")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHeaderClick(
      value: (/* headerCt */ js.UndefOr[js.Any], /* header */ js.UndefOr[js.Any], /* e */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHeaderClick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnHeaderClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHeaderClick")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderer(
      value: (/* value */ js.UndefOr[js.Any], /* metaData */ js.UndefOr[js.Any], /* record */ js.UndefOr[js.Any], /* rowIndex */ js.UndefOr[js.Any], /* colIndex */ js.UndefOr[js.Any], /* store */ js.UndefOr[js.Any], /* view */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withoutRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHeaderCheckbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeaderCheckbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHeaderCheckbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeaderCheckbox")(js.undefined)
        ret
    }
  }
  
}

