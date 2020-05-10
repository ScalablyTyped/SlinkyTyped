package typingsSlinky.googleapis.languageV1beta2Mod.languageV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ################################################################ #
  * Represents the input to API methods.
  */
@js.native
trait SchemaDocument extends js.Object {
  /**
    * The content of the input in string format. Cloud audit logging exempt
    * since it is based on user data.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The Google Cloud Storage URI where the file content is located. This URI
    * must be of the form: gs://bucket_name/object_name. For more details, see
    * https://cloud.google.com/storage/docs/reference-uris. NOTE: Cloud Storage
    * object versioning is not supported.
    */
  var gcsContentUri: js.UndefOr[String] = js.native
  /**
    * The language of the document (if not specified, the language is
    * automatically detected). Both ISO and BCP-47 language codes are
    * accepted.&lt;br&gt; [Language Support](/natural-language/docs/languages)
    * lists currently supported languages for each API method. If the language
    * (either specified by the caller or automatically detected) is not
    * supported by the called API method, an `INVALID_ARGUMENT` error is
    * returned.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Required. If the type is not set or is `TYPE_UNSPECIFIED`, returns an
    * `INVALID_ARGUMENT` error.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaDocument {
  @scala.inline
  def apply(): SchemaDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocument]
  }
  @scala.inline
  implicit class SchemaDocumentOps[Self <: SchemaDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withGcsContentUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsContentUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcsContentUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsContentUri")(js.undefined)
        ret
    }
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
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

