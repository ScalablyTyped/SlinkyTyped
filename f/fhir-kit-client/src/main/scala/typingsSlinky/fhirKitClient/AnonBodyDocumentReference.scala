package typingsSlinky.fhirKitClient

import typingsSlinky.fhir.fhir.DocumentReference
import typingsSlinky.request.mod.Headers
import typingsSlinky.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyDocumentReference extends js.Object {
  var body: DocumentReference
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.DocumentReference
}

object AnonBodyDocumentReference {
  @scala.inline
  def apply(
    body: DocumentReference,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.DocumentReference,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyDocumentReference = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyDocumentReference]
  }
}

