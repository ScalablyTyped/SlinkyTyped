package typingsSlinky.monacoEditor.mod.languages.html

import typingsSlinky.monacoEditor.monacoEditorStrings.`force-aligned`
import typingsSlinky.monacoEditor.monacoEditorStrings.`force-expand-multiline`
import typingsSlinky.monacoEditor.monacoEditorStrings.auto
import typingsSlinky.monacoEditor.monacoEditorStrings.force
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLFormatConfiguration extends js.Object {
  val contentUnformatted: String = js.native
  val endWithNewline: Boolean = js.native
  val extraLiners: String = js.native
  val indentHandlebars: Boolean = js.native
  val indentInnerHtml: Boolean = js.native
  val insertSpaces: Boolean = js.native
  val maxPreserveNewLines: Double = js.native
  val preserveNewLines: Boolean = js.native
  val tabSize: Double = js.native
  val unformatted: String = js.native
  val wrapAttributes: auto | force | `force-aligned` | `force-expand-multiline` = js.native
  val wrapLineLength: Double = js.native
}

object HTMLFormatConfiguration {
  @scala.inline
  def apply(
    contentUnformatted: String,
    endWithNewline: Boolean,
    extraLiners: String,
    indentHandlebars: Boolean,
    indentInnerHtml: Boolean,
    insertSpaces: Boolean,
    maxPreserveNewLines: Double,
    preserveNewLines: Boolean,
    tabSize: Double,
    unformatted: String,
    wrapAttributes: auto | force | `force-aligned` | `force-expand-multiline`,
    wrapLineLength: Double
  ): HTMLFormatConfiguration = {
    val __obj = js.Dynamic.literal(contentUnformatted = contentUnformatted.asInstanceOf[js.Any], endWithNewline = endWithNewline.asInstanceOf[js.Any], extraLiners = extraLiners.asInstanceOf[js.Any], indentHandlebars = indentHandlebars.asInstanceOf[js.Any], indentInnerHtml = indentInnerHtml.asInstanceOf[js.Any], insertSpaces = insertSpaces.asInstanceOf[js.Any], maxPreserveNewLines = maxPreserveNewLines.asInstanceOf[js.Any], preserveNewLines = preserveNewLines.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any], unformatted = unformatted.asInstanceOf[js.Any], wrapAttributes = wrapAttributes.asInstanceOf[js.Any], wrapLineLength = wrapLineLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLFormatConfiguration]
  }
  @scala.inline
  implicit class HTMLFormatConfigurationOps[Self <: HTMLFormatConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentUnformatted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUnformatted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndWithNewline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endWithNewline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtraLiners(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraLiners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndentHandlebars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentHandlebars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndentInnerHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentInnerHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertSpaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxPreserveNewLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPreserveNewLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreserveNewLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveNewLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnformatted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unformatted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapAttributes(value: auto | force | `force-aligned` | `force-expand-multiline`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapLineLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapLineLength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

