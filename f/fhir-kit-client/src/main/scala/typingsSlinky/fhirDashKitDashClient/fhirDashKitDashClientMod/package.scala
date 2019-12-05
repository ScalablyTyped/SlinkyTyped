package typingsSlinky.fhirDashKitDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fhirDashKitDashClientMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.fhir.fhir.Resource
  import typingsSlinky.std.Exclude

  type CustomResourceType = Exclude[ResourceType, KnownResourceType]
  type FhirResource = CustomResource | Resource
  type ResourceType = String
  type SearchParams = StringDictionary[String | Double | Boolean]
}
