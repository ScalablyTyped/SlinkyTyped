package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mobile Carrier List Response
  */
@js.native
trait SchemaMobileCarriersListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#mobileCarriersListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Mobile carrier collection.
    */
  var mobileCarriers: js.UndefOr[js.Array[SchemaMobileCarrier]] = js.native
}

object SchemaMobileCarriersListResponse {
  @scala.inline
  def apply(): SchemaMobileCarriersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileCarriersListResponse]
  }
  @scala.inline
  implicit class SchemaMobileCarriersListResponseOps[Self <: SchemaMobileCarriersListResponse] (val x: Self) extends AnyVal {
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
    def withMobileCarriers(value: js.Array[SchemaMobileCarrier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileCarriers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileCarriers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileCarriers")(js.undefined)
        ret
    }
  }
  
}

