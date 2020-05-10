package typingsSlinky.graphqlPlaygroundHtml.renderPlaygroundPageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISettings extends js.Object {
  @JSName("editor.cursorShape")
  var editorDotcursorShape: CursorShape = js.native
  @JSName("editor.fontFamily")
  var editorDotfontFamily: String = js.native
  @JSName("editor.fontSize")
  var editorDotfontSize: Double = js.native
  @JSName("editor.reuseHeaders")
  var editorDotreuseHeaders: Boolean = js.native
  @JSName("editor.theme")
  var editorDottheme: Theme = js.native
  @JSName("general.betaUpdates")
  var generalDotbetaUpdates: Boolean = js.native
  @JSName("request.credentials")
  var requestDotcredentials: String = js.native
  @JSName("tracing.hideTracingResponse")
  var tracingDothideTracingResponse: Boolean = js.native
}

object ISettings {
  @scala.inline
  def apply(
    editorDotcursorShape: CursorShape,
    editorDotfontFamily: String,
    editorDotfontSize: Double,
    editorDotreuseHeaders: Boolean,
    editorDottheme: Theme,
    generalDotbetaUpdates: Boolean,
    requestDotcredentials: String,
    tracingDothideTracingResponse: Boolean
  ): ISettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("editor.cursorShape")(editorDotcursorShape.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.fontFamily")(editorDotfontFamily.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.fontSize")(editorDotfontSize.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.reuseHeaders")(editorDotreuseHeaders.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.theme")(editorDottheme.asInstanceOf[js.Any])
    __obj.updateDynamic("general.betaUpdates")(generalDotbetaUpdates.asInstanceOf[js.Any])
    __obj.updateDynamic("request.credentials")(requestDotcredentials.asInstanceOf[js.Any])
    __obj.updateDynamic("tracing.hideTracingResponse")(tracingDothideTracingResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISettings]
  }
  @scala.inline
  implicit class ISettingsOps[Self <: ISettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEditorDotcursorShape(value: CursorShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor.cursorShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditorDotfontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor.fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditorDotfontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor.fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditorDotreuseHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor.reuseHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditorDottheme(value: Theme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor.theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeneralDotbetaUpdates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("general.betaUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestDotcredentials(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request.credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTracingDothideTracingResponse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracing.hideTracingResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

