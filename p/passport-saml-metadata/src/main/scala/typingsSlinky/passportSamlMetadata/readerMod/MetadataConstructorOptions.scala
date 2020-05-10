package typingsSlinky.passportSamlMetadata.readerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataConstructorOptions extends js.Object {
  var authnRequestBinding: String = js.native
  var throwExceptions: Boolean = js.native
}

object MetadataConstructorOptions {
  @scala.inline
  def apply(authnRequestBinding: String, throwExceptions: Boolean): MetadataConstructorOptions = {
    val __obj = js.Dynamic.literal(authnRequestBinding = authnRequestBinding.asInstanceOf[js.Any], throwExceptions = throwExceptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataConstructorOptions]
  }
  @scala.inline
  implicit class MetadataConstructorOptionsOps[Self <: MetadataConstructorOptions] (val x: Self) extends AnyVal {
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
    def withThrowExceptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwExceptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

