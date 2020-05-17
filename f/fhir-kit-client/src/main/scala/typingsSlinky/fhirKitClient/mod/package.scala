package typingsSlinky.fhirKitClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomResourceType = typingsSlinky.std.Exclude[
    typingsSlinky.fhirKitClient.mod.ResourceType, 
    typingsSlinky.fhirKitClient.mod.KnownResourceType
  ]
  type ResourceType = java.lang.String
  type SearchParams = org.scalablytyped.runtime.StringDictionary[
    java.lang.String | scala.Double | scala.Boolean | (js.Array[java.lang.String | scala.Double | scala.Boolean])
  ]
}
