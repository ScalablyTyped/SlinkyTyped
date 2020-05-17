package typingsSlinky.passportSamlMetadata.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<passport-saml-metadata.passport-saml-metadata/src/reader.MetadataConstructorOptions> */
@js.native
trait PartialMetadataConstructo extends js.Object {
  var authnRequestBinding: js.UndefOr[String] = js.native
  var throwExceptions: js.UndefOr[Boolean] = js.native
}

object PartialMetadataConstructo {
  @scala.inline
  def apply(): PartialMetadataConstructo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMetadataConstructo]
  }
  @scala.inline
  implicit class PartialMetadataConstructoOps[Self <: PartialMetadataConstructo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthnRequestBinding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authnRequestBinding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthnRequestBinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authnRequestBinding")(js.undefined)
        ret
    }
    @scala.inline
    def withThrowExceptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwExceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrowExceptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwExceptions")(js.undefined)
        ret
    }
  }
  
}

