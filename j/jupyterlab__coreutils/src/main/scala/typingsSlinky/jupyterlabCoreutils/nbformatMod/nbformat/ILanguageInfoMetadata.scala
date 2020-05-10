package typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat

import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The language info metatda
  */
@js.native
trait ILanguageInfoMetadata extends JSONObject {
  var codemirror_mode: js.UndefOr[String | JSONObject] = js.native
  var file_extension: js.UndefOr[String] = js.native
  var mimetype: js.UndefOr[String] = js.native
  var name: String = js.native
  var pygments_lexer: js.UndefOr[String] = js.native
}

object ILanguageInfoMetadata {
  @scala.inline
  def apply(name: String): ILanguageInfoMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanguageInfoMetadata]
  }
  @scala.inline
  implicit class ILanguageInfoMetadataOps[Self <: ILanguageInfoMetadata] (val x: Self) extends AnyVal {
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
    def withCodemirror_mode(value: String | JSONObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codemirror_mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodemirror_mode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codemirror_mode")(js.undefined)
        ret
    }
    @scala.inline
    def withFile_extension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile_extension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_extension")(js.undefined)
        ret
    }
    @scala.inline
    def withMimetype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimetype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimetype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimetype")(js.undefined)
        ret
    }
    @scala.inline
    def withPygments_lexer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pygments_lexer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPygments_lexer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pygments_lexer")(js.undefined)
        ret
    }
  }
  
}

