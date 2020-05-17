package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arcgisJsApi.esri.RelationshipSchemeForPoint
  - typingsSlinky.arcgisJsApi.esri.RelationshipSchemeForPolyline
  - typingsSlinky.arcgisJsApi.esri.RelationshipSchemeForPolygon
  - typingsSlinky.arcgisJsApi.esri.RelationshipSchemeForMesh
*/
trait RelationshipScheme extends js.Object

object RelationshipScheme {
  @scala.inline
  implicit def apply(value: RelationshipSchemeForMesh): RelationshipScheme = value.asInstanceOf[RelationshipScheme]
  @scala.inline
  implicit def apply(value: RelationshipSchemeForPoint): RelationshipScheme = value.asInstanceOf[RelationshipScheme]
  @scala.inline
  implicit def apply(value: RelationshipSchemeForPolygon): RelationshipScheme = value.asInstanceOf[RelationshipScheme]
  @scala.inline
  implicit def apply(value: RelationshipSchemeForPolyline): RelationshipScheme = value.asInstanceOf[RelationshipScheme]
}

