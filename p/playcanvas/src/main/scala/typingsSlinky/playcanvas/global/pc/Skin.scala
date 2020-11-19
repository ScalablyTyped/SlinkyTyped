package typingsSlinky.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A skin contains data about the bones in a hierarchy that drive a skinned mesh animation.
  Specifically, the skin stores the bone name and inverse bind matrix and for each bone.
  Inverse bind matrices are instrumental in the mathematics of vertex skinning.
  * @param graphicsDevice - The graphics device used to manage this skin.
  * @param ibp - The array of inverse bind matrices.
  * @param boneNames - The array of bone names for the bones referenced by this skin.
  */
@JSGlobal("pc.Skin")
@js.native
class Skin protected ()
  extends typingsSlinky.playcanvas.pc.Skin {
  def this(
    graphicsDevice: typingsSlinky.playcanvas.pc.GraphicsDevice,
    ibp: js.Array[typingsSlinky.playcanvas.pc.Mat4],
    boneNames: js.Array[String]
  ) = this()
}
