package typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A search request for political geographies.
  */
@js.native
trait SchemaDivisionSearchRequest extends js.Object {
  var contextParams: js.UndefOr[SchemaContextParams] = js.native
}

object SchemaDivisionSearchRequest {
  @scala.inline
  def apply(): SchemaDivisionSearchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDivisionSearchRequest]
  }
  @scala.inline
  implicit class SchemaDivisionSearchRequestOps[Self <: SchemaDivisionSearchRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextParams(value: SchemaContextParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextParams")(js.undefined)
        ret
    }
  }
  
}

