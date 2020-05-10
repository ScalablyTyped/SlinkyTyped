package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sets the basic filter associated with a sheet.
  */
@js.native
trait SchemaSetBasicFilterRequest extends js.Object {
  /**
    * The filter to set.
    */
  var filter: js.UndefOr[SchemaBasicFilter] = js.native
}

object SchemaSetBasicFilterRequest {
  @scala.inline
  def apply(): SchemaSetBasicFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetBasicFilterRequest]
  }
  @scala.inline
  implicit class SchemaSetBasicFilterRequestOps[Self <: SchemaSetBasicFilterRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: SchemaBasicFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
  }
  
}

