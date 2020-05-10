package typingsSlinky.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geometry extends js.Object {
  /**
    *   Averages the vertex normals. Used in curved
    *   surfaces
    *   @chainable
    */
  def averageNormals(): Geometry = js.native
  /**
    *   Averages pole normals. Used in spherical
    *   primitives
    *   @chainable
    */
  def averagePoleNormals(): Geometry = js.native
  def computeFaces(): Geometry = js.native
  /**
    *   computes smooth normals per vertex as an average
    *   of each face.
    *   @chainable
    */
  def computeNormals(): Geometry = js.native
  /**
    *   Modifies all vertices to be centered within the
    *   range -100 to 100.
    *   @chainable
    */
  def normalize(): Geometry = js.native
}

object Geometry {
  @scala.inline
  def apply(
    averageNormals: () => Geometry,
    averagePoleNormals: () => Geometry,
    computeFaces: () => Geometry,
    computeNormals: () => Geometry,
    normalize: () => Geometry
  ): Geometry = {
    val __obj = js.Dynamic.literal(averageNormals = js.Any.fromFunction0(averageNormals), averagePoleNormals = js.Any.fromFunction0(averagePoleNormals), computeFaces = js.Any.fromFunction0(computeFaces), computeNormals = js.Any.fromFunction0(computeNormals), normalize = js.Any.fromFunction0(normalize))
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  implicit class GeometryOps[Self <: Geometry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAverageNormals(value: () => Geometry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageNormals")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAveragePoleNormals(value: () => Geometry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averagePoleNormals")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withComputeFaces(value: () => Geometry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeFaces")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withComputeNormals(value: () => Geometry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeNormals")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNormalize(value: () => Geometry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

