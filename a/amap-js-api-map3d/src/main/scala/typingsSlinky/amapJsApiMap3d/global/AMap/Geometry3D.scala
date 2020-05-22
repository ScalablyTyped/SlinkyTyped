package typingsSlinky.amapJsApiMap3d.global.AMap

import typingsSlinky.amapJsApiMap3d.amapJsApiMap3dStrings.line
import typingsSlinky.amapJsApiMap3d.amapJsApiMap3dStrings.mesh
import typingsSlinky.amapJsApiMap3d.amapJsApiMap3dStrings.points
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Geometry3D")
@js.native
abstract class Geometry3D ()
  extends typingsSlinky.amapJsApiMap3d.AMap.Geometry3D {
  /* CompleteClass */
  override val vertexColors: js.Array[Double] = js.native
  /* CompleteClass */
  override val vertexUVs: js.Array[Double] = js.native
  /* CompleteClass */
  override val vertices: js.Array[Double] = js.native
}

@JSGlobal("AMap.Geometry3D")
@js.native
object Geometry3D extends js.Object {
  @js.native
  class Line ()
    extends typingsSlinky.amapJsApiMap3d.AMap.Geometry3D.Line {
    /* CompleteClass */
    override val segments: js.Array[Double] = js.native
    /* CompleteClass */
    override val textureIndices: js.Array[Double] = js.native
    /* CompleteClass */
    override val `type`: line = js.native
    /* CompleteClass */
    override val vertexColors: js.Array[Double] = js.native
    /* CompleteClass */
    override val vertexUVs: js.Array[Double] = js.native
    /* CompleteClass */
    override val vertices: js.Array[Double] = js.native
  }
  
  @js.native
  class Mesh ()
    extends typingsSlinky.amapJsApiMap3d.AMap.Geometry3D.Mesh {
    /* CompleteClass */
    override val faces: js.Array[Double] = js.native
    /* CompleteClass */
    override val textureIndices: js.Array[Double] = js.native
    /* CompleteClass */
    override val `type`: mesh = js.native
    /* CompleteClass */
    override val vertexColors: js.Array[Double] = js.native
    /* CompleteClass */
    override val vertexUVs: js.Array[Double] = js.native
    /* CompleteClass */
    override val vertices: js.Array[Double] = js.native
  }
  
  @js.native
  class Points ()
    extends typingsSlinky.amapJsApiMap3d.AMap.Geometry3D.Points {
    /* CompleteClass */
    override val pointAreas: js.Array[Double] = js.native
    /* CompleteClass */
    override val pointSizes: js.Array[Double] = js.native
    /* CompleteClass */
    override val textureIndices: js.Array[Double] = js.native
    /* CompleteClass */
    override val `type`: points = js.native
    /* CompleteClass */
    override val vertexColors: js.Array[Double] = js.native
    /* CompleteClass */
    override val vertexUVs: js.Array[Double] = js.native
    /* CompleteClass */
    override val vertices: js.Array[Double] = js.native
  }
  
}

