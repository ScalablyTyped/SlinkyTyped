package typingsSlinky.extjs.Ext.flash

import typingsSlinky.extjs.Ext.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComponent
  extends typingsSlinky.extjs.Ext.IComponent {
  /** [Property] (String) */
  var EXPRESS_INSTALL_URL: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var backgroundColor: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var expressInstall: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object) */
  var flashAttributes: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var flashParams: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var flashVars: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var flashVersion: js.UndefOr[String] = js.native
  /** [Method] Retrieves the id of the SWF object embed element  */
  var getSwfId: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Ext.Element) */
  var swf: js.UndefOr[IElement] = js.native
  /** [Config Option] (String/Number) */
  var swfHeight: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Number) */
  var swfWidth: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var wmode: js.UndefOr[String] = js.native
}

object IComponent {
  @scala.inline
  def apply(): IComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComponent]
  }
  @scala.inline
  implicit class IComponentOps[Self <: IComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEXPRESS_INSTALL_URL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EXPRESS_INSTALL_URL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEXPRESS_INSTALL_URL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EXPRESS_INSTALL_URL")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withExpressInstall(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expressInstall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpressInstall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expressInstall")(js.undefined)
        ret
    }
    @scala.inline
    def withFlashAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlashAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withFlashParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlashParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashParams")(js.undefined)
        ret
    }
    @scala.inline
    def withFlashVars(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashVars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlashVars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashVars")(js.undefined)
        ret
    }
    @scala.inline
    def withFlashVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlashVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSwfId(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSwfId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSwfId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSwfId")(js.undefined)
        ret
    }
    @scala.inline
    def withSwf(value: IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swf")(js.undefined)
        ret
    }
    @scala.inline
    def withSwfHeight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swfHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwfHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swfHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSwfWidth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swfWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwfWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swfWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withWmode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWmode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wmode")(js.undefined)
        ret
    }
  }
  
}

