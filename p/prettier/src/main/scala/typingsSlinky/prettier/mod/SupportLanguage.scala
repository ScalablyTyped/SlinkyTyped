package typingsSlinky.prettier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupportLanguage extends js.Object {
  var aceMode: js.UndefOr[String] = js.native
  var aliases: js.UndefOr[js.Array[String]] = js.native
  var codemirrorMimeType: js.UndefOr[String] = js.native
  var codemirrorMode: js.UndefOr[String] = js.native
  var extensions: js.UndefOr[js.Array[String]] = js.native
  var filenames: js.UndefOr[js.Array[String]] = js.native
  var group: js.UndefOr[String] = js.native
  var linguistLanguageId: js.UndefOr[Double] = js.native
  var name: String = js.native
  var parsers: js.Array[BuiltInParserName | String] = js.native
  var since: js.UndefOr[String] = js.native
  var tmScope: js.UndefOr[String] = js.native
  var vscodeLanguageIds: js.UndefOr[js.Array[String]] = js.native
}

object SupportLanguage {
  @scala.inline
  def apply(name: String, parsers: js.Array[BuiltInParserName | String]): SupportLanguage = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parsers = parsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportLanguage]
  }
  @scala.inline
  implicit class SupportLanguageOps[Self <: SupportLanguage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParsers(value: js.Array[BuiltInParserName | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAceMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aceMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAceMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aceMode")(js.undefined)
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
    def withCodemirrorMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codemirrorMimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodemirrorMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codemirrorMimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withCodemirrorMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codemirrorMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodemirrorMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codemirrorMode")(js.undefined)
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
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withLinguistLanguageId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linguistLanguageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinguistLanguageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linguistLanguageId")(js.undefined)
        ret
    }
    @scala.inline
    def withSince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(js.undefined)
        ret
    }
    @scala.inline
    def withTmScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTmScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmScope")(js.undefined)
        ret
    }
    @scala.inline
    def withVscodeLanguageIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vscodeLanguageIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVscodeLanguageIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vscodeLanguageIds")(js.undefined)
        ret
    }
  }
  
}

