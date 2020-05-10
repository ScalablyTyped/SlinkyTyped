package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaShippingsettingsGetSupportedCarriersResponse extends js.Object {
  /**
    * A list of supported carriers. May be empty.
    */
  var carriers: js.UndefOr[js.Array[SchemaCarriersCarrier]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#shippingsettingsGetSupportedCarriersResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaShippingsettingsGetSupportedCarriersResponse {
  @scala.inline
  def apply(): SchemaShippingsettingsGetSupportedCarriersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShippingsettingsGetSupportedCarriersResponse]
  }
  @scala.inline
  implicit class SchemaShippingsettingsGetSupportedCarriersResponseOps[Self <: SchemaShippingsettingsGetSupportedCarriersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCarriers(value: js.Array[SchemaCarriersCarrier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carriers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarriers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carriers")(js.undefined)
        ret
    }
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
  }
  
}

