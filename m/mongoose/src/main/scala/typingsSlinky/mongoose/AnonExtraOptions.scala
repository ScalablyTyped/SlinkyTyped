package typingsSlinky.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExtraOptions extends js.Object {
  var extraOptions: js.UndefOr[js.Any] = js.native
  var keyVaultNamespace: String = js.native
  var kmsProviders: js.Any = js.native
  var schemaMap: js.Any = js.native
}

object AnonExtraOptions {
  @scala.inline
  def apply(keyVaultNamespace: String, kmsProviders: js.Any, schemaMap: js.Any): AnonExtraOptions = {
    val __obj = js.Dynamic.literal(keyVaultNamespace = keyVaultNamespace.asInstanceOf[js.Any], kmsProviders = kmsProviders.asInstanceOf[js.Any], schemaMap = schemaMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtraOptions]
  }
  @scala.inline
  implicit class AnonExtraOptionsOps[Self <: AnonExtraOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyVaultNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyVaultNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKmsProviders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemaMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtraOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraOptions")(js.undefined)
        ret
    }
  }
  
}

