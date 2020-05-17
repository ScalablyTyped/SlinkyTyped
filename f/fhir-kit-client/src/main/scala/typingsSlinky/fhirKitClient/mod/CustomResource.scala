package typingsSlinky.fhirKitClient.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.fhir.fhir.ResourceBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomResource
  extends ResourceBase
     with /* key */ StringDictionary[js.Any]
     with FhirResource

object CustomResource {
  @scala.inline
  def apply(): CustomResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomResource]
  }
}

