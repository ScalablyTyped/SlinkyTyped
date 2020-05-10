package typingsSlinky.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslationMetadata extends js.Object {
  /**
    * The absolute URI from which the translation metadata can be downloaded.
    */
  var downloadUri: js.UndefOr[String] = js.native
  /**
    * A comprehensive description of the translation metadata.
    */
  var fullDescription: js.UndefOr[MultiformatMessageString] = js.native
  /**
    * The full name associated with the translation metadata.
    */
  var fullName: js.UndefOr[String] = js.native
  /**
    * The absolute URI from which information related to the translation metadata can be downloaded.
    */
  var informationUri: js.UndefOr[String] = js.native
  /**
    * The name associated with the translation metadata.
    */
  var name: String = js.native
  /**
    * Key/value pairs that provide additional information about the translation metadata.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * A brief description of the translation metadata.
    */
  var shortDescription: js.UndefOr[MultiformatMessageString] = js.native
}

object TranslationMetadata {
  @scala.inline
  def apply(name: String): TranslationMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslationMetadata]
  }
  @scala.inline
  implicit class TranslationMetadataOps[Self <: TranslationMetadata] (val x: Self) extends AnyVal {
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
    def withDownloadUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadUri")(js.undefined)
        ret
    }
    @scala.inline
    def withFullDescription(value: MultiformatMessageString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullName")(js.undefined)
        ret
    }
    @scala.inline
    def withInformationUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("informationUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInformationUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("informationUri")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: PropertyBag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withShortDescription(value: MultiformatMessageString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDescription")(js.undefined)
        ret
    }
  }
  
}

