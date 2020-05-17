package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.NutritionOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BodyNutritionOrder extends js.Object {
  var body: NutritionOrder = js.native
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.NutritionOrder = js.native
}

object BodyNutritionOrder {
  @scala.inline
  def apply(
    body: NutritionOrder,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.NutritionOrder
  ): BodyNutritionOrder = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyNutritionOrder]
  }
  @scala.inline
  implicit class BodyNutritionOrderOps[Self <: BodyNutritionOrder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: NutritionOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceType(value: typingsSlinky.fhirKitClient.fhirKitClientStrings.NutritionOrder): Self = {
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
  }
  
}

