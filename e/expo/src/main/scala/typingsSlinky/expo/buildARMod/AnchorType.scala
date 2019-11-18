package typingsSlinky.expo.buildARMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AnchorType extends js.Object

@JSImport("expo/build/AR", "AnchorType")
@js.native
object AnchorType extends js.Object {
  @js.native
  sealed trait Anchor extends AnchorType
  
  @js.native
  sealed trait Face extends AnchorType
  
  @js.native
  sealed trait Image extends AnchorType
  
  @js.native
  sealed trait Plane extends AnchorType
  
  /* "ARAnchor" */ val Anchor: typingsSlinky.expo.buildARMod.AnchorType.Anchor with String = js.native
  /* "ARFaceAnchor" */ val Face: typingsSlinky.expo.buildARMod.AnchorType.Face with String = js.native
  /* "ARImageAnchor" */ val Image: typingsSlinky.expo.buildARMod.AnchorType.Image with String = js.native
  /* "ARPlaneAnchor" */ val Plane: typingsSlinky.expo.buildARMod.AnchorType.Plane with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AnchorType with String] = js.native
}

