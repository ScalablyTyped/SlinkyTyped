package typingsSlinky.expo.aRMod

import typingsSlinky.expo.AnonLength
import typingsSlinky.expo.AnonName
import typingsSlinky.expo.aRMod.AnchorType.Face
import typingsSlinky.expo.aRMod.AnchorType.Image
import typingsSlinky.expo.aRMod.AnchorType.Plane
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.expo.aRMod.BaseAnchor
  - typingsSlinky.expo.aRMod.PlaneAnchor
  - typingsSlinky.expo.aRMod.ImageAnchor
  - typingsSlinky.expo.aRMod.FaceAnchor
*/
trait Anchor extends js.Object

object Anchor {
  @scala.inline
  def BaseAnchor(id: String, transform: Matrix, `type`: AnchorType): Anchor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anchor]
  }
  @scala.inline
  def PlaneAnchor(center: Vector3, extent: AnonLength, id: String, transform: Matrix, `type`: AnchorType with Plane): Anchor = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anchor]
  }
  @scala.inline
  def ImageAnchor(id: String, transform: Matrix, `type`: AnchorType with Image, image: AnonName = null): Anchor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anchor]
  }
  @scala.inline
  def FaceAnchor(
    id: String,
    isTracked: Boolean,
    transform: Matrix,
    `type`: AnchorType with Face,
    blendShapes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ shape in expo.expo/build/AR.BlendShape ]:? number}
    */ typingsSlinky.expo.expoStrings.FaceAnchor with js.Any = null,
    geometry: FaceGeometry = null
  ): Anchor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isTracked = isTracked.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (blendShapes != null) __obj.updateDynamic("blendShapes")(blendShapes.asInstanceOf[js.Any])
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anchor]
  }
}

