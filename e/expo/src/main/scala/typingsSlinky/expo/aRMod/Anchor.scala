package typingsSlinky.expo.aRMod

import typingsSlinky.expo.aRMod.AnchorType.Face
import typingsSlinky.expo.aRMod.AnchorType.Image
import typingsSlinky.expo.aRMod.AnchorType.Plane
import typingsSlinky.expo.anon.Length
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
  def PlaneAnchor(center: Vector3, extent: Length, id: String, transform: Matrix, `type`: AnchorType with Plane): Anchor = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anchor]
  }
  @scala.inline
  def ImageAnchor(id: String, transform: Matrix, `type`: AnchorType with Image): Anchor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anchor]
  }
  @scala.inline
  def FaceAnchor(id: String, isTracked: Boolean, transform: Matrix, `type`: AnchorType with Face): Anchor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isTracked = isTracked.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anchor]
  }
}

