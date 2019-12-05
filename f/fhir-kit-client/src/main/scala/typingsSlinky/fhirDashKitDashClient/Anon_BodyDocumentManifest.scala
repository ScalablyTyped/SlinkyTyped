package typingsSlinky.fhirDashKitDashClient

import typingsSlinky.fhir.fhir.DocumentManifest
import typingsSlinky.request.requestMod.Headers
import typingsSlinky.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyDocumentManifest extends js.Object {
  var body: DocumentManifest
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.DocumentManifest
}

object Anon_BodyDocumentManifest {
  @scala.inline
  def apply(
    body: DocumentManifest,
    resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.DocumentManifest,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyDocumentManifest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyDocumentManifest]
  }
}

