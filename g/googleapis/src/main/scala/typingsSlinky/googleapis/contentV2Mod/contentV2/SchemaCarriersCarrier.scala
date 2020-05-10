package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCarriersCarrier extends js.Object {
  /**
    * The CLDR country code of the carrier (e.g., &quot;US&quot;). Always
    * present.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The name of the carrier (e.g., &quot;UPS&quot;). Always present.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A list of supported services (e.g., &quot;ground&quot;) for that carrier.
    * Contains at least one service.
    */
  var services: js.UndefOr[js.Array[String]] = js.native
}

object SchemaCarriersCarrier {
  @scala.inline
  def apply(): SchemaCarriersCarrier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCarriersCarrier]
  }
  @scala.inline
  implicit class SchemaCarriersCarrierOps[Self <: SchemaCarriersCarrier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withServices(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(js.undefined)
        ret
    }
  }
  
}

