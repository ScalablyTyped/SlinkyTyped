package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Postal Code List Response
  */
@js.native
trait SchemaPostalCodesListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#postalCodesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Postal code collection.
    */
  var postalCodes: js.UndefOr[js.Array[SchemaPostalCode]] = js.native
}

object SchemaPostalCodesListResponse {
  @scala.inline
  def apply(): SchemaPostalCodesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPostalCodesListResponse]
  }
  @scala.inline
  implicit class SchemaPostalCodesListResponseOps[Self <: SchemaPostalCodesListResponse] (val x: Self) extends AnyVal {
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
    def withPostalCodes(value: js.Array[SchemaPostalCode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostalCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCodes")(js.undefined)
        ret
    }
  }
  
}

