package typingsSlinky.fhirKitClient

import typingsSlinky.fhirKitClient.mod.ResourceType
import typingsSlinky.fhirKitClient.mod.SearchParams
import typingsSlinky.request.mod.Headers
import typingsSlinky.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSearchParams extends js.Object {
  var headers: js.UndefOr[Headers] = js.native
  var options: js.UndefOr[Options] = js.native
  var resourceType: ResourceType = js.native
  var searchParams: SearchParams = js.native
}

object AnonSearchParams {
  @scala.inline
  def apply(resourceType: ResourceType, searchParams: SearchParams): AnonSearchParams = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any], searchParams = searchParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSearchParams]
  }
  @scala.inline
  implicit class AnonSearchParamsOps[Self <: AnonSearchParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchParams(value: SearchParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: Headers): Self = {
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
    def withOptions(value: Options): Self = {
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
  }
  
}

