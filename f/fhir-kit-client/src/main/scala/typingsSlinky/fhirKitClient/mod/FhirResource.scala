package typingsSlinky.fhirKitClient.mod

import typingsSlinky.fhir.fhir.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fhirKitClient.mod.CustomResource
  - typingsSlinky.fhir.fhir.Resource
*/
trait FhirResource extends js.Object

object FhirResource {
  @scala.inline
  implicit def apply(value: CustomResource): FhirResource = value.asInstanceOf[FhirResource]
  @scala.inline
  implicit def apply(value: Resource): FhirResource = value.asInstanceOf[FhirResource]
}

