package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMappingRequest extends js.Object {
  /**
    * Parameters for the mapping.
    */
  var Location: js.UndefOr[typingsSlinky.awsSdk.glueMod.Location] = js.native
  /**
    * A list of target tables.
    */
  var Sinks: js.UndefOr[CatalogEntries] = js.native
  /**
    * Specifies the source table.
    */
  var Source: CatalogEntry = js.native
}

object GetMappingRequest {
  @scala.inline
  def apply(Source: CatalogEntry): GetMappingRequest = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMappingRequest]
  }
  @scala.inline
  implicit class GetMappingRequestOps[Self <: GetMappingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: CatalogEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(js.undefined)
        ret
    }
    @scala.inline
    def withSinks(value: CatalogEntries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sinks")(js.undefined)
        ret
    }
  }
  
}

