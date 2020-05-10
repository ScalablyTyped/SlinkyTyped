package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILanguageExtensionPoint extends js.Object {
  var aliases: js.UndefOr[js.Array[String]] = js.native
  var configuration: js.UndefOr[Uri] = js.native
  var extensions: js.UndefOr[js.Array[String]] = js.native
  var filenamePatterns: js.UndefOr[js.Array[String]] = js.native
  var filenames: js.UndefOr[js.Array[String]] = js.native
  var firstLine: js.UndefOr[String] = js.native
  var id: String = js.native
  var mimetypes: js.UndefOr[js.Array[String]] = js.native
}

object ILanguageExtensionPoint {
  @scala.inline
  def apply(id: String): ILanguageExtensionPoint = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanguageExtensionPoint]
  }
  @scala.inline
  implicit class ILanguageExtensionPointOps[Self <: ILanguageExtensionPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAliases(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(js.undefined)
        ret
    }
    @scala.inline
    def withConfiguration(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withFilenamePatterns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filenamePatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilenamePatterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filenamePatterns")(js.undefined)
        ret
    }
    @scala.inline
    def withFilenames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filenames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilenames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filenames")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLine")(js.undefined)
        ret
    }
    @scala.inline
    def withMimetypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimetypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimetypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimetypes")(js.undefined)
        ret
    }
  }
  
}

