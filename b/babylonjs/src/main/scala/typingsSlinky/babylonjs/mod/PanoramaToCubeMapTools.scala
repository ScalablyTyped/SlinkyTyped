package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.panoramaToCubemapMod.CubeMapInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "PanoramaToCubeMapTools")
@js.native
class PanoramaToCubeMapTools ()
  extends typingsSlinky.babylonjs.legacyMod.PanoramaToCubeMapTools

/* static members */
@JSImport("babylonjs", "PanoramaToCubeMapTools")
@js.native
object PanoramaToCubeMapTools extends js.Object {
  var CalcProjectionSpherical: js.Any = js.native
  var CreateCubemapTexture: js.Any = js.native
  var FACE_BACK: js.Any = js.native
  var FACE_DOWN: js.Any = js.native
  var FACE_FRONT: js.Any = js.native
  var FACE_LEFT: js.Any = js.native
  var FACE_RIGHT: js.Any = js.native
  var FACE_UP: js.Any = js.native
  /**
    * Converts a panorma stored in RGB right to left up to down format into a cubemap (6 faces).
    *
    * @param float32Array The source data.
    * @param inputWidth The width of the input panorama.
    * @param inputHeight The height of the input panorama.
    * @param size The willing size of the generated cubemap (each faces will be size * size pixels)
    * @return The cubemap data
    */
  def ConvertPanoramaToCubemap(float32Array: js.typedarray.Float32Array, inputWidth: Double, inputHeight: Double, size: Double): CubeMapInfo = js.native
}

