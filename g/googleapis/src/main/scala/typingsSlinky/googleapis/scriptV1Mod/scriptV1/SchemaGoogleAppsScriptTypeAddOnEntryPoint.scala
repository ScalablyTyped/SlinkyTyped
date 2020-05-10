package typingsSlinky.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An add-on entry point.
  */
@js.native
trait SchemaGoogleAppsScriptTypeAddOnEntryPoint extends js.Object {
  /**
    * The add-on&#39;s required list of supported container types.
    */
  var addOnType: js.UndefOr[String] = js.native
  /**
    * The add-on&#39;s optional description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The add-on&#39;s optional help URL.
    */
  var helpUrl: js.UndefOr[String] = js.native
  /**
    * The add-on&#39;s required post install tip URL.
    */
  var postInstallTipUrl: js.UndefOr[String] = js.native
  /**
    * The add-on&#39;s optional report issue URL.
    */
  var reportIssueUrl: js.UndefOr[String] = js.native
  /**
    * The add-on&#39;s required title.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaGoogleAppsScriptTypeAddOnEntryPoint {
  @scala.inline
  def apply(): SchemaGoogleAppsScriptTypeAddOnEntryPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeAddOnEntryPoint]
  }
  @scala.inline
  implicit class SchemaGoogleAppsScriptTypeAddOnEntryPointOps[Self <: SchemaGoogleAppsScriptTypeAddOnEntryPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddOnType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddOnType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnType")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withHelpUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelpUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPostInstallTipUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postInstallTipUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostInstallTipUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postInstallTipUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withReportIssueUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportIssueUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportIssueUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportIssueUrl")(js.undefined)
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
  }
  
}

