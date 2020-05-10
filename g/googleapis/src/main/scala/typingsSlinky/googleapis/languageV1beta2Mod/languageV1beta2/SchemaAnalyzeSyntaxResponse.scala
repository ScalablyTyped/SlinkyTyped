package typingsSlinky.googleapis.languageV1beta2Mod.languageV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The syntax analysis response message.
  */
@js.native
trait SchemaAnalyzeSyntaxResponse extends js.Object {
  /**
    * The language of the text, which will be the same as the language
    * specified in the request or, if not specified, the automatically-detected
    * language. See Document.language field for more details.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Sentences in the input document.
    */
  var sentences: js.UndefOr[js.Array[SchemaSentence]] = js.native
  /**
    * Tokens, along with their syntactic information, in the input document.
    */
  var tokens: js.UndefOr[js.Array[SchemaToken]] = js.native
}

object SchemaAnalyzeSyntaxResponse {
  @scala.inline
  def apply(): SchemaAnalyzeSyntaxResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyzeSyntaxResponse]
  }
  @scala.inline
  implicit class SchemaAnalyzeSyntaxResponseOps[Self <: SchemaAnalyzeSyntaxResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withSentences(value: js.Array[SchemaSentence]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentences")(js.undefined)
        ret
    }
    @scala.inline
    def withTokens(value: js.Array[SchemaToken]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(js.undefined)
        ret
    }
  }
  
}

