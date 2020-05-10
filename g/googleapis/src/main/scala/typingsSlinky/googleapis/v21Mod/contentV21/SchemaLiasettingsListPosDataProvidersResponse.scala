package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiasettingsListPosDataProvidersResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#liasettingsListPosDataProvidersResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The list of POS data providers for each eligible country
    */
  var posDataProviders: js.UndefOr[js.Array[SchemaPosDataProviders]] = js.native
}

object SchemaLiasettingsListPosDataProvidersResponse {
  @scala.inline
  def apply(): SchemaLiasettingsListPosDataProvidersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiasettingsListPosDataProvidersResponse]
  }
  @scala.inline
  implicit class SchemaLiasettingsListPosDataProvidersResponseOps[Self <: SchemaLiasettingsListPosDataProvidersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withPosDataProviders(value: js.Array[SchemaPosDataProviders]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posDataProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosDataProviders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posDataProviders")(js.undefined)
        ret
    }
  }
  
}

