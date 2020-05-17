package typingsSlinky.fhirKitClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompartmentHeaders extends js.Object {
  var compartment: typingsSlinky.fhirKitClient.mod.Compartment = js.native
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  var resourceType: typingsSlinky.fhirKitClient.mod.ResourceType = js.native
  var searchParams: js.UndefOr[typingsSlinky.fhirKitClient.mod.SearchParams] = js.native
}

object CompartmentHeaders {
  @scala.inline
  def apply(
    compartment: typingsSlinky.fhirKitClient.mod.Compartment,
    resourceType: typingsSlinky.fhirKitClient.mod.ResourceType
  ): CompartmentHeaders = {
    val __obj = js.Dynamic.literal(compartment = compartment.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompartmentHeaders]
  }
  @scala.inline
  implicit class CompartmentHeadersOps[Self <: CompartmentHeaders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompartment(value: typingsSlinky.fhirKitClient.mod.Compartment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compartment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceType(value: typingsSlinky.fhirKitClient.mod.ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: typingsSlinky.request.mod.Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: typingsSlinky.request.mod.Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchParams(value: typingsSlinky.fhirKitClient.mod.SearchParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchParams")(js.undefined)
        ret
    }
  }
  
}

