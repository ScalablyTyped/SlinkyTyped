package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.DomainResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var context: js.UndefOr[typingsSlinky.fhir.fhir.Bundle | DomainResource] = js.undefined
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.undefined
  var reference: String
}

object Context {
  @scala.inline
  def apply(
    reference: String,
    context: typingsSlinky.fhir.fhir.Bundle | DomainResource = null,
    options: typingsSlinky.request.mod.Options = null
  ): Context = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

