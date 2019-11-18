package typingsSlinky.expo.buildARMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FaceAnchorProp extends js.Object

@JSImport("expo/build/AR", "FaceAnchorProp")
@js.native
object FaceAnchorProp extends js.Object {
  @js.native
  sealed trait BlendShapes extends FaceAnchorProp
  
  @js.native
  sealed trait Geometry extends FaceAnchorProp
  
  /* "blendShapes" */ val BlendShapes: typingsSlinky.expo.buildARMod.FaceAnchorProp.BlendShapes with String = js.native
  /* "geometry" */ val Geometry: typingsSlinky.expo.buildARMod.FaceAnchorProp.Geometry with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FaceAnchorProp with String] = js.native
}

