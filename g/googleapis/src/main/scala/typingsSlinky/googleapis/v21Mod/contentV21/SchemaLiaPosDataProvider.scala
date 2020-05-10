package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiaPosDataProvider extends js.Object {
  /**
    * The ID of the POS data provider.
    */
  var posDataProviderId: js.UndefOr[String] = js.native
  /**
    * The account ID by which this merchant is known to the POS data provider.
    */
  var posExternalAccountId: js.UndefOr[String] = js.native
}

object SchemaLiaPosDataProvider {
  @scala.inline
  def apply(): SchemaLiaPosDataProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiaPosDataProvider]
  }
  @scala.inline
  implicit class SchemaLiaPosDataProviderOps[Self <: SchemaLiaPosDataProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosDataProviderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posDataProviderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosDataProviderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posDataProviderId")(js.undefined)
        ret
    }
    @scala.inline
    def withPosExternalAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posExternalAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosExternalAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posExternalAccountId")(js.undefined)
        ret
    }
  }
  
}

